package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfc {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhfb.zza, com.google.android.gms.internal.ads.zzhey.class, com.google.android.gms.internal.ads.zzhdi.class);
    private static final com.google.android.gms.internal.ads.zzhdr zzc = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", com.google.android.gms.internal.ads.zzhdi.class, com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhqq.zzg());
    private static final com.google.android.gms.internal.ads.zzhmj zzd = com.google.android.gms.internal.ads.zzhfa.zza;
    private static final com.google.android.gms.internal.ads.zzhln zze = com.google.android.gms.internal.ads.zzhez.zza;
    private static final int zzf = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzf;
        if (!com.google.android.gms.internal.ads.zzhkr.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzhin.zza;
        com.google.android.gms.internal.ads.zzhin.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", com.google.android.gms.internal.ads.zzhhv.zze);
        com.google.android.gms.internal.ads.zzhfd zzhfdVar = new com.google.android.gms.internal.ads.zzhfd(null);
        zzhfdVar.zza(16);
        zzhfdVar.zzb(32);
        zzhfdVar.zzd(16);
        zzhfdVar.zzc(16);
        com.google.android.gms.internal.ads.zzhfe zzhfeVar = com.google.android.gms.internal.ads.zzhfe.zzc;
        zzhfdVar.zzf(zzhfeVar);
        com.google.android.gms.internal.ads.zzhff zzhffVar = com.google.android.gms.internal.ads.zzhff.zzc;
        zzhfdVar.zze(zzhffVar);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzhfdVar.zzg());
        hashMap.put("AES256_CTR_HMAC_SHA256", com.google.android.gms.internal.ads.zzhhv.zzf);
        com.google.android.gms.internal.ads.zzhfd zzhfdVar2 = new com.google.android.gms.internal.ads.zzhfd(null);
        zzhfdVar2.zza(32);
        zzhfdVar2.zzb(32);
        zzhfdVar2.zzd(32);
        zzhfdVar2.zzc(16);
        zzhfdVar2.zzf(zzhfeVar);
        zzhfdVar2.zze(zzhffVar);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzhfdVar2.zzg());
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmk.zza().zzb(zzd, com.google.android.gms.internal.ads.zzhfg.class);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zze, com.google.android.gms.internal.ads.zzhfg.class);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zzc, i, true);
    }
}
