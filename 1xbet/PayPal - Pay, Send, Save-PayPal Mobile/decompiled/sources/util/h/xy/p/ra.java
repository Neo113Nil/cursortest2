package util.h.xy.p;

/* loaded from: classes5.dex */
public class ra {
    private static int Camera2StreamConfigurationMap = 56;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final java.lang.String f2293 = "ra";

    static {
        int i = 56 % 2;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i & 109) + (i | 109)) % 128;
        java.lang.String string = util.h.xy.ag.a.m24556().m24558().getSharedPreferences(util.h.xy.al.ra.f472, 0).getString(str, null);
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i2 & 65) + (i2 | 65)) % 128;
        return string;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i ^ 13) + ((i & 13) << 1)) % 128;
        android.content.SharedPreferences.Editor edit = util.h.xy.ag.a.m24556().m24558().getSharedPreferences(util.h.xy.al.ra.f472, 0).edit();
        edit.putString(str, str2);
        edit.apply();
        edit.commit();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 69) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m27048() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i & 39) + (i | 39)) % 128;
        android.content.SharedPreferences.Editor edit = util.h.xy.ag.a.m24556().m24558().getSharedPreferences(util.h.xy.al.ra.f472, 0).edit();
        edit.clear();
        edit.apply();
        edit.commit();
        int i2 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i2 & 43) + (i2 | 43)) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m27052(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 19) % 128;
        getHighSpeedVideoFpsRangesFor(util.h.xy.al.ra.f702, str);
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 17) << 1) - (i ^ 17)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m27047(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.ak.ma.f84.m24980(str.getBytes());
        } else {
            util.h.xy.ak.ma.f84.m24980(str.getBytes());
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m27046() {
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        int i = getHighSpeedVideoFpsRangesFor + 37;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ak.ma.f84.m24974();
            throw new java.lang.ArithmeticException();
        }
        if (util.h.xy.ak.ma.f84.m24974() == null) {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(util.h.xy.al.ra.f702);
        } else {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                util.h.xy.ak.ma.f84.m24974();
                throw null;
            }
            highResolutionOutputSizeshNQ4ISI = util.h.xy.ak.ma.f84.m24974();
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 125) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m27049(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i & 7) + (i | 7)) % 128;
        getHighSpeedVideoFpsRangesFor(util.h.xy.al.ra.f701, str);
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m27050(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i ^ 25) + ((i & 25) << 1)) % 128;
        util.h.xy.ak.ma.f84.m24970(str.getBytes());
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i2 & 59) + (i2 | 59)) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m27051() {
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        int i = Camera2StreamConfigurationMap + 109;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ak.ma.f84.m24971();
            throw null;
        }
        if (util.h.xy.ak.ma.f84.m24971() == null) {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(util.h.xy.al.ra.f701);
        } else {
            int i2 = getHighSpeedVideoFpsRangesFor + 19;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                highResolutionOutputSizeshNQ4ISI = util.h.xy.ak.ma.f84.m24971();
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 91) % 128;
            } else {
                util.h.xy.ak.ma.f84.m24971();
                throw null;
            }
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 23) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }
}
