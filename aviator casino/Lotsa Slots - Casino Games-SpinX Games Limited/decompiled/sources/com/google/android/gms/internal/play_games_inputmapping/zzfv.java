package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzfv implements com.google.android.gms.internal.play_games_inputmapping.zzgc {
    private final com.google.android.gms.internal.play_games_inputmapping.zzgc[] zza;

    zzfv(com.google.android.gms.internal.play_games_inputmapping.zzgc... zzgcVarArr) {
        this.zza = zzgcVarArr;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgc
    public final boolean zzb(java.lang.Class cls) {
        com.google.android.gms.internal.play_games_inputmapping.zzgc[] zzgcVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzgcVarArr[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgc
    public final com.google.android.gms.internal.play_games_inputmapping.zzgb zzc(java.lang.Class cls) {
        com.google.android.gms.internal.play_games_inputmapping.zzgc[] zzgcVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.play_games_inputmapping.zzgc zzgcVar = zzgcVarArr[i];
            if (zzgcVar.zzb(cls)) {
                return zzgcVar.zzc(cls);
            }
        }
        java.lang.String name = cls.getName();
        java.lang.String.valueOf(name);
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(name)));
    }
}
