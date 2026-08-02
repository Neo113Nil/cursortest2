package androidx.media3.container;

/* loaded from: classes7.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    public static final int H264_NAL_UNIT_TYPE_AUD = 9;
    public static final int H264_NAL_UNIT_TYPE_IDR = 5;
    public static final int H264_NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int H264_NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int H264_NAL_UNIT_TYPE_PPS = 8;
    public static final int H264_NAL_UNIT_TYPE_PREFIX = 14;
    public static final int H264_NAL_UNIT_TYPE_SEI = 6;
    public static final int H264_NAL_UNIT_TYPE_SPS = 7;
    public static final int H264_NAL_UNIT_TYPE_UNSPECIFIED = 24;
    public static final int H265_NAL_UNIT_TYPE_AUD = 35;
    public static final int H265_NAL_UNIT_TYPE_BLA_W_LP = 16;
    public static final int H265_NAL_UNIT_TYPE_CRA = 21;
    public static final int H265_NAL_UNIT_TYPE_PPS = 34;
    public static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int H265_NAL_UNIT_TYPE_RASL_R = 9;
    public static final int H265_NAL_UNIT_TYPE_SPS = 33;
    public static final int H265_NAL_UNIT_TYPE_SUFFIX_SEI = 40;
    public static final int H265_NAL_UNIT_TYPE_UNSPECIFIED = 48;
    public static final int H265_NAL_UNIT_TYPE_VPS = 32;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_AUD = 9;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_IDR = 5;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_PPS = 8;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_PREFIX = 14;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_SEI = 6;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_SPS = 7;
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private static int[] getHighSpeedVideoFpsRanges = new int[10];

    public static boolean isH264NalUnitDependedOn(byte b) {
        if (((b & com.visa.cbp.getEncExpo.IResultReceiver2) >> 5) != 0) {
            return true;
        }
        int i = b & com.google.common.base.Ascii.US;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.profileIdc = i;
            this.constraintsFlagsAndReservedZero2Bits = i2;
            this.levelIdc = i3;
            this.seqParameterSetId = i4;
            this.maxNumRefFrames = i5;
            this.width = i6;
            this.height = i7;
            this.pixelWidthHeightRatio = f;
            this.bitDepthLumaMinus8 = i8;
            this.bitDepthChromaMinus8 = i9;
            this.separateColorPlaneFlag = z;
            this.frameMbsOnlyFlag = z2;
            this.frameNumLength = i10;
            this.picOrderCountType = i11;
            this.picOrderCntLsbLength = i12;
            this.deltaPicOrderAlwaysZeroFlag = z3;
            this.colorSpace = i13;
            this.colorRange = i14;
            this.colorTransfer = i15;
            this.maxNumReorderFrames = i16;
        }
    }

    public static final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i, int i2, int i3) {
            this.nalUnitType = i;
            this.layerId = i2;
            this.temporalId = i3;
        }
    }

    public static final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i, int i2) {
            this.layerIdInVps = i;
            this.viewId = i2;
        }
    }

    public static final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.generalProfileSpace = i;
            this.generalTierFlag = z;
            this.generalProfileIdc = i2;
            this.generalProfileCompatibilityFlags = i3;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i4;
        }
    }

    public static final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final com.google.common.collect.ImmutableList<androidx.media3.container.NalUnitUtil.H265ProfileTierLevel> profileTierLevels;

        public H265ProfileTierLevelsAndIndices(java.util.List<androidx.media3.container.NalUnitUtil.H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i, int i2, int i3, int i4, int i5) {
            this.chromaFormatIdc = i;
            this.bitDepthLumaMinus8 = i2;
            this.bitDepthChromaMinus8 = i3;
            this.width = i4;
            this.height = i5;
        }
    }

    public static final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final com.google.common.collect.ImmutableList<androidx.media3.container.NalUnitUtil.H265RepFormat> repFormats;

        public H265RepFormatsAndIndices(java.util.List<androidx.media3.container.NalUnitUtil.H265RepFormat> list, int[] iArr) {
            this.repFormats = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i, int i2, int i3) {
            this.colorSpace = i;
            this.colorRange = i2;
            this.colorTransfer = i3;
        }
    }

    public static final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final com.google.common.collect.ImmutableList<androidx.media3.container.NalUnitUtil.H265VideoSignalInfo> videoSignalInfos;

        public H265VideoSignalInfosAndIndices(java.util.List<androidx.media3.container.NalUnitUtil.H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265VpsData {
        public final com.google.common.collect.ImmutableList<androidx.media3.container.NalUnitUtil.H265LayerInfo> layerInfos;
        public final androidx.media3.container.NalUnitUtil.H265NalHeader nalHeader;
        public final androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;
        public final androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices repFormatsAndIndices;
        public final androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader, java.util.List<androidx.media3.container.NalUnitUtil.H265LayerInfo> list, androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices h265RepFormatsAndIndices, androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            this.nalHeader = h265NalHeader;
            this.layerInfos = list != null ? com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list) : com.google.common.collect.ImmutableList.of();
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int decodedHeight;
        public final int decodedWidth;
        public final int height;
        public final int maxNumReorderPics;
        public final int maxSubLayersMinus1;
        public final androidx.media3.container.NalUnitUtil.H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;
        public final androidx.media3.container.NalUnitUtil.H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader, int i, androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, int i11, int i12, int i13) {
            this.nalHeader = h265NalHeader;
            this.maxSubLayersMinus1 = i;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i2;
            this.bitDepthLumaMinus8 = i3;
            this.bitDepthChromaMinus8 = i4;
            this.seqParameterSetId = i5;
            this.width = i6;
            this.height = i7;
            this.pixelWidthHeightRatio = f;
            this.maxNumReorderPics = i10;
            this.colorSpace = i11;
            this.colorRange = i12;
            this.colorTransfer = i13;
            this.decodedWidth = i8;
            this.decodedHeight = i9;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i, int i2, boolean z) {
            this.picParameterSetId = i;
            this.seqParameterSetId = i2;
            this.bottomFieldPicOrderInFramePresentFlag = z;
        }
    }

    public static final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.precRefDisplayWidth = i;
            this.precRefViewingDist = i2;
            this.numRefDisplays = i3;
            this.leftViewId = i4;
            this.rightViewId = i5;
            this.exponentRefDisplayWidth = i6;
            this.mantissaRefDisplayWidth = i7;
            this.exponentRefViewingDist = i8;
            this.mantissaRefViewingDist = i9;
        }
    }

    public static int unescapeStream(byte[] bArr, int i) {
        int i2;
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i) {
                    int[] iArr = getHighSpeedVideoFpsRanges;
                    if (iArr.length <= i4) {
                        getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    getHighSpeedVideoFpsRanges[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < i4) {
                int i8 = getHighSpeedVideoFpsRanges[i5] - i6;
                java.lang.System.arraycopy(bArr, i6, bArr, i7, i8);
                int i9 = i7 + i8;
                bArr[i9] = 0;
                bArr[i9 + 1] = 0;
                i6 += i8 + 3;
                i5++;
                i7 = i9 + 2;
            }
            java.lang.System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    public static void discardToSps(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & com.google.common.base.Ascii.US) == 7) {
                        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    @java.lang.Deprecated
    public static boolean isNalUnitSei(java.lang.String str, byte b) {
        return ("video/avc".equals(str) && (b & com.google.common.base.Ascii.US) == 6) || (androidx.media3.common.MimeTypes.VIDEO_H265.equals(str) && ((b & 126) >> 1) == 39);
    }

    public static boolean isNalUnitSei(androidx.media3.common.Format format, byte b) {
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(format);
        return (java.util.Objects.equals(Camera2StreamConfigurationMap, "video/avc") && (b & com.google.common.base.Ascii.US) == 6) || (java.util.Objects.equals(Camera2StreamConfigurationMap, androidx.media3.common.MimeTypes.VIDEO_H265) && ((b & 126) >> 1) == 39);
    }

    public static int getNalUnitType(byte[] bArr, int i) {
        return bArr[i + 3] & com.google.common.base.Ascii.US;
    }

    public static int numberOfBytesInNalUnitHeader(androidx.media3.common.Format format) {
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(format);
        if (java.util.Objects.equals(Camera2StreamConfigurationMap, "video/avc")) {
            return 1;
        }
        return java.util.Objects.equals(Camera2StreamConfigurationMap, androidx.media3.common.MimeTypes.VIDEO_H265) ? 2 : 0;
    }

    public static boolean isDependedOn(byte[] bArr, int i, int i2, androidx.media3.common.Format format) {
        if (java.util.Objects.equals(format.sampleMimeType, "video/avc")) {
            return isH264NalUnitDependedOn(bArr[i]);
        }
        if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_H265)) {
            androidx.media3.container.NalUnitUtil.H265NalHeader highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2 + i));
            if (highSpeedVideoFpsRangesFor.nalUnitType == 35) {
                return false;
            }
            if (highSpeedVideoFpsRangesFor.nalUnitType <= 14 && highSpeedVideoFpsRangesFor.nalUnitType % 2 == 0 && highSpeedVideoFpsRangesFor.temporalId == format.maxSubLayers - 1) {
                return false;
            }
        }
        return true;
    }

    public static int getH265NalUnitType(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnit(byte[] bArr, int i, int i2) {
        return parseSpsNalUnitPayload(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] bArr, int i, int i2) {
        int readUnsignedExpGolombCodedInt;
        boolean readBit;
        int readUnsignedExpGolombCodedInt2;
        int readUnsignedExpGolombCodedInt3;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean readBit2;
        boolean readBit3;
        int i10;
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2);
        int readBits = parsableNalUnitBitArray.readBits(8);
        int readBits2 = parsableNalUnitBitArray.readBits(8);
        int readBits3 = parsableNalUnitBitArray.readBits(8);
        int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readBits == 100 || readBits == 110 || readBits == 122 || readBits == 244 || readBits == 44 || readBits == 83 || readBits == 86 || readBits == 118 || readBits == 128 || readBits == 138) {
            readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readBit = readUnsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i11 = readUnsignedExpGolombCodedInt == 3 ? 12 : 8;
                int i12 = 0;
                while (i12 < i11) {
                    if (parsableNalUnitBitArray.readBit()) {
                        int i13 = i12 < 6 ? 16 : 64;
                        int i14 = 8;
                        int i15 = 8;
                        for (int i16 = 0; i16 < i13; i16++) {
                            if (i14 != 0) {
                                i14 = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i15) + 256) % 256;
                            }
                            if (i14 != 0) {
                                i15 = i14;
                            }
                        }
                    }
                    i12++;
                }
            }
        } else {
            readUnsignedExpGolombCodedInt = 1;
            readBit = false;
            readUnsignedExpGolombCodedInt2 = 0;
            readUnsignedExpGolombCodedInt3 = 0;
        }
        int readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readUnsignedExpGolombCodedInt6 == 0) {
            i3 = readBits;
            i4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
            z2 = false;
        } else {
            if (readUnsignedExpGolombCodedInt6 == 1) {
                boolean readBit4 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                i3 = readBits;
                long readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i17 = 0; i17 < readUnsignedExpGolombCodedInt7; i17++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z = readBit4;
            } else {
                i3 = readBits;
                z = false;
            }
            z2 = z;
            i4 = 0;
        }
        int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int readUnsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        boolean readBit5 = parsableNalUnitBitArray.readBit();
        if (!readBit5) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        int i18 = (readUnsignedExpGolombCodedInt9 + 1) * 16;
        int i19 = 2 - (readBit5 ? 1 : 0);
        int i20 = (readUnsignedExpGolombCodedInt10 + 1) * i19 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (readUnsignedExpGolombCodedInt == 0) {
                i10 = 1;
            } else {
                i10 = readUnsignedExpGolombCodedInt == 3 ? 1 : 2;
                i19 *= readUnsignedExpGolombCodedInt == 1 ? 2 : 1;
            }
            i18 -= (readUnsignedExpGolombCodedInt11 + readUnsignedExpGolombCodedInt12) * i10;
            i20 -= (readUnsignedExpGolombCodedInt13 + readUnsignedExpGolombCodedInt14) * i19;
        }
        int i21 = i18;
        int i22 = i20;
        int i23 = i3;
        int i24 = ((i23 == 44 || i23 == 86 || i23 == 100 || i23 == 110 || i23 == 122 || i23 == 244) && (readBits2 & 16) != 0) ? 0 : 16;
        float f2 = 1.0f;
        int i25 = -1;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int readBits4 = parsableNalUnitBitArray.readBits(8);
                if (readBits4 == 255) {
                    int readBits5 = parsableNalUnitBitArray.readBits(16);
                    int readBits6 = parsableNalUnitBitArray.readBits(16);
                    if (readBits5 != 0 && readBits6 != 0) {
                        f2 = readBits5 / readBits6;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (readBits4 < fArr.length) {
                        f2 = fArr[readBits4];
                    } else {
                        androidx.media3.common.util.Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: ".concat(java.lang.String.valueOf(readBits4)));
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i8 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int readBits7 = parsableNalUnitBitArray.readBits(8);
                    int readBits8 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    i25 = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(readBits7);
                    i9 = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits8);
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBits(65);
                    }
                    readBit2 = parsableNalUnitBitArray.readBit();
                    if (readBit2) {
                        getHighResolutionOutputSizeshNQ4ISI(parsableNalUnitBitArray);
                    }
                    readBit3 = parsableNalUnitBitArray.readBit();
                    if (readBit3) {
                        getHighResolutionOutputSizeshNQ4ISI(parsableNalUnitBitArray);
                    }
                    if (!readBit2 || readBit3) {
                        parsableNalUnitBitArray.skipBit();
                    }
                    parsableNalUnitBitArray.skipBit();
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i24 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    i7 = i9;
                    i5 = i24;
                    i6 = i8;
                    f = f2;
                }
            } else {
                i8 = -1;
            }
            i9 = -1;
            if (parsableNalUnitBitArray.readBit()) {
            }
            if (parsableNalUnitBitArray.readBit()) {
            }
            readBit2 = parsableNalUnitBitArray.readBit();
            if (readBit2) {
            }
            readBit3 = parsableNalUnitBitArray.readBit();
            if (readBit3) {
            }
            if (!readBit2) {
            }
            parsableNalUnitBitArray.skipBit();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
            }
            i7 = i9;
            i5 = i24;
            i6 = i8;
            f = f2;
        } else {
            i5 = i24;
            f = 1.0f;
            i6 = -1;
            i7 = -1;
        }
        return new androidx.media3.container.NalUnitUtil.SpsData(i23, readBits2, readBits3, readUnsignedExpGolombCodedInt4, readUnsignedExpGolombCodedInt8, i21, i22, f, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt3, readBit, readBit5, readUnsignedExpGolombCodedInt5 + 4, readUnsignedExpGolombCodedInt6, i4, z2, i25, i6, i7, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:448:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.media3.container.NalUnitUtil.H265VpsData parseH265VpsNalUnit(byte[] bArr, int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        com.google.common.collect.ImmutableList immutableList;
        int i11;
        boolean[][] zArr;
        int i12;
        boolean[][] zArr2;
        int i13;
        int[] iArr3;
        int i14;
        boolean z;
        boolean readBit;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        boolean z3;
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2);
        androidx.media3.container.NalUnitUtil.H265NalHeader highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(parsableNalUnitBitArray);
        parsableNalUnitBitArray.skipBits(4);
        boolean readBit2 = parsableNalUnitBitArray.readBit();
        boolean readBit3 = parsableNalUnitBitArray.readBit();
        int readBits = parsableNalUnitBitArray.readBits(6);
        int i21 = readBits + 1;
        int readBits2 = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBits(17);
        int i22 = 1;
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(parsableNalUnitBitArray, true, readBits2, null);
        int i23 = 0;
        for (int i24 = parsableNalUnitBitArray.readBit() ? 0 : readBits2; i24 <= readBits2; i24++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int readBits3 = parsableNalUnitBitArray.readBits(6);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices(com.google.common.collect.ImmutableList.of(highSpeedVideoFpsRangesFor2), new int[1]);
        boolean z4 = i21 >= 2 && readUnsignedExpGolombCodedInt >= 2;
        boolean z5 = readBit2 && readBit3;
        int i25 = readBits3 + 1;
        boolean z6 = i25 >= i21;
        if (!z4 || !z5 || !z6) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[][] iArr4 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, readUnsignedExpGolombCodedInt, i25);
        int[] iArr5 = new int[readUnsignedExpGolombCodedInt];
        int[] iArr6 = new int[readUnsignedExpGolombCodedInt];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        while (i22 < readUnsignedExpGolombCodedInt) {
            int i26 = i23;
            while (i23 <= readBits3) {
                if (parsableNalUnitBitArray.readBit()) {
                    iArr4[i22][i26] = i23;
                    iArr6[i22] = i23;
                    i26++;
                }
                iArr5[i22] = i26;
                i23++;
            }
            i22++;
            i23 = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(64);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            for (int i27 = 0; i27 < readUnsignedExpGolombCodedInt2; i27++) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (i27 == 0 || parsableNalUnitBitArray.readBit()) {
                    boolean readBit4 = parsableNalUnitBitArray.readBit();
                    boolean readBit5 = parsableNalUnitBitArray.readBit();
                    z3 = readBit4;
                    z2 = readBit5;
                    if (readBit4 || readBit5) {
                        readBit = parsableNalUnitBitArray.readBit();
                        if (readBit) {
                            parsableNalUnitBitArray.skipBits(19);
                        }
                        parsableNalUnitBitArray.skipBits(8);
                        if (readBit) {
                            parsableNalUnitBitArray.skipBits(4);
                        }
                        parsableNalUnitBitArray.skipBits(15);
                        i16 = readBit4;
                        i15 = readBit5;
                        i17 = 0;
                        while (i17 <= readBits2) {
                            boolean readBit6 = parsableNalUnitBitArray.readBit();
                            if (!readBit6) {
                                readBit6 = parsableNalUnitBitArray.readBit();
                            }
                            if (readBit6) {
                                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                            } else if (parsableNalUnitBitArray.readBit()) {
                                i18 = readUnsignedExpGolombCodedInt2;
                                i19 = 0;
                                int[][] iArr7 = iArr4;
                                int[] iArr8 = iArr6;
                                for (i20 = 0; i20 < i16 + i15; i20++) {
                                    for (int i28 = 0; i28 <= i19; i28++) {
                                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                                        if (readBit) {
                                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                                        }
                                        parsableNalUnitBitArray.skipBit();
                                    }
                                }
                                i17++;
                                readUnsignedExpGolombCodedInt2 = i18;
                                iArr6 = iArr8;
                                iArr4 = iArr7;
                            }
                            i18 = readUnsignedExpGolombCodedInt2;
                            i19 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                            int[][] iArr72 = iArr4;
                            int[] iArr82 = iArr6;
                            while (i20 < i16 + i15) {
                            }
                            i17++;
                            readUnsignedExpGolombCodedInt2 = i18;
                            iArr6 = iArr82;
                            iArr4 = iArr72;
                        }
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                readBit = false;
                i16 = z3;
                i15 = z2;
                i17 = 0;
                while (i17 <= readBits2) {
                }
            }
        }
        int[][] iArr9 = iArr4;
        int[] iArr10 = iArr6;
        if (!parsableNalUnitBitArray.readBit()) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        parsableNalUnitBitArray.byteAlign();
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(parsableNalUnitBitArray, false, readBits2, highSpeedVideoFpsRangesFor2);
        boolean readBit7 = parsableNalUnitBitArray.readBit();
        boolean[] zArr3 = new boolean[16];
        int i29 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            boolean readBit8 = parsableNalUnitBitArray.readBit();
            zArr3[i30] = readBit8;
            if (readBit8) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr3[1]) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr11 = new int[i29];
        for (int i31 = 0; i31 < i29 - (readBit7 ? 1 : 0); i31++) {
            iArr11[i31] = parsableNalUnitBitArray.readBits(3);
        }
        int[] iArr12 = new int[i29 + 1];
        if (readBit7) {
            int i32 = 1;
            while (i32 < i29) {
                int[] iArr13 = iArr5;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr12[i32] = iArr12[i32] + iArr11[i33] + 1;
                }
                i32++;
                iArr5 = iArr13;
            }
            iArr = iArr5;
            iArr12[i29] = 6;
        } else {
            iArr = iArr5;
        }
        int[][] iArr14 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i21, i29);
        int[] iArr15 = new int[i21];
        iArr15[0] = 0;
        boolean readBit9 = parsableNalUnitBitArray.readBit();
        int i34 = 1;
        while (i34 < i21) {
            if (readBit9) {
                i14 = readUnsignedExpGolombCodedInt;
                iArr15[i34] = parsableNalUnitBitArray.readBits(6);
            } else {
                i14 = readUnsignedExpGolombCodedInt;
                iArr15[i34] = i34;
            }
            if (readBit7) {
                z = readBit7 ? 1 : 0;
                for (int i35 = 0; i35 < i29; i35++) {
                    iArr14[i34][i35] = (iArr15[i34] & ((1 << iArr12[r30]) - 1)) >> iArr12[i35];
                }
            } else {
                int i36 = 0;
                while (i36 < i29) {
                    iArr14[i34][i36] = parsableNalUnitBitArray.readBits(iArr11[i36] + 1);
                    i36++;
                    readBit7 = readBit7;
                }
                z = readBit7;
            }
            i34++;
            readUnsignedExpGolombCodedInt = i14;
            readBit7 = z;
        }
        int i37 = readUnsignedExpGolombCodedInt;
        int[] iArr16 = new int[i25];
        int i38 = 1;
        for (int i39 = 0; i39 < i21; i39++) {
            iArr16[iArr15[i39]] = -1;
            int i40 = 0;
            for (int i41 = 0; i41 < 16; i41++) {
                if (zArr3[i41]) {
                    if (i41 == 1) {
                        iArr16[iArr15[i39]] = iArr14[i39][i40];
                    }
                    i40++;
                }
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    if (iArr16[iArr15[i39]] == iArr16[iArr15[i42]]) {
                        break;
                    }
                    i42++;
                }
            }
        }
        int readBits4 = parsableNalUnitBitArray.readBits(4);
        if (i38 < 2 || readBits4 == 0) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr17 = new int[i38];
        for (int i43 = 0; i43 < i38; i43++) {
            iArr17[i43] = parsableNalUnitBitArray.readBits(readBits4);
        }
        int[] iArr18 = new int[i25];
        for (int i44 = 0; i44 < i21; i44++) {
            iArr18[java.lang.Math.min(iArr15[i44], readBits3)] = i44;
        }
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        int i45 = 0;
        while (i45 <= readBits3) {
            int min = java.lang.Math.min(iArr16[i45], i38 - 1);
            builder.add((com.google.common.collect.ImmutableList.Builder) new androidx.media3.container.NalUnitUtil.H265LayerInfo(iArr18[i45], min >= 0 ? iArr17[min] : -1));
            i45++;
            iArr16 = iArr16;
        }
        com.google.common.collect.ImmutableList build = builder.build();
        if (((androidx.media3.container.NalUnitUtil.H265LayerInfo) build.get(0)).viewId == -1) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i46 = 1;
        while (true) {
            if (i46 > readBits3) {
                i3 = -1;
                i4 = -1;
                break;
            }
            i3 = -1;
            if (((androidx.media3.container.NalUnitUtil.H265LayerInfo) build.get(i46)).viewId != -1) {
                i4 = i46;
                break;
            }
            i46++;
        }
        if (i4 == i3) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        boolean[][] zArr4 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, i21, i21);
        boolean[][] zArr5 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, i21, i21);
        for (int i47 = 1; i47 < i21; i47++) {
            for (int i48 = 0; i48 < i47; i48++) {
                boolean[] zArr6 = zArr4[i47];
                boolean[] zArr7 = zArr5[i47];
                boolean readBit10 = parsableNalUnitBitArray.readBit();
                zArr7[i48] = readBit10;
                zArr6[i48] = readBit10;
            }
        }
        for (int i49 = 1; i49 < i21; i49++) {
            for (int i50 = 0; i50 < readBits; i50++) {
                int i51 = 0;
                while (true) {
                    if (i51 < i49) {
                        boolean[] zArr8 = zArr5[i49];
                        if (zArr8[i51] && zArr5[i51][i50]) {
                            zArr8[i50] = true;
                            break;
                        }
                        i51++;
                    }
                }
            }
        }
        int[] iArr19 = new int[i25];
        for (int i52 = 0; i52 < i21; i52++) {
            int i53 = 0;
            for (int i54 = 0; i54 < i52; i54++) {
                i53 += zArr4[i52][i54] ? 1 : 0;
            }
            iArr19[iArr15[i52]] = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i21; i56++) {
            if (iArr19[iArr15[i56]] == 0) {
                i55++;
            }
        }
        if (i55 > 1) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr20 = new int[i21];
        int i57 = i37;
        int[] iArr21 = new int[i57];
        if (parsableNalUnitBitArray.readBit()) {
            int i58 = 0;
            while (true) {
                iArr2 = iArr15;
                if (i58 >= i21) {
                    break;
                }
                iArr20[i58] = parsableNalUnitBitArray.readBits(3);
                i58++;
                iArr15 = iArr2;
            }
            i5 = readBits2;
        } else {
            iArr2 = iArr15;
            i5 = readBits2;
            java.util.Arrays.fill(iArr20, 0, i21, i5);
        }
        int i59 = 0;
        while (i59 < i57) {
            int i60 = i4;
            boolean[][] zArr9 = zArr5;
            int[] iArr22 = iArr19;
            int i61 = 0;
            for (int i62 = 0; i62 < iArr[i59]; i62++) {
                i61 = java.lang.Math.max(i61, iArr20[((androidx.media3.container.NalUnitUtil.H265LayerInfo) build.get(iArr9[i59][i62])).layerIdInVps]);
            }
            iArr21[i59] = i61 + 1;
            i59++;
            zArr5 = zArr9;
            iArr19 = iArr22;
            i4 = i60;
        }
        int i63 = i4;
        boolean[][] zArr10 = zArr5;
        int[] iArr23 = iArr19;
        if (parsableNalUnitBitArray.readBit()) {
            int i64 = 0;
            while (i64 < readBits) {
                int i65 = i64 + 1;
                for (int i66 = i65; i66 < i21; i66++) {
                    if (zArr4[i66][i64]) {
                        parsableNalUnitBitArray.skipBits(3);
                    }
                }
                i64 = i65;
            }
        }
        parsableNalUnitBitArray.skipBit();
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        com.google.common.collect.ImmutableList.Builder builder2 = com.google.common.collect.ImmutableList.builder();
        builder2.add((com.google.common.collect.ImmutableList.Builder) highSpeedVideoFpsRangesFor2);
        if (readUnsignedExpGolombCodedInt3 > 1) {
            androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = highSpeedVideoFpsRangesFor3;
            builder2.add((com.google.common.collect.ImmutableList.Builder) h265ProfileTierLevel);
            for (int i67 = 2; i67 < readUnsignedExpGolombCodedInt3; i67++) {
                h265ProfileTierLevel = getHighSpeedVideoFpsRangesFor(parsableNalUnitBitArray, parsableNalUnitBitArray.readBit(), i5, h265ProfileTierLevel);
                builder2.add((com.google.common.collect.ImmutableList.Builder) h265ProfileTierLevel);
            }
        }
        com.google.common.collect.ImmutableList build2 = builder2.build();
        int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + i57;
        if (readUnsignedExpGolombCodedInt4 > i57) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int readBits5 = parsableNalUnitBitArray.readBits(2);
        boolean[][] zArr11 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, readUnsignedExpGolombCodedInt4, i25);
        int[] iArr24 = new int[readUnsignedExpGolombCodedInt4];
        int[] iArr25 = new int[readUnsignedExpGolombCodedInt4];
        int i68 = 0;
        while (i68 < i57) {
            int i69 = i57;
            iArr24[i68] = 0;
            iArr25[i68] = iArr10[i68];
            if (readBits5 == 0) {
                zArr2 = zArr4;
                iArr3 = iArr21;
                i13 = i21;
                java.util.Arrays.fill(zArr11[i68], 0, iArr[i68], true);
                iArr24[i68] = iArr[i68];
            } else {
                zArr2 = zArr4;
                i13 = i21;
                iArr3 = iArr21;
                if (readBits5 == 1) {
                    int i70 = iArr10[i68];
                    for (int i71 = 0; i71 < iArr[i68]; i71++) {
                        zArr11[i68][i71] = iArr9[i68][i71] == i70;
                    }
                    iArr24[i68] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr24[0] = 1;
                }
            }
            i68++;
            i57 = i69;
            zArr4 = zArr2;
            iArr21 = iArr3;
            i21 = i13;
        }
        boolean[][] zArr12 = zArr4;
        int i72 = i21;
        int[] iArr26 = iArr21;
        int i73 = i57;
        int[] iArr27 = new int[i25];
        boolean[][] zArr13 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, readUnsignedExpGolombCodedInt4, i25);
        int i74 = 0;
        int i75 = 1;
        while (i75 < readUnsignedExpGolombCodedInt4) {
            if (readBits5 == 2) {
                for (int i76 = 0; i76 < iArr[i75]; i76++) {
                    zArr11[i75][i76] = parsableNalUnitBitArray.readBit();
                    int i77 = iArr24[i75];
                    boolean z7 = zArr11[i75][i76];
                    iArr24[i75] = i77 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr25[i75] = iArr9[i75][i76];
                    }
                }
            }
            if (i74 == 0 && iArr9[i75][0] == 0 && zArr11[i75][0]) {
                int i78 = 1;
                while (i78 < iArr[i75]) {
                    int i79 = readBits5;
                    int i80 = i63;
                    if (iArr9[i75][i78] == i80 && zArr11[i75][i80]) {
                        i74 = i75;
                    }
                    i78++;
                    i63 = i80;
                    readBits5 = i79;
                }
            }
            int i81 = readBits5;
            int i82 = i63;
            int i83 = 0;
            while (i83 < iArr[i75]) {
                if (readUnsignedExpGolombCodedInt3 > 1) {
                    zArr13[i75][i83] = zArr11[i75][i83];
                    boolean[][] zArr14 = zArr11;
                    i12 = i82;
                    i11 = readUnsignedExpGolombCodedInt3;
                    int log2 = com.google.common.math.DoubleMath.log2(readUnsignedExpGolombCodedInt3, java.math.RoundingMode.CEILING);
                    if (!zArr13[i75][i83]) {
                        int i84 = ((androidx.media3.container.NalUnitUtil.H265LayerInfo) build.get(iArr9[i75][i83])).layerIdInVps;
                        int i85 = 0;
                        while (i85 < i83) {
                            zArr = zArr14;
                            if (zArr10[i84][((androidx.media3.container.NalUnitUtil.H265LayerInfo) build.get(iArr9[i75][i85])).layerIdInVps]) {
                                zArr13[i75][i83] = true;
                                break;
                            }
                            i85++;
                            zArr14 = zArr;
                        }
                    }
                    zArr = zArr14;
                    if (zArr13[i75][i83]) {
                        if (i74 > 0 && i75 == i74) {
                            iArr27[i83] = parsableNalUnitBitArray.readBits(log2);
                        } else {
                            parsableNalUnitBitArray.skipBits(log2);
                        }
                    }
                } else {
                    i11 = readUnsignedExpGolombCodedInt3;
                    zArr = zArr11;
                    i12 = i82;
                }
                i83++;
                i82 = i12;
                readUnsignedExpGolombCodedInt3 = i11;
                zArr11 = zArr;
            }
            int i86 = readUnsignedExpGolombCodedInt3;
            boolean[][] zArr15 = zArr11;
            i63 = i82;
            if (iArr24[i75] == 1 && iArr23[iArr25[i75]] > 0) {
                parsableNalUnitBitArray.skipBit();
            }
            i75++;
            readBits5 = i81;
            readUnsignedExpGolombCodedInt3 = i86;
            zArr11 = zArr15;
        }
        if (i74 == 0) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i87 = readUnsignedExpGolombCodedInt5 + 1;
        com.google.common.collect.ImmutableList.Builder builderWithExpectedSize = com.google.common.collect.ImmutableList.builderWithExpectedSize(i87);
        int[] iArr28 = new int[i72];
        int i88 = 0;
        while (i88 < i87) {
            int readBits6 = parsableNalUnitBitArray.readBits(16);
            int readBits7 = parsableNalUnitBitArray.readBits(16);
            if (parsableNalUnitBitArray.readBit()) {
                i8 = parsableNalUnitBitArray.readBits(2);
                if (i8 == 3) {
                    parsableNalUnitBitArray.skipBit();
                }
                i9 = parsableNalUnitBitArray.readBits(4);
                i10 = parsableNalUnitBitArray.readBits(4);
            } else {
                i8 = 0;
                i9 = 0;
                i10 = 0;
            }
            if (parsableNalUnitBitArray.readBit()) {
                int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                immutableList = build;
                readBits6 -= ((i8 == 1 || i8 == 2) ? 2 : 1) * (readUnsignedExpGolombCodedInt6 + readUnsignedExpGolombCodedInt7);
                readBits7 -= (i8 == 1 ? 2 : 1) * (readUnsignedExpGolombCodedInt8 + readUnsignedExpGolombCodedInt9);
            } else {
                immutableList = build;
            }
            builderWithExpectedSize.add((com.google.common.collect.ImmutableList.Builder) new androidx.media3.container.NalUnitUtil.H265RepFormat(i8, i9, i10, readBits6, readBits7));
            i88++;
            build = immutableList;
        }
        com.google.common.collect.ImmutableList immutableList2 = build;
        if (i87 <= 1 || !parsableNalUnitBitArray.readBit()) {
            for (int i89 = 1; i89 < i72; i89++) {
                iArr28[i89] = java.lang.Math.min(i89, readUnsignedExpGolombCodedInt5);
            }
        } else {
            int log22 = com.google.common.math.DoubleMath.log2(i87, java.math.RoundingMode.CEILING);
            for (int i90 = 1; i90 < i72; i90++) {
                iArr28[i90] = parsableNalUnitBitArray.readBits(log22);
            }
        }
        androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices h265RepFormatsAndIndices = new androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices(builderWithExpectedSize.build(), iArr28);
        parsableNalUnitBitArray.skipBits(2);
        for (int i91 = 1; i91 < i72; i91++) {
            if (iArr23[iArr2[i91]] == 0) {
                parsableNalUnitBitArray.skipBit();
            }
        }
        for (int i92 = 1; i92 < readUnsignedExpGolombCodedInt4; i92++) {
            boolean readBit11 = parsableNalUnitBitArray.readBit();
            while (i6 < iArr26[i92]) {
                if (i6 > 0 && readBit11) {
                    if (!parsableNalUnitBitArray.readBit()) {
                    }
                    while (i7 < iArr[i92]) {
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                } else {
                    i6 = i6 != 0 ? i6 + 1 : 0;
                    for (i7 = 0; i7 < iArr[i92]; i7++) {
                        if (zArr13[i92][i7]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
            }
        }
        int i93 = 2;
        int readUnsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt10);
        } else {
            for (int i94 = 1; i94 < i72; i94++) {
                for (int i95 = 0; i95 < i94; i95++) {
                    if (zArr12[i94][i95]) {
                        parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt10);
                    }
                }
            }
        }
        int readUnsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i96 = 1; i96 <= readUnsignedExpGolombCodedInt11; i96++) {
            parsableNalUnitBitArray.skipBits(8);
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.byteAlign();
            if (parsableNalUnitBitArray.readBit() || parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            boolean readBit12 = parsableNalUnitBitArray.readBit();
            boolean readBit13 = parsableNalUnitBitArray.readBit();
            if (readBit12 || readBit13) {
                for (int i97 = 0; i97 < i73; i97++) {
                    for (int i98 = 0; i98 < iArr26[i97]; i98++) {
                        boolean readBit14 = readBit12 ? parsableNalUnitBitArray.readBit() : false;
                        boolean readBit15 = readBit13 ? parsableNalUnitBitArray.readBit() : false;
                        if (readBit14) {
                            parsableNalUnitBitArray.skipBits(32);
                        }
                        if (readBit15) {
                            parsableNalUnitBitArray.skipBits(18);
                        }
                    }
                }
            }
            boolean readBit16 = parsableNalUnitBitArray.readBit();
            int readBits8 = readBit16 ? parsableNalUnitBitArray.readBits(4) + 1 : i72;
            com.google.common.collect.ImmutableList.Builder builderWithExpectedSize2 = com.google.common.collect.ImmutableList.builderWithExpectedSize(readBits8);
            int[] iArr29 = new int[i72];
            int i99 = 0;
            while (i99 < readBits8) {
                parsableNalUnitBitArray.skipBits(3);
                int i100 = parsableNalUnitBitArray.readBit() ? 1 : i93;
                int isoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
                int isoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
                parsableNalUnitBitArray.skipBits(8);
                builderWithExpectedSize2.add((com.google.common.collect.ImmutableList.Builder) new androidx.media3.container.NalUnitUtil.H265VideoSignalInfo(isoColorPrimariesToColorSpace, i100, isoTransferCharacteristicsToColorTransfer));
                i99++;
                i93 = 2;
            }
            if (readBit16 && readBits8 > 1) {
                for (int i101 = 0; i101 < i72; i101++) {
                    iArr29[i101] = parsableNalUnitBitArray.readBits(4);
                }
            }
            h265VideoSignalInfosAndIndices = new androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices(builderWithExpectedSize2.build(), iArr29);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new androidx.media3.container.NalUnitUtil.H265VpsData(highSpeedVideoFpsRangesFor, immutableList2, new androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices(build2, iArr27), h265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    private static androidx.media3.container.NalUnitUtil.H265NalHeader getHighSpeedVideoFpsRangesFor(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new androidx.media3.container.NalUnitUtil.H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnit(byte[] bArr, int i, int i2, androidx.media3.container.NalUnitUtil.H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i + 2, i2, getHighSpeedVideoFpsRangesFor(new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2)), h265VpsData);
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i, int i2, androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader, androidx.media3.container.NalUnitUtil.H265VpsData h265VpsData) {
        int i3;
        int i4;
        int i5;
        int readUnsignedExpGolombCodedInt;
        int readUnsignedExpGolombCodedInt2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2);
        parsableNalUnitBitArray.skipBits(4);
        int readBits = parsableNalUnitBitArray.readBits(3);
        boolean z = h265NalHeader.layerId != 0 && readBits == 7;
        int i26 = (h265VpsData == null || h265VpsData.layerInfos.isEmpty()) ? 0 : h265VpsData.layerInfos.get(java.lang.Math.min(h265NalHeader.layerId, h265VpsData.layerInfos.size() - 1)).layerIdInVps;
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel2 = null;
        if (!z) {
            parsableNalUnitBitArray.skipBit();
            h265ProfileTierLevel2 = getHighSpeedVideoFpsRangesFor(parsableNalUnitBitArray, true, readBits, null);
        } else if (h265VpsData != null && h265VpsData.profileTierLevelsAndIndices.profileTierLevels.size() > (i3 = h265VpsData.profileTierLevelsAndIndices.indices[i26])) {
            h265ProfileTierLevel2 = h265VpsData.profileTierLevelsAndIndices.profileTierLevels.get(i3);
        }
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z) {
            int readBits2 = parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBits(8) : -1;
            if (h265VpsData != null && h265VpsData.repFormatsAndIndices != null) {
                if (readBits2 == -1) {
                    readBits2 = h265VpsData.repFormatsAndIndices.indices[i26];
                }
                if (readBits2 != -1 && h265VpsData.repFormatsAndIndices.repFormats.size() > readBits2) {
                    androidx.media3.container.NalUnitUtil.H265RepFormat h265RepFormat = h265VpsData.repFormatsAndIndices.repFormats.get(readBits2);
                    i8 = h265RepFormat.chromaFormatIdc;
                    i4 = h265RepFormat.width;
                    int i27 = h265RepFormat.height;
                    readUnsignedExpGolombCodedInt = h265RepFormat.bitDepthLumaMinus8;
                    readUnsignedExpGolombCodedInt2 = h265RepFormat.bitDepthChromaMinus8;
                    i9 = i27;
                    i6 = i9;
                    i7 = i4;
                }
            }
            i9 = 0;
            i7 = 0;
            i4 = 0;
            i8 = 0;
            readUnsignedExpGolombCodedInt = 0;
            readUnsignedExpGolombCodedInt2 = 0;
            i6 = 0;
        } else {
            int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (readUnsignedExpGolombCodedInt4 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (parsableNalUnitBitArray.readBit()) {
                int readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                i4 = readUnsignedExpGolombCodedInt5 - (((readUnsignedExpGolombCodedInt4 == 1 || readUnsignedExpGolombCodedInt4 == 2) ? 2 : 1) * (readUnsignedExpGolombCodedInt7 + readUnsignedExpGolombCodedInt8));
                i5 = readUnsignedExpGolombCodedInt6 - ((readUnsignedExpGolombCodedInt4 == 1 ? 2 : 1) * (readUnsignedExpGolombCodedInt9 + readUnsignedExpGolombCodedInt10));
            } else {
                i4 = readUnsignedExpGolombCodedInt5;
                i5 = readUnsignedExpGolombCodedInt6;
            }
            readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            i6 = readUnsignedExpGolombCodedInt6;
            i7 = readUnsignedExpGolombCodedInt5;
            int i28 = i5;
            i8 = readUnsignedExpGolombCodedInt4;
            i9 = i28;
        }
        int readUnsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z) {
            i10 = -1;
        } else {
            int i29 = -1;
            for (int i30 = parsableNalUnitBitArray.readBit() ? 0 : readBits; i30 <= readBits; i30++) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                i29 = java.lang.Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), i29);
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            i10 = i29;
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int i31 = 6;
            if (z && parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(6);
            } else if (parsableNalUnitBitArray.readBit()) {
                int i32 = 0;
                int i33 = 4;
                while (i32 < i33) {
                    int i34 = 0;
                    while (i34 < i31) {
                        if (!parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                            i24 = i10;
                            i25 = 3;
                        } else {
                            i24 = i10;
                            int min = java.lang.Math.min(64, 1 << ((i32 << 1) + 4));
                            if (i32 > 1) {
                                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                            }
                            for (int i35 = 0; i35 < min; i35++) {
                                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                            }
                            i25 = 3;
                        }
                        i34 += i32 == i25 ? 3 : 1;
                        i10 = i24;
                        i31 = 6;
                    }
                    i32++;
                    i33 = 4;
                    i31 = 6;
                }
            }
        }
        int i36 = i10;
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        int readUnsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i37 = 0;
        int i38 = i7;
        int i39 = -1;
        int i40 = -1;
        while (i37 < readUnsignedExpGolombCodedInt12) {
            if (i37 != 0 && parsableNalUnitBitArray.readBit()) {
                i18 = readUnsignedExpGolombCodedInt12;
                int i41 = i39 + i40;
                int readUnsignedExpGolombCodedInt13 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                i21 = i4;
                int i42 = i41 + 1;
                i20 = readUnsignedExpGolombCodedInt3;
                boolean[] zArr = new boolean[i42];
                i22 = i8;
                for (int i43 = 0; i43 <= i41; i43++) {
                    if (!parsableNalUnitBitArray.readBit()) {
                        zArr[i43] = parsableNalUnitBitArray.readBit();
                    } else {
                        zArr[i43] = true;
                    }
                }
                int[] iArr3 = new int[i42];
                int[] iArr4 = new int[i42];
                int i44 = 0;
                for (int i45 = i40 - 1; i45 >= 0; i45--) {
                    int i46 = iArr2[i45] + readUnsignedExpGolombCodedInt13;
                    if (i46 < 0 && zArr[i39 + i45]) {
                        iArr3[i44] = i46;
                        i44++;
                    }
                }
                if (readUnsignedExpGolombCodedInt13 < 0 && zArr[i41]) {
                    iArr3[i44] = readUnsignedExpGolombCodedInt13;
                    i44++;
                }
                h265ProfileTierLevel = h265ProfileTierLevel2;
                int i47 = i44;
                i19 = readBits;
                for (int i48 = 0; i48 < i39; i48++) {
                    int i49 = iArr[i48] + readUnsignedExpGolombCodedInt13;
                    if (i49 < 0 && zArr[i48]) {
                        iArr3[i47] = i49;
                        i47++;
                    }
                }
                int[] copyOf = java.util.Arrays.copyOf(iArr3, i47);
                int i50 = 0;
                for (int i51 = i39 - 1; i51 >= 0; i51--) {
                    int i52 = iArr[i51] + readUnsignedExpGolombCodedInt13;
                    if (i52 > 0 && zArr[i51]) {
                        iArr4[i50] = i52;
                        i50++;
                    }
                }
                if (readUnsignedExpGolombCodedInt13 > 0 && zArr[i41]) {
                    iArr4[i50] = readUnsignedExpGolombCodedInt13;
                    i50++;
                }
                i23 = i50;
                for (int i53 = 0; i53 < i40; i53++) {
                    int i54 = iArr2[i53] + readUnsignedExpGolombCodedInt13;
                    if (i54 > 0 && zArr[i39 + i53]) {
                        iArr4[i23] = i54;
                        i23++;
                    }
                }
                iArr2 = java.util.Arrays.copyOf(iArr4, i23);
                iArr = copyOf;
                i39 = i47;
            } else {
                i18 = readUnsignedExpGolombCodedInt12;
                i19 = readBits;
                h265ProfileTierLevel = h265ProfileTierLevel2;
                i20 = readUnsignedExpGolombCodedInt3;
                i21 = i4;
                i22 = i8;
                int readUnsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt15 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr5 = new int[readUnsignedExpGolombCodedInt14];
                int i55 = 0;
                while (i55 < readUnsignedExpGolombCodedInt14) {
                    iArr5[i55] = (i55 > 0 ? iArr5[i55 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i55++;
                }
                int[] iArr6 = new int[readUnsignedExpGolombCodedInt15];
                int i56 = 0;
                while (i56 < readUnsignedExpGolombCodedInt15) {
                    iArr6[i56] = (i56 > 0 ? iArr6[i56 - 1] : 0) + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                    i56++;
                }
                iArr2 = iArr6;
                iArr = iArr5;
                i39 = readUnsignedExpGolombCodedInt14;
                i23 = readUnsignedExpGolombCodedInt15;
            }
            i37++;
            i40 = i23;
            readUnsignedExpGolombCodedInt12 = i18;
            i4 = i21;
            readUnsignedExpGolombCodedInt3 = i20;
            i8 = i22;
            h265ProfileTierLevel2 = h265ProfileTierLevel;
            readBits = i19;
        }
        int i57 = readBits;
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel3 = h265ProfileTierLevel2;
        int i58 = readUnsignedExpGolombCodedInt3;
        int i59 = i4;
        int i60 = i8;
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            for (int i61 = 0; i61 < readUnsignedExpGolombCodedInt16; i61++) {
                parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt11 + 5);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f2 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int readBits3 = parsableNalUnitBitArray.readBits(8);
                if (readBits3 == 255) {
                    int readBits4 = parsableNalUnitBitArray.readBits(16);
                    int readBits5 = parsableNalUnitBitArray.readBits(16);
                    if (readBits4 != 0 && readBits5 != 0) {
                        f2 = readBits4 / readBits5;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (readBits3 < fArr.length) {
                        f2 = fArr[readBits3];
                    } else {
                        androidx.media3.common.util.Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: ".concat(java.lang.String.valueOf(readBits3)));
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i15 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int readBits6 = parsableNalUnitBitArray.readBits(8);
                    int readBits7 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    i12 = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(readBits6);
                    i17 = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits7);
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                    if (parsableNalUnitBitArray.readBit()) {
                        i9 *= 2;
                    }
                    i14 = i17;
                    i11 = i9;
                    f = f2;
                    i13 = i15;
                }
                i17 = -1;
                i12 = -1;
                if (parsableNalUnitBitArray.readBit()) {
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                i14 = i17;
                i11 = i9;
                f = f2;
                i13 = i15;
            } else if (h265VpsData != null && h265VpsData.videoSignalInfosAndIndices != null && h265VpsData.videoSignalInfosAndIndices.videoSignalInfos.size() > (i16 = h265VpsData.videoSignalInfosAndIndices.indices[i26])) {
                androidx.media3.container.NalUnitUtil.H265VideoSignalInfo h265VideoSignalInfo = h265VpsData.videoSignalInfosAndIndices.videoSignalInfos.get(i16);
                i12 = h265VideoSignalInfo.colorSpace;
                i15 = h265VideoSignalInfo.colorRange;
                i17 = h265VideoSignalInfo.colorTransfer;
                if (parsableNalUnitBitArray.readBit()) {
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                i14 = i17;
                i11 = i9;
                f = f2;
                i13 = i15;
            } else {
                i15 = -1;
                i17 = -1;
                i12 = -1;
                if (parsableNalUnitBitArray.readBit()) {
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                i14 = i17;
                i11 = i9;
                f = f2;
                i13 = i15;
            }
        } else {
            i11 = i9;
            f = 1.0f;
            i12 = -1;
            i13 = -1;
            i14 = -1;
        }
        return new androidx.media3.container.NalUnitUtil.H265SpsData(h265NalHeader, i57, h265ProfileTierLevel3, i60, readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, i58, i59, i11, i38, i6, f, i36, i12, i13, i14);
    }

    public static androidx.media3.container.NalUnitUtil.PpsData parsePpsNalUnit(byte[] bArr, int i, int i2) {
        return parsePpsNalUnitPayload(bArr, i + 1, i2);
    }

    public static androidx.media3.container.NalUnitUtil.PpsData parsePpsNalUnitPayload(byte[] bArr, int i, int i2) {
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new androidx.media3.container.NalUnitUtil.PpsData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static androidx.media3.container.NalUnitUtil.H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i, int i2) {
        byte b;
        int max;
        int max2;
        int i3 = i + 2;
        int i4 = i2 - 1;
        while (true) {
            b = bArr[i4];
            if (b != 0 || i4 <= i3) {
                break;
            }
            i4--;
        }
        if (b != 0 && i4 > i3) {
            androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i3, i4 + 1);
            while (parsableNalUnitBitArray.canReadBits(16)) {
                int readBits = parsableNalUnitBitArray.readBits(8);
                int i5 = 0;
                while (readBits == 255) {
                    i5 += 255;
                    readBits = parsableNalUnitBitArray.readBits(8);
                }
                int readBits2 = parsableNalUnitBitArray.readBits(8);
                int i6 = 0;
                while (readBits2 == 255) {
                    i6 += 255;
                    readBits2 = parsableNalUnitBitArray.readBits(8);
                }
                int i7 = i6 + readBits2;
                if (i7 == 0 || !parsableNalUnitBitArray.canReadBits(i7)) {
                    break;
                }
                if (i5 + readBits == 176) {
                    int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    boolean readBit = parsableNalUnitBitArray.readBit();
                    int readUnsignedExpGolombCodedInt2 = readBit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                    int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int i8 = -1;
                    int i9 = -1;
                    int i10 = -1;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = -1;
                    for (int i14 = 0; i14 <= readUnsignedExpGolombCodedInt3; i14++) {
                        i8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i10 = parsableNalUnitBitArray.readBits(6);
                        if (i10 == 63) {
                            return null;
                        }
                        if (i10 == 0) {
                            max = java.lang.Math.max(0, readUnsignedExpGolombCodedInt - 30);
                        } else {
                            max = java.lang.Math.max(0, (i10 + readUnsignedExpGolombCodedInt) - 31);
                        }
                        i11 = parsableNalUnitBitArray.readBits(max);
                        if (readBit) {
                            int readBits3 = parsableNalUnitBitArray.readBits(6);
                            if (readBits3 == 63) {
                                return null;
                            }
                            if (readBits3 == 0) {
                                max2 = java.lang.Math.max(0, readUnsignedExpGolombCodedInt2 - 30);
                            } else {
                                max2 = java.lang.Math.max(0, (readBits3 + readUnsignedExpGolombCodedInt2) - 31);
                            }
                            i13 = parsableNalUnitBitArray.readBits(max2);
                            i12 = readBits3;
                        }
                        if (parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.skipBits(10);
                        }
                    }
                    return new androidx.media3.container.NalUnitUtil.H265Sei3dRefDisplayInfoData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt3 + 1, i8, i9, i10, i11, i12, i13);
                }
                parsableNalUnitBitArray.skipBits(i7 * 8);
            }
        }
        return null;
    }

    public static int findNalUnit(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        com.google.common.base.Preconditions.checkState(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    clearPrefixFlags(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String getH265BaseLayerCodecsString(java.util.List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
                int i2 = 0;
                while (i2 < bArr.length) {
                    int findNalUnit = findNalUnit(bArr, i2, bArr.length, zArr);
                    if (findNalUnit != bArr.length) {
                        builder.add((com.google.common.collect.ImmutableList.Builder) java.lang.Integer.valueOf(findNalUnit));
                    }
                    i2 = findNalUnit + 3;
                }
                com.google.common.collect.ImmutableList build = builder.build();
                for (int i3 = 0; i3 < build.size(); i3++) {
                    if (((java.lang.Integer) build.get(i3)).intValue() + 3 < length) {
                        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, ((java.lang.Integer) build.get(i3)).intValue() + 3, length);
                        androidx.media3.container.NalUnitUtil.H265NalHeader highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(parsableNalUnitBitArray);
                        if (highSpeedVideoFpsRangesFor.nalUnitType == 33 && highSpeedVideoFpsRangesFor.layerId == 0) {
                            parsableNalUnitBitArray.skipBits(4);
                            int readBits = parsableNalUnitBitArray.readBits(3);
                            parsableNalUnitBitArray.skipBit();
                            androidx.media3.container.NalUnitUtil.H265ProfileTierLevel highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(parsableNalUnitBitArray, true, readBits, null);
                            return androidx.media3.common.util.CodecSpecificDataUtil.buildHevcCodecString(highSpeedVideoFpsRangesFor2.generalProfileSpace, highSpeedVideoFpsRangesFor2.generalTierFlag, highSpeedVideoFpsRangesFor2.generalProfileIdc, highSpeedVideoFpsRangesFor2.generalProfileCompatibilityFlags, highSpeedVideoFpsRangesFor2.constraintBytes, highSpeedVideoFpsRangesFor2.generalLevelIdc);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static androidx.media3.container.NalUnitUtil.H265ProfileTierLevel getHighSpeedVideoFpsRangesFor(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z, int i, androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (z) {
            i7 = parsableNalUnitBitArray.readBits(2);
            z3 = parsableNalUnitBitArray.readBit();
            i5 = parsableNalUnitBitArray.readBits(5);
            i6 = 0;
            for (int i8 = 0; i8 < 32; i8++) {
                if (parsableNalUnitBitArray.readBit()) {
                    i6 |= 1 << i8;
                }
            }
            for (int i9 = 0; i9 < 6; i9++) {
                iArr2[i9] = parsableNalUnitBitArray.readBits(8);
            }
        } else if (h265ProfileTierLevel != null) {
            int i10 = h265ProfileTierLevel.generalProfileSpace;
            z3 = h265ProfileTierLevel.generalTierFlag;
            i5 = h265ProfileTierLevel.generalProfileIdc;
            i6 = h265ProfileTierLevel.generalProfileCompatibilityFlags;
            iArr2 = h265ProfileTierLevel.constraintBytes;
            i7 = i10;
        } else {
            iArr = iArr2;
            i2 = 0;
            z2 = false;
            i3 = 0;
            i4 = 0;
            int readBits = parsableNalUnitBitArray.readBits(8);
            int i11 = 0;
            for (int i12 = 0; i12 < i; i12++) {
                if (parsableNalUnitBitArray.readBit()) {
                    i11 += 88;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    i11 += 8;
                }
            }
            parsableNalUnitBitArray.skipBits(i11);
            if (i > 0) {
                parsableNalUnitBitArray.skipBits((8 - i) * 2);
            }
            return new androidx.media3.container.NalUnitUtil.H265ProfileTierLevel(i2, z2, i3, i4, iArr, readBits);
        }
        i2 = i7;
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int readBits2 = parsableNalUnitBitArray.readBits(8);
        int i112 = 0;
        while (i12 < i) {
        }
        parsableNalUnitBitArray.skipBits(i112);
        if (i > 0) {
        }
        return new androidx.media3.container.NalUnitUtil.H265ProfileTierLevel(i2, z2, i3, i4, iArr, readBits2);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBits(8);
        for (int i = 0; i < readUnsignedExpGolombCodedInt + 1; i++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static java.lang.String Camera2StreamConfigurationMap(androidx.media3.common.Format format) {
        if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION) && format.codecs != null) {
            if (format.codecs.startsWith("dva1") || format.codecs.startsWith("dvav")) {
                return "video/avc";
            }
            if (format.codecs.startsWith("dvh1") || format.codecs.startsWith("dvhe")) {
                return androidx.media3.common.MimeTypes.VIDEO_H265;
            }
        }
        return format.sampleMimeType;
    }

    private NalUnitUtil() {
    }
}
