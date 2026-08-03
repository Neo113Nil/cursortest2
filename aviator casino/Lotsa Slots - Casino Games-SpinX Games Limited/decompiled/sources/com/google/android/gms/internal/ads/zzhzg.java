package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzg implements com.google.android.gms.internal.ads.zzhdi {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzhzf();
    private final byte[] zzb;
    private final com.google.android.gms.internal.ads.zzhqd zzc;
    private final javax.crypto.spec.SecretKeySpec zzd;
    private final int zze;

    private zzhzg(byte[] bArr, int i, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new java.lang.IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zze = i;
        int length = bArr.length;
        com.google.android.gms.internal.ads.zziax.zza(length);
        this.zzd = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.zzc = com.google.android.gms.internal.ads.zziam.zzb(com.google.android.gms.internal.ads.zzhqb.zzc(com.google.android.gms.internal.ads.zzhqc.zzb(length), com.google.android.gms.internal.ads.zzibb.zza(bArr, com.google.android.gms.internal.ads.zzhdo.zza())));
        this.zzb = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhfi zzhfiVar) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzhfiVar.zzf();
        return new com.google.android.gms.internal.ads.zzhzg(zzhfiVar.zze().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhfiVar.zzf().zzd(), zzhfiVar.zzc().zzc());
    }

    private final byte[] zzc(int i, byte[] bArr, int i2, int i3) throws java.security.GeneralSecurityException {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        java.lang.System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i = this.zze;
        int i2 = ((length - length2) - i) - 16;
        if (i2 < 0) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] zzc = zzc(0, bArr, length2, i);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] zzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] zzc3 = zzc(2, bArr, length2 + i, i2);
        int i3 = length - 16;
        byte b = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b = (byte) (b | (((bArr[i3 + i4] ^ zzc2[i4]) ^ zzc[i4]) ^ zzc3[i4]));
        }
        if (b != 0) {
            throw new javax.crypto.AEADBadTagException("tag mismatch");
        }
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) zza.get();
        cipher.init(1, this.zzd, new javax.crypto.spec.IvParameterSpec(zzc));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }
}
