package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgep {
    private zzgey zza = null;
    private zzgve zzb = null;
    private Integer zzc = null;

    private zzgep() {
    }

    public final zzgep zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgep zzb(zzgve zzgveVar) {
        this.zzb = zzgveVar;
        return this;
    }

    public final zzgep zzc(zzgey zzgeyVar) {
        this.zza = zzgeyVar;
        return this;
    }

    public final zzger zzd() throws GeneralSecurityException {
        zzgve zzgveVar;
        zzgvd zzgvdVarZzb;
        zzgey zzgeyVar = this.zza;
        if (zzgeyVar == null || (zzgveVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgeyVar.zzc() != zzgveVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgeyVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgew.zzc) {
            zzgvdVarZzb = zzglv.zza;
        } else if (this.zza.zze() == zzgew.zzb) {
            zzgvdVarZzb = zzglv.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzgew.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzgvdVarZzb = zzglv.zzb(this.zzc.intValue());
        }
        return new zzger(this.zza, this.zzb, zzgvdVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgep(zzgeq zzgeqVar) {
    }
}
