package com.gemalto.mfs.mwsdk.payment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class PluginRegistrationManager {
    private static int Camera2StreamConfigurationMap = 1;
    public static final com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager INSTANCE;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final /* synthetic */ com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static char[] getOutputMinFrameDuration;

    private PluginRegistrationManager(java.lang.String str) {
    }

    public static com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager valueOf(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager pluginRegistrationManager = (com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager.class, str);
        int i = getHighSpeedVideoFpsRangesFor + 75;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return pluginRegistrationManager;
        }
        throw null;
    }

    public static com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager[] values() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 107) % 128;
        com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager[] pluginRegistrationManagerArr = (com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager[]) getHighSpeedVideoFpsRanges.clone();
        int i = getHighResolutionOutputSizeshNQ4ISI + 29;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return pluginRegistrationManagerArr;
        }
        throw null;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        int[] iArr = {0, 8, 91, 0};
        byte[] bytes = "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001".getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        char[] cArr6 = new char[i2];
        maVar.f2631 = 0;
        while (maVar.f2631 < i2) {
            cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
            maVar.f2631++;
        }
        if (i3 > 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 35) % 128;
            loop3: while (true) {
                maVar.f2631 = 0;
                while (maVar.f2631 < i2) {
                    int i7 = Camera2StreamConfigurationMap + 77;
                    getHighSpeedVideoSizes = i7 % 128;
                    if (i7 % 2 != 0) {
                        break;
                    }
                    cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                    maVar.f2631++;
                }
                cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] >> iArr[5]);
                int i8 = maVar.f2631;
            }
        }
        com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager pluginRegistrationManager = new com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager(new java.lang.String(cArr6).intern());
        INSTANCE = pluginRegistrationManager;
        int i9 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i9 + 27) % 128;
        com.gemalto.mfs.mwsdk.payment.PluginRegistrationManager[] pluginRegistrationManagerArr = {pluginRegistrationManager};
        int i10 = i9 + 45;
        getHighSpeedVideoFpsRangesFor = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges = pluginRegistrationManagerArr;
        getHighSpeedVideoFpsRangesFor = (i9 + 39) % 128;
    }

    public final void register(com.gemalto.mfs.mwsdk.payment.CustomApduListener customApduListener, java.lang.String[] strArr) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f554);
        sb.append(30);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bu.d.m25655().m25657(customApduListener, strArr);
        int i = getHighResolutionOutputSizeshNQ4ISI + 59;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final boolean hasRegisteredPlugin() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f584);
        sb.append(util.h.xy.al.ra.f597);
        util.h.xy.am.ma.m25027(str, sb.toString());
        boolean m25656 = util.h.xy.bu.d.m25655().m25656();
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
        return m25656;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = new char[]{42253, 42434, 42494, 42495, 42488, 42483, 42486, 42491};
    }
}
