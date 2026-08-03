package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdh {
    private static java.util.concurrent.Executor zza;

    public static synchronized java.util.concurrent.Executor zza() {
        java.util.concurrent.Executor executor;
        synchronized (com.google.android.gms.internal.ads.zzdh.class) {
            if (zza == null) {
                zza = com.google.android.gms.internal.ads.zzfl.zzg("ExoPlayer:BackgroundExecutor");
            }
            executor = zza;
        }
        return executor;
    }
}
