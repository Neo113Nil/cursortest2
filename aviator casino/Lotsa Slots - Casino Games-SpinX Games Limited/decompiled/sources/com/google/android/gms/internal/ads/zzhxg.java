package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhxg {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhxd.zza, com.google.android.gms.internal.ads.zzhxa.class, com.google.android.gms.internal.ads.zzhej.class);
    private static final com.google.android.gms.internal.ads.zzhnf zzc = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhxf.zza, com.google.android.gms.internal.ads.zzhxc.class, com.google.android.gms.internal.ads.zzhek.class);
    private static final com.google.android.gms.internal.ads.zzhei zzd = com.google.android.gms.internal.ads.zzhlw.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", com.google.android.gms.internal.ads.zzhej.class, com.google.android.gms.internal.ads.zzhuc.zzl());
    private static final com.google.android.gms.internal.ads.zzhdr zze = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", com.google.android.gms.internal.ads.zzhek.class, com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PUBLIC, com.google.android.gms.internal.ads.zzhue.zzi());
    private static final com.google.android.gms.internal.ads.zzhln zzf = com.google.android.gms.internal.ads.zzhxe.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzg;
        if (!com.google.android.gms.internal.ads.zzhkr.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzhyu.zza;
        com.google.android.gms.internal.ads.zzhyu.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.math.BigInteger bigInteger = com.google.android.gms.internal.ads.zzhwy.zza;
        com.google.android.gms.internal.ads.zzhwv zzhwvVar = new com.google.android.gms.internal.ads.zzhwv(null);
        com.google.android.gms.internal.ads.zzhww zzhwwVar = com.google.android.gms.internal.ads.zzhww.zza;
        zzhwvVar.zzd(zzhwwVar);
        zzhwvVar.zze(zzhwwVar);
        zzhwvVar.zzf(32);
        zzhwvVar.zza(3072);
        java.math.BigInteger bigInteger2 = com.google.android.gms.internal.ads.zzhwy.zza;
        zzhwvVar.zzb(bigInteger2);
        com.google.android.gms.internal.ads.zzhwx zzhwxVar = com.google.android.gms.internal.ads.zzhwx.zza;
        zzhwvVar.zzc(zzhwxVar);
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", zzhwvVar.zzg());
        com.google.android.gms.internal.ads.zzhwv zzhwvVar2 = new com.google.android.gms.internal.ads.zzhwv(null);
        zzhwvVar2.zzd(zzhwwVar);
        zzhwvVar2.zze(zzhwwVar);
        zzhwvVar2.zzf(32);
        zzhwvVar2.zza(3072);
        zzhwvVar2.zzb(bigInteger2);
        com.google.android.gms.internal.ads.zzhwx zzhwxVar2 = com.google.android.gms.internal.ads.zzhwx.zzd;
        zzhwvVar2.zzc(zzhwxVar2);
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhwvVar2.zzg());
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", com.google.android.gms.internal.ads.zzhwe.zzk);
        com.google.android.gms.internal.ads.zzhwv zzhwvVar3 = new com.google.android.gms.internal.ads.zzhwv(null);
        com.google.android.gms.internal.ads.zzhww zzhwwVar2 = com.google.android.gms.internal.ads.zzhww.zzc;
        zzhwvVar3.zzd(zzhwwVar2);
        zzhwvVar3.zze(zzhwwVar2);
        zzhwvVar3.zzf(64);
        zzhwvVar3.zza(4096);
        zzhwvVar3.zzb(bigInteger2);
        zzhwvVar3.zzc(zzhwxVar);
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", zzhwvVar3.zzg());
        com.google.android.gms.internal.ads.zzhwv zzhwvVar4 = new com.google.android.gms.internal.ads.zzhwv(null);
        zzhwvVar4.zzd(zzhwwVar2);
        zzhwvVar4.zze(zzhwwVar2);
        zzhwvVar4.zzf(64);
        zzhwvVar4.zza(4096);
        zzhwvVar4.zzb(bigInteger2);
        zzhwvVar4.zzc(zzhwxVar2);
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhwvVar4.zzg());
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", com.google.android.gms.internal.ads.zzhwe.zzl);
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzc);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzf, com.google.android.gms.internal.ads.zzhwy.class);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zzd, i, true);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zze, i, false);
    }
}
