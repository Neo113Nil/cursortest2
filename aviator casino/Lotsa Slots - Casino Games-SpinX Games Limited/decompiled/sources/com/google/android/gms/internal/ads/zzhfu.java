package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfu {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhfr.zza, com.google.android.gms.internal.ads.zzhfq.class, com.google.android.gms.internal.ads.zzhdi.class);
    private static final com.google.android.gms.internal.ads.zzhdr zzc = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.AesGcmKey", com.google.android.gms.internal.ads.zzhdi.class, com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhrg.zze());
    private static final com.google.android.gms.internal.ads.zzhmj zzd = com.google.android.gms.internal.ads.zzhft.zza;
    private static final com.google.android.gms.internal.ads.zzhln zze = com.google.android.gms.internal.ads.zzhfs.zza;
    private static final int zzf = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzf;
        if (!com.google.android.gms.internal.ads.zzhkr.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzhiz.zza;
        com.google.android.gms.internal.ads.zzhiz.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_GCM", com.google.android.gms.internal.ads.zzhhv.zza);
        com.google.android.gms.internal.ads.zzhfv zzhfvVar = new com.google.android.gms.internal.ads.zzhfv(null);
        zzhfvVar.zzb(12);
        zzhfvVar.zza(16);
        zzhfvVar.zzc(16);
        com.google.android.gms.internal.ads.zzhfw zzhfwVar = com.google.android.gms.internal.ads.zzhfw.zzc;
        zzhfvVar.zzd(zzhfwVar);
        hashMap.put("AES128_GCM_RAW", zzhfvVar.zze());
        hashMap.put("AES256_GCM", com.google.android.gms.internal.ads.zzhhv.zzb);
        com.google.android.gms.internal.ads.zzhfv zzhfvVar2 = new com.google.android.gms.internal.ads.zzhfv(null);
        zzhfvVar2.zzb(12);
        zzhfvVar2.zza(32);
        zzhfvVar2.zzc(16);
        zzhfvVar2.zzd(zzhfwVar);
        hashMap.put("AES256_GCM_RAW", zzhfvVar2.zze());
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmk.zza().zzb(zzd, com.google.android.gms.internal.ads.zzhfx.class);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zze, com.google.android.gms.internal.ads.zzhfx.class);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zzc, i, true);
    }
}
