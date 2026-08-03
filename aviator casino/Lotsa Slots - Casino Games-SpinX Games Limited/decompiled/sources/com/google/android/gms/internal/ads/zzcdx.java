package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcdx implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger zza;

    zzcdx(com.google.android.gms.internal.ads.zzcdz zzcdzVar) {
        java.util.Objects.requireNonNull(zzcdzVar);
        this.zza = new java.util.concurrent.atomic.AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(andIncrement).length() + 31);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new java.lang.Thread(runnable, sb.toString());
    }
}
