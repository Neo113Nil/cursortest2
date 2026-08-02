package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbro implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcac zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrs zzb;

    zzbro(com.google.android.libraries.places.internal.zzbrs zzbrsVar, com.google.android.libraries.places.internal.zzcac zzcacVar) {
        this.zza = zzcacVar;
        java.util.Objects.requireNonNull(zzbrsVar);
        this.zzb = zzbrsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf().zzb(this.zza);
    }
}
