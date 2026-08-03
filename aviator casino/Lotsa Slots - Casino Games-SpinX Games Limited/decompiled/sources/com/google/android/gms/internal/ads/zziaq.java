package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zziaq implements com.google.android.gms.internal.ads.zzhek {
    private final java.security.interfaces.RSAPublicKey zza;
    private final com.google.android.gms.internal.ads.zziai zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    /* synthetic */ zziaq(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.android.gms.internal.ads.zziai zziaiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (com.google.android.gms.internal.ads.zzhks.zza()) {
            throw new java.security.GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        com.google.android.gms.internal.ads.zziax.zzb(zziaiVar);
        com.google.android.gms.internal.ads.zziax.zzc(rSAPublicKey.getModulus().bitLength());
        com.google.android.gms.internal.ads.zziax.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zziaiVar;
        this.zzc = bArr;
        this.zzd = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] zza;
        int i;
        java.security.interfaces.RSAPublicKey rSAPublicKey = this.zza;
        java.math.BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        java.math.BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new java.security.GeneralSecurityException("invalid signature's length");
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new java.security.GeneralSecurityException("signature out of range");
        }
        byte[] zzb = com.google.android.gms.internal.ads.zzhku.zzb(bigInteger.modPow(publicExponent, modulus), bitLength);
        com.google.android.gms.internal.ads.zziai zziaiVar = this.zzb;
        com.google.android.gms.internal.ads.zziax.zzb(zziaiVar);
        java.security.MessageDigest messageDigest = (java.security.MessageDigest) com.google.android.gms.internal.ads.zzhzz.zzd.zzb(com.google.android.gms.internal.ads.zziaw.zzb(zziaiVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzd;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int ordinal = zziaiVar.ordinal();
        int i2 = 2;
        if (ordinal == 2) {
            zza = com.google.android.gms.internal.ads.zziaj.zza("3031300d060960864801650304020105000420");
        } else if (ordinal == 3) {
            zza = com.google.android.gms.internal.ads.zziaj.zza("3041300d060960864801650304020205000430");
        } else {
            if (ordinal != 4) {
                throw new java.security.GeneralSecurityException("Unsupported hash ".concat(zziaiVar.toString()));
            }
            zza = com.google.android.gms.internal.ads.zziaj.zza("3051300d060960864801650304020305000440");
        }
        if (bitLength < zza.length + digest.length + 11) {
            throw new java.security.GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (bitLength - r5) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length = zza.length;
        java.lang.System.arraycopy(zza, 0, bArr4, i, length);
        java.lang.System.arraycopy(digest, 0, bArr4, i + length, digest.length);
        if (!java.security.MessageDigest.isEqual(zzb, bArr4)) {
            throw new java.security.GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
                throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(java.util.Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
