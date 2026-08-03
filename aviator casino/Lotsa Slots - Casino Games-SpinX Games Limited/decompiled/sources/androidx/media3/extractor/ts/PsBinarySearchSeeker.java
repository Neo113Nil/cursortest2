package androidx.media3.extractor.ts;

/* loaded from: classes2.dex */
final class PsBinarySearchSeeker extends androidx.media3.extractor.BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 1000;
    private static final long SEEK_TOLERANCE_US = 100000;
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;

    public PsBinarySearchSeeker(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, long j, long j2) {
        super(new androidx.media3.extractor.BinarySearchSeeker.DefaultSeekTimestampConverter(), new androidx.media3.extractor.ts.PsBinarySearchSeeker.PsScrSeeker(timestampAdjuster), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    private static final class PsScrSeeker implements androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker {
        private final androidx.media3.common.util.ParsableByteArray packetBuffer;
        private final androidx.media3.common.util.TimestampAdjuster scrTimestampAdjuster;

        private PsScrSeeker(androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
            this.scrTimestampAdjuster = timestampAdjuster;
            this.packetBuffer = new androidx.media3.common.util.ParsableByteArray();
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException {
            long position = extractorInput.getPosition();
            int min = (int) java.lang.Math.min(20000L, extractorInput.getLength() - position);
            this.packetBuffer.reset(min);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
            return searchForScrValueInBuffer(this.packetBuffer, j, position);
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY);
        }

        private androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForScrValueInBuffer(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (parsableByteArray.bytesLeft() >= 4) {
                if (androidx.media3.extractor.ts.PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition()) != 442) {
                    parsableByteArray.skipBytes(1);
                } else {
                    parsableByteArray.skipBytes(4);
                    long readScrValueFromPack = androidx.media3.extractor.ts.PsDurationReader.readScrValueFromPack(parsableByteArray);
                    if (readScrValueFromPack != -9223372036854775807L) {
                        long adjustTsTimestamp = this.scrTimestampAdjuster.adjustTsTimestamp(readScrValueFromPack);
                        if (adjustTsTimestamp > j) {
                            if (j3 == -9223372036854775807L) {
                                return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(adjustTsTimestamp, j2);
                            }
                            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j2 + i2);
                        }
                        if (100000 + adjustTsTimestamp > j) {
                            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j2 + parsableByteArray.getPosition());
                        }
                        i2 = parsableByteArray.getPosition();
                        j3 = adjustTsTimestamp;
                    }
                    skipToEndOfCurrentPack(parsableByteArray);
                    i = parsableByteArray.getPosition();
                }
            }
            if (j3 != -9223372036854775807L) {
                return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j3, j2 + i);
            }
            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        private static void skipToEndOfCurrentPack(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            int peekIntAtPosition;
            int limit = parsableByteArray.limit();
            if (parsableByteArray.bytesLeft() < 10) {
                parsableByteArray.setPosition(limit);
                return;
            }
            parsableByteArray.skipBytes(9);
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 7;
            if (parsableByteArray.bytesLeft() < readUnsignedByte) {
                parsableByteArray.setPosition(limit);
                return;
            }
            parsableByteArray.skipBytes(readUnsignedByte);
            if (parsableByteArray.bytesLeft() >= 4) {
                if (androidx.media3.extractor.ts.PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition()) == 443) {
                    parsableByteArray.skipBytes(4);
                    int readUnsignedShort = parsableByteArray.readUnsignedShort();
                    if (parsableByteArray.bytesLeft() < readUnsignedShort) {
                        parsableByteArray.setPosition(limit);
                        return;
                    }
                    parsableByteArray.skipBytes(readUnsignedShort);
                }
                while (parsableByteArray.bytesLeft() >= 4 && (peekIntAtPosition = androidx.media3.extractor.ts.PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition())) != 442 && peekIntAtPosition != 441 && (peekIntAtPosition >>> 8) == 1) {
                    parsableByteArray.skipBytes(4);
                    if (parsableByteArray.bytesLeft() < 2) {
                        parsableByteArray.setPosition(limit);
                        return;
                    }
                    parsableByteArray.setPosition(java.lang.Math.min(parsableByteArray.limit(), parsableByteArray.getPosition() + parsableByteArray.readUnsignedShort()));
                }
                return;
            }
            parsableByteArray.setPosition(limit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
