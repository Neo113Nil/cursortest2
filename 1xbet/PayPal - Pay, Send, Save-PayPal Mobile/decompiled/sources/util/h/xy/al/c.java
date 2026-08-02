package util.h.xy.al;

/* loaded from: classes18.dex */
public class c {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;

    static {
        int i = Camera2StreamConfigurationMap + 1;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m25004(android.content.Context context) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f755);
        sb.append(util.h.xy.al.ra.f462);
        util.h.xy.am.ma.m25027(str, sb.toString());
        android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService(util.h.xy.al.ra.f358);
        int i = ~((int) java.lang.System.currentTimeMillis());
        int i2 = ((~((-1283548305) | i)) | 1003199714) * (-983);
        int i3 = ~((i ^ 1003199714) | (i & 1003199714));
        int i4 = -(-(((i3 ^ (-2144074995)) | (i3 & (-2144074995))) * 983));
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i5 = ~currentTimeMillis;
        int i6 = (((1082662955 ^ i5) | (i5 & 1082662955)) * (-192)) + 352269819;
        int i7 = (i5 ^ (-107463889)) | (i5 & (-107463889));
        int i8 = ~i7;
        int i9 = ((i8 ^ 35652800) | (i8 & 35652800)) * (-384);
        int i10 = (~((i7 ^ 1118315755) | (i7 & 1118315755))) | (~(((-35652801) ^ currentTimeMillis) | (currentTimeMillis & (-35652801))));
        int i11 = ~(currentTimeMillis | 1190126843);
        if ((((i2 & 1674934416) + (i2 | 1674934416)) - (~i4)) - 1 > (((i6 ^ i9) + ((i9 & i6) << 1)) - (~(-(-(((i11 & i10) | (i11 ^ i10)) * 192))))) - 1) {
            powerManager.isInteractive();
            throw null;
        }
        boolean isInteractive = powerManager.isInteractive();
        int i12 = getHighSpeedVideoSizes + 103;
        Camera2StreamConfigurationMap = i12 % 128;
        if (i12 % 2 != 0) {
            return isInteractive;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m25003() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f755);
        sb.append(util.h.xy.al.ra.f402);
        util.h.xy.am.ma.m25027(str, sb.toString());
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) util.h.xy.ag.a.m24556().m24558().getSystemService(util.h.xy.al.ra.f803);
        if (keyguardManager != null) {
            int i = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = ((i ^ 27) + ((i & 27) << 1)) % 128;
            if (keyguardManager.inKeyguardRestrictedInputMode()) {
                int i2 = Camera2StreamConfigurationMap;
                int i3 = (((i2 | 53) << 1) - (i2 ^ 53)) % 128;
                getHighSpeedVideoSizes = i3;
                Camera2StreamConfigurationMap = (((i3 | 103) << 1) - (i3 ^ 103)) % 128;
                return true;
            }
        }
        int i4 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i4 & 115) + (i4 | 115)) % 128;
        return false;
    }
}
