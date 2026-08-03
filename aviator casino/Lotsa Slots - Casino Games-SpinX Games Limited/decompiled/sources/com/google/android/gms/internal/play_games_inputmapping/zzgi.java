package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzgi implements com.google.android.gms.internal.play_games_inputmapping.zzgp {
    private final com.google.android.gms.internal.play_games_inputmapping.zzge zza;
    private final com.google.android.gms.internal.play_games_inputmapping.zzhd zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.play_games_inputmapping.zzes zzd;

    private zzgi(com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar, com.google.android.gms.internal.play_games_inputmapping.zzes zzesVar, com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar) {
        this.zzb = zzhdVar;
        this.zzc = zzesVar.zza(zzgeVar);
        this.zzd = zzesVar;
        this.zza = zzgeVar;
    }

    static com.google.android.gms.internal.play_games_inputmapping.zzgi zzh(com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar, com.google.android.gms.internal.play_games_inputmapping.zzes zzesVar, com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzgi(zzhdVar, zzesVar, zzgeVar);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final boolean zza(java.lang.Object obj, java.lang.Object obj2) {
        if (!this.zzb.zzb(obj).equals(this.zzb.zzb(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zzb(obj);
        this.zzd.zzb(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final int zzb(java.lang.Object obj) {
        int hashCode = this.zzb.zzb(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zzb(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final void zzc(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_games_inputmapping.zzgr.zzX(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.gms.internal.play_games_inputmapping.zzgr.zzW(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final int zzd(java.lang.Object obj) {
        com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar = this.zzb;
        int zzf = zzhdVar.zzf(zzhdVar.zzb(obj));
        if (!this.zzc) {
            return zzf;
        }
        this.zzd.zzb(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final void zze(java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar) throws java.io.IOException {
        this.zzd.zzb(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final void zzf(java.lang.Object obj) {
        this.zzb.zzc(obj);
        this.zzd.zzc(obj);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final boolean zzg(java.lang.Object obj) {
        this.zzd.zzb(obj);
        throw null;
    }
}
