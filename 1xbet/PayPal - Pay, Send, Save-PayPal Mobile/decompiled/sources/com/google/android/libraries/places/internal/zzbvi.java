package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvi implements java.lang.Runnable {
    final /* synthetic */ java.lang.Runnable zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvk zzb;

    zzbvi(com.google.android.libraries.places.internal.zzbvk zzbvkVar, java.lang.Runnable runnable) {
        this.zza = runnable;
        java.util.Objects.requireNonNull(zzbvkVar);
        this.zzb = zzbvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.run();
        com.google.android.libraries.places.internal.zzbvk zzbvkVar = this.zzb;
        com.google.android.libraries.places.internal.zzbvj zzbvjVar = new com.google.android.libraries.places.internal.zzbvj(zzbvkVar);
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = zzbvkVar.zzd.zza.zze;
        zzbnxVar.zzb(zzbvjVar);
        zzbnxVar.zza();
    }
}
