package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhwv {
    private static final java.math.BigInteger zzg;
    private static final java.math.BigInteger zzh;

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.math.BigInteger zzb = com.google.android.gms.internal.ads.zzhwy.zza;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhww zzc = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhww zzd = null;

    @javax.annotation.Nullable
    private java.lang.Integer zze = null;
    private com.google.android.gms.internal.ads.zzhwx zzf = com.google.android.gms.internal.ads.zzhwx.zzd;

    static {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(2L);
        zzg = valueOf;
        zzh = valueOf.pow(256);
    }

    private zzhwv() {
    }

    public final com.google.android.gms.internal.ads.zzhwv zza(int i) {
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwv zzb(java.math.BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwv zzc(com.google.android.gms.internal.ads.zzhwx zzhwxVar) {
        this.zzf = zzhwxVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwv zzd(com.google.android.gms.internal.ads.zzhww zzhwwVar) {
        this.zzc = zzhwwVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwv zze(com.google.android.gms.internal.ads.zzhww zzhwwVar) {
        this.zzd = zzhwwVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwy zzg() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new java.security.GeneralSecurityException("signature hash type is not set");
        }
        if (this.zzd == null) {
            throw new java.security.GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.zzf == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        if (this.zze == null) {
            throw new java.security.GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least %d bits", this.zza, 2048));
        }
        if (this.zzc != this.zzd) {
            throw new java.security.GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        java.math.BigInteger bigInteger = this.zzb;
        int compareTo = bigInteger.compareTo(com.google.android.gms.internal.ads.zzhwy.zza);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new java.security.InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zzg).equals(java.math.BigInteger.ZERO)) {
                throw new java.security.InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzh) > 0) {
                throw new java.security.InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new com.google.android.gms.internal.ads.zzhwy(this.zza.intValue(), this.zzb, this.zzf, this.zzc, this.zzd, this.zze.intValue(), null);
    }

    /* synthetic */ zzhwv(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhwv zzf(int i) throws java.security.GeneralSecurityException {
        if (i < 0) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid salt length in bytes %d; salt length must be positive", java.lang.Integer.valueOf(i)));
        }
        this.zze = java.lang.Integer.valueOf(i);
        return this;
    }
}
