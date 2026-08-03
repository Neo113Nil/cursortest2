package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhvk {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhvi.zza, com.google.android.gms.internal.ads.zzhvf.class, com.google.android.gms.internal.ads.zzhej.class);
    private static final com.google.android.gms.internal.ads.zzhnf zzc = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhvj.zza, com.google.android.gms.internal.ads.zzhvl.class, com.google.android.gms.internal.ads.zzhek.class);
    private static final com.google.android.gms.internal.ads.zzhei zzd = com.google.android.gms.internal.ads.zzhlw.zzf("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", com.google.android.gms.internal.ads.zzhej.class, com.google.android.gms.internal.ads.zzhsd.zzg());
    private static final com.google.android.gms.internal.ads.zzhdr zze = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", com.google.android.gms.internal.ads.zzhek.class, com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PUBLIC, com.google.android.gms.internal.ads.zzhsf.zzg());
    private static final com.google.android.gms.internal.ads.zzhmj zzf = com.google.android.gms.internal.ads.zzhvh.zza;
    private static final com.google.android.gms.internal.ads.zzhln zzg = com.google.android.gms.internal.ads.zzhvg.zza;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzhya.zza;
        com.google.android.gms.internal.ads.zzhya.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ED25519", com.google.android.gms.internal.ads.zzhve.zzb(com.google.android.gms.internal.ads.zzhvd.zza));
        com.google.android.gms.internal.ads.zzhvd zzhvdVar = com.google.android.gms.internal.ads.zzhvd.zzd;
        hashMap.put("ED25519_RAW", com.google.android.gms.internal.ads.zzhve.zzb(zzhvdVar));
        hashMap.put("ED25519WithRawOutput", com.google.android.gms.internal.ads.zzhve.zzb(zzhvdVar));
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzg, com.google.android.gms.internal.ads.zzhve.class);
        com.google.android.gms.internal.ads.zzhmk.zza().zzb(zzf, com.google.android.gms.internal.ads.zzhve.class);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzc);
        com.google.android.gms.internal.ads.zzhlo.zza().zzb(zzd, true);
        com.google.android.gms.internal.ads.zzhlo.zza().zzb(zze, false);
    }
}
