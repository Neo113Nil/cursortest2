package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzh implements com.google.android.gms.internal.ads.zzhdi {
    private final javax.crypto.SecretKey zza;
    private final byte[] zzb;

    private zzhzh(byte[] bArr, com.google.android.gms.internal.ads.zziaz zziazVar) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = com.google.android.gms.internal.ads.zzhiu.zzb(bArr);
        this.zzb = zziazVar.zzc();
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhfq zzhfqVar) throws java.security.GeneralSecurityException {
        zzhfqVar.zzf();
        zzhfqVar.zzf();
        return new com.google.android.gms.internal.ads.zzhzh(zzhfqVar.zze().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhfqVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        java.security.spec.AlgorithmParameterSpec zzc = com.google.android.gms.internal.ads.zzhiu.zzc(bArr, length2, 12);
        javax.crypto.SecretKey secretKey = this.zza;
        javax.crypto.Cipher zza = com.google.android.gms.internal.ads.zzhiu.zza();
        zza.init(2, secretKey, zzc);
        if (bArr2 != null && bArr2.length != 0) {
            zza.updateAAD(bArr2);
        }
        return zza.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
