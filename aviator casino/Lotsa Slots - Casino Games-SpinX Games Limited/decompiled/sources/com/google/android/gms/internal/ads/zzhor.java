package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhor {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhon.zza, com.google.android.gms.internal.ads.zzhom.class, com.google.android.gms.internal.ads.zzhoj.class);
    private static final com.google.android.gms.internal.ads.zzhnf zzc = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhoq.zza, com.google.android.gms.internal.ads.zzhom.class, com.google.android.gms.internal.ads.zzheg.class);
    private static final com.google.android.gms.internal.ads.zzhdr zzd = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.HmacKey", com.google.android.gms.internal.ads.zzheg.class, com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhsj.zzh());
    private static final com.google.android.gms.internal.ads.zzhmj zze = com.google.android.gms.internal.ads.zzhop.zza;
    private static final com.google.android.gms.internal.ads.zzhln zzf = com.google.android.gms.internal.ads.zzhoo.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzg;
        if (!com.google.android.gms.internal.ads.zzhkr.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzhpu.zza;
        com.google.android.gms.internal.ads.zzhpu.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzc);
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", com.google.android.gms.internal.ads.zzhpg.zza);
        com.google.android.gms.internal.ads.zzhos zzhosVar = new com.google.android.gms.internal.ads.zzhos(null);
        zzhosVar.zza(32);
        zzhosVar.zzb(16);
        com.google.android.gms.internal.ads.zzhou zzhouVar = com.google.android.gms.internal.ads.zzhou.zzd;
        zzhosVar.zzc(zzhouVar);
        com.google.android.gms.internal.ads.zzhot zzhotVar = com.google.android.gms.internal.ads.zzhot.zzc;
        zzhosVar.zzd(zzhotVar);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzhosVar.zze());
        com.google.android.gms.internal.ads.zzhos zzhosVar2 = new com.google.android.gms.internal.ads.zzhos(null);
        zzhosVar2.zza(32);
        zzhosVar2.zzb(32);
        com.google.android.gms.internal.ads.zzhou zzhouVar2 = com.google.android.gms.internal.ads.zzhou.zza;
        zzhosVar2.zzc(zzhouVar2);
        zzhosVar2.zzd(zzhotVar);
        hashMap.put("HMAC_SHA256_256BITTAG", zzhosVar2.zze());
        com.google.android.gms.internal.ads.zzhos zzhosVar3 = new com.google.android.gms.internal.ads.zzhos(null);
        zzhosVar3.zza(32);
        zzhosVar3.zzb(32);
        zzhosVar3.zzc(zzhouVar);
        zzhosVar3.zzd(zzhotVar);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzhosVar3.zze());
        com.google.android.gms.internal.ads.zzhos zzhosVar4 = new com.google.android.gms.internal.ads.zzhos(null);
        zzhosVar4.zza(64);
        zzhosVar4.zzb(16);
        zzhosVar4.zzc(zzhouVar2);
        com.google.android.gms.internal.ads.zzhot zzhotVar2 = com.google.android.gms.internal.ads.zzhot.zze;
        zzhosVar4.zzd(zzhotVar2);
        hashMap.put("HMAC_SHA512_128BITTAG", zzhosVar4.zze());
        com.google.android.gms.internal.ads.zzhos zzhosVar5 = new com.google.android.gms.internal.ads.zzhos(null);
        zzhosVar5.zza(64);
        zzhosVar5.zzb(16);
        zzhosVar5.zzc(zzhouVar);
        zzhosVar5.zzd(zzhotVar2);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzhosVar5.zze());
        com.google.android.gms.internal.ads.zzhos zzhosVar6 = new com.google.android.gms.internal.ads.zzhos(null);
        zzhosVar6.zza(64);
        zzhosVar6.zzb(32);
        zzhosVar6.zzc(zzhouVar2);
        zzhosVar6.zzd(zzhotVar2);
        hashMap.put("HMAC_SHA512_256BITTAG", zzhosVar6.zze());
        com.google.android.gms.internal.ads.zzhos zzhosVar7 = new com.google.android.gms.internal.ads.zzhos(null);
        zzhosVar7.zza(64);
        zzhosVar7.zzb(32);
        zzhosVar7.zzc(zzhouVar);
        zzhosVar7.zzd(zzhotVar2);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzhosVar7.zze());
        hashMap.put("HMAC_SHA512_512BITTAG", com.google.android.gms.internal.ads.zzhpg.zzb);
        com.google.android.gms.internal.ads.zzhos zzhosVar8 = new com.google.android.gms.internal.ads.zzhos(null);
        zzhosVar8.zza(64);
        zzhosVar8.zzb(64);
        zzhosVar8.zzc(zzhouVar);
        zzhosVar8.zzd(zzhotVar2);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzhosVar8.zze());
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzf, com.google.android.gms.internal.ads.zzhov.class);
        com.google.android.gms.internal.ads.zzhmk.zza().zzb(zze, com.google.android.gms.internal.ads.zzhov.class);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zzd, i, true);
    }
}
