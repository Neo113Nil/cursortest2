package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhwn {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhwq zza = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zziba zzb = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zziba zzc = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zziba zzd = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zziba zze = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zziba zzf = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zziba zzg = null;

    private zzhwn() {
    }

    /* synthetic */ zzhwn(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhwn zza(com.google.android.gms.internal.ads.zzhwq zzhwqVar) {
        this.zza = zzhwqVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwn zzb(com.google.android.gms.internal.ads.zziba zzibaVar, com.google.android.gms.internal.ads.zziba zzibaVar2) {
        this.zzc = zzibaVar;
        this.zzd = zzibaVar2;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwn zzc(com.google.android.gms.internal.ads.zziba zzibaVar) {
        this.zzb = zzibaVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwn zzd(com.google.android.gms.internal.ads.zziba zzibaVar, com.google.android.gms.internal.ads.zziba zzibaVar2) {
        this.zze = zzibaVar;
        this.zzf = zzibaVar2;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwn zze(com.google.android.gms.internal.ads.zziba zzibaVar) {
        this.zzg = zzibaVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwo zzf() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhwq zzhwqVar = this.zza;
        if (zzhwqVar == null) {
            throw new java.security.GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new java.security.GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new java.security.GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new java.security.GeneralSecurityException("Cannot build without CRT coefficient");
        }
        java.math.BigInteger zzd = zzhwqVar.zzf().zzd();
        java.math.BigInteger zzd2 = this.zza.zzd();
        java.math.BigInteger zzb = this.zzc.zzb(com.google.android.gms.internal.ads.zzhdo.zza());
        java.math.BigInteger zzb2 = this.zzd.zzb(com.google.android.gms.internal.ads.zzhdo.zza());
        java.math.BigInteger zzb3 = this.zzb.zzb(com.google.android.gms.internal.ads.zzhdo.zza());
        java.math.BigInteger zzb4 = this.zze.zzb(com.google.android.gms.internal.ads.zzhdo.zza());
        java.math.BigInteger zzb5 = this.zzf.zzb(com.google.android.gms.internal.ads.zzhdo.zza());
        java.math.BigInteger zzb6 = this.zzg.zzb(com.google.android.gms.internal.ads.zzhdo.zza());
        if (!zzb.isProbablePrime(10)) {
            throw new java.security.GeneralSecurityException("p is not a prime");
        }
        if (!zzb2.isProbablePrime(10)) {
            throw new java.security.GeneralSecurityException("q is not a prime");
        }
        if (!zzb.multiply(zzb2).equals(zzd2)) {
            throw new java.security.GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        java.math.BigInteger subtract = zzb.subtract(java.math.BigInteger.ONE);
        java.math.BigInteger subtract2 = zzb2.subtract(java.math.BigInteger.ONE);
        if (!zzd.multiply(zzb3).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(java.math.BigInteger.ONE)) {
            throw new java.security.GeneralSecurityException("D is invalid.");
        }
        if (!zzd.multiply(zzb4).mod(subtract).equals(java.math.BigInteger.ONE)) {
            throw new java.security.GeneralSecurityException("dP is invalid.");
        }
        if (!zzd.multiply(zzb5).mod(subtract2).equals(java.math.BigInteger.ONE)) {
            throw new java.security.GeneralSecurityException("dQ is invalid.");
        }
        if (zzb2.multiply(zzb6).mod(zzb).equals(java.math.BigInteger.ONE)) {
            return new com.google.android.gms.internal.ads.zzhwo(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new java.security.GeneralSecurityException("qInv is invalid.");
    }
}
