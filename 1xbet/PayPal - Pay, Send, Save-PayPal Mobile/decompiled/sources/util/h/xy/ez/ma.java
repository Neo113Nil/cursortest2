package util.h.xy.ez;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 4096;
    private static int getHighSpeedVideoFpsRanges = 125;

    static {
        int i = 125 % 2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m26743(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i) throws java.io.IOException {
        int i2 = Camera2StreamConfigurationMap + 105;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            byte[] bArr = new byte[i];
            throw null;
        }
        byte[] bArr2 = new byte[i];
        int i4 = ((i3 | 73) << 1) - (i3 ^ 73);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 2;
        }
        while (true) {
            int read = inputStream.read(bArr2, 0, i);
            if (read < 0) {
                return;
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 93) % 128;
            outputStream.write(bArr2, 0, read);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m26742(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (((i | 119) << 1) - (i ^ 119)) % 128;
        m26743(inputStream, outputStream, getHighResolutionOutputSizeshNQ4ISI);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 63) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m26744(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = Camera2StreamConfigurationMap;
        int i4 = ((i3 | 59) << 1) - (i3 ^ 59);
        getHighSpeedVideoFpsRanges = i4 % 128;
        int i5 = i4 % 2 == 0 ? 1 : 0;
        while (i5 < i2) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 63) % 128;
            int i6 = ~i5;
            int i7 = (i6 ^ i) | (i6 & i);
            int i8 = (i5 * 592) + (i * (-590)) + ((~i7) * (-1182));
            int i9 = ~i;
            int i10 = ~((i6 & i9) | (i6 ^ i9) | i9);
            int i11 = ~((i5 ^ i) | (i5 & i));
            int i12 = -(-(((i10 ^ i11) | (i10 & i11)) * (-591)));
            int i13 = (i8 ^ i12) + ((i8 & i12) << 1);
            int i14 = -(-(((i7 & i9) | (i7 ^ i9)) * 591));
            int i15 = -i5;
            int read = inputStream.read(bArr, (i13 ^ i14) + ((i14 & i13) << 1), (i2 ^ i15) + ((i15 & i2) << 1));
            if (read < 0) {
                int i16 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = (((i16 | 47) << 1) - (i16 ^ 47)) % 128;
                return i5;
            }
            int i17 = (i9 ^ read) | (i9 & read);
            int i18 = (read * 829) + (i5 * 829) + (((~(i6 | (~read))) | (~((i17 ^ i5) | (i17 & i5)))) * (-828));
            int i19 = (i5 ^ read) | (i5 & read);
            int i20 = (i19 | i9) * (-828);
            int i21 = ((i18 | i20) << 1) - (i20 ^ i18);
            int i22 = -(-((~i19) * 828));
            i5 = ((i21 | i22) << 1) - (i22 ^ i21);
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 37) % 128;
        }
        return i5;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26745(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        m26742(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i ^ 69) + ((i & 69) << 1)) % 128;
        return byteArray;
    }
}
