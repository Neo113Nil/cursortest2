package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzer {
    static final com.google.android.gms.internal.play_games_inputmapping.zzer zza = new com.google.android.gms.internal.play_games_inputmapping.zzer(true);
    private static volatile boolean zzb = false;
    private static volatile com.google.android.gms.internal.play_games_inputmapping.zzer zzc;
    private final java.util.Map zzd;

    zzer() {
        this.zzd = new java.util.HashMap();
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzer zza() {
        com.google.android.gms.internal.play_games_inputmapping.zzer zzerVar = zzc;
        if (zzerVar == null) {
            synchronized (com.google.android.gms.internal.play_games_inputmapping.zzer.class) {
                zzerVar = zzc;
                if (zzerVar == null) {
                    zzerVar = zza;
                    zzc = zzerVar;
                }
            }
        }
        return zzerVar;
    }

    zzer(boolean z) {
        this.zzd = java.util.Collections.emptyMap();
    }
}
