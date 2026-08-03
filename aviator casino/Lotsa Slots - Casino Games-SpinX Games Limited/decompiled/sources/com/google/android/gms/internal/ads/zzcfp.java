package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcfp implements java.util.concurrent.Executor {
    private final android.os.Handler zza = new com.google.android.gms.ads.internal.util.zzf(android.os.Looper.getMainLooper());

    zzcfp() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzP(com.google.android.gms.ads.internal.zzt.zzh().zzp(), th);
            throw th;
        }
    }
}
