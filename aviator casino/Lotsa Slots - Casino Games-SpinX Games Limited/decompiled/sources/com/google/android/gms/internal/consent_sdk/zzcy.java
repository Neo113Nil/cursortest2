package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzcy implements java.util.concurrent.Executor {
    private final java.util.concurrent.ThreadPoolExecutor zzb;
    private final java.util.concurrent.atomic.AtomicInteger zza = new java.util.concurrent.atomic.AtomicInteger(1);
    private java.lang.ref.WeakReference zzc = new java.lang.ref.WeakReference(null);

    zzcy(java.lang.String str) {
        final java.lang.String str2 = "Google consent worker";
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new java.util.concurrent.ThreadFactory(str2) { // from class: com.google.android.gms.internal.consent_sdk.zzcx
            public final /* synthetic */ java.lang.String zzb = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return com.google.android.gms.internal.consent_sdk.zzcy.zza(com.google.android.gms.internal.consent_sdk.zzcy.this, this.zzb, runnable);
            }
        });
        this.zzb = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ java.lang.Thread zza(com.google.android.gms.internal.consent_sdk.zzcy zzcyVar, java.lang.String str, java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "Google consent worker #" + zzcyVar.zza.getAndIncrement());
        zzcyVar.zzc = new java.lang.ref.WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == this.zzc.get()) {
            runnable.run();
        } else {
            this.zzb.execute(runnable);
        }
    }
}
