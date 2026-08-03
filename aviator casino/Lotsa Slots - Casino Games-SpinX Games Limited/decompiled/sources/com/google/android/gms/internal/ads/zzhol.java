package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhol {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhov zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzibb zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzhol() {
    }

    /* synthetic */ zzhol(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhol zza(com.google.android.gms.internal.ads.zzhov zzhovVar) {
        this.zza = zzhovVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhol zzb(com.google.android.gms.internal.ads.zzibb zzibbVar) {
        this.zzb = zzibbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhol zzc(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhom zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzibb zzibbVar;
        com.google.android.gms.internal.ads.zziaz zza;
        com.google.android.gms.internal.ads.zzhov zzhovVar = this.zza;
        if (zzhovVar == null || (zzibbVar = this.zzb) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhovVar.zzc() != zzibbVar.zzd()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (zzhovVar.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == com.google.android.gms.internal.ads.zzhou.zzd) {
            zza = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (this.zza.zzf() == com.google.android.gms.internal.ads.zzhou.zzc || this.zza.zzf() == com.google.android.gms.internal.ads.zzhou.zzb) {
            zza = com.google.android.gms.internal.ads.zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != com.google.android.gms.internal.ads.zzhou.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zza.zzf());
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalStateException("Unknown HmacParameters.Variant: ".concat(java.lang.String.valueOf(valueOf)));
            }
            zza = com.google.android.gms.internal.ads.zzhms.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhom(this.zza, this.zzb, zza, this.zzc, null);
    }
}
