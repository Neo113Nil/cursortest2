package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzm implements com.google.android.gms.internal.ads.zzhdi {
    private final com.google.android.gms.internal.ads.zzhjq zza;
    private final byte[] zzb;

    private zzhzm(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.zza = new com.google.android.gms.internal.ads.zzhjq(bArr);
        this.zzb = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhgh zzhghVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzhzm(zzhghVar.zze().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhghVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(java.nio.ByteBuffer.wrap(bArr, 12, length - 12), java.util.Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0) {
            return zzc(bArr, bArr2);
        }
        if (com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            return zzc(java.util.Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
