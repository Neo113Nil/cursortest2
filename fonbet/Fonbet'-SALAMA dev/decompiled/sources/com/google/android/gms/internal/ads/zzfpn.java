package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfpn implements zzfpm {
    private zzfpn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final ExecutorService zza(int i7) {
        return zzc(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final ExecutorService zzb(ThreadFactory threadFactory, int i7) {
        return zzc(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final ExecutorService zzc(int i7, ThreadFactory threadFactory, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public /* synthetic */ zzfpn(zzfpo zzfpoVar) {
    }
}
