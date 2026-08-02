package androidx.media3.container;

/* loaded from: classes7.dex */
public final class DolbyVisionConfig {
    public final java.lang.String codecs;
    public final int level;
    public final int profile;

    public static androidx.media3.container.DolbyVisionConfig parse(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.lang.String str;
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte >> 1;
        int readUnsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((readUnsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(readUnsignedByte2 < 10 ? ".0" : ".");
        sb.append(readUnsignedByte2);
        return new androidx.media3.container.DolbyVisionConfig(i, readUnsignedByte2, sb.toString());
    }

    private DolbyVisionConfig(int i, int i2, java.lang.String str) {
        this.profile = i;
        this.level = i2;
        this.codecs = str;
    }
}
