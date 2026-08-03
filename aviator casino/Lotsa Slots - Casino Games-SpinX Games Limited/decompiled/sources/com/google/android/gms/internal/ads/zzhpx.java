package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhpx {
    public static com.google.android.gms.internal.ads.zzhoj zza(com.google.android.gms.internal.ads.zzhec zzhecVar, com.google.android.gms.internal.ads.zzhnk zzhnkVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zzd;
        com.google.android.gms.internal.ads.zzheb zzhebVar = (com.google.android.gms.internal.ads.zzheb) zzhecVar;
        com.google.android.gms.internal.ads.zzhdz zzc = zzhebVar.zzc();
        com.google.android.gms.internal.ads.zzhna zzhnaVar = new com.google.android.gms.internal.ads.zzhna();
        for (int i = 0; i < zzhecVar.zzd(); i++) {
            com.google.android.gms.internal.ads.zzhdz zze = zzhebVar.zze(i);
            if (zze.zzb().equals(com.google.android.gms.internal.ads.zzhds.zza)) {
                com.google.android.gms.internal.ads.zzhoj zzhojVar = (com.google.android.gms.internal.ads.zzhoj) zzhnkVar.zza(zze);
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
                zzhnaVar.zza(zzd, zzhojVar);
            }
        }
        return new com.google.android.gms.internal.ads.zzhpw(zzhnaVar.zzb(), (com.google.android.gms.internal.ads.zzhoj) zzhnkVar.zza(zzc), null);
    }
}
