package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgez {
    private zzgfj zza = null;
    private zzgve zzb = null;
    private Integer zzc = null;

    private zzgez() {
    }

    public final zzgez zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgez zzb(zzgve zzgveVar) {
        this.zzb = zzgveVar;
        return this;
    }

    public final zzgez zzc(zzgfj zzgfjVar) {
        this.zza = zzgfjVar;
        return this;
    }

    public final zzgfb zzd() throws GeneralSecurityException {
        zzgve zzgveVar;
        zzgvd zzgvdVarZzb;
        zzgfj zzgfjVar = this.zza;
        if (zzgfjVar == null || (zzgveVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfjVar.zzb() != zzgveVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgfjVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgfh.zzc) {
            zzgvdVarZzb = zzglv.zza;
        } else if (this.zza.zzd() == zzgfh.zzb) {
            zzgvdVarZzb = zzglv.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgfh.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzgvdVarZzb = zzglv.zzb(this.zzc.intValue());
        }
        return new zzgfb(this.zza, this.zzb, zzgvdVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgez(zzgfa zzgfaVar) {
    }
}
