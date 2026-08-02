package util.h.xy.al;

/* loaded from: classes18.dex */
public class a {
    private static boolean Camera2StreamConfigurationMap = false;
    private static int getHighSpeedVideoSizes;
    private static int getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 5) % 128;

    private a() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m25001() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
        getHighSpeedVideoSizes = i;
        boolean z = Camera2StreamConfigurationMap;
        int i2 = i + 53;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25002(boolean z) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 59) << 1) - (i ^ 59);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            Camera2StreamConfigurationMap = z;
            getHighResolutionOutputSizeshNQ4ISI = (((i | 67) << 1) - (i ^ 67)) % 128;
        } else {
            Camera2StreamConfigurationMap = z;
            throw null;
        }
    }
}
