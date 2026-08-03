package androidx.media3.extractor;

/* loaded from: classes2.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final java.lang.String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final java.util.List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static androidx.media3.extractor.HevcConfig parse(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        int i;
        int i2;
        try {
            parsableByteArray.skipBytes(21);
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i3 = 0;
            for (int i4 = 0; i4 < readUnsignedByte2; i4++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i5 = 0; i5 < readUnsignedShort; i5++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i3 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i3];
            java.lang.String str = null;
            int i6 = 0;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            int i14 = -1;
            for (int i15 = 0; i15 < readUnsignedByte2; i15++) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                int i16 = 0;
                while (i16 < readUnsignedShort3) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    int i17 = readUnsignedByte2;
                    java.lang.System.arraycopy(androidx.media3.container.NalUnitUtil.NAL_START_CODE, 0, bArr, i6, androidx.media3.container.NalUnitUtil.NAL_START_CODE.length);
                    int length = i6 + androidx.media3.container.NalUnitUtil.NAL_START_CODE.length;
                    java.lang.System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    if (readUnsignedByte3 == 33 && i16 == 0) {
                        androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnit = androidx.media3.container.NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + readUnsignedShort4);
                        int i18 = parseH265SpsNalUnit.width;
                        i8 = parseH265SpsNalUnit.height;
                        i9 = parseH265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i10 = parseH265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i19 = parseH265SpsNalUnit.colorSpace;
                        int i20 = parseH265SpsNalUnit.colorRange;
                        int i21 = parseH265SpsNalUnit.colorTransfer;
                        float f2 = parseH265SpsNalUnit.pixelWidthHeightRatio;
                        int i22 = parseH265SpsNalUnit.maxNumReorderPics;
                        i = readUnsignedByte3;
                        i2 = readUnsignedShort3;
                        i7 = i18;
                        str = androidx.media3.common.util.CodecSpecificDataUtil.buildHevcCodecString(parseH265SpsNalUnit.generalProfileSpace, parseH265SpsNalUnit.generalTierFlag, parseH265SpsNalUnit.generalProfileIdc, parseH265SpsNalUnit.generalProfileCompatibilityFlags, parseH265SpsNalUnit.constraintBytes, parseH265SpsNalUnit.generalLevelIdc);
                        i12 = i20;
                        i11 = i19;
                        i14 = i22;
                        f = f2;
                        i13 = i21;
                    } else {
                        i = readUnsignedByte3;
                        i2 = readUnsignedShort3;
                    }
                    i6 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                    i16++;
                    readUnsignedByte2 = i17;
                    readUnsignedByte3 = i;
                    readUnsignedShort3 = i2;
                }
            }
            return new androidx.media3.extractor.HevcConfig(i3 == 0 ? java.util.Collections.emptyList() : java.util.Collections.singletonList(bArr), readUnsignedByte + 1, i7, i8, i9, i10, i11, i12, i13, f, i14, str);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }

    private HevcConfig(java.util.List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, java.lang.String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.bitdepthLuma = i4;
        this.bitdepthChroma = i5;
        this.colorSpace = i6;
        this.colorRange = i7;
        this.colorTransfer = i8;
        this.pixelWidthHeightRatio = f;
        this.maxNumReorderPics = i9;
        this.codecs = str;
    }
}
