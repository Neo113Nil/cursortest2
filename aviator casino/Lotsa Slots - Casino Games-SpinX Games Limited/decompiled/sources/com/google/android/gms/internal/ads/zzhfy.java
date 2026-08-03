package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfy {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhgg zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzibb zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzhfy() {
    }

    /* synthetic */ zzhfy(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhfy zza(com.google.android.gms.internal.ads.zzhgg zzhggVar) {
        this.zza = zzhggVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfy zzb(com.google.android.gms.internal.ads.zzibb zzibbVar) {
        this.zzb = zzibbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfy zzc(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfz zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzibb zzibbVar;
        com.google.android.gms.internal.ads.zziaz zzb;
        com.google.android.gms.internal.ads.zzhgg zzhggVar = this.zza;
        if (zzhggVar == null || (zzibbVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhggVar.zzc() != zzibbVar.zzd()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzhggVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == com.google.android.gms.internal.ads.zzhgf.zzc) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (this.zza.zzd() == com.google.android.gms.internal.ads.zzhgf.zzb) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != com.google.android.gms.internal.ads.zzhgf.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zza.zzd());
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(java.lang.String.valueOf(valueOf)));
            }
            zzb = com.google.android.gms.internal.ads.zzhms.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhfz(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
