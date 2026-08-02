package com.gemalto.mfs.mwsdk.dcm.broadcast;

/* loaded from: classes8.dex */
public class DCMBroadcastService extends androidx.core.app.JobIntentService {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 124;
    private final int getHighResolutionOutputSizeshNQ4ISI = 60;
    private boolean getHighSpeedVideoSizes = false;

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = (i3 ^ 77) + ((i3 & 77) << 1);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            super.onStartCommand(intent, i, i2);
            if (util.h.xy.ag.a.m24556().m24558() == null) {
                int i5 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = ((i5 & 111) + (i5 | 111)) % 128;
                util.h.xy.ag.a.m24556().m24559(getApplicationContext());
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 67) % 128;
            }
            return 1;
        }
        super.onStartCommand(intent, i, i2);
        util.h.xy.ag.a.m24556().m24558();
        throw null;
    }

    public static void enqueueWork(android.content.Context context, android.content.Intent intent) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 17) + (i | 17);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        enqueueWork(context, (java.lang.Class<?>) com.gemalto.mfs.mwsdk.dcm.broadcast.DCMBroadcastService.class, i2 % 2 != 0 ? 118 : 120, intent);
        int i3 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i3 & 107) + (i3 | 107)) % 128;
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(android.content.Intent intent) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f770);
        sb.append(util.h.xy.al.ra.f540);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String stringExtra = intent.getStringExtra(util.h.xy.al.ra.f359);
        if (stringExtra != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 117) % 128;
            if (intent.getStringExtra(util.h.xy.al.ra.f359).equalsIgnoreCase(util.h.xy.al.ra.f525)) {
                int i = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i & 29) + (i | 29)) % 128;
                try {
                    if (util.h.xy.ag.a.m24556().m24558() == null) {
                        util.h.xy.ag.a.m24556().m24559(getApplicationContext());
                    }
                    util.h.xy.k.a.m26907(true);
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 59) % 128;
                    return;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                    return;
                }
            }
        }
        if (stringExtra != null) {
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i2 & 25) + (i2 | 25)) % 128;
            if (intent.getStringExtra(util.h.xy.al.ra.f359).equalsIgnoreCase(util.h.xy.al.ra.f477)) {
                int i3 = getHighSpeedVideoFpsRanges + 81;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 != 0) {
                    intent.getStringExtra(util.h.xy.al.ra.f688);
                    throw new java.lang.ArithmeticException();
                }
                java.lang.String stringExtra2 = intent.getStringExtra(util.h.xy.al.ra.f688);
                if (stringExtra2 == null || stringExtra2.isEmpty()) {
                    return;
                }
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 5) % 128;
                getHighSpeedVideoSizes(stringExtra2);
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 113) % 128;
            }
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f770);
        sb.append(util.h.xy.al.ra.f629);
        util.h.xy.am.ma.m25027(str, sb.toString());
        super.onDestroy();
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 61) << 1) - (i ^ 61);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f770);
        sb.append(util.h.xy.al.ra.f643);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        try {
            util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).mo26174(str);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 29) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
        }
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 5) + (i | 5);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
