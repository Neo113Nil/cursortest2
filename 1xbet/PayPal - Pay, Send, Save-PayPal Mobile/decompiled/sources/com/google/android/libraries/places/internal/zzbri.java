package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbri implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbjv zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zzb;

    zzbri(com.google.android.libraries.places.internal.zzbrt zzbrtVar, com.google.android.libraries.places.internal.zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zzb = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zza(this.zza);
    }
}
