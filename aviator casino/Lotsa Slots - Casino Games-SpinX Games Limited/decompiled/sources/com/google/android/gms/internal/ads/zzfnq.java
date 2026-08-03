package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfnq implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger zza = new java.util.concurrent.atomic.AtomicInteger(1);

    zzfnq() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(andIncrement).length() + 14);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new java.lang.Thread(runnable, sb.toString());
    }
}
