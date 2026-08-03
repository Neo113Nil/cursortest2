package com.google.android.gms.drive.events;

/* loaded from: classes3.dex */
final class zzh extends java.lang.Thread {
    private final /* synthetic */ java.util.concurrent.CountDownLatch zzcn;
    private final /* synthetic */ com.google.android.gms.drive.events.DriveEventService zzco;

    zzh(com.google.android.gms.drive.events.DriveEventService driveEventService, java.util.concurrent.CountDownLatch countDownLatch) {
        this.zzco = driveEventService;
        this.zzcn = countDownLatch;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.util.concurrent.CountDownLatch countDownLatch;
        java.util.concurrent.CountDownLatch countDownLatch2;
        try {
            android.os.Looper.prepare();
            this.zzco.zzck = new com.google.android.gms.drive.events.DriveEventService.zza(this.zzco, null);
            this.zzco.zzcl = false;
            this.zzcn.countDown();
            android.os.Looper.loop();
        } finally {
            countDownLatch = this.zzco.zzcj;
            if (countDownLatch != null) {
                countDownLatch2 = this.zzco.zzcj;
                countDownLatch2.countDown();
            }
        }
    }
}
