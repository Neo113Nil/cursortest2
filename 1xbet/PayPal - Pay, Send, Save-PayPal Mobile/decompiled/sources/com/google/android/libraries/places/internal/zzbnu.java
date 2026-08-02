package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbnu implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnv zza;
    final /* synthetic */ java.lang.Runnable zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnx zzc;

    zzbnu(com.google.android.libraries.places.internal.zzbnx zzbnxVar, com.google.android.libraries.places.internal.zzbnv zzbnvVar, java.lang.Runnable runnable) {
        this.zza = zzbnvVar;
        this.zzb = runnable;
        java.util.Objects.requireNonNull(zzbnxVar);
        this.zzc = zzbnxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzc;
        zzbnxVar.zzb(this.zza);
        zzbnxVar.zza();
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.zzb.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
