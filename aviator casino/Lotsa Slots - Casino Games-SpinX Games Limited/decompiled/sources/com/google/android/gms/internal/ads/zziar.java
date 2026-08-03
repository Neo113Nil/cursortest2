package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziar implements com.google.android.gms.internal.ads.zzhek {
    static final com.google.android.gms.internal.ads.zzhli zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        com.google.android.gms.internal.ads.zzhlh zza2 = com.google.android.gms.internal.ads.zzhli.zza();
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA256, com.google.android.gms.internal.ads.zzhwk.zza);
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA384, com.google.android.gms.internal.ads.zzhwk.zzb);
        zza2.zza(com.google.android.gms.internal.ads.zziai.SHA512, com.google.android.gms.internal.ads.zzhwk.zzc);
        zza = zza2.zzb();
    }

    public static com.google.android.gms.internal.ads.zzhek zzb(com.google.android.gms.internal.ads.zzhwq zzhwqVar) throws java.security.GeneralSecurityException {
        try {
            return com.google.android.gms.internal.ads.zzhyn.zzd(zzhwqVar);
        } catch (java.security.NoSuchProviderException unused) {
            return new com.google.android.gms.internal.ads.zziaq((java.security.interfaces.RSAPublicKey) ((java.security.KeyFactory) com.google.android.gms.internal.ads.zzhzz.zzf.zzb("RSA")).generatePublic(new java.security.spec.RSAPublicKeySpec(zzhwqVar.zzd(), zzhwqVar.zzf().zzd())), (com.google.android.gms.internal.ads.zziai) zza.zzb(zzhwqVar.zzf().zzf()), zzhwqVar.zze().zzc(), zzhwqVar.zzf().zze().equals(com.google.android.gms.internal.ads.zzhwl.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        throw null;
    }
}
