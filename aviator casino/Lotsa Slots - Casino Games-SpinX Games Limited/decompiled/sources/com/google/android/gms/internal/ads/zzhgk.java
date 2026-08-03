package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgk {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhgj.zza, com.google.android.gms.internal.ads.zzhgh.class, com.google.android.gms.internal.ads.zzhdi.class);
    private static final com.google.android.gms.internal.ads.zzhln zzc = com.google.android.gms.internal.ads.zzhgi.zza;
    private static final com.google.android.gms.internal.ads.zzhdr zzd = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", com.google.android.gms.internal.ads.zzhdi.class, com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhro.zze());

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzhjm.zza;
        com.google.android.gms.internal.ads.zzhjm.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzc, com.google.android.gms.internal.ads.zzhgm.class);
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("CHACHA20_POLY1305", com.google.android.gms.internal.ads.zzhgm.zzb(com.google.android.gms.internal.ads.zzhgl.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", com.google.android.gms.internal.ads.zzhgm.zzb(com.google.android.gms.internal.ads.zzhgl.zzc));
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhlo.zza().zzb(zzd, true);
    }
}
