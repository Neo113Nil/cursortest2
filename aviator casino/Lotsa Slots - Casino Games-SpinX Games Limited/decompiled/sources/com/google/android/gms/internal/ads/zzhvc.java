package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhvc {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhuz.zza, com.google.android.gms.internal.ads.zzhuw.class, com.google.android.gms.internal.ads.zzhej.class);
    private static final com.google.android.gms.internal.ads.zzhnf zzc = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhvb.zza, com.google.android.gms.internal.ads.zzhuy.class, com.google.android.gms.internal.ads.zzhek.class);
    private static final com.google.android.gms.internal.ads.zzhei zzd = com.google.android.gms.internal.ads.zzhlw.zzf("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", com.google.android.gms.internal.ads.zzhej.class, com.google.android.gms.internal.ads.zzhrw.zzg());
    private static final com.google.android.gms.internal.ads.zzhdr zze = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", com.google.android.gms.internal.ads.zzhek.class, com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PUBLIC, com.google.android.gms.internal.ads.zzhry.zzi());
    private static final com.google.android.gms.internal.ads.zzhln zzf = com.google.android.gms.internal.ads.zzhva.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzg;
        if (!com.google.android.gms.internal.ads.zzhkr.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzhxr.zza;
        com.google.android.gms.internal.ads.zzhxr.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ECDSA_P256", com.google.android.gms.internal.ads.zzhwe.zza);
        hashMap.put("ECDSA_P256_IEEE_P1363", com.google.android.gms.internal.ads.zzhwe.zzd);
        com.google.android.gms.internal.ads.zzhup zzhupVar = new com.google.android.gms.internal.ads.zzhup(null);
        zzhupVar.zzc(com.google.android.gms.internal.ads.zzhur.zza);
        zzhupVar.zzb(com.google.android.gms.internal.ads.zzhuq.zza);
        zzhupVar.zza(com.google.android.gms.internal.ads.zzhus.zza);
        zzhupVar.zzd(com.google.android.gms.internal.ads.zzhut.zzd);
        hashMap.put("ECDSA_P256_RAW", zzhupVar.zze());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", com.google.android.gms.internal.ads.zzhwe.zzf);
        hashMap.put("ECDSA_P384", com.google.android.gms.internal.ads.zzhwe.zzb);
        hashMap.put("ECDSA_P384_IEEE_P1363", com.google.android.gms.internal.ads.zzhwe.zze);
        com.google.android.gms.internal.ads.zzhup zzhupVar2 = new com.google.android.gms.internal.ads.zzhup(null);
        zzhupVar2.zzc(com.google.android.gms.internal.ads.zzhur.zzc);
        com.google.android.gms.internal.ads.zzhuq zzhuqVar = com.google.android.gms.internal.ads.zzhuq.zzb;
        zzhupVar2.zzb(zzhuqVar);
        com.google.android.gms.internal.ads.zzhus zzhusVar = com.google.android.gms.internal.ads.zzhus.zzb;
        zzhupVar2.zza(zzhusVar);
        com.google.android.gms.internal.ads.zzhut zzhutVar = com.google.android.gms.internal.ads.zzhut.zza;
        zzhupVar2.zzd(zzhutVar);
        hashMap.put("ECDSA_P384_SHA512", zzhupVar2.zze());
        com.google.android.gms.internal.ads.zzhup zzhupVar3 = new com.google.android.gms.internal.ads.zzhup(null);
        zzhupVar3.zzc(com.google.android.gms.internal.ads.zzhur.zzb);
        zzhupVar3.zzb(zzhuqVar);
        zzhupVar3.zza(zzhusVar);
        zzhupVar3.zzd(zzhutVar);
        hashMap.put("ECDSA_P384_SHA384", zzhupVar3.zze());
        hashMap.put("ECDSA_P521", com.google.android.gms.internal.ads.zzhwe.zzc);
        hashMap.put("ECDSA_P521_IEEE_P1363", com.google.android.gms.internal.ads.zzhwe.zzg);
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzc);
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zzf, com.google.android.gms.internal.ads.zzhuu.class);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zzd, i, true);
        com.google.android.gms.internal.ads.zzhlo.zza().zzf(zze, i, false);
    }
}
