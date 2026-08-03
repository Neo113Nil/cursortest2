package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqa {
    public static com.google.android.gms.internal.ads.zzheg zza(com.google.android.gms.internal.ads.zzhec zzhecVar, com.google.android.gms.internal.ads.zzhnk zzhnkVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhmd zzhmdVar;
        com.google.android.gms.internal.ads.zzhmd zzhmdVar2;
        com.google.android.gms.internal.ads.zziaz zzd;
        com.google.android.gms.internal.ads.zzhna zzhnaVar = new com.google.android.gms.internal.ads.zzhna();
        for (int i = 0; i < zzhecVar.zzd(); i++) {
            com.google.android.gms.internal.ads.zzhdz zze = ((com.google.android.gms.internal.ads.zzheb) zzhecVar).zze(i);
            if (zze.zzb().equals(com.google.android.gms.internal.ads.zzhds.zza)) {
                com.google.android.gms.internal.ads.zzheg zzhegVar = (com.google.android.gms.internal.ads.zzheg) zzhnkVar.zza(zze);
                com.google.android.gms.internal.ads.zzhdq zza = zze.zza();
                if (zza instanceof com.google.android.gms.internal.ads.zzhox) {
                    zzd = ((com.google.android.gms.internal.ads.zzhox) zza).zze();
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
                zzhnaVar.zza(zzd, new com.google.android.gms.internal.ads.zzhpy(zzhegVar, zze.zzc()));
            }
        }
        com.google.android.gms.internal.ads.zzhmc zzhmcVar = (com.google.android.gms.internal.ads.zzhmc) zzhecVar.zzf(com.google.android.gms.internal.ads.zzhmc.class);
        if (zzhmcVar == null || zzhmcVar.zza()) {
            zzhmdVar = com.google.android.gms.internal.ads.zzhmg.zza;
            zzhmdVar2 = zzhmdVar;
        } else {
            com.google.android.gms.internal.ads.zzhme zzb = com.google.android.gms.internal.ads.zzhmm.zza().zzb();
            com.google.android.gms.internal.ads.zzhmd zza2 = zzb.zza(zzhecVar, zzhmcVar, "mac", "compute");
            zzhmdVar2 = zzb.zza(zzhecVar, zzhmcVar, "mac", "verify");
            zzhmdVar = zza2;
        }
        com.google.android.gms.internal.ads.zzheb zzhebVar = (com.google.android.gms.internal.ads.zzheb) zzhecVar;
        return new com.google.android.gms.internal.ads.zzhpz(new com.google.android.gms.internal.ads.zzhpy((com.google.android.gms.internal.ads.zzheg) zzhnkVar.zza(zzhebVar.zzc()), zzhebVar.zzc().zzc()), zzhnaVar.zzb(), zzhmdVar, zzhmdVar2, null);
    }
}
