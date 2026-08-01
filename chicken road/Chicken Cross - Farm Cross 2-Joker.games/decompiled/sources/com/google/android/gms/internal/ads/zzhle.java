package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhle {
    public static zzhek zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzhni zzhniVar;
        zzhni zzhniVar2;
        zzich zzd;
        zzhof zzhofVar = new zzhof();
        for (int i = 0; i < zzhfeVar.zzd(); i++) {
            zzhfb zze = ((zzhfd) zzhfeVar).zze(i);
            if (zze.zzb().equals(zzheu.zza)) {
                zzhes zza = zze.zza();
                if (zza instanceof zzhfz) {
                    zzd = ((zzhfz) zza).zzc();
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
                zzhofVar.zza(zzd, new zzhlc((zzhek) zzhopVar.zza(zze), zze.zzc()));
            }
        }
        zzhnh zzhnhVar = (zzhnh) zzhfeVar.zzf(zzhnh.class);
        if (zzhnhVar == null || zzhnhVar.zza()) {
            zzhniVar = zzhnl.zza;
            zzhniVar2 = zzhniVar;
        } else {
            zzhnj zzb = zzhnr.zza().zzb();
            zzhni zza2 = zzb.zza(zzhfeVar, zzhnhVar, "aead", "encrypt");
            zzhniVar2 = zzb.zza(zzhfeVar, zzhnhVar, "aead", "decrypt");
            zzhniVar = zza2;
        }
        zzhfd zzhfdVar = (zzhfd) zzhfeVar;
        return new zzhld(new zzhlc((zzhek) zzhopVar.zza(zzhfdVar.zzc()), zzhfdVar.zzc().zzc()), zzhofVar.zzb(), zzhniVar, zzhniVar2, null);
    }
}
