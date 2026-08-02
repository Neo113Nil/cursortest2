package com.gemalto.mfs.mwsdk.payment.cdcvm;

/* loaded from: classes8.dex */
public class DeviceCVMPreEntryReceiver extends android.content.BroadcastReceiver {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m10183(java.lang.Object[] objArr, int i, int i2, int i3) {
        return getHighSpeedVideoSizes(objArr);
    }

    static {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 81) << 1) - (i ^ 81);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f584);
        sb.append(util.h.xy.al.ra.f651);
        util.h.xy.am.ma.m25027(str, sb.toString());
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
        util.h.xy.al.a.m25002(false);
        util.h.xy.f.b.f2201.m26754(true);
        int i = getHighResolutionOutputSizeshNQ4ISI + 45;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            int i3 = (i2 ^ 119) + ((i2 & 119) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    public void init() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f584);
        sb.append(util.h.xy.al.ra.f439);
        util.h.xy.am.ma.m25027(str, sb.toString());
        m10183(new java.lang.Object[]{this}, -1072764675, 1072764675, java.lang.System.identityHashCode(this));
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 47) + (i | 47)) % 128;
    }

    private static /* synthetic */ java.lang.Object getHighSpeedVideoSizes(java.lang.Object[] objArr) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 5) + ((i & 5) << 1)) % 128;
        try {
            com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager.INSTANCE.setPreEntryActivation(new byte[]{1});
        } catch (java.lang.ExceptionInInitializerError e) {
            e.getMessage();
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i2 ^ 3) + ((i2 & 3) << 1)) % 128;
        return null;
    }
}
