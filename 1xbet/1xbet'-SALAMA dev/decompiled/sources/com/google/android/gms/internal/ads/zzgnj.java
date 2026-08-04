package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgnj {
    private zzgnt zza = null;
    private zzgve zzb = null;
    private Integer zzc = null;

    private zzgnj() {
    }

    public final zzgnj zza(zzgve zzgveVar) {
        this.zzb = zzgveVar;
        return this;
    }

    public final zzgnj zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgnj zzc(zzgnt zzgntVar) {
        this.zza = zzgntVar;
        return this;
    }

    public final zzgnl zzd() throws GeneralSecurityException {
        zzgve zzgveVar;
        zzgvd zzgvdVarZza;
        zzgnt zzgntVar = this.zza;
        if (zzgntVar == null || (zzgveVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgntVar.zzc() != zzgveVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgntVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzgnr.zzd) {
            zzgvdVarZza = zzglv.zza;
        } else if (this.zza.zzf() == zzgnr.zzc || this.zza.zzf() == zzgnr.zzb) {
            zzgvdVarZza = zzglv.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzgnr.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzgvdVarZza = zzglv.zzb(this.zzc.intValue());
        }
        return new zzgnl(this.zza, this.zzb, zzgvdVarZza, this.zzc, null);
    }

    public /* synthetic */ zzgnj(zzgnk zzgnkVar) {
    }
}
