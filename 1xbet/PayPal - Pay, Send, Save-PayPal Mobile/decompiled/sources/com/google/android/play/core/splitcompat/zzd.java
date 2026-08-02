package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
public final class zzd {
    private static java.util.concurrent.ThreadPoolExecutor zza;

    public static java.util.concurrent.Executor zza() {
        if (zza == null) {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.play.core.splitcompat.zzc());
            zza = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return zza;
    }
}
