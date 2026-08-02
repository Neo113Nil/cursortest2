package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbal {
    private static volatile com.google.android.libraries.places.internal.zzbml zza;
    private static volatile com.google.android.libraries.places.internal.zzbml zzb;
    private static volatile com.google.android.libraries.places.internal.zzbml zzc;
    private static volatile com.google.android.libraries.places.internal.zzbml zzd;
    private static volatile com.google.android.libraries.places.internal.zzbml zze;

    public static com.google.android.libraries.places.internal.zzbml zza() {
        com.google.android.libraries.places.internal.zzbml zzbmlVar;
        com.google.android.libraries.places.internal.zzbml zzbmlVar2 = zza;
        if (zzbmlVar2 != null) {
            return zzbmlVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbal.class) {
            zzbmlVar = zza;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.maps.places.v1.Places", "SearchNearby"));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbbi.zzc()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbbk.zzd()));
                zzbmlVar = zzi.zzf();
                zza = zzbmlVar;
            }
        }
        return zzbmlVar;
    }

    public static com.google.android.libraries.places.internal.zzbml zzb() {
        com.google.android.libraries.places.internal.zzbml zzbmlVar;
        com.google.android.libraries.places.internal.zzbml zzbmlVar2 = zzb;
        if (zzbmlVar2 != null) {
            return zzbmlVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbal.class) {
            zzbmlVar = zzb;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.maps.places.v1.Places", "SearchText"));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbbu.zzc()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbbw.zzf()));
                zzbmlVar = zzi.zzf();
                zzb = zzbmlVar;
            }
        }
        return zzbmlVar;
    }

    public static com.google.android.libraries.places.internal.zzbml zzc() {
        com.google.android.libraries.places.internal.zzbml zzbmlVar;
        com.google.android.libraries.places.internal.zzbml zzbmlVar2 = zzc;
        if (zzbmlVar2 != null) {
            return zzbmlVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbal.class) {
            zzbmlVar = zzc;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.maps.places.v1.Places", "GetPhotoMedia"));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzayg.zzc()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzayo.zzc()));
                zzbmlVar = zzi.zzf();
                zzc = zzbmlVar;
            }
        }
        return zzbmlVar;
    }

    public static com.google.android.libraries.places.internal.zzbml zzd() {
        com.google.android.libraries.places.internal.zzbml zzbmlVar;
        com.google.android.libraries.places.internal.zzbml zzbmlVar2 = zzd;
        if (zzbmlVar2 != null) {
            return zzbmlVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbal.class) {
            zzbmlVar = zzd;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.maps.places.v1.Places", com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.OPERATION_NAME));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzayi.zzc()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbai.zzbi()));
                zzbmlVar = zzi.zzf();
                zzd = zzbmlVar;
            }
        }
        return zzbmlVar;
    }

    public static com.google.android.libraries.places.internal.zzbml zze() {
        com.google.android.libraries.places.internal.zzbml zzbmlVar;
        com.google.android.libraries.places.internal.zzbml zzbmlVar2 = zze;
        if (zzbmlVar2 != null) {
            return zzbmlVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbal.class) {
            zzbmlVar = zze;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.maps.places.v1.Places", "AutocompletePlaces"));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzawm.zzc()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzaxa.zzc()));
                zzbmlVar = zzi.zzf();
                zze = zzbmlVar;
            }
        }
        return zzbmlVar;
    }

    public static com.google.android.libraries.places.internal.zzbak zzf(com.google.android.libraries.places.internal.zzbit zzbitVar) {
        return (com.google.android.libraries.places.internal.zzbak) com.google.android.libraries.places.internal.zzcdu.zzb(new com.google.android.libraries.places.internal.zzbaj(), zzbitVar, com.google.android.libraries.places.internal.zzbis.zza);
    }

    private zzbal() {
    }
}
