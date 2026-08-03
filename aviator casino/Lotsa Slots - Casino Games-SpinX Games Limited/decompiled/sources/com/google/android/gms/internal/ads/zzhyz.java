package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhyz {
    public static com.google.android.gms.internal.ads.zzhej zza(com.google.android.gms.internal.ads.zzhec zzhecVar, com.google.android.gms.internal.ads.zzhnk zzhnkVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhmc zzhmcVar = (com.google.android.gms.internal.ads.zzhmc) zzhecVar.zzf(com.google.android.gms.internal.ads.zzhmc.class);
        com.google.android.gms.internal.ads.zzhmd zza = (zzhmcVar == null || zzhmcVar.zza()) ? com.google.android.gms.internal.ads.zzhmg.zza : com.google.android.gms.internal.ads.zzhmm.zza().zzb().zza(zzhecVar, zzhmcVar, "public_key_sign", "sign");
        com.google.android.gms.internal.ads.zzheb zzhebVar = (com.google.android.gms.internal.ads.zzheb) zzhecVar;
        return new com.google.android.gms.internal.ads.zzhyx(new com.google.android.gms.internal.ads.zzhyy((com.google.android.gms.internal.ads.zzhej) zzhnkVar.zza(zzhebVar.zzc()), zzhebVar.zzc().zzc()), zza);
    }
}
