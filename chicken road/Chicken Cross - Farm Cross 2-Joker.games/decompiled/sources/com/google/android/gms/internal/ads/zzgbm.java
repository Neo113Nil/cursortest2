package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgbm implements zzgbl {
    private zzgbm() {
        throw null;
    }

    /* synthetic */ zzgbm(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final ExecutorService zza(int i) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzgbn(null)));
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final ExecutorService zzb(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final ExecutorService zzc(int i) {
        return zzb(1, new zzgbn(null), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final ExecutorService zzd(ThreadFactory threadFactory, int i) {
        return zzb(1, threadFactory, 1);
    }
}
