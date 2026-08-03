package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfl {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhfj.zza, com.google.android.gms.internal.ads.zzhfi.class, com.google.android.gms.internal.ads.zzhdi.class);
    private static final com.google.android.gms.internal.ads.zzhdr zzc = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.AesEaxKey", com.google.android.gms.internal.ads.zzhdi.class, com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhra.zzg());
    private static final com.google.android.gms.internal.ads.zzhln zzd = com.google.android.gms.internal.ads.zzhfk.zza;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzhis.zza;
        com.google.android.gms.internal.ads.zzhis.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_EAX", com.google.android.gms.internal.ads.zzhhv.zzc);
        com.google.android.gms.internal.ads.zzhfm zzhfmVar = new com.google.android.gms.internal.ads.zzhfm(null);
        zzhfmVar.zzb(16);
        zzhfmVar.zza(16);
        zzhfmVar.zzc(16);
        com.google.android.gms.internal.ads.zzhfn zzhfnVar = com.google.android.gms.internal.ads.zzhfn.zzc;
        zzhfmVar.zzd(zzhfnVar);
        hashMap.put("AES128_EAX_RAW", zzhfmVar.zze());
        hashMap.put("AES256_EAX", com.google.android.gms.internal.ads.zzhhv.zzd);
        com.google.android.gms.internal.ads.zzhfm zzhfmVar2 = new com.google.android.gms.internal.ads.zzhfm(null);
        zzhfmVar2.zzb(16);
        zzhfmVar2.zza(32);
        zzhfmVar2.zzc(16);
        zzhfmVar2.zzd(zzhfnVar);
        hashMap.put("AES256_EAX_RAW", zzhfmVar2.zze());
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzd, com.google.android.gms.internal.ads.zzhfo.class);
        com.google.android.gms.internal.ads.zzhlo.zza().zzb(zzc, true);
    }
}
