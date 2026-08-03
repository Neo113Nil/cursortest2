package androidx.media3.extractor.ts;

/* loaded from: classes2.dex */
public final class H263Reader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final float[] PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private static final int START_CODE_VALUE_GROUP_OF_VOP = 179;
    private static final int START_CODE_VALUE_MAX_VIDEO_OBJECT = 31;
    private static final int START_CODE_VALUE_UNSET = -1;
    private static final int START_CODE_VALUE_USER_DATA = 178;
    private static final int START_CODE_VALUE_VISUAL_OBJECT = 181;
    private static final int START_CODE_VALUE_VISUAL_OBJECT_SEQUENCE = 176;
    private static final int START_CODE_VALUE_VOP = 182;
    private static final java.lang.String TAG = "H263Reader";
    private static final int VIDEO_OBJECT_LAYER_SHAPE_RECTANGULAR = 0;
    private final androidx.media3.extractor.ts.H263Reader.CsdBuffer csdBuffer;
    private java.lang.String formatId;
    private boolean hasOutputFormat;
    private androidx.media3.extractor.TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private androidx.media3.extractor.ts.H263Reader.SampleReader sampleReader;
    private long totalBytesWritten;
    private final androidx.media3.extractor.ts.NalUnitTargetBuffer userData;
    private final androidx.media3.common.util.ParsableByteArray userDataParsable;
    private final androidx.media3.extractor.ts.UserDataReader userDataReader;

    public H263Reader() {
        this(null);
    }

    H263Reader(androidx.media3.extractor.ts.UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new androidx.media3.extractor.ts.H263Reader.CsdBuffer(128);
        this.pesTimeUs = -9223372036854775807L;
        if (userDataReader != null) {
            this.userData = new androidx.media3.extractor.ts.NalUnitTargetBuffer(START_CODE_VALUE_USER_DATA, 128);
            this.userDataParsable = new androidx.media3.common.util.ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        androidx.media3.container.NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        androidx.media3.extractor.ts.H263Reader.SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
        androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.pesTimeUs = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        androidx.media3.extractor.TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new androidx.media3.extractor.ts.H263Reader.SampleReader(track);
        androidx.media3.extractor.ts.UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.pesTimeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.sampleReader);
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = androidx.media3.container.NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                break;
            }
            int i = findNalUnit + 3;
            int i2 = parsableByteArray.getData()[i] & 255;
            int i3 = findNalUnit - position;
            int i4 = 0;
            if (!this.hasOutputFormat) {
                if (i3 > 0) {
                    this.csdBuffer.onData(data, position, findNalUnit);
                }
                if (this.csdBuffer.onStartCode(i2, i3 < 0 ? -i3 : 0)) {
                    androidx.media3.extractor.TrackOutput trackOutput = this.output;
                    androidx.media3.extractor.ts.H263Reader.CsdBuffer csdBuffer = this.csdBuffer;
                    trackOutput.format(parseCsdBuffer(csdBuffer, csdBuffer.volStartPosition, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.formatId)));
                    this.hasOutputFormat = true;
                }
            }
            this.sampleReader.onData(data, position, findNalUnit);
            androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i3 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, findNalUnit);
                } else {
                    i4 = -i3;
                }
                if (this.userData.endNalUnit(i4)) {
                    ((androidx.media3.common.util.ParsableByteArray) androidx.media3.common.util.Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, androidx.media3.container.NalUnitUtil.unescapeStream(this.userData.nalData, this.userData.nalLength));
                    ((androidx.media3.extractor.ts.UserDataReader) androidx.media3.common.util.Util.castNonNull(this.userDataReader)).consume(this.pesTimeUs, this.userDataParsable);
                }
                if (i2 == START_CODE_VALUE_USER_DATA && parsableByteArray.getData()[findNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i2);
                }
            }
            int i5 = limit - findNalUnit;
            this.sampleReader.onDataEnd(this.totalBytesWritten - i5, i5, this.hasOutputFormat);
            this.sampleReader.onStartCode(i2, this.pesTimeUs);
            position = i;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, limit);
        }
        this.sampleReader.onData(data, position, limit);
        androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
        if (nalUnitTargetBuffer2 != null) {
            nalUnitTargetBuffer2.appendToNalUnit(data, position, limit);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.sampleReader);
        if (z) {
            this.sampleReader.onDataEnd(this.totalBytesWritten, 0, this.hasOutputFormat);
            this.sampleReader.reset();
        }
    }

    private static androidx.media3.common.Format parseCsdBuffer(androidx.media3.extractor.ts.H263Reader.CsdBuffer csdBuffer, int i, java.lang.String str) {
        byte[] copyOf = java.util.Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(copyOf);
        parsableBitArray.skipBytes(i);
        parsableBitArray.skipBytes(4);
        parsableBitArray.skipBit();
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        int readBits = parsableBitArray.readBits(4);
        float f = 1.0f;
        if (readBits == 15) {
            int readBits2 = parsableBitArray.readBits(8);
            int readBits3 = parsableBitArray.readBits(8);
            if (readBits3 == 0) {
                androidx.media3.common.util.Log.w(TAG, "Invalid aspect ratio");
            } else {
                f = readBits2 / readBits3;
            }
        } else {
            float[] fArr = PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO;
            if (readBits < fArr.length) {
                f = fArr[readBits];
            } else {
                androidx.media3.common.util.Log.w(TAG, "Invalid aspect ratio");
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(3);
                parsableBitArray.skipBits(11);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
            }
        }
        if (parsableBitArray.readBits(2) != 0) {
            androidx.media3.common.util.Log.w(TAG, "Unhandled video object layer shape");
        }
        parsableBitArray.skipBit();
        int readBits4 = parsableBitArray.readBits(16);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            if (readBits4 == 0) {
                androidx.media3.common.util.Log.w(TAG, "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = readBits4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                parsableBitArray.skipBits(i2);
            }
        }
        parsableBitArray.skipBit();
        int readBits5 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        int readBits6 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        parsableBitArray.skipBit();
        return new androidx.media3.common.Format.Builder().setId(str).setSampleMimeType("video/mp4v-es").setWidth(readBits5).setHeight(readBits6).setPixelWidthHeightRatio(f).setInitializationData(java.util.Collections.singletonList(copyOf)).build();
    }

    private static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        private static final int STATE_EXPECT_VIDEO_OBJECT_LAYER_START = 3;
        private static final int STATE_EXPECT_VIDEO_OBJECT_START = 2;
        private static final int STATE_EXPECT_VISUAL_OBJECT_START = 1;
        private static final int STATE_SKIP_TO_VISUAL_OBJECT_SEQUENCE_START = 0;
        private static final int STATE_WAIT_FOR_VOP_START = 4;
        public byte[] data;
        private boolean isFilling;
        public int length;
        private int state;
        public int volStartPosition;

        public CsdBuffer(int i) {
            this.data = new byte[i];
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.state = 0;
        }

        public boolean onStartCode(int i, int i2) {
            int i3 = this.state;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new java.lang.IllegalStateException();
                            }
                            if (i == androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_GROUP_OF_VOP || i == androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_VISUAL_OBJECT) {
                                this.length -= i2;
                                this.isFilling = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            androidx.media3.common.util.Log.w(androidx.media3.extractor.ts.H263Reader.TAG, "Unexpected start code value");
                            reset();
                        } else {
                            this.volStartPosition = this.length;
                            this.state = 4;
                        }
                    } else if (i > 31) {
                        androidx.media3.common.util.Log.w(androidx.media3.extractor.ts.H263Reader.TAG, "Unexpected start code value");
                        reset();
                    } else {
                        this.state = 3;
                    }
                } else if (i != androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_VISUAL_OBJECT) {
                    androidx.media3.common.util.Log.w(androidx.media3.extractor.ts.H263Reader.TAG, "Unexpected start code value");
                    reset();
                } else {
                    this.state = 2;
                }
            } else if (i == androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_VISUAL_OBJECT_SEQUENCE) {
                this.state = 1;
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.isFilling) {
                int i3 = i2 - i;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i4 = this.length;
                if (length < i4 + i3) {
                    this.data = java.util.Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                java.lang.System.arraycopy(bArr, i, this.data, this.length, i3);
                this.length += i3;
            }
        }
    }

    private static final class SampleReader {
        private static final int OFFSET_VOP_CODING_TYPE = 1;
        private static final int VOP_CODING_TYPE_INTRA = 0;
        private boolean lookingForVopCodingType;
        private final androidx.media3.extractor.TrackOutput output;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private int startCodeValue;
        private int vopBytesRead;

        public SampleReader(androidx.media3.extractor.TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        public void reset() {
            this.readingSample = false;
            this.lookingForVopCodingType = false;
            this.sampleIsKeyframe = false;
            this.startCodeValue = -1;
        }

        public void onStartCode(int i, long j) {
            this.startCodeValue = i;
            this.sampleIsKeyframe = false;
            this.readingSample = i == androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_VOP || i == androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_GROUP_OF_VOP;
            this.lookingForVopCodingType = i == androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_VOP;
            this.vopBytesRead = 0;
            this.sampleTimeUs = j;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.lookingForVopCodingType) {
                int i3 = this.vopBytesRead;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.sampleIsKeyframe = ((bArr[i4] & 192) >> 6) == 0;
                    this.lookingForVopCodingType = false;
                } else {
                    this.vopBytesRead = i3 + (i2 - i);
                }
            }
        }

        public void onDataEnd(long j, int i, boolean z) {
            androidx.media3.common.util.Assertions.checkState(this.sampleTimeUs != -9223372036854775807L);
            if (this.startCodeValue == androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_VOP && z && this.readingSample) {
                this.output.sampleMetadata(this.sampleTimeUs, this.sampleIsKeyframe ? 1 : 0, (int) (j - this.samplePosition), i, null);
            }
            if (this.startCodeValue != androidx.media3.extractor.ts.H263Reader.START_CODE_VALUE_GROUP_OF_VOP) {
                this.samplePosition = j;
            }
        }
    }
}
