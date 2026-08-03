package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziat implements com.google.android.gms.internal.ads.zzhej {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    public static com.google.android.gms.internal.ads.zzhej zzb(com.google.android.gms.internal.ads.zzhxa zzhxaVar) throws java.security.GeneralSecurityException {
        try {
            return com.google.android.gms.internal.ads.zzhyv.zzb(zzhxaVar);
        } catch (java.security.NoSuchProviderException unused) {
            java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) ((java.security.KeyFactory) com.google.android.gms.internal.ads.zzhzz.zzf.zzb("RSA")).generatePrivate(new java.security.spec.RSAPrivateCrtKeySpec(zzhxaVar.zze().zzd(), zzhxaVar.zzd().zzd(), zzhxaVar.zzi().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzf().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzh().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzj().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzk().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhxaVar.zzl().zzb(com.google.android.gms.internal.ads.zzhdo.zza())));
            com.google.android.gms.internal.ads.zzhwy zzd = zzhxaVar.zzd();
            com.google.android.gms.internal.ads.zzhli zzhliVar = com.google.android.gms.internal.ads.zziav.zza;
            return new com.google.android.gms.internal.ads.zzias(rSAPrivateCrtKey, (com.google.android.gms.internal.ads.zziai) zzhliVar.zzb(zzd.zzf()), (com.google.android.gms.internal.ads.zziai) zzhliVar.zzb(zzd.zzg()), zzd.zzh(), zzhxaVar.zze().zze().zzc(), zzhxaVar.zzd().zze().equals(com.google.android.gms.internal.ads.zzhwx.zzc) ? zzb : zza, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        throw null;
    }
}
