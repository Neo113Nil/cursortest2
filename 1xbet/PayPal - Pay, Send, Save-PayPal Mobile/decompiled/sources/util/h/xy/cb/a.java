package util.h.xy.cb;

/* loaded from: classes5.dex */
public class a {
    private static int getHighResolutionOutputSizeshNQ4ISI = 125;
    private static int getHighSpeedVideoSizes;

    static {
        int i = 125 % 2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m25846() {
        int i = getHighSpeedVideoSizes + 125;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            java.lang.Integer m25847 = m25847(util.h.xy.al.ra.f511);
            if (m25847 != null) {
                int intValue = m25847.intValue();
                int i2 = getHighSpeedVideoSizes;
                getHighResolutionOutputSizeshNQ4ISI = (((i2 | 81) << 1) - (i2 ^ 81)) % 128;
                return intValue;
            }
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
            return 5;
        }
        m25847(util.h.xy.al.ra.f511);
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m25845() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 115) + ((i & 115) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Integer m25847 = m25847(util.h.xy.al.ra.f574);
            if (m25847 != null) {
                int i3 = getHighSpeedVideoSizes;
                int i4 = ((i3 | 97) << 1) - (i3 ^ 97);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0) {
                    return m25847.intValue();
                }
                throw null;
            }
            int i5 = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = ((i5 ^ 117) + ((i5 & 117) << 1)) % 128;
            return 10000;
        }
        m25847(util.h.xy.al.ra.f574);
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.Integer m25847(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 89) + (i | 89);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.String m25859 = util.h.xy.cb.ra.m25859(util.h.xy.al.ra.f575, str);
            if (android.text.TextUtils.isEmpty(m25859)) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
                return null;
            }
            new java.lang.Object[]{str, java.lang.Integer.valueOf(java.lang.Integer.parseInt(m25859))};
            int parseInt = java.lang.Integer.parseInt(m25859);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 7) % 128;
            return java.lang.Integer.valueOf(parseInt);
        }
        android.text.TextUtils.isEmpty(util.h.xy.cb.ra.m25859(util.h.xy.al.ra.f575, str));
        throw new java.lang.ArithmeticException();
    }
}
