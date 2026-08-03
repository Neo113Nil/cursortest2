package androidx.media3.extractor.ts;

/* loaded from: classes2.dex */
final class TsBinarySearchSeeker extends androidx.media3.extractor.BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 940;
    private static final long SEEK_TOLERANCE_US = 100000;

    public TsBinarySearchSeeker(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, long j, long j2, int i, int i2) {
        super(new androidx.media3.extractor.BinarySearchSeeker.DefaultSeekTimestampConverter(), new androidx.media3.extractor.ts.TsBinarySearchSeeker.TsPcrSeeker(i, timestampAdjuster, i2), j, 0L, j + 1, 0L, j2, 188L, MINIMUM_SEARCH_RANGE_BYTES);
    }

    private static final class TsPcrSeeker implements androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker {
        private final androidx.media3.common.util.ParsableByteArray packetBuffer = new androidx.media3.common.util.ParsableByteArray();
        private final int pcrPid;
        private final androidx.media3.common.util.TimestampAdjuster pcrTimestampAdjuster;
        private final int timestampSearchBytes;

        public TsPcrSeeker(int i, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, int i2) {
            this.pcrPid = i;
            this.pcrTimestampAdjuster = timestampAdjuster;
            this.timestampSearchBytes = i2;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException {
            long position = extractorInput.getPosition();
            int min = (int) java.lang.Math.min(this.timestampSearchBytes, extractorInput.getLength() - position);
            this.packetBuffer.reset(min);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
            return searchForPcrValueInBuffer(this.packetBuffer, j, position);
        }

        private androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForPcrValueInBuffer(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, long j2) {
            int findSyncBytePosition;
            int findSyncBytePosition2;
            int limit = parsableByteArray.limit();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 188 && (findSyncBytePosition2 = (findSyncBytePosition = androidx.media3.extractor.ts.TsUtil.findSyncBytePosition(parsableByteArray.getData(), parsableByteArray.getPosition(), limit)) + 188) <= limit) {
                long readPcrFromPacket = androidx.media3.extractor.ts.TsUtil.readPcrFromPacket(parsableByteArray, findSyncBytePosition, this.pcrPid);
                if (readPcrFromPacket != -9223372036854775807L) {
                    long adjustTsTimestamp = this.pcrTimestampAdjuster.adjustTsTimestamp(readPcrFromPacket);
                    if (adjustTsTimestamp > j) {
                        if (j5 == -9223372036854775807L) {
                            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(adjustTsTimestamp, j2);
                        }
                        return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j2 + j4);
                    }
                    if (100000 + adjustTsTimestamp > j) {
                        return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j2 + findSyncBytePosition);
                    }
                    j4 = findSyncBytePosition;
                    j5 = adjustTsTimestamp;
                }
                parsableByteArray.setPosition(findSyncBytePosition2);
                j3 = findSyncBytePosition2;
            }
            if (j5 != -9223372036854775807L) {
                return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j5, j2 + j3);
            }
            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY);
        }
    }
}
