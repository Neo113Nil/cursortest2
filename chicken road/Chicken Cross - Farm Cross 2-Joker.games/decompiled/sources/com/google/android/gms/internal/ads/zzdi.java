package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdi {
    private static Executor zza;

    public static synchronized Executor zza() {
        Executor executor;
        synchronized (zzdi.class) {
            if (zza == null) {
                zza = zzfm.zzg("ExoPlayer:BackgroundExecutor");
            }
            executor = zza;
        }
        return executor;
    }
}
