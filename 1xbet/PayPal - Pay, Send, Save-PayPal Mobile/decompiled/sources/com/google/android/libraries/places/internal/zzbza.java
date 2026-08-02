package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbza implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcac zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzc zzb;

    zzbza(com.google.android.libraries.places.internal.zzbzc zzbzcVar, com.google.android.libraries.places.internal.zzcac zzcacVar) {
        this.zza = zzcacVar;
        java.util.Objects.requireNonNull(zzbzcVar);
        this.zzb = zzbzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzY().zzb(this.zza);
    }
}
