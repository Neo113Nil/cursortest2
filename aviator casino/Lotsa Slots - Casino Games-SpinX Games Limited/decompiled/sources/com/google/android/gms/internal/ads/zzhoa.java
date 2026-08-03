package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhoa {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhoi zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzibb zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzhoa() {
    }

    /* synthetic */ zzhoa(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhoa zza(com.google.android.gms.internal.ads.zzhoi zzhoiVar) {
        this.zza = zzhoiVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhoa zzb(com.google.android.gms.internal.ads.zzibb zzibbVar) throws java.security.GeneralSecurityException {
        this.zzb = zzibbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhoa zzc(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhob zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzibb zzibbVar;
        com.google.android.gms.internal.ads.zziaz zza;
        com.google.android.gms.internal.ads.zzhoi zzhoiVar = this.zza;
        if (zzhoiVar == null || (zzibbVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhoiVar.zzc() != zzibbVar.zzd()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzhoiVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == com.google.android.gms.internal.ads.zzhoh.zzd) {
            zza = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (this.zza.zzf() == com.google.android.gms.internal.ads.zzhoh.zzc || this.zza.zzf() == com.google.android.gms.internal.ads.zzhoh.zzb) {
            zza = com.google.android.gms.internal.ads.zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != com.google.android.gms.internal.ads.zzhoh.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zza.zzf());
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(java.lang.String.valueOf(valueOf)));
            }
            zza = com.google.android.gms.internal.ads.zzhms.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhob(this.zza, this.zzb, zza, this.zzc, null);
    }
}
