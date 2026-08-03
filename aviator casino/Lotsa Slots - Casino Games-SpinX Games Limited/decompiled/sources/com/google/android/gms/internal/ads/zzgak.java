package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgak implements com.google.android.gms.internal.ads.zzgaj {
    private zzgak() {
        throw null;
    }

    /* synthetic */ zzgak(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzgaj
    public final java.util.concurrent.ExecutorService zza(int i, java.util.concurrent.ThreadFactory threadFactory, int i2) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzgaj
    public final java.util.concurrent.ExecutorService zzb(int i) {
        return zza(1, java.util.concurrent.Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgaj
    public final java.util.concurrent.ExecutorService zzc(java.util.concurrent.ThreadFactory threadFactory, int i) {
        return zza(1, threadFactory, 1);
    }
}
