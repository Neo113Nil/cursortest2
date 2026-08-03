package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgd {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhga.zza, com.google.android.gms.internal.ads.zzhfz.class, com.google.android.gms.internal.ads.zzhdi.class);
    private static final com.google.android.gms.internal.ads.zzhln zzc = com.google.android.gms.internal.ads.zzhgc.zza;
    private static final com.google.android.gms.internal.ads.zzhmj zzd = com.google.android.gms.internal.ads.zzhgb.zza;
    private static final com.google.android.gms.internal.ads.zzhdr zze = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.AesGcmSivKey", com.google.android.gms.internal.ads.zzhdi.class, com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhrk.zze());

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzhjg.zza;
        com.google.android.gms.internal.ads.zzhjg.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.google.android.gms.internal.ads.zzhge zzhgeVar = new com.google.android.gms.internal.ads.zzhge(null);
        zzhgeVar.zza(16);
        com.google.android.gms.internal.ads.zzhgf zzhgfVar = com.google.android.gms.internal.ads.zzhgf.zza;
        zzhgeVar.zzb(zzhgfVar);
        hashMap.put("AES128_GCM_SIV", zzhgeVar.zzc());
        com.google.android.gms.internal.ads.zzhge zzhgeVar2 = new com.google.android.gms.internal.ads.zzhge(null);
        zzhgeVar2.zza(16);
        com.google.android.gms.internal.ads.zzhgf zzhgfVar2 = com.google.android.gms.internal.ads.zzhgf.zzc;
        zzhgeVar2.zzb(zzhgfVar2);
        hashMap.put("AES128_GCM_SIV_RAW", zzhgeVar2.zzc());
        com.google.android.gms.internal.ads.zzhge zzhgeVar3 = new com.google.android.gms.internal.ads.zzhge(null);
        zzhgeVar3.zza(32);
        zzhgeVar3.zzb(zzhgfVar);
        hashMap.put("AES256_GCM_SIV", zzhgeVar3.zzc());
        com.google.android.gms.internal.ads.zzhge zzhgeVar4 = new com.google.android.gms.internal.ads.zzhge(null);
        zzhgeVar4.zza(32);
        zzhgeVar4.zzb(zzhgfVar2);
        hashMap.put("AES256_GCM_SIV_RAW", zzhgeVar4.zzc());
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmk.zza().zzb(zzd, com.google.android.gms.internal.ads.zzhgg.class);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzc, com.google.android.gms.internal.ads.zzhgg.class);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhlo.zza().zzb(zze, true);
    }
}
