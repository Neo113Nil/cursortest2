package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzhw {
    private final com.google.android.libraries.places.internal.zzblw zza;
    private final com.google.android.libraries.places.internal.zzjc zzb;

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.maps.model.LatLng latLng, com.google.android.libraries.places.api.auth.zzb zzbVar, java.lang.String str) {
        com.google.android.libraries.places.internal.zzavv zzavvVar = (com.google.android.libraries.places.internal.zzavv) com.google.android.libraries.places.internal.zzavw.zzb(this.zza).zze(com.google.android.libraries.places.internal.zzcei.zza(this.zzb.zzb(str, "results.placeId,results.types")), com.google.android.libraries.places.internal.zzey.zza(zzbVar.zzb()));
        com.google.android.libraries.places.internal.zzavm zza = com.google.android.libraries.places.internal.zzavn.zza();
        double d = latLng.latitude;
        double d2 = latLng.longitude;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(d).length() + 1 + java.lang.String.valueOf(d2).length());
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        zza.zza(sb.toString());
        com.google.android.libraries.places.internal.zzavn zzavnVar = (com.google.android.libraries.places.internal.zzavn) zza.zzG();
        com.google.common.util.concurrent.SettableFuture create = com.google.common.util.concurrent.SettableFuture.create();
        com.google.android.libraries.places.internal.zzcef.zza(zzavvVar.zzc().zza(com.google.android.libraries.places.internal.zzavw.zza(), zzavvVar.zzd()), zzavnVar, new com.google.android.libraries.places.internal.zzhv(this, create));
        return create;
    }

    zzhw(com.google.android.libraries.places.internal.zzblw zzblwVar, com.google.android.libraries.places.internal.zzjc zzjcVar) {
        this.zza = zzblwVar;
        this.zzb = zzjcVar;
    }
}
