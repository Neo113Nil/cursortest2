package com.google.android.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
final class FlacReader extends com.google.android.exoplayer2.extractor.ogg.StreamReader {
    private static final byte AUDIO_PACKET_TYPE = -1;
    private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
    private com.google.android.exoplayer2.extractor.ogg.FlacReader.FlacOggSeeker flacOggSeeker;
    private com.google.android.exoplayer2.extractor.FlacStreamMetadata streamMetadata;

    FlacReader() {
    }

    public static boolean verifyBitstreamType(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        return parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    protected void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.streamMetadata = null;
            this.flacOggSeeker = null;
        }
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    protected long preparePayload(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        if (isAudioPacket(parsableByteArray.getData())) {
            return getFlacFrameBlockSize(parsableByteArray);
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean readHeaders(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, long j, com.google.android.exoplayer2.extractor.ogg.StreamReader.SetupData setupData) {
        byte[] data = parsableByteArray.getData();
        com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata = this.streamMetadata;
        if (flacStreamMetadata == null) {
            com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata2 = new com.google.android.exoplayer2.extractor.FlacStreamMetadata(data, 17);
            this.streamMetadata = flacStreamMetadata2;
            setupData.format = flacStreamMetadata2.getFormat(java.util.Arrays.copyOfRange(data, 9, parsableByteArray.limit()), null);
            return true;
        }
        if ((data[0] & Byte.MAX_VALUE) == 3) {
            com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable readSeekTableMetadataBlock = com.google.android.exoplayer2.extractor.FlacMetadataReader.readSeekTableMetadataBlock(parsableByteArray);
            com.google.android.exoplayer2.extractor.FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(readSeekTableMetadataBlock);
            this.streamMetadata = copyWithSeekTable;
            this.flacOggSeeker = new com.google.android.exoplayer2.extractor.ogg.FlacReader.FlacOggSeeker(copyWithSeekTable, readSeekTableMetadataBlock);
            return true;
        }
        if (!isAudioPacket(data)) {
            return true;
        }
        com.google.android.exoplayer2.extractor.ogg.FlacReader.FlacOggSeeker flacOggSeeker = this.flacOggSeeker;
        if (flacOggSeeker != null) {
            flacOggSeeker.setFirstFrameOffset(j);
            setupData.oggSeeker = this.flacOggSeeker;
        }
        com.google.android.exoplayer2.util.Assertions.checkNotNull(setupData.format);
        return false;
    }

    private int getFlacFrameBlockSize(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int i = (parsableByteArray.getData()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            parsableByteArray.skipBytes(4);
            parsableByteArray.readUtf8EncodedLong();
        }
        int readFrameBlockSizeSamplesFromKey = com.google.android.exoplayer2.extractor.FlacFrameReader.readFrameBlockSizeSamplesFromKey(parsableByteArray, i);
        parsableByteArray.setPosition(0);
        return readFrameBlockSizeSamplesFromKey;
    }

    private static final class FlacOggSeeker implements com.google.android.exoplayer2.extractor.ogg.OggSeeker {
        private long firstFrameOffset = -1;
        private long pendingSeekGranule = -1;
        private com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable seekTable;
        private com.google.android.exoplayer2.extractor.FlacStreamMetadata streamMetadata;

        public FlacOggSeeker(com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata, com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable seekTable) {
            this.streamMetadata = flacStreamMetadata;
            this.seekTable = seekTable;
        }

        public void setFirstFrameOffset(long j) {
            this.firstFrameOffset = j;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public long read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) {
            long j = this.pendingSeekGranule;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.pendingSeekGranule = -1L;
            return j2;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public void startSeek(long j) {
            long[] jArr = this.seekTable.pointSampleNumbers;
            this.pendingSeekGranule = jArr[com.google.android.exoplayer2.util.Util.binarySearchFloor(jArr, j, true, true)];
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public com.google.android.exoplayer2.extractor.SeekMap createSeekMap() {
            com.google.android.exoplayer2.util.Assertions.checkState(this.firstFrameOffset != -1);
            return new com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap(this.streamMetadata, this.firstFrameOffset);
        }
    }
}
