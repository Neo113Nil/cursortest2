package com.google.android.exoplayer2.video;

/* loaded from: classes3.dex */
public final class DolbyVisionConfig {
    public final java.lang.String codecs;
    public final int level;
    public final int profile;

    public static com.google.android.exoplayer2.video.DolbyVisionConfig parse(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        java.lang.String str;
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte >> 1;
        int readUnsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((readUnsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(readUnsignedByte2 >= 10 ? "." : ".0");
        sb.append(readUnsignedByte2);
        return new com.google.android.exoplayer2.video.DolbyVisionConfig(i, readUnsignedByte2, sb.toString());
    }

    private DolbyVisionConfig(int i, int i2, java.lang.String str) {
        this.profile = i;
        this.level = i2;
        this.codecs = str;
    }
}
