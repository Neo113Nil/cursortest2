package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhex {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhfg zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzibb zzb = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzibb zzc = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzd = null;

    private zzhex() {
    }

    /* synthetic */ zzhex(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhex zza(com.google.android.gms.internal.ads.zzhfg zzhfgVar) {
        this.zza = zzhfgVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhex zzb(com.google.android.gms.internal.ads.zzibb zzibbVar) {
        this.zzb = zzibbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhex zzc(com.google.android.gms.internal.ads.zzibb zzibbVar) {
        this.zzc = zzibbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhex zzd(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzd = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhey zze() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zzb;
        com.google.android.gms.internal.ads.zzhfg zzhfgVar = this.zza;
        if (zzhfgVar == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters");
        }
        com.google.android.gms.internal.ads.zzibb zzibbVar = this.zzb;
        if (zzibbVar == null || this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot build without key material");
        }
        if (zzhfgVar.zzc() != zzibbVar.zzd()) {
            throw new java.security.GeneralSecurityException("AES key size mismatch");
        }
        if (zzhfgVar.zzd() != this.zzc.zzd()) {
            throw new java.security.GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == com.google.android.gms.internal.ads.zzhff.zzc) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (this.zza.zzg() == com.google.android.gms.internal.ads.zzhff.zzb) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != com.google.android.gms.internal.ads.zzhff.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zza.zzg());
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(java.lang.String.valueOf(valueOf)));
            }
            zzb = com.google.android.gms.internal.ads.zzhms.zzb(this.zzd.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhey(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
    }
}
