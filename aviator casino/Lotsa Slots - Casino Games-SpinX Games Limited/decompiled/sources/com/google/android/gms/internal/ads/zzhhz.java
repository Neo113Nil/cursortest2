package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhhz {
    private static final com.google.android.gms.internal.ads.zzhln zza = com.google.android.gms.internal.ads.zzhhy.zza;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhhx.zza, com.google.android.gms.internal.ads.zzhhw.class, com.google.android.gms.internal.ads.zzhdi.class);

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = com.google.android.gms.internal.ads.zzhke.zza;
        com.google.android.gms.internal.ads.zzhke.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", com.google.android.gms.internal.ads.zzhhv.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", com.google.android.gms.internal.ads.zzhhv.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", com.google.android.gms.internal.ads.zzhhv.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", com.google.android.gms.internal.ads.zzhhv.zzj);
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zza, com.google.android.gms.internal.ads.zzhib.class);
    }
}
