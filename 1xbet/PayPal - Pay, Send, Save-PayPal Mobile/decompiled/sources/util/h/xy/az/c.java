package util.h.xy.az;

/* loaded from: classes5.dex */
public final class c {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25265(java.io.Closeable closeable) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i ^ 35) + ((i & 35) << 1)) % 128;
        if (closeable != null) {
            int i2 = (i ^ 25) + ((i & 25) << 1);
            getHighSpeedVideoSizes = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    closeable.close();
                } else {
                    closeable.close();
                    throw new java.lang.ArithmeticException();
                }
            } catch (java.io.IOException unused) {
            }
        }
        int i3 = getHighSpeedVideoSizes + 97;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m25266(byte[] bArr) {
        if (bArr != null) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 9) % 128;
            int i = 0;
            while (i < bArr.length) {
                int i2 = (getHighSpeedVideoSizes + 37) % 128;
                Camera2StreamConfigurationMap = i2;
                bArr[i] = 0;
                i++;
                getHighSpeedVideoSizes = (i2 + 25) % 128;
            }
            int i3 = getHighSpeedVideoSizes;
            int i4 = ((i3 | 1) << 1) - (i3 ^ 1);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        int i5 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i5 ^ 55) + ((i5 & 55) << 1)) % 128;
    }
}
