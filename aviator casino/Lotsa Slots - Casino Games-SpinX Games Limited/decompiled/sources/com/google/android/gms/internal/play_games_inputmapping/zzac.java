package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzac implements com.google.android.gms.internal.play_games_inputmapping.zzao, com.google.android.gms.internal.play_games_inputmapping.zzba {
    private static final java.lang.String zza = new java.lang.String();
    private final java.util.logging.Level zzb;
    private final long zzc;
    private com.google.android.gms.internal.play_games_inputmapping.zzab zzd;
    private com.google.android.gms.internal.play_games_inputmapping.zzaf zze;
    private com.google.android.gms.internal.play_games_inputmapping.zzcf zzf;
    private java.lang.Object[] zzg;

    protected zzac(java.util.logging.Level level, boolean z) {
        long zzk = com.google.android.gms.internal.play_games_inputmapping.zzcb.zzk();
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(level, com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL);
        this.zzb = level;
        this.zzc = zzk;
    }

    protected abstract com.google.android.gms.internal.play_games_inputmapping.zzdo zza();

    protected boolean zzb(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.android.gms.internal.play_games_inputmapping.zzag zzagVar) {
        com.google.android.gms.internal.play_games_inputmapping.zzab zzabVar = this.zzd;
        if (zzabVar != null) {
            if (zzagVar != null) {
                java.lang.Integer num = (java.lang.Integer) zzabVar.zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zzb);
                com.google.android.gms.internal.play_games_inputmapping.zzal zzalVar = (com.google.android.gms.internal.play_games_inputmapping.zzal) this.zzd.zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zzc);
                com.google.android.gms.internal.play_games_inputmapping.zzam zza2 = com.google.android.gms.internal.play_games_inputmapping.zzam.zza(zzagVar, this.zzd);
                if (num != null && !zza2.zzb(num.intValue())) {
                    return false;
                }
                if (zzalVar != null && !zza2.zzc(this.zzc, zzalVar)) {
                    return false;
                }
            }
            com.google.android.gms.internal.play_games_inputmapping.zzat zzatVar = (com.google.android.gms.internal.play_games_inputmapping.zzat) this.zzd.zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zzg);
            if (zzatVar != null) {
                com.google.android.gms.internal.play_games_inputmapping.zzar zzarVar = com.google.android.gms.internal.play_games_inputmapping.zzaa.zzg;
                com.google.android.gms.internal.play_games_inputmapping.zzab zzabVar2 = this.zzd;
                if (zzabVar2 != null) {
                    zzabVar2.zzf(zzarVar);
                }
                zzm(com.google.android.gms.internal.play_games_inputmapping.zzaa.zza, new com.google.android.gms.internal.play_games_inputmapping.zzaj((java.lang.Throwable) zzl().zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zza), zzatVar, com.google.android.gms.internal.play_games_inputmapping.zzdr.zzb(com.google.android.gms.internal.play_games_inputmapping.zzac.class, zzatVar.zza(), 1)));
            }
        }
        return true;
    }

    protected abstract com.google.android.gms.internal.play_games_inputmapping.zzp zzc();

    protected abstract com.google.android.gms.internal.play_games_inputmapping.zzao zzd();

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzba
    public final java.util.logging.Level zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzba
    public final long zzf() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzba
    public final com.google.android.gms.internal.play_games_inputmapping.zzaf zzg() {
        com.google.android.gms.internal.play_games_inputmapping.zzaf zzafVar = this.zze;
        if (zzafVar != null) {
            return zzafVar;
        }
        throw new java.lang.IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzba
    public final com.google.android.gms.internal.play_games_inputmapping.zzcf zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzba
    public final java.lang.Object[] zzi() {
        if (this.zzf != null) {
            return this.zzg;
        }
        throw new java.lang.IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzba
    public final java.lang.Object zzj() {
        if (this.zzf == null) {
            return this.zzg[0];
        }
        throw new java.lang.IllegalStateException("cannot get literal argument if a template context exists");
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzba
    public final boolean zzk() {
        return this.zzd != null && java.lang.Boolean.TRUE.equals(this.zzd.zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zze));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzba
    public final com.google.android.gms.internal.play_games_inputmapping.zzbg zzl() {
        com.google.android.gms.internal.play_games_inputmapping.zzab zzabVar = this.zzd;
        return zzabVar != null ? zzabVar : com.google.android.gms.internal.play_games_inputmapping.zzbg.zzg();
    }

    protected final void zzm(com.google.android.gms.internal.play_games_inputmapping.zzar zzarVar, java.lang.Object obj) {
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.play_games_inputmapping.zzab();
        }
        this.zzd.zze(zzarVar, obj);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzao
    public final com.google.android.gms.internal.play_games_inputmapping.zzao zzn(java.lang.String str, java.lang.String str2, int i, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str3) {
        com.google.android.gms.internal.play_games_inputmapping.zzae zzaeVar = new com.google.android.gms.internal.play_games_inputmapping.zzae(str, str2, i, str3, null);
        if (this.zze == null) {
            this.zze = zzaeVar;
        }
        return zzd();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzao
    public final void zzo(java.lang.String str) {
        if (this.zze == null) {
            this.zze = com.google.android.gms.internal.play_games_inputmapping.zzcb.zzb().zzb(com.google.android.gms.internal.play_games_inputmapping.zzac.class, 1);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzag zzagVar = this.zze;
        if (zzagVar != com.google.android.gms.internal.play_games_inputmapping.zzaf.zza) {
            com.google.android.gms.internal.play_games_inputmapping.zzab zzabVar = this.zzd;
            if (zzabVar != null && zzabVar.zza() > 0) {
                com.google.android.gms.internal.play_games_inputmapping.zzds.zza(zzagVar, "logSiteKey");
                int zza2 = zzabVar.zza();
                for (int i = 0; i < zza2; i++) {
                    if (com.google.android.gms.internal.play_games_inputmapping.zzaa.zzd.equals(zzabVar.zzb(i))) {
                        java.lang.Object zzc = zzabVar.zzc(i);
                        zzagVar = zzc instanceof com.google.android.gms.internal.play_games_inputmapping.zzap ? ((com.google.android.gms.internal.play_games_inputmapping.zzap) zzc).zzb() : com.google.android.gms.internal.play_games_inputmapping.zzas.zza(zzagVar, zzc);
                    }
                }
            }
        } else {
            zzagVar = null;
        }
        if (zzb(zzagVar)) {
            java.lang.String str2 = zza;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = str;
            this.zzg = objArr;
            for (int i2 = 0; i2 <= 0; i2++) {
                java.lang.Object obj = objArr[i2];
                if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzx) {
                    objArr[i2] = ((com.google.android.gms.internal.play_games_inputmapping.zzx) obj).zza();
                }
            }
            if (str2 != zza) {
                this.zzf = new com.google.android.gms.internal.play_games_inputmapping.zzcf(zza(), str2);
            }
            com.google.android.gms.internal.play_games_inputmapping.zzdf zzi = com.google.android.gms.internal.play_games_inputmapping.zzcb.zzi();
            if (!zzi.zzc()) {
                com.google.android.gms.internal.play_games_inputmapping.zzdf zzdfVar = (com.google.android.gms.internal.play_games_inputmapping.zzdf) zzl().zzd(com.google.android.gms.internal.play_games_inputmapping.zzaa.zzf);
                if (zzdfVar != null) {
                    zzi = zzi.zzd(zzdfVar);
                }
                zzm(com.google.android.gms.internal.play_games_inputmapping.zzaa.zzf, zzi);
            }
            zzc().zzf(this);
        }
    }
}
