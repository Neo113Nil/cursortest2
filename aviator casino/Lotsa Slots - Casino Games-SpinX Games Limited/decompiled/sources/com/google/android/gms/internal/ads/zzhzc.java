package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzc {
    public static com.google.android.gms.internal.ads.zzhek zza(com.google.android.gms.internal.ads.zzhec zzhecVar, com.google.android.gms.internal.ads.zzhnk zzhnkVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zzd;
        com.google.android.gms.internal.ads.zzhna zzhnaVar = new com.google.android.gms.internal.ads.zzhna();
        for (int i = 0; i < zzhecVar.zzd(); i++) {
            com.google.android.gms.internal.ads.zzhdz zze = ((com.google.android.gms.internal.ads.zzheb) zzhecVar).zze(i);
            if (zze.zzb().equals(com.google.android.gms.internal.ads.zzhds.zza)) {
                com.google.android.gms.internal.ads.zzhek zzhekVar = (com.google.android.gms.internal.ads.zzhek) zzhnkVar.zza(zze);
                com.google.android.gms.internal.ads.zzhdq zza = zze.zza();
                if (zza instanceof com.google.android.gms.internal.ads.zzhxk) {
                    zzd = ((com.google.android.gms.internal.ads.zzhxk) zza).zze();
                } else {
                    if (!(zza instanceof com.google.android.gms.internal.ads.zzhlz)) {
                        java.lang.String name = zza.getClass().getName();
                        java.lang.String valueOf = java.lang.String.valueOf(zza.zza());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 59 + java.lang.String.valueOf(valueOf).length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(valueOf);
                        throw new java.security.GeneralSecurityException(sb.toString());
                    }
                    zzd = ((com.google.android.gms.internal.ads.zzhlz) zza).zzd();
                }
                zzhnaVar.zza(zzd, new com.google.android.gms.internal.ads.zzhzb(zzhekVar, zze.zzc()));
            }
        }
        com.google.android.gms.internal.ads.zzhmc zzhmcVar = (com.google.android.gms.internal.ads.zzhmc) zzhecVar.zzf(com.google.android.gms.internal.ads.zzhmc.class);
        return new com.google.android.gms.internal.ads.zzhza(zzhnaVar.zzb(), (zzhmcVar == null || zzhmcVar.zza()) ? com.google.android.gms.internal.ads.zzhmg.zza : com.google.android.gms.internal.ads.zzhmm.zza().zzb().zza(zzhecVar, zzhmcVar, "public_key_verify", "verify"));
    }
}
