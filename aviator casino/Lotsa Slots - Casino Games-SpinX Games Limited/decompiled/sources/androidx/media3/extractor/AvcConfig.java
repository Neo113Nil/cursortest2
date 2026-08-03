package androidx.media3.extractor;

/* loaded from: classes2.dex */
public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final java.lang.String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final java.util.List<byte[]> initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static androidx.media3.extractor.AvcConfig parse(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        java.lang.String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            parsableByteArray.skipBytes(4);
            int readUnsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i9 = 0; i9 < readUnsignedByte2; i9++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i10 = 0; i10 < readUnsignedByte3; i10++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (readUnsignedByte2 > 0) {
                androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnit = androidx.media3.container.NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                int i11 = parseSpsNalUnit.width;
                int i12 = parseSpsNalUnit.height;
                int i13 = parseSpsNalUnit.bitDepthLumaMinus8 + 8;
                int i14 = parseSpsNalUnit.bitDepthChromaMinus8 + 8;
                int i15 = parseSpsNalUnit.colorSpace;
                int i16 = parseSpsNalUnit.colorRange;
                int i17 = parseSpsNalUnit.colorTransfer;
                int i18 = parseSpsNalUnit.maxNumReorderFrames;
                float f2 = parseSpsNalUnit.pixelWidthHeightRatio;
                str = androidx.media3.common.util.CodecSpecificDataUtil.buildAvcCodecString(parseSpsNalUnit.profileIdc, parseSpsNalUnit.constraintsFlagsAndReservedZero2Bits, parseSpsNalUnit.levelIdc);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new androidx.media3.extractor.AvcConfig(arrayList, readUnsignedByte, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }

    private AvcConfig(java.util.List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, java.lang.String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.bitdepthLuma = i4;
        this.bitdepthChroma = i5;
        this.colorSpace = i6;
        this.colorRange = i7;
        this.colorTransfer = i8;
        this.maxNumReorderFrames = i9;
        this.pixelWidthHeightRatio = f;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return androidx.media3.common.util.CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, readUnsignedShort);
    }
}
