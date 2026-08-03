package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziay implements com.google.android.gms.internal.ads.zzhdi {
    private final com.google.android.gms.internal.ads.zzhjt zza;
    private final byte[] zzb;

    private zziay(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.zza = new com.google.android.gms.internal.ads.zzhjt(bArr);
        this.zzb = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhic zzhicVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zziay(zzhicVar.zze().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhicVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(java.nio.ByteBuffer.wrap(bArr, 24, length - 24), java.util.Arrays.copyOf(bArr, 24), bArr2);
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
