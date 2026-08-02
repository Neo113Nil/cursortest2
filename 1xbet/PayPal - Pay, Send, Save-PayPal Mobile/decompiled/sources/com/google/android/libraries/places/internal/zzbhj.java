package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbhj {
    private static volatile com.google.android.libraries.places.internal.zzbml zza;

    public static com.google.android.libraries.places.internal.zzbml zza() {
        com.google.android.libraries.places.internal.zzbml zzbmlVar;
        com.google.android.libraries.places.internal.zzbml zzbmlVar2 = zza;
        if (zzbmlVar2 != null) {
            return zzbmlVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbhj.class) {
            zzbmlVar = zza;
            if (zzbmlVar == null) {
                com.google.android.libraries.places.internal.zzbmh zzi = com.google.android.libraries.places.internal.zzbml.zzi(null, null);
                zzi.zzc(com.google.android.libraries.places.internal.zzbmj.UNARY);
                zzi.zzd(com.google.android.libraries.places.internal.zzbml.zzh("google.internal.maps.mapsmobilesdks.v1.MapsMobileSDKsService", "GetSession"));
                zzi.zze(true);
                zzi.zza(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbhe.zze()));
                zzi.zzb(com.google.android.libraries.places.internal.zzcds.zza(com.google.android.libraries.places.internal.zzbhg.zze()));
                zzbmlVar = zzi.zzf();
                zza = zzbmlVar;
            }
        }
        return zzbmlVar;
    }

    public static com.google.android.libraries.places.internal.zzbhi zzb(com.google.android.libraries.places.internal.zzbit zzbitVar) {
        return (com.google.android.libraries.places.internal.zzbhi) com.google.android.libraries.places.internal.zzcdu.zzb(new com.google.android.libraries.places.internal.zzbhh(), zzbitVar, com.google.android.libraries.places.internal.zzbis.zza);
    }

    private zzbhj() {
    }
}
