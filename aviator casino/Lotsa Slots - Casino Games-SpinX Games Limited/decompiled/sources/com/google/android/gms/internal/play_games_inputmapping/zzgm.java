package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzgm {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzgm zza = new com.google.android.gms.internal.play_games_inputmapping.zzgm();
    private final java.util.concurrent.ConcurrentMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.play_games_inputmapping.zzgq zzb = new com.google.android.gms.internal.play_games_inputmapping.zzfw();

    private zzgm() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzgm zza() {
        return zza;
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzgp zzb(java.lang.Class cls) {
        com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb(cls, "messageType");
        com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar = (com.google.android.gms.internal.play_games_inputmapping.zzgp) this.zzc.get(cls);
        if (zzgpVar == null) {
            zzgpVar = this.zzb.zza(cls);
            com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb(cls, "messageType");
            com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb(zzgpVar, "schema");
            com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar2 = (com.google.android.gms.internal.play_games_inputmapping.zzgp) this.zzc.putIfAbsent(cls, zzgpVar);
            if (zzgpVar2 != null) {
                return zzgpVar2;
            }
        }
        return zzgpVar;
    }
}
