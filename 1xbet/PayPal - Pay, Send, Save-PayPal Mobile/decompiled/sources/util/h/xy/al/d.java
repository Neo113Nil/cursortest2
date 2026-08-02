package util.h.xy.al;

/* loaded from: classes5.dex */
public class d {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;

    static {
        int i = Camera2StreamConfigurationMap + 89;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static int m25005() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i & 81) + (i | 81)) % 128;
        int i2 = 0;
        try {
            byte[] m27637 = util.h.xy.v.b.f2439.m27637(new byte[16]);
            java.util.Arrays.toString(m27637);
            byte[] bArr = new byte[2];
            int i3 = 0;
            while (i3 < 2) {
                int i4 = Camera2StreamConfigurationMap;
                int i5 = (i4 ^ 53) + ((i4 & 53) << 1);
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 != 0) {
                    bArr[i3] = m27637[i3];
                    int i6 = (i3 & 5) + (i3 | 5);
                    i3 = ((i6 | 36) << 1) - (i6 ^ 36);
                } else {
                    bArr[i3] = m27637[i3];
                    i3 = (i3 ^ 1) + ((i3 & 1) << 1);
                }
                int i7 = (i4 & 61) + (i4 | 61);
                getHighSpeedVideoFpsRanges = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 / 2;
                }
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 117) % 128;
            for (int i9 = 0; i9 < 2; i9 = ((i9 | 1) << 1) - (i9 ^ 1)) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 77) % 128;
                int i10 = i2 << 8;
                int i11 = -(-(bArr[i9] & 255));
                i2 = ((i10 | i11) << 1) - (i11 ^ i10);
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
        }
        int i12 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i12 ^ 69) + ((i12 & 69) << 1)) % 128;
        return i2;
    }
}
