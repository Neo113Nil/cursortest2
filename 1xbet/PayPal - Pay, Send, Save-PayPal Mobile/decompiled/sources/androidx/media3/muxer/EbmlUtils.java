package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class EbmlUtils {
    private EbmlUtils() {
    }

    public static java.nio.ByteBuffer Camera2StreamConfigurationMap(long j, int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0 && i <= 8);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (((1 << (i * 7)) | j) >>> (((i - 1) - i2) * 8));
        }
        return java.nio.ByteBuffer.wrap(bArr);
    }

    public static java.nio.ByteBuffer getHighSpeedVideoSizes(long j) {
        int i = 1;
        com.google.common.base.Preconditions.checkArgument(j >= 0);
        if (j > 126) {
            if (j <= 16382) {
                i = 2;
            } else if (j <= 2097150) {
                i = 3;
            } else if (j <= 268435454) {
                i = 4;
            } else if (j <= 34359738366L) {
                i = 5;
            } else if (j <= 4398046511102L) {
                i = 6;
            } else if (j <= 562949953421310L) {
                i = 7;
            } else {
                if (j > 72057594037927934L) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Value ");
                    sb.append(j);
                    sb.append(" is too large for a VINT.");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                i = 8;
            }
        }
        return Camera2StreamConfigurationMap(j, i);
    }
}
