package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzo implements com.google.android.gms.internal.ads.zzhej {
    private final byte[] zza;

    private zzhzo(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Given private key's length is not %s", 32));
        }
        byte[] zzb = com.google.android.gms.internal.ads.zzhlc.zzb(bArr);
        this.zza = zzb;
        com.google.android.gms.internal.ads.zzhlc.zza(zzb);
    }

    public static com.google.android.gms.internal.ads.zzhej zzb(com.google.android.gms.internal.ads.zzhvf zzhvfVar) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return com.google.android.gms.internal.ads.zzhyb.zzb(zzhvfVar);
        } catch (java.security.GeneralSecurityException unused) {
            return new com.google.android.gms.internal.ads.zzhzo(zzhvfVar.zzf().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhvfVar.zze().zze().zzc(), zzhvfVar.zzd().zzc().equals(com.google.android.gms.internal.ads.zzhvd.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        throw null;
    }
}
