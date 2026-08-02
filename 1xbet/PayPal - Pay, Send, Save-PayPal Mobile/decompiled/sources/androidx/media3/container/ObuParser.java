package androidx.media3.container;

/* loaded from: classes7.dex */
public final class ObuParser {
    public static final int OBU_FRAME = 6;
    public static final int OBU_FRAME_HEADER = 3;
    public static final int OBU_METADATA = 5;
    public static final int OBU_PADDING = 15;
    public static final int OBU_SEQUENCE_HEADER = 1;
    public static final int OBU_TEMPORAL_DELIMITER = 2;

    public static final class Obu {
        public final java.nio.ByteBuffer payload;
        public final int type;

        /* synthetic */ Obu(int i, java.nio.ByteBuffer byteBuffer, byte b) {
            this(i, byteBuffer);
        }

        private Obu(int i, java.nio.ByteBuffer byteBuffer) {
            this.type = i;
            this.payload = byteBuffer;
        }
    }

    public static java.util.List<androidx.media3.container.ObuParser.Obu> split(java.nio.ByteBuffer byteBuffer) {
        int remaining;
        java.nio.ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = asReadOnlyBuffer.get();
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                byte b2 = 0;
                if (((b >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i = 0; i < 8; i++) {
                        byte b3 = asReadOnlyBuffer.get();
                        remaining |= (b3 & Byte.MAX_VALUE) << (i * 7);
                        if ((b3 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                java.nio.ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new androidx.media3.container.ObuParser.Obu((b >> 3) & 15, duplicate, b2));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (java.nio.BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static final class SequenceHeader {
        public final int chromaSamplePosition;
        public final byte colorPrimaries;
        public final boolean decoderModelInfoPresentFlag;
        public final boolean frameIdNumbersPresentFlag;
        public final boolean highBitdepth;
        public final int initialDisplayDelayMinus1;
        public final boolean initialDisplayDelayPresentFlag;
        public final byte matrixCoefficients;
        public final boolean monochrome;
        public final int orderHintBits;
        public final boolean reducedStillPictureHeader;
        public final boolean seqForceIntegerMv;
        public final boolean seqForceScreenContentTools;
        public final int seqLevelIdx0;
        public final int seqProfile;
        public final int seqTier0;
        public final boolean subsamplingX;
        public final boolean subsamplingY;
        public final byte transferCharacteristics;
        public final boolean twelveBit;

        public static androidx.media3.container.ObuParser.SequenceHeader parse(androidx.media3.container.ObuParser.Obu obu) {
            try {
                return new androidx.media3.container.ObuParser.SequenceHeader(obu);
            } catch (androidx.media3.container.ObuParser.NotYetImplementedException unused) {
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private SequenceHeader(androidx.media3.container.ObuParser.Obu obu) throws androidx.media3.container.ObuParser.NotYetImplementedException {
            int i;
            int i2;
            boolean z;
            ?? r9;
            com.google.common.base.Preconditions.checkArgument(obu.type == 1);
            byte[] bArr = new byte[obu.payload.remaining()];
            obu.payload.asReadOnlyBuffer().get(bArr);
            androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr);
            this.seqProfile = parsableBitArray.readBits(3);
            parsableBitArray.skipBit();
            boolean readBit = parsableBitArray.readBit();
            this.reducedStillPictureHeader = readBit;
            if (readBit) {
                i2 = parsableBitArray.readBits(5);
                this.decoderModelInfoPresentFlag = false;
                this.initialDisplayDelayPresentFlag = false;
                i = 0;
                r9 = 0;
            } else {
                if (!parsableBitArray.readBit()) {
                    this.decoderModelInfoPresentFlag = false;
                } else {
                    parsableBitArray.skipBits(64);
                    if (parsableBitArray.readBit()) {
                        androidx.media3.container.ObuParser.getHighSpeedVideoFpsRangesFor(parsableBitArray);
                    }
                    boolean readBit2 = parsableBitArray.readBit();
                    this.decoderModelInfoPresentFlag = readBit2;
                    if (readBit2) {
                        parsableBitArray.skipBits(47);
                    }
                }
                this.initialDisplayDelayPresentFlag = parsableBitArray.readBit();
                int readBits = parsableBitArray.readBits(5);
                int i3 = 0;
                int i4 = 0;
                i = 0;
                boolean z2 = false;
                while (i4 <= readBits) {
                    parsableBitArray.skipBits(12);
                    if (i4 == 0) {
                        i3 = parsableBitArray.readBits(5);
                        z = z2;
                        if (i3 > 7) {
                            z = parsableBitArray.readBit();
                        }
                    } else {
                        z = z2;
                        if (parsableBitArray.readBits(5) > 7) {
                            parsableBitArray.skipBit();
                            z = z2;
                        }
                    }
                    if (this.decoderModelInfoPresentFlag) {
                        parsableBitArray.skipBit();
                    }
                    if (this.initialDisplayDelayPresentFlag && parsableBitArray.readBit()) {
                        if (i4 == 0) {
                            i = parsableBitArray.readBits(4);
                        } else {
                            parsableBitArray.skipBits(4);
                        }
                    }
                    i4++;
                    z2 = z;
                }
                i2 = i3;
                r9 = z2;
            }
            int readBits2 = parsableBitArray.readBits(4);
            int readBits3 = parsableBitArray.readBits(4);
            parsableBitArray.skipBits(readBits2 + 1);
            parsableBitArray.skipBits(readBits3 + 1);
            if (!this.reducedStillPictureHeader) {
                this.frameIdNumbersPresentFlag = parsableBitArray.readBit();
            } else {
                this.frameIdNumbersPresentFlag = false;
            }
            if (this.frameIdNumbersPresentFlag) {
                parsableBitArray.skipBits(4);
                parsableBitArray.skipBits(3);
            }
            parsableBitArray.skipBits(3);
            if (this.reducedStillPictureHeader) {
                this.seqForceIntegerMv = true;
                this.seqForceScreenContentTools = true;
            } else {
                parsableBitArray.skipBits(4);
                boolean readBit3 = parsableBitArray.readBit();
                if (readBit3) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    this.seqForceScreenContentTools = true;
                } else {
                    this.seqForceScreenContentTools = parsableBitArray.readBit();
                }
                if (this.seqForceScreenContentTools && !parsableBitArray.readBit()) {
                    this.seqForceIntegerMv = parsableBitArray.readBit();
                } else {
                    this.seqForceIntegerMv = true;
                }
                if (readBit3) {
                    this.orderHintBits = parsableBitArray.readBits(3) + 1;
                    this.seqLevelIdx0 = i2;
                    this.seqTier0 = r9;
                    this.initialDisplayDelayMinus1 = i;
                    parsableBitArray.skipBits(3);
                    boolean readBit4 = parsableBitArray.readBit();
                    this.highBitdepth = readBit4;
                    if (this.seqProfile != 2 && readBit4) {
                        this.twelveBit = parsableBitArray.readBit();
                    } else {
                        this.twelveBit = false;
                    }
                    if (this.seqProfile == 1) {
                        this.monochrome = parsableBitArray.readBit();
                    } else {
                        this.monochrome = false;
                    }
                    if (!parsableBitArray.readBit()) {
                        this.colorPrimaries = (byte) parsableBitArray.readBits(8);
                        this.transferCharacteristics = (byte) parsableBitArray.readBits(8);
                        this.matrixCoefficients = (byte) parsableBitArray.readBits(8);
                    } else {
                        this.colorPrimaries = (byte) 0;
                        this.transferCharacteristics = (byte) 0;
                        this.matrixCoefficients = (byte) 0;
                    }
                    if (!this.monochrome) {
                        parsableBitArray.skipBit();
                        this.subsamplingX = false;
                        this.subsamplingY = false;
                    } else if (this.colorPrimaries == 1 && this.transferCharacteristics == 13 && this.matrixCoefficients == 0) {
                        this.subsamplingX = false;
                        this.subsamplingY = false;
                    } else {
                        parsableBitArray.skipBit();
                        int i5 = this.seqProfile;
                        if (i5 == 0) {
                            this.subsamplingX = true;
                            this.subsamplingY = true;
                        } else if (i5 == 1) {
                            this.subsamplingX = false;
                            this.subsamplingY = false;
                        } else if (this.twelveBit) {
                            boolean readBit5 = parsableBitArray.readBit();
                            this.subsamplingX = readBit5;
                            if (readBit5) {
                                this.subsamplingY = parsableBitArray.readBit();
                            } else {
                                this.subsamplingY = false;
                            }
                        } else {
                            this.subsamplingX = true;
                            this.subsamplingY = false;
                        }
                        if (this.subsamplingX && this.subsamplingY) {
                            this.chromaSamplePosition = parsableBitArray.readBits(2);
                            parsableBitArray.skipBit();
                        }
                    }
                    this.chromaSamplePosition = 0;
                    parsableBitArray.skipBit();
                }
            }
            this.orderHintBits = 0;
            this.seqLevelIdx0 = i2;
            this.seqTier0 = r9;
            this.initialDisplayDelayMinus1 = i;
            parsableBitArray.skipBits(3);
            boolean readBit42 = parsableBitArray.readBit();
            this.highBitdepth = readBit42;
            if (this.seqProfile != 2) {
            }
            this.twelveBit = false;
            if (this.seqProfile == 1) {
            }
            if (!parsableBitArray.readBit()) {
            }
            if (!this.monochrome) {
            }
            this.chromaSamplePosition = 0;
            parsableBitArray.skipBit();
        }
    }

    public static final class FrameHeader {
        private final boolean getHighSpeedVideoFpsRanges;

        public final boolean isDependedOn() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public static androidx.media3.container.ObuParser.FrameHeader parse(androidx.media3.container.ObuParser.SequenceHeader sequenceHeader, androidx.media3.container.ObuParser.Obu obu) {
            try {
                return new androidx.media3.container.ObuParser.FrameHeader(sequenceHeader, obu);
            } catch (androidx.media3.container.ObuParser.NotYetImplementedException unused) {
                return null;
            }
        }

        private FrameHeader(androidx.media3.container.ObuParser.SequenceHeader sequenceHeader, androidx.media3.container.ObuParser.Obu obu) throws androidx.media3.container.ObuParser.NotYetImplementedException {
            com.google.common.base.Preconditions.checkArgument(obu.type == 6 || obu.type == 3);
            byte[] bArr = new byte[java.lang.Math.min(4, obu.payload.remaining())];
            obu.payload.asReadOnlyBuffer().get(bArr);
            androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr);
            androidx.media3.container.ObuParser.getHighSpeedVideoFpsRangesFor(sequenceHeader.reducedStillPictureHeader);
            if (parsableBitArray.readBit()) {
                this.getHighSpeedVideoFpsRanges = false;
                return;
            }
            int readBits = parsableBitArray.readBits(2);
            boolean readBit = parsableBitArray.readBit();
            androidx.media3.container.ObuParser.getHighSpeedVideoFpsRangesFor(sequenceHeader.decoderModelInfoPresentFlag);
            if (!readBit) {
                this.getHighSpeedVideoFpsRanges = true;
                return;
            }
            boolean readBit2 = (readBits == 3 || readBits == 0) ? true : parsableBitArray.readBit();
            parsableBitArray.skipBit();
            androidx.media3.container.ObuParser.getHighSpeedVideoFpsRangesFor(!sequenceHeader.seqForceScreenContentTools);
            if (parsableBitArray.readBit()) {
                androidx.media3.container.ObuParser.getHighSpeedVideoFpsRangesFor(!sequenceHeader.seqForceIntegerMv);
                parsableBitArray.skipBit();
            }
            androidx.media3.container.ObuParser.getHighSpeedVideoFpsRangesFor(sequenceHeader.frameIdNumbersPresentFlag);
            if (readBits != 3) {
                parsableBitArray.skipBit();
            }
            parsableBitArray.skipBits(sequenceHeader.orderHintBits);
            if (readBits != 2 && readBits != 0 && !readBit2) {
                parsableBitArray.skipBits(3);
            }
            this.getHighSpeedVideoFpsRanges = ((readBits == 3 || readBits == 0) ? 255 : parsableBitArray.readBits(8)) != 0;
        }
    }

    static class NotYetImplementedException extends java.lang.Exception {
        private NotYetImplementedException() {
        }

        /* synthetic */ NotYetImplementedException(byte b) {
            this();
        }
    }

    private ObuParser() {
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int i = 0;
        while (!parsableBitArray.readBit()) {
            i++;
        }
        if (i < 32) {
            parsableBitArray.skipBits(i);
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(boolean z) throws androidx.media3.container.ObuParser.NotYetImplementedException {
        if (z) {
            throw new androidx.media3.container.ObuParser.NotYetImplementedException((byte) 0);
        }
    }
}
