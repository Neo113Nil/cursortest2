package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbgw {
    private static volatile com.google.android.libraries.places.internal.zzbml zza;
    private static volatile com.google.android.libraries.places.internal.zzbml zzb;

    public static com.google.android.libraries.places.internal.zzbml zza() {
        com.google.android.libraries.places.internal.zzbml zzbmlVar;
        com.google.android.libraries.places.internal.zzbml zzbmlVar2 = zza;
        if (zzbmlVar2 != null) {
            return zzbmlVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbgw.class) {
            zzbmlVar = zza;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.internal.maps.gmpsdksbackend.v1.GmpSdksBackendService", "InitMapsJwt"));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbgy.zze()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbha.zzf()));
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
        synchronized (com.google.android.libraries.places.internal.zzbgw.class) {
            zzbmlVar = zzb;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.internal.maps.gmpsdksbackend.v1.GmpSdksBackendService", "GetPlaceWidgetMetadata"));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbgt.zze()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbhc.zze()));
                zzbmlVar = zzi.zzf();
                zzb = zzbmlVar;
            }
        }
        return zzbmlVar;
    }

    public static com.google.android.libraries.places.internal.zzbgv zzc(com.google.android.libraries.places.internal.zzbit zzbitVar) {
        return (com.google.android.libraries.places.internal.zzbgv) com.google.android.libraries.places.internal.zzcdu.zzb(new com.google.android.libraries.places.internal.zzbgu(), zzbitVar, com.google.android.libraries.places.internal.zzbis.zza);
    }

    private zzbgw() {
    }
}
