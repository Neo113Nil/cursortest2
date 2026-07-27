package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zziak {
    public static zzhfo zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzich zzd;
        zzhof zzhofVar = new zzhof();
        for (int i = 0; i < zzhfeVar.zzd(); i++) {
            zzhfb zze = ((zzhfd) zzhfeVar).zze(i);
            if (zze.zzb().equals(zzheu.zza)) {
                zzhfo zzhfoVar = (zzhfo) zzhopVar.zza(zze);
                zzhes zza = zze.zza();
                if (zza instanceof zzhyo) {
                    zzd = ((zzhyo) zza).zze();
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
                zzhofVar.zza(zzd, new zziaj(zzhfoVar, zze.zzc()));
            }
        }
        zzhnh zzhnhVar = (zzhnh) zzhfeVar.zzf(zzhnh.class);
        return new zziai(zzhofVar.zzb(), (zzhnhVar == null || zzhnhVar.zza()) ? zzhnl.zza : zzhnr.zza().zzb().zza(zzhfeVar, zzhnhVar, "public_key_verify", "verify"));
    }
}
