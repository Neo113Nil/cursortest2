package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgny {
    private zzgok zza = null;
    private zzgve zzb = null;
    private Integer zzc = null;

    private zzgny() {
    }

    public final zzgny zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgny zzb(zzgve zzgveVar) {
        this.zzb = zzgveVar;
        return this;
    }

    public final zzgny zzc(zzgok zzgokVar) {
        this.zza = zzgokVar;
        return this;
    }

    public final zzgoa zzd() {
        zzgve zzgveVar;
        zzgvd zza;
        zzgok zzgokVar = this.zza;
        if (zzgokVar == null || (zzgveVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgokVar.zzc() != zzgveVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgokVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgoi.zzd) {
            zza = zzglv.zza;
        } else if (this.zza.zzg() == zzgoi.zzc || this.zza.zzg() == zzgoi.zzb) {
            zza = zzglv.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzg() != zzgoi.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zza = zzglv.zzb(this.zzc.intValue());
        }
        return new zzgoa(this.zza, this.zzb, zza, this.zzc, null);
    }

    public /* synthetic */ zzgny(zzgnz zzgnzVar) {
    }
}
