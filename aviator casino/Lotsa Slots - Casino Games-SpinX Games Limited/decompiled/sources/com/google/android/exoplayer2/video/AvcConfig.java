package com.google.android.exoplayer2.video;

/* loaded from: classes3.dex */
public final class AvcConfig {
    public final java.lang.String codecs;
    public final int height;
    public final java.util.List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static com.google.android.exoplayer2.video.AvcConfig parse(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws com.google.android.exoplayer2.ParserException {
        java.lang.String str;
        int i;
        int i2;
        float f;
        try {
            parsableByteArray.skipBytes(4);
            int readUnsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i3 = 0; i3 < readUnsignedByte2; i3++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i4 = 0; i4 < readUnsignedByte3; i4++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (readUnsignedByte2 > 0) {
                com.google.android.exoplayer2.util.NalUnitUtil.SpsData parseSpsNalUnit = com.google.android.exoplayer2.util.NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                int i5 = parseSpsNalUnit.width;
                int i6 = parseSpsNalUnit.height;
                float f2 = parseSpsNalUnit.pixelWidthHeightRatio;
                str = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildAvcCodecString(parseSpsNalUnit.profileIdc, parseSpsNalUnit.constraintsFlagsAndReservedZero2Bits, parseSpsNalUnit.levelIdc);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new com.google.android.exoplayer2.video.AvcConfig(arrayList, readUnsignedByte, i, i2, f, str);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }

    private AvcConfig(java.util.List<byte[]> list, int i, int i2, int i3, float f, java.lang.String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.pixelWidthHeightRatio = f;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, readUnsignedShort);
    }
}
