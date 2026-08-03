package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhjz implements com.google.android.gms.internal.ads.zzhdi {
    private final byte[] zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzhqd zzc;

    private zzhjz(byte[] bArr, com.google.android.gms.internal.ads.zziaz zziazVar, int i) throws java.security.GeneralSecurityException {
        this.zzc = com.google.android.gms.internal.ads.zziam.zzb(com.google.android.gms.internal.ads.zzhqb.zzc(com.google.android.gms.internal.ads.zzhqc.zzb(bArr.length), com.google.android.gms.internal.ads.zzibb.zza(bArr, com.google.android.gms.internal.ads.zzhdo.zza())));
        this.zza = zziazVar.zzc();
        this.zzb = i;
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhhw zzhhwVar) throws java.security.GeneralSecurityException {
        zzhhwVar.zzf();
        zzhhwVar.zzf();
        return new com.google.android.gms.internal.ads.zzhjz(zzhhwVar.zze().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhhwVar.zzc(), zzhhwVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i2 = i + length2;
        if (length < i2 + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, length2, i2);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = copyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new java.security.GeneralSecurityException("invalid salt size");
        }
        java.lang.System.arraycopy(copyOfRange, 0, bArr4, 4, length3);
        java.lang.System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
        com.google.android.gms.internal.ads.zzhqd zzhqdVar = this.zzc;
        byte[] bArr6 = new byte[32];
        java.lang.System.arraycopy(zzhqdVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        java.lang.System.arraycopy(zzhqdVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        javax.crypto.SecretKey zzb = com.google.android.gms.internal.ads.zzhiu.zzb(bArr6);
        int i3 = i2 + 12;
        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr, i2, i3);
        if (copyOfRange2.length != 12) {
            throw new java.security.GeneralSecurityException("iv is wrong size");
        }
        if (length < i2 + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        java.security.spec.AlgorithmParameterSpec zzc = com.google.android.gms.internal.ads.zzhiu.zzc(copyOfRange2, 0, 12);
        javax.crypto.Cipher zza = com.google.android.gms.internal.ads.zzhiu.zza();
        zza.init(2, zzb, zzc);
        if (bArr2 != null && bArr2.length != 0) {
            zza.updateAAD(bArr2);
        }
        return zza.doFinal(bArr, i3, length - i3);
    }
}
