package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzfh implements com.google.android.libraries.places.internal.zzbie {
    private final com.google.android.libraries.places.internal.zzbih zza;

    @Override // com.google.android.libraries.places.internal.zzcez
    public final /* synthetic */ java.lang.Object zzb() {
        java.util.Optional optional = (java.util.Optional) this.zza.zzb();
        com.google.android.libraries.places.internal.zzcbd zze = com.google.android.libraries.places.internal.zzcbd.zze("mapsmobilesdks-pa.googleapis.com", 443);
        zze.zzf();
        com.google.android.libraries.places.internal.zzbmg zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
        zzbmgVar.zzc(com.google.android.libraries.places.internal.zzbmc.zzc("X-Goog-Api-Key", com.google.android.libraries.places.internal.zzbmg.zza), (java.lang.String) optional.orElse("AIzaSyDgmW4ZMvNblSXqMOgsbY8uRrTnfR3E7pY"));
        zze.zzb(com.google.android.libraries.places.internal.zzcei.zza(zzbmgVar));
        return zze.zzd();
    }

    public static com.google.android.libraries.places.internal.zzfh zza(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        return new com.google.android.libraries.places.internal.zzfh(zzbihVar);
    }

    private zzfh(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        this.zza = zzbihVar;
    }
}
