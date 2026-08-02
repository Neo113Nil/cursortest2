package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgfk {
    private zzgfu zza = null;
    private zzgve zzb = null;
    private Integer zzc = null;

    private zzgfk() {
    }

    public final zzgfk zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfk zzb(zzgve zzgveVar) {
        this.zzb = zzgveVar;
        return this;
    }

    public final zzgfk zzc(zzgfu zzgfuVar) {
        this.zza = zzgfuVar;
        return this;
    }

    public final zzgfm zzd() {
        zzgve zzgveVar;
        zzgvd zzb;
        zzgfu zzgfuVar = this.zza;
        if (zzgfuVar == null || (zzgveVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfuVar.zzb() != zzgveVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgfuVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgfs.zzc) {
            zzb = zzglv.zza;
        } else if (this.zza.zzd() == zzgfs.zzb) {
            zzb = zzglv.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgfs.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzb = zzglv.zzb(this.zzc.intValue());
        }
        return new zzgfm(this.zza, this.zzb, zzb, this.zzc, null);
    }

    public /* synthetic */ zzgfk(zzgfl zzgflVar) {
    }
}
