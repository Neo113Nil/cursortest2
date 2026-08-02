package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzged {
    private zzgeo zza = null;
    private zzgve zzb = null;
    private zzgve zzc = null;
    private Integer zzd = null;

    private zzged() {
    }

    public final zzged zza(zzgve zzgveVar) {
        this.zzb = zzgveVar;
        return this;
    }

    public final zzged zzb(zzgve zzgveVar) {
        this.zzc = zzgveVar;
        return this;
    }

    public final zzged zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzged zzd(zzgeo zzgeoVar) {
        this.zza = zzgeoVar;
        return this;
    }

    public final zzgef zze() {
        zzgvd zzb;
        zzgeo zzgeoVar = this.zza;
        if (zzgeoVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgve zzgveVar = this.zzb;
        if (zzgveVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzgeoVar.zzb() != zzgveVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzgeoVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzh() == zzgem.zzc) {
            zzb = zzglv.zza;
        } else if (this.zza.zzh() == zzgem.zzb) {
            zzb = zzglv.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzh() != zzgem.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
            }
            zzb = zzglv.zzb(this.zzd.intValue());
        }
        return new zzgef(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
    }

    public /* synthetic */ zzged(zzgee zzgeeVar) {
    }
}
