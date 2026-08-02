package com.google.android.gms.common.providers;

/* loaded from: classes8.dex */
final class zza implements com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory {
    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor() {
        com.google.android.gms.internal.common.zzf.zza();
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1));
    }

    zza() {
    }
}
