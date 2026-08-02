package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zztj implements com.google.android.libraries.places.internal.zzts, com.google.android.libraries.places.internal.zzun {
    private static final java.lang.String zza = new java.lang.String();
    private final java.util.logging.Level zzb;
    private final long zzc;
    private com.google.android.libraries.places.internal.zzti zzd;
    private com.google.android.libraries.places.internal.zztm zze;
    private com.google.android.libraries.places.internal.zzua zzf;
    private com.google.android.libraries.places.internal.zzvp zzg;
    private java.lang.Object[] zzh;

    protected zztj(java.util.logging.Level level, boolean z) {
        long zzk = com.google.android.libraries.places.internal.zzvn.zzk();
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzh = null;
        com.google.android.libraries.places.internal.zzxb.zza(level, "level");
        this.zzb = level;
        this.zzc = zzk;
    }

    private final boolean zzq() {
        com.google.android.libraries.places.internal.zztn zztnVar;
        com.google.android.libraries.places.internal.zzti zztiVar;
        if (this.zze == null) {
            this.zze = com.google.android.libraries.places.internal.zzvn.zzb().zzb(com.google.android.libraries.places.internal.zztj.class, 1);
        }
        if (this.zze != com.google.android.libraries.places.internal.zztm.zza) {
            zztnVar = this.zze;
            com.google.android.libraries.places.internal.zzti zztiVar2 = this.zzd;
            if (zztiVar2 != null && zztiVar2.zza() > 0) {
                com.google.android.libraries.places.internal.zzxb.zza(zztnVar, "logSiteKey");
                int zza2 = zztiVar2.zza();
                for (int i = 0; i < zza2; i++) {
                    if (com.google.android.libraries.places.internal.zzth.zzf.equals(zztiVar2.zzb(i))) {
                        java.lang.Object zzc = zztiVar2.zzc(i);
                        zztnVar = zzc instanceof com.google.android.libraries.places.internal.zztt ? ((com.google.android.libraries.places.internal.zztt) zzc).zzb() : com.google.android.libraries.places.internal.zzue.zza(zztnVar, zzc);
                    }
                }
            }
        } else {
            zztnVar = null;
        }
        boolean zzb = zzb(zztnVar);
        com.google.android.libraries.places.internal.zzua zzuaVar = this.zzf;
        if (zzuaVar == null) {
            return zzb;
        }
        int zza3 = com.google.android.libraries.places.internal.zztz.zza(zzuaVar, zztnVar, this.zzd);
        if (zzb && zza3 > 0 && (zztiVar = this.zzd) != null) {
            zztiVar.zze(com.google.android.libraries.places.internal.zzth.zze, java.lang.Integer.valueOf(zza3));
        }
        return zzb & (zza3 >= 0);
    }

    private final void zzr(java.lang.String str, java.lang.Object... objArr) {
        this.zzh = objArr;
        java.lang.Object obj = objArr[0];
        if (obj instanceof com.google.android.libraries.places.internal.zzte) {
            objArr[0] = ((com.google.android.libraries.places.internal.zzte) obj).zza();
        }
        if (str != zza) {
            this.zzg = new com.google.android.libraries.places.internal.zzvp(zza(), str);
        }
        com.google.android.libraries.places.internal.zzwo zzi = com.google.android.libraries.places.internal.zzvn.zzi();
        if (!zzi.zzc()) {
            com.google.android.libraries.places.internal.zzut zzl = zzl();
            com.google.android.libraries.places.internal.zztv zztvVar = com.google.android.libraries.places.internal.zzth.zzh;
            com.google.android.libraries.places.internal.zzwo zzwoVar = (com.google.android.libraries.places.internal.zzwo) zzl.zzd(zztvVar);
            if (zzwoVar != null) {
                zzi = zzi.zzd(zzwoVar);
            }
            zzm(zztvVar, zzi);
        }
        zzc().zze(this);
    }

    protected abstract com.google.android.libraries.places.internal.zzwx zza();

    protected boolean zzb(com.google.android.libraries.places.internal.zztn zztnVar) {
        com.google.android.libraries.places.internal.zzti zztiVar = this.zzd;
        if (zztiVar != null) {
            if (zztnVar != null) {
                com.google.android.libraries.places.internal.zzua zzc = com.google.android.libraries.places.internal.zzua.zzc(com.google.android.libraries.places.internal.zzua.zzc(com.google.android.libraries.places.internal.zzsx.zza(zztiVar, zztnVar, this.zzc), com.google.android.libraries.places.internal.zzsu.zza(this.zzd, zztnVar)), com.google.android.libraries.places.internal.zzud.zza(this.zzd, zztnVar));
                this.zzf = zzc;
                if (zzc == com.google.android.libraries.places.internal.zzua.zzc) {
                    return false;
                }
            }
            com.google.android.libraries.places.internal.zzti zztiVar2 = this.zzd;
            com.google.android.libraries.places.internal.zztv zztvVar = com.google.android.libraries.places.internal.zzth.zzi;
            com.google.android.libraries.places.internal.zzuf zzufVar = (com.google.android.libraries.places.internal.zzuf) zztiVar2.zzd(zztvVar);
            if (zzufVar != null) {
                com.google.android.libraries.places.internal.zzti zztiVar3 = this.zzd;
                if (zztiVar3 != null) {
                    zztiVar3.zzf(zztvVar);
                }
                com.google.android.libraries.places.internal.zzut zzl = zzl();
                com.google.android.libraries.places.internal.zztv zztvVar2 = com.google.android.libraries.places.internal.zzth.zza;
                zzm(zztvVar2, new com.google.android.libraries.places.internal.zztq((java.lang.Throwable) zzl.zzd(zztvVar2), zzufVar, com.google.android.libraries.places.internal.zzxa.zzb(com.google.android.libraries.places.internal.zztj.class, zzufVar.zza(), 1)));
            }
        }
        return true;
    }

    protected abstract com.google.android.libraries.places.internal.zzss zzc();

    protected abstract com.google.android.libraries.places.internal.zzts zzd();

    @Override // com.google.android.libraries.places.internal.zzun
    public final com.google.android.libraries.places.internal.zztm zzg() {
        com.google.android.libraries.places.internal.zztm zztmVar = this.zze;
        if (zztmVar != null) {
            return zztmVar;
        }
        throw new java.lang.IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // com.google.android.libraries.places.internal.zzun
    public final java.lang.Object[] zzi() {
        com.google.android.libraries.places.internal.zzxb.zzc(this.zzg != null, "cannot get arguments unless a template context exists");
        java.lang.Object[] objArr = this.zzh;
        if (objArr != null) {
            return objArr;
        }
        throw new java.lang.IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // com.google.android.libraries.places.internal.zzun
    public final java.lang.Object zzj() {
        com.google.android.libraries.places.internal.zzxb.zzc(this.zzg == null, "cannot get literal argument if a template context exists");
        java.lang.Object[] objArr = this.zzh;
        if (objArr != null) {
            return objArr[0];
        }
        throw new java.lang.IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // com.google.android.libraries.places.internal.zzun
    public final boolean zzk() {
        return this.zzd != null && java.lang.Boolean.TRUE.equals(this.zzd.zzd(com.google.android.libraries.places.internal.zzth.zzg));
    }

    protected final void zzm(com.google.android.libraries.places.internal.zztv zztvVar, java.lang.Object obj) {
        if (this.zzd == null) {
            this.zzd = new com.google.android.libraries.places.internal.zzti();
        }
        this.zzd.zze(zztvVar, obj);
    }

    @Override // com.google.android.libraries.places.internal.zzts
    public final void zzo(java.lang.String str) {
        if (zzq()) {
            zzr(zza, "Internal Usage Attribution Ids list is full.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzts
    public final void zzp(java.lang.String str, java.lang.Object obj) {
        if (zzq()) {
            zzr("Internal Usage Attribution Id is too long: %s", obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzts
    public final com.google.android.libraries.places.internal.zzts zzn(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        com.google.android.libraries.places.internal.zztl zztlVar = new com.google.android.libraries.places.internal.zztl("com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs", "addInternalUsageAttributionId", i, "AuxLibConfigs.java", null);
        if (this.zze == null) {
            this.zze = zztlVar;
        }
        return zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzun
    public final com.google.android.libraries.places.internal.zzut zzl() {
        com.google.android.libraries.places.internal.zzti zztiVar = this.zzd;
        return zztiVar != null ? zztiVar : com.google.android.libraries.places.internal.zzut.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzun
    public final com.google.android.libraries.places.internal.zzvp zzh() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzun
    public final long zzf() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzun
    public final java.util.logging.Level zze() {
        return this.zzb;
    }
}
