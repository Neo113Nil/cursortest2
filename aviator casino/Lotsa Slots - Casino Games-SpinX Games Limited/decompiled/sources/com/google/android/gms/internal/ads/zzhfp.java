package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfp {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhfx zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzibb zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzhfp() {
    }

    /* synthetic */ zzhfp(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhfp zza(com.google.android.gms.internal.ads.zzhfx zzhfxVar) {
        this.zza = zzhfxVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfp zzb(com.google.android.gms.internal.ads.zzibb zzibbVar) {
        this.zzb = zzibbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfp zzc(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfq zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzibb zzibbVar;
        com.google.android.gms.internal.ads.zziaz zzb;
        com.google.android.gms.internal.ads.zzhfx zzhfxVar = this.zza;
        if (zzhfxVar == null || (zzibbVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfxVar.zzc() != zzibbVar.zzd()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzhfxVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == com.google.android.gms.internal.ads.zzhfw.zzc) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (this.zza.zzd() == com.google.android.gms.internal.ads.zzhfw.zzb) {
            zzb = com.google.android.gms.internal.ads.zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != com.google.android.gms.internal.ads.zzhfw.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zza.zzd());
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(java.lang.String.valueOf(valueOf)));
            }
            zzb = com.google.android.gms.internal.ads.zzhms.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhfq(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
