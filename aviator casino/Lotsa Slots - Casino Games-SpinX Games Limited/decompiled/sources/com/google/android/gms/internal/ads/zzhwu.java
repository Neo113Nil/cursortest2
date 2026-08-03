package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhwu {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhwr.zza, com.google.android.gms.internal.ads.zzhwo.class, com.google.android.gms.internal.ads.zzhej.class);
    private static final com.google.android.gms.internal.ads.zzhnf zzc = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhwt.zza, com.google.android.gms.internal.ads.zzhwq.class, com.google.android.gms.internal.ads.zzhek.class);
    private static final com.google.android.gms.internal.ads.zzhei zzd = com.google.android.gms.internal.ads.zzhlw.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", com.google.android.gms.internal.ads.zzhej.class, com.google.android.gms.internal.ads.zzhtu.zzl());
    private static final com.google.android.gms.internal.ads.zzhdr zze = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", com.google.android.gms.internal.ads.zzhek.class, com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PUBLIC, com.google.android.gms.internal.ads.zzhtw.zzi());
    private static final com.google.android.gms.internal.ads.zzhln zzf = com.google.android.gms.internal.ads.zzhws.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzg;
        if (!com.google.android.gms.internal.ads.zzhkr.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzhyl.zza;
        com.google.android.gms.internal.ads.zzhyl.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", com.google.android.gms.internal.ads.zzhwe.zzh);
        java.math.BigInteger bigInteger = com.google.android.gms.internal.ads.zzhwm.zza;
        com.google.android.gms.internal.ads.zzhwj zzhwjVar = new com.google.android.gms.internal.ads.zzhwj(null);
        zzhwjVar.zzd(com.google.android.gms.internal.ads.zzhwk.zza);
        zzhwjVar.zza(3072);
        java.math.BigInteger bigInteger2 = com.google.android.gms.internal.ads.zzhwm.zza;
        zzhwjVar.zzb(bigInteger2);
        com.google.android.gms.internal.ads.zzhwl zzhwlVar = com.google.android.gms.internal.ads.zzhwl.zzd;
        zzhwjVar.zzc(zzhwlVar);
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhwjVar.zze());
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", com.google.android.gms.internal.ads.zzhwe.zzi);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", com.google.android.gms.internal.ads.zzhwe.zzj);
        com.google.android.gms.internal.ads.zzhwj zzhwjVar2 = new com.google.android.gms.internal.ads.zzhwj(null);
        zzhwjVar2.zzd(com.google.android.gms.internal.ads.zzhwk.zzc);
        zzhwjVar2.zza(4096);
        zzhwjVar2.zzb(bigInteger2);
        zzhwjVar2.zzc(zzhwlVar);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhwjVar2.zze());
        zza2.zzd(hashMap);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzc);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzf, com.google.android.gms.internal.ads.zzhwm.class);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zzd, i, true);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zze, i, false);
    }
}
