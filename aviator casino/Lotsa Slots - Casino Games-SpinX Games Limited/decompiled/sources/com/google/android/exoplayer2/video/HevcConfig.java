package com.google.android.exoplayer2.video;

/* loaded from: classes3.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final java.lang.String codecs;
    public final int height;
    public final java.util.List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static com.google.android.exoplayer2.video.HevcConfig parse(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws com.google.android.exoplayer2.ParserException {
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
            float f = 1.0f;
            for (int i9 = 0; i9 < readUnsignedByte2; i9++) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                int i10 = 0;
                while (i10 < readUnsignedShort3) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    int i11 = readUnsignedByte2;
                    java.lang.System.arraycopy(com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE, 0, bArr, i6, com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE.length);
                    int length = i6 + com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE.length;
                    java.lang.System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    if (readUnsignedByte3 == 33 && i10 == 0) {
                        com.google.android.exoplayer2.util.NalUnitUtil.H265SpsData parseH265SpsNalUnit = com.google.android.exoplayer2.util.NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + readUnsignedShort4);
                        int i12 = parseH265SpsNalUnit.width;
                        i8 = parseH265SpsNalUnit.height;
                        f = parseH265SpsNalUnit.pixelWidthHeightRatio;
                        i = readUnsignedByte3;
                        i2 = readUnsignedShort3;
                        i7 = i12;
                        str = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildHevcCodecString(parseH265SpsNalUnit.generalProfileSpace, parseH265SpsNalUnit.generalTierFlag, parseH265SpsNalUnit.generalProfileIdc, parseH265SpsNalUnit.generalProfileCompatibilityFlags, parseH265SpsNalUnit.constraintBytes, parseH265SpsNalUnit.generalLevelIdc);
                    } else {
                        i = readUnsignedByte3;
                        i2 = readUnsignedShort3;
                    }
                    i6 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                    i10++;
                    readUnsignedByte2 = i11;
                    readUnsignedByte3 = i;
                    readUnsignedShort3 = i2;
                }
            }
            return new com.google.android.exoplayer2.video.HevcConfig(i3 == 0 ? java.util.Collections.emptyList() : java.util.Collections.singletonList(bArr), readUnsignedByte + 1, i7, i8, f, str);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }

    private HevcConfig(java.util.List<byte[]> list, int i, int i2, int i3, float f, java.lang.String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.pixelWidthHeightRatio = f;
        this.codecs = str;
    }
}
