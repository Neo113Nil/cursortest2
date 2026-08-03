package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zziau implements com.google.android.gms.internal.ads.zzhek {
    private final java.security.interfaces.RSAPublicKey zza;
    private final com.google.android.gms.internal.ads.zziai zzb;
    private final com.google.android.gms.internal.ads.zziai zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;

    /* synthetic */ zziau(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.android.gms.internal.ads.zziai zziaiVar, com.google.android.gms.internal.ads.zziai zziaiVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (com.google.android.gms.internal.ads.zzhks.zza()) {
            throw new java.security.GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.android.gms.internal.ads.zziax.zzb(zziaiVar);
        if (!zziaiVar.equals(zziaiVar2)) {
            throw new java.security.GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        com.google.android.gms.internal.ads.zziax.zzc(rSAPublicKey.getModulus().bitLength());
        com.google.android.gms.internal.ads.zziax.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zziaiVar;
        this.zzc = zziaiVar2;
        this.zzd = i;
        this.zze = bArr;
        this.zzf = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        java.security.interfaces.RSAPublicKey rSAPublicKey = this.zza;
        java.math.BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        java.math.BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 != bArr.length) {
            throw new java.security.GeneralSecurityException("invalid signature's length");
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new java.security.GeneralSecurityException("signature out of range");
        }
        byte[] zzb = com.google.android.gms.internal.ads.zzhku.zzb(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        com.google.android.gms.internal.ads.zziai zziaiVar = this.zzb;
        com.google.android.gms.internal.ads.zziax.zzb(zziaiVar);
        com.google.android.gms.internal.ads.zzhzz zzhzzVar = com.google.android.gms.internal.ads.zzhzz.zzd;
        java.security.MessageDigest messageDigest = (java.security.MessageDigest) zzhzzVar.zzb(com.google.android.gms.internal.ads.zziaw.zzb(zziaiVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzf;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = zzb.length;
        int i = this.zzd;
        if (length < digestLength + i + 2) {
            throw new java.security.GeneralSecurityException("inconsistent");
        }
        if (zzb[length - 1] != -68) {
            throw new java.security.GeneralSecurityException("inconsistent");
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] copyOf = java.util.Arrays.copyOf(zzb, i3);
        int length2 = copyOf.length;
        byte[] copyOfRange = java.util.Arrays.copyOfRange(zzb, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            int i5 = digestLength;
            int i6 = length;
            int i7 = bitLength3;
            java.security.MessageDigest messageDigest2 = messageDigest;
            long j = (length * 8) - bitLength3;
            if (i4 < j) {
                if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new java.security.GeneralSecurityException("inconsistent");
                }
                i4++;
                digestLength = i5;
                length = i6;
                bitLength3 = i7;
                messageDigest = messageDigest2;
            } else {
                java.security.MessageDigest messageDigest3 = (java.security.MessageDigest) zzhzzVar.zzb(com.google.android.gms.internal.ads.zziaw.zzb(this.zzc));
                byte[] bArr4 = new byte[i3];
                int i8 = 0;
                int i9 = 0;
                for (int digestLength2 = messageDigest3.getDigestLength(); i8 <= (i2 - 2) / digestLength2; digestLength2 = digestLength2) {
                    messageDigest3.reset();
                    messageDigest3.update(copyOfRange);
                    byte[] bArr5 = copyOfRange;
                    messageDigest3.update(com.google.android.gms.internal.ads.zzhku.zzb(java.math.BigInteger.valueOf(i8), 4));
                    byte[] digest2 = messageDigest3.digest();
                    int length3 = digest2.length;
                    java.lang.System.arraycopy(digest2, 0, bArr4, i9, java.lang.Math.min(length3, i3 - i9));
                    i9 += length3;
                    i8++;
                    copyOfRange = bArr5;
                    messageDigest3 = messageDigest3;
                }
                byte[] bArr6 = copyOfRange;
                byte[] bArr7 = new byte[i3];
                for (int i10 = 0; i10 < i3; i10++) {
                    bArr7[i10] = (byte) (bArr4[i10] ^ copyOf[i10]);
                }
                for (int i11 = 0; i11 <= j; i11++) {
                    int i12 = i11 / 8;
                    bArr7[i12] = (byte) ((~(1 << (7 - (i11 % 8)))) & bArr7[i12]);
                }
                int i13 = 0;
                while (true) {
                    int i14 = (i2 - i) - 2;
                    if (i13 >= i14) {
                        if (bArr7[i14] != 1) {
                            throw new java.security.GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr7, i3 - i, i3);
                        int i15 = i5 + 8;
                        byte[] bArr8 = new byte[i + i15];
                        java.lang.System.arraycopy(digest, 0, bArr8, 8, digest.length);
                        java.lang.System.arraycopy(copyOfRange2, 0, bArr8, i15, copyOfRange2.length);
                        if (!java.security.MessageDigest.isEqual(messageDigest2.digest(bArr8), bArr6)) {
                            throw new java.security.GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr7[i13] != 0) {
                        throw new java.security.GeneralSecurityException("inconsistent");
                    }
                    i13++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zze;
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
