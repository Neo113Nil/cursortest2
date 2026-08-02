package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzng {
    public static com.google.android.libraries.places.internal.zzaoc zza(com.google.android.libraries.places.internal.zzmz zzmzVar, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        return zzb(zzmzVar, zzmyVar == com.google.android.libraries.places.internal.zzmy.AUTOCOMPLETE_WIDGET ? 2 : 3, zzmyVar, com.google.android.libraries.places.api.auth.zzb.zza);
    }

    public static com.google.android.libraries.places.internal.zzaoc zzb(com.google.android.libraries.places.internal.zzmz zzmzVar, int i, com.google.android.libraries.places.internal.zzmy zzmyVar, com.google.android.libraries.places.api.auth.zzb zzbVar) {
        int i2;
        com.google.android.libraries.places.internal.zzmy zzmyVar2 = com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_KOTLIN_API;
        int ordinal = zzmzVar.zzc().ordinal();
        if (ordinal != 0) {
            i2 = 4;
            if (ordinal != 1) {
                i2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 1 : 8 : 7 : 5;
            }
        } else {
            i2 = 2;
        }
        int i3 = zzmyVar == zzmyVar2 ? 2 : 3;
        com.google.android.libraries.places.internal.zzaoc zza = com.google.android.libraries.places.internal.zzaoj.zza();
        com.google.android.libraries.places.internal.zzxv zza2 = com.google.android.libraries.places.internal.zzya.zza();
        zza2.zza(zzmzVar.zza());
        zza2.zzb(zzmzVar.zzb());
        zza.zza((com.google.android.libraries.places.internal.zzya) zza2.zzG());
        zza.zzg(i == 2);
        zza.zzr(i);
        zza.zzq(i2);
        zza.zzs(i3);
        zza.zzi("5.1.1");
        zza.zzm(zzbVar.zza());
        java.lang.String zzc = zzbVar.zzc();
        if (zzc != null) {
            com.google.android.libraries.places.internal.zzaku zza3 = com.google.android.libraries.places.internal.zzakv.zza();
            zza3.zza(zzc);
            zza.zzl(zza3);
        }
        return zza;
    }
}
