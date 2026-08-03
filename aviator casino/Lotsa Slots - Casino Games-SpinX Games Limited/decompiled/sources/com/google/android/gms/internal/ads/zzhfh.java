package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfh {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhfo zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzibb zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzhfh() {
    }

    /* synthetic */ zzhfh(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhfh zza(com.google.android.gms.internal.ads.zzhfo zzhfoVar) {
        this.zza = zzhfoVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfh zzb(com.google.android.gms.internal.ads.zzibb zzibbVar) {
        this.zzb = zzibbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfh zzc(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfi zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzibb zzibbVar;
        com.google.android.gms.internal.ads.zziaz zzb;
        com.google.android.gms.internal.ads.zzhfo zzhfoVar = this.zza;
        if (zzhfoVar == null || (zzibbVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfoVar.zzc() != zzibbVar.zzd()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzhfoVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == com.google.android.gms.internal.ads.zzhfn.zzc) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (this.zza.zze() == com.google.android.gms.internal.ads.zzhfn.zzb) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != com.google.android.gms.internal.ads.zzhfn.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zza.zze());
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(java.lang.String.valueOf(valueOf)));
            }
            zzb = com.google.android.gms.internal.ads.zzhms.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhfi(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
