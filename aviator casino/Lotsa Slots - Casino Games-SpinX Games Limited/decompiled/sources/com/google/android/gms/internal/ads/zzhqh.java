package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqh implements com.google.android.gms.internal.ads.zzhqd {
    private static final java.lang.ThreadLocal zzd = new com.google.android.gms.internal.ads.zzhqg();
    private final javax.crypto.SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhqh(byte[] bArr) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziax.zza(bArr.length);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        javax.crypto.Cipher zzc = zzc();
        zzc.init(1, secretKeySpec);
        byte[] zza = com.google.android.gms.internal.ads.zzhpm.zza(zzc.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = com.google.android.gms.internal.ads.zzhpm.zza(zza);
    }

    public static com.google.android.gms.internal.ads.zzhqd zzb(com.google.android.gms.internal.ads.zzhqb zzhqbVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzhqh(zzhqbVar.zzd().zzc(com.google.android.gms.internal.ads.zzhdo.zza()));
    }

    private static javax.crypto.Cipher zzc() throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            return (javax.crypto.Cipher) zzd.get();
        }
        throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzd(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhqd
    public final byte[] zza(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        byte[] zzb;
        if (i > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        javax.crypto.SecretKey secretKey = this.zza;
        javax.crypto.Cipher zzc = zzc();
        zzc.init(1, secretKey);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        int i4 = i3 * 16;
        if (i2 * 16 == length) {
            zzb = com.google.android.gms.internal.ads.zzhzl.zzb(bArr, i4, this.zzb, 0, 16);
        } else {
            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, i4, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new java.lang.IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = java.util.Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            byte[] bArr2 = this.zzc;
            if (copyOf.length != 16) {
                throw new java.lang.IllegalArgumentException("The lengths of x and y should match.");
            }
            zzb = com.google.android.gms.internal.ads.zzhzl.zzb(copyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            zzd(bArr3, bArr, i5 * 16, bArr4);
            if (zzc.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new java.lang.IllegalStateException("Cipher didn't write full block");
            }
        }
        zzd(bArr3, zzb, 0, bArr4);
        if (zzc.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i == 16 ? bArr3 : java.util.Arrays.copyOf(bArr3, i);
        }
        throw new java.lang.IllegalStateException("Cipher didn't write full block");
    }
}
