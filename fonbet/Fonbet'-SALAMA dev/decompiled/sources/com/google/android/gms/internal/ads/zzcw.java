package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcw {
    private static Executor zza;

    public static synchronized Executor zza() {
        Executor executor;
        synchronized (zzcw.class) {
            try {
                if (zza == null) {
                    zza = zzen.zzF("ExoPlayer:BackgroundExecutor");
                }
                executor = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }
}
