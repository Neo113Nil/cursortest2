package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzavw {
    private static volatile com.google.android.libraries.places.internal.zzbml zza;

    public static com.google.android.libraries.places.internal.zzbml zza() {
        com.google.android.libraries.places.internal.zzbml zzbmlVar;
        com.google.android.libraries.places.internal.zzbml zzbmlVar2 = zza;
        if (zzbmlVar2 != null) {
            return zzbmlVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzavw.class) {
            zzbmlVar = zza;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.maps.geocode.v4.GeocodeService", "GeocodeLocation"));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzavn.zzc()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzavp.zzc()));
                zzbmlVar = zzi.zzf();
                zza = zzbmlVar;
            }
        }
        return zzbmlVar;
    }

    public static com.google.android.libraries.places.internal.zzavv zzb(com.google.android.libraries.places.internal.zzbit zzbitVar) {
        return (com.google.android.libraries.places.internal.zzavv) com.google.android.libraries.places.internal.zzcdt.zzb(new com.google.android.libraries.places.internal.zzavu(), zzbitVar, com.google.android.libraries.places.internal.zzbis.zza);
    }

    private zzavw() {
    }
}
