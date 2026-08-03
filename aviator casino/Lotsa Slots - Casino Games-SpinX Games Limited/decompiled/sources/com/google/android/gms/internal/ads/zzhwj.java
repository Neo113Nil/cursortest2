package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhwj {
    private static final java.math.BigInteger zze;
    private static final java.math.BigInteger zzf;

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.math.BigInteger zzb = com.google.android.gms.internal.ads.zzhwm.zza;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhwk zzc = null;
    private com.google.android.gms.internal.ads.zzhwl zzd = com.google.android.gms.internal.ads.zzhwl.zzd;

    static {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(2L);
        zze = valueOf;
        zzf = valueOf.pow(256);
    }

    private zzhwj() {
    }

    public final com.google.android.gms.internal.ads.zzhwj zza(int i) {
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwj zzb(java.math.BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwj zzc(com.google.android.gms.internal.ads.zzhwl zzhwlVar) {
        this.zzd = zzhwlVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwj zzd(com.google.android.gms.internal.ads.zzhwk zzhwkVar) {
        this.zzc = zzhwkVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwm zze() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.zza));
        }
        java.math.BigInteger bigInteger = this.zzb;
        int compareTo = bigInteger.compareTo(com.google.android.gms.internal.ads.zzhwm.zza);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new java.security.InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zze).equals(java.math.BigInteger.ZERO)) {
                throw new java.security.InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzf) > 0) {
                throw new java.security.InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new com.google.android.gms.internal.ads.zzhwm(this.zza.intValue(), this.zzb, this.zzd, this.zzc, null);
    }

    /* synthetic */ zzhwj(byte[] bArr) {
    }
}
