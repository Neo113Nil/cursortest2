package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzcf {
    private final com.google.android.gms.internal.play_games_inputmapping.zzdo zza;
    private final java.lang.String zzb;

    public zzcf(com.google.android.gms.internal.play_games_inputmapping.zzdo zzdoVar, java.lang.String str) {
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(zzdoVar, "parser");
        this.zza = zzdoVar;
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(str, "message");
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzcf) {
            com.google.android.gms.internal.play_games_inputmapping.zzcf zzcfVar = (com.google.android.gms.internal.play_games_inputmapping.zzcf) obj;
            if (this.zza.equals(zzcfVar.zza) && this.zzb.equals(zzcfVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzdo zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }
}
