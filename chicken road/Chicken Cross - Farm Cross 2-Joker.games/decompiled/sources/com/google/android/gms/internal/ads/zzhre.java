package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhre {
    public static zzhfi zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzhni zzhniVar;
        zzhni zzhniVar2;
        zzich zzd;
        zzhof zzhofVar = new zzhof();
        for (int i = 0; i < zzhfeVar.zzd(); i++) {
            zzhfb zze = ((zzhfd) zzhfeVar).zze(i);
            if (zze.zzb().equals(zzheu.zza)) {
                zzhfi zzhfiVar = (zzhfi) zzhopVar.zza(zze);
                zzhes zza = zze.zza();
                if (zza instanceof zzhqb) {
                    zzd = ((zzhqb) zza).zze();
                } else {
                    if (!(zza instanceof zzhne)) {
                        String name = zza.getClass().getName();
                        String valueOf = String.valueOf(zza.zza());
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 59 + String.valueOf(valueOf).length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zzd = ((zzhne) zza).zzd();
                }
                zzhofVar.zza(zzd, new zzhrc(zzhfiVar, zze.zzc()));
            }
        }
        zzhnh zzhnhVar = (zzhnh) zzhfeVar.zzf(zzhnh.class);
        if (zzhnhVar == null || zzhnhVar.zza()) {
            zzhniVar = zzhnl.zza;
            zzhniVar2 = zzhniVar;
        } else {
            zzhnj zzb = zzhnr.zza().zzb();
            zzhni zza2 = zzb.zza(zzhfeVar, zzhnhVar, "mac", "compute");
            zzhniVar2 = zzb.zza(zzhfeVar, zzhnhVar, "mac", "verify");
            zzhniVar = zza2;
        }
        zzhfd zzhfdVar = (zzhfd) zzhfeVar;
        return new zzhrd(new zzhrc((zzhfi) zzhopVar.zza(zzhfdVar.zzc()), zzhfdVar.zzc().zzc()), zzhofVar.zzb(), zzhniVar, zzhniVar2, null);
    }
}
