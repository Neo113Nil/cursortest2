package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhxs implements com.google.android.gms.internal.ads.zzhej {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhxs(java.security.interfaces.ECPrivateKey eCPrivateKey, com.google.android.gms.internal.ads.zziai zziaiVar, com.google.android.gms.internal.ads.zzhzs zzhzsVar, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        com.google.android.gms.internal.ads.zziaw.zza(zziaiVar);
    }

    public static com.google.android.gms.internal.ads.zzhej zzb(com.google.android.gms.internal.ads.zzhuw zzhuwVar) throws java.security.GeneralSecurityException {
        java.security.Provider zza2 = com.google.android.gms.internal.ads.zzhkv.zza();
        return new com.google.android.gms.internal.ads.zzhxs((java.security.interfaces.ECPrivateKey) (zza2 != null ? java.security.KeyFactory.getInstance("EC", zza2) : (java.security.KeyFactory) com.google.android.gms.internal.ads.zzhzz.zzf.zzb("EC")).generatePrivate(new java.security.spec.ECPrivateKeySpec(zzhuwVar.zzf().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), com.google.android.gms.internal.ads.zzhzt.zzb((com.google.android.gms.internal.ads.zzhzr) com.google.android.gms.internal.ads.zzhxt.zzc.zzb(zzhuwVar.zzd().zzd())))), (com.google.android.gms.internal.ads.zziai) com.google.android.gms.internal.ads.zzhxt.zza.zzb(zzhuwVar.zzd().zze()), (com.google.android.gms.internal.ads.zzhzs) com.google.android.gms.internal.ads.zzhxt.zzb.zzb(zzhuwVar.zzd().zzc()), zzhuwVar.zze().zze().zzc(), zzhuwVar.zzd().zzf().equals(com.google.android.gms.internal.ads.zzhut.zzc) ? zzb : zza, zza2);
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        throw null;
    }
}
