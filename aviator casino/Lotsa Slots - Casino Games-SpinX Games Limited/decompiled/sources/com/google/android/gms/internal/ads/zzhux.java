package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhux {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhuu zza = null;

    @javax.annotation.Nullable
    private java.security.spec.ECPoint zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzhux() {
    }

    /* synthetic */ zzhux(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhux zza(com.google.android.gms.internal.ads.zzhuu zzhuuVar) {
        this.zza = zzhuuVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhux zzb(java.security.spec.ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhux zzc(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhuy zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zza;
        com.google.android.gms.internal.ads.zzhuu zzhuuVar = this.zza;
        if (zzhuuVar == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters");
        }
        java.security.spec.ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            throw new java.security.GeneralSecurityException("Cannot build without public point");
        }
        com.google.android.gms.internal.ads.zzhlg.zza(eCPoint, zzhuuVar.zzd().zza().getCurve());
        if (this.zza.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == com.google.android.gms.internal.ads.zzhut.zzd) {
            zza = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (this.zza.zzf() == com.google.android.gms.internal.ads.zzhut.zzc || this.zza.zzf() == com.google.android.gms.internal.ads.zzhut.zzb) {
            zza = com.google.android.gms.internal.ads.zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != com.google.android.gms.internal.ads.zzhut.zza) {
                throw new java.lang.IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.zza.zzf().toString()));
            }
            zza = com.google.android.gms.internal.ads.zzhms.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhuy(this.zza, this.zzb, zza, this.zzc, null);
    }
}
