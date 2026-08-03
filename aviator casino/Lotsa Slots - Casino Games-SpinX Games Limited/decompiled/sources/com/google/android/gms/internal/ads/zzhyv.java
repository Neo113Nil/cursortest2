package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhyv implements com.google.android.gms.internal.ads.zzhej {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhyv(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.android.gms.internal.ads.zzhww zzhwwVar, com.google.android.gms.internal.ads.zzhww zzhwwVar2, int i, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.android.gms.internal.ads.zziax.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        com.google.android.gms.internal.ads.zziax.zzd(rSAPrivateCrtKey.getPublicExponent());
        com.google.android.gms.internal.ads.zzhyw.zzc(zzhwwVar);
        com.google.android.gms.internal.ads.zzhyw.zzd(zzhwwVar, zzhwwVar2, i);
    }

    public static com.google.android.gms.internal.ads.zzhej zzb(com.google.android.gms.internal.ads.zzhxa zzhxaVar) throws java.security.GeneralSecurityException {
        java.security.Provider zzb2 = com.google.android.gms.internal.ads.zzhyw.zzb();
        if (zzb2 == null) {
            throw new java.security.NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA", zzb2);
        com.google.android.gms.internal.ads.zzhwy zzd = zzhxaVar.zzd();
        return new com.google.android.gms.internal.ads.zzhyv((java.security.interfaces.RSAPrivateCrtKey) keyFactory.generatePrivate(new java.security.spec.RSAPrivateCrtKeySpec(zzhxaVar.zze().zzd(), zzd.zzd(), zzhxaVar.zzi().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzf().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzh().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzj().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzk().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzl().zzb(com.google.android.gms.internal.ads.zzhdo.zza()))), zzd.zzf(), zzd.zzg(), zzd.zzh(), zzhxaVar.zze().zze().zzc(), zzd.zze().equals(com.google.android.gms.internal.ads.zzhwx.zzc) ? zzb : zza, zzb2);
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        throw null;
    }
}
