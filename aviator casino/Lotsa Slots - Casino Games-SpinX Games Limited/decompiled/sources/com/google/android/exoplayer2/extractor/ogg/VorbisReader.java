package com.google.android.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
final class VorbisReader extends com.google.android.exoplayer2.extractor.ogg.StreamReader {
    private com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;
    private com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader;
    private com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup vorbisSetup;

    static int readBits(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    VorbisReader() {
    }

    public static boolean verifyBitstreamType(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        try {
            return com.google.android.exoplayer2.extractor.VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
        } catch (com.google.android.exoplayer2.ParserException unused) {
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    protected void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.vorbisSetup = null;
            this.vorbisIdHeader = null;
            this.commentHeader = null;
        }
        this.previousPacketBlockSize = 0;
        this.seenFirstAudioPacket = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    protected void onSeekEnd(long j) {
        super.onSeekEnd(j);
        this.seenFirstAudioPacket = j != 0;
        com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        this.previousPacketBlockSize = vorbisIdHeader != null ? vorbisIdHeader.blockSize0 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    protected long preparePayload(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        if ((parsableByteArray.getData()[0] & 1) == 1) {
            return -1L;
        }
        int decodeBlockSize = decodeBlockSize(parsableByteArray.getData()[0], (com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.vorbisSetup));
        long j = this.seenFirstAudioPacket ? (this.previousPacketBlockSize + decodeBlockSize) / 4 : 0;
        appendNumberOfSamples(parsableByteArray, j);
        this.seenFirstAudioPacket = true;
        this.previousPacketBlockSize = decodeBlockSize;
        return j;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean readHeaders(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, long j, com.google.android.exoplayer2.extractor.ogg.StreamReader.SetupData setupData) throws java.io.IOException {
        if (this.vorbisSetup != null) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(setupData.format);
            return false;
        }
        com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup readSetupHeaders = readSetupHeaders(parsableByteArray);
        this.vorbisSetup = readSetupHeaders;
        if (readSetupHeaders == null) {
            return true;
        }
        com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = readSetupHeaders.idHeader;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(vorbisIdHeader.data);
        arrayList.add(readSetupHeaders.setupHeaderData);
        setupData.format = new com.google.android.exoplayer2.Format.Builder().setSampleMimeType("audio/vorbis").setAverageBitrate(vorbisIdHeader.bitrateNominal).setPeakBitrate(vorbisIdHeader.bitrateMaximum).setChannelCount(vorbisIdHeader.channels).setSampleRate(vorbisIdHeader.sampleRate).setInitializationData(arrayList).setMetadata(com.google.android.exoplayer2.extractor.VorbisUtil.parseVorbisComments(com.google.common.collect.ImmutableList.copyOf(readSetupHeaders.commentHeader.comments))).build();
        return true;
    }

    com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup readSetupHeaders(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws java.io.IOException {
        com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader == null) {
            this.vorbisIdHeader = com.google.android.exoplayer2.extractor.VorbisUtil.readVorbisIdentificationHeader(parsableByteArray);
            return null;
        }
        com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader commentHeader = this.commentHeader;
        if (commentHeader == null) {
            this.commentHeader = com.google.android.exoplayer2.extractor.VorbisUtil.readVorbisCommentHeader(parsableByteArray);
            return null;
        }
        byte[] bArr = new byte[parsableByteArray.limit()];
        java.lang.System.arraycopy(parsableByteArray.getData(), 0, bArr, 0, parsableByteArray.limit());
        return new com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup(vorbisIdHeader, commentHeader, bArr, com.google.android.exoplayer2.extractor.VorbisUtil.readVorbisModes(parsableByteArray, vorbisIdHeader.channels), com.google.android.exoplayer2.extractor.VorbisUtil.iLog(r4.length - 1));
    }

    static void appendNumberOfSamples(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, long j) {
        if (parsableByteArray.capacity() < parsableByteArray.limit() + 4) {
            parsableByteArray.reset(java.util.Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit() + 4));
        } else {
            parsableByteArray.setLimit(parsableByteArray.limit() + 4);
        }
        byte[] data = parsableByteArray.getData();
        data[parsableByteArray.limit() - 4] = (byte) (j & 255);
        data[parsableByteArray.limit() - 3] = (byte) ((j >>> 8) & 255);
        data[parsableByteArray.limit() - 2] = (byte) ((j >>> 16) & 255);
        data[parsableByteArray.limit() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int decodeBlockSize(byte b, com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup vorbisSetup) {
        if (!vorbisSetup.modes[readBits(b, vorbisSetup.iLogModes, 1)].blockFlag) {
            return vorbisSetup.idHeader.blockSize0;
        }
        return vorbisSetup.idHeader.blockSize1;
    }

    static final class VorbisSetup {
        public final com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader idHeader;
        public final com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public VorbisSetup(com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader, com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader commentHeader, byte[] bArr, com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] modeArr, int i) {
            this.idHeader = vorbisIdHeader;
            this.commentHeader = commentHeader;
            this.setupHeaderData = bArr;
            this.modes = modeArr;
            this.iLogModes = i;
        }
    }
}
