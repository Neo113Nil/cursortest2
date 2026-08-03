package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziav implements com.google.android.gms.internal.ads.zzhek {
    static final com.google.android.gms.internal.ads.zzhli zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        com.google.android.gms.internal.ads.zzhlh zza2 = com.google.android.gms.internal.ads.zzhli.zza();
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA256, com.google.android.gms.internal.ads.zzhww.zza);
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA384, com.google.android.gms.internal.ads.zzhww.zzb);
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA512, com.google.android.gms.internal.ads.zzhww.zzc);
        zza = zza2.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static com.google.android.gms.internal.ads.zzhek zzb(com.google.android.gms.internal.ads.zzhxc zzhxcVar) throws java.security.GeneralSecurityException {
        try {
            return com.google.android.gms.internal.ads.zzhyw.zze(zzhxcVar);
        } catch (java.security.NoSuchProviderException unused) {
            java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) ((java.security.KeyFactory) com.google.android.gms.internal.ads.zzhzz.zzf.zzb("RSA")).generatePublic(new java.security.spec.RSAPublicKeySpec(zzhxcVar.zzd(), zzhxcVar.zzf().zzd()));
            com.google.android.gms.internal.ads.zzhwy zzf = zzhxcVar.zzf();
            com.google.android.gms.internal.ads.zzhli zzhliVar = zza;
            return new com.google.android.gms.internal.ads.zziau(rSAPublicKey, (com.google.android.gms.internal.ads.zziai) zzhliVar.zzb(zzf.zzf()), (com.google.android.gms.internal.ads.zziai) zzhliVar.zzb(zzf.zzg()), zzf.zzh(), zzhxcVar.zze().zzc(), zzhxcVar.zzf().zze().equals(com.google.android.gms.internal.ads.zzhwx.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        throw null;
    }
}
