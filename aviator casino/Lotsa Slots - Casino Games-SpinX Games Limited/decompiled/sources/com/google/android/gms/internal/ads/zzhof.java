package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhof {
    private static final com.google.android.gms.internal.ads.zzhln zza = com.google.android.gms.internal.ads.zzhoe.zza;
    private static final com.google.android.gms.internal.ads.zzhnf zzb = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhoc.zza, com.google.android.gms.internal.ads.zzhob.class, com.google.android.gms.internal.ads.zzhoj.class);
    private static final com.google.android.gms.internal.ads.zzhnf zzc = com.google.android.gms.internal.ads.zzhnf.zzd(com.google.android.gms.internal.ads.zzhod.zza, com.google.android.gms.internal.ads.zzhob.class, com.google.android.gms.internal.ads.zzheg.class);
    private static final com.google.android.gms.internal.ads.zzhdr zzd = com.google.android.gms.internal.ads.zzhlw.zze("type.googleapis.com/google.crypto.tink.AesCmacKey", com.google.android.gms.internal.ads.zzheg.class, com.google.android.gms.internal.ads.zzhsp.SYMMETRIC, com.google.android.gms.internal.ads.zzhqk.zzg());

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzhpl.zza;
        com.google.android.gms.internal.ads.zzhpl.zza(com.google.android.gms.internal.ads.zzhmr.zza());
        com.google.android.gms.internal.ads.zzhmi.zza().zzb(zza, com.google.android.gms.internal.ads.zzhoi.class);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzb);
        com.google.android.gms.internal.ads.zzhmo.zza().zzb(zzc);
        com.google.android.gms.internal.ads.zzhmn zza2 = com.google.android.gms.internal.ads.zzhmn.zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.google.android.gms.internal.ads.zzhoi zzhoiVar = com.google.android.gms.internal.ads.zzhpg.zzc;
        hashMap.put("AES_CMAC", zzhoiVar);
        hashMap.put("AES256_CMAC", zzhoiVar);
        com.google.android.gms.internal.ads.zzhog zzhogVar = new com.google.android.gms.internal.ads.zzhog(null);
        zzhogVar.zza(32);
        zzhogVar.zzb(16);
        zzhogVar.zzc(com.google.android.gms.internal.ads.zzhoh.zzd);
        hashMap.put("AES256_CMAC_RAW", zzhogVar.zzd());
        zza2.zzd(java.util.Collections.unmodifiableMap(hashMap));
        com.google.android.gms.internal.ads.zzhlo.zza().zzb(zzd, true);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhob zzb(com.google.android.gms.internal.ads.zzhoi zzhoiVar, java.lang.Integer num) {
        zze(zzhoiVar);
        com.google.android.gms.internal.ads.zzhoa zzhoaVar = new com.google.android.gms.internal.ads.zzhoa(null);
        zzhoaVar.zza(zzhoiVar);
        zzhoaVar.zzb(com.google.android.gms.internal.ads.zzibb.zzb(zzhoiVar.zzc()));
        zzhoaVar.zzc(num);
        return zzhoaVar.zzd();
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhoj zzc(com.google.android.gms.internal.ads.zzhob zzhobVar) {
        zze(zzhobVar.zzf());
        return com.google.android.gms.internal.ads.zzhpo.zza(zzhobVar);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzheg zzd(com.google.android.gms.internal.ads.zzhob zzhobVar) {
        zze(zzhobVar.zzf());
        return com.google.android.gms.internal.ads.zziap.zza(zzhobVar);
    }

    private static void zze(com.google.android.gms.internal.ads.zzhoi zzhoiVar) throws java.security.GeneralSecurityException {
        if (zzhoiVar.zzc() != 32) {
            throw new java.security.GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
