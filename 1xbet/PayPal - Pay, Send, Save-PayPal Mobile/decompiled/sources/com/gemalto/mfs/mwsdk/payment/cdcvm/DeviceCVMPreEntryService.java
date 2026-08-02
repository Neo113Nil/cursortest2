package com.gemalto.mfs.mwsdk.payment.cdcvm;

/* loaded from: classes8.dex */
public class DeviceCVMPreEntryService extends android.app.Service {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private com.gemalto.mfs.mwsdk.payment.cdcvm.DeviceCVMPreEntryReceiver getHighSpeedVideoSizes;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 39) + ((i & 39) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f585);
        sb.append(util.h.xy.al.ra.f612);
        util.h.xy.am.ma.m25027(str, sb.toString());
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(util.h.xy.al.ra.f529);
        com.gemalto.mfs.mwsdk.payment.cdcvm.DeviceCVMPreEntryReceiver deviceCVMPreEntryReceiver = new com.gemalto.mfs.mwsdk.payment.cdcvm.DeviceCVMPreEntryReceiver();
        this.getHighSpeedVideoSizes = deviceCVMPreEntryReceiver;
        registerReceiver(deviceCVMPreEntryReceiver, intentFilter);
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = ((i3 | 21) << 1) - (i3 ^ 21);
        int i5 = i4 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i5;
        if (i4 % 2 == 0) {
            getHighSpeedVideoFpsRanges = ((i5 ^ 51) + ((i5 & 51) << 1)) % 128;
            return 1;
        }
        throw null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f585);
        sb.append(util.h.xy.al.ra.f629);
        util.h.xy.am.ma.m25027(str, sb.toString());
        unregisterReceiver(this.getHighSpeedVideoSizes);
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 107) << 1) - (i ^ 107)) % 128;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 107) << 1) - (i ^ 107);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i + 77;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
