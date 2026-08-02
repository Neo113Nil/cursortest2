package com.google.android.gms.common.providers;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class PooledExecutorsProvider {
    private static com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory zza;

    public interface PooledExecutorFactory {
        @java.lang.Deprecated
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    @java.lang.Deprecated
    public static com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory getInstance() {
        com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory pooledExecutorFactory;
        synchronized (com.google.android.gms.common.providers.PooledExecutorsProvider.class) {
            if (zza == null) {
                zza = new com.google.android.gms.common.providers.zza();
            }
            pooledExecutorFactory = zza;
        }
        return pooledExecutorFactory;
    }

    private PooledExecutorsProvider() {
    }
}
