package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbql implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqu zzb;

    zzbql(com.google.android.libraries.places.internal.zzbqu zzbquVar, int i) {
        this.zza = i;
        java.util.Objects.requireNonNull(zzbquVar);
        this.zzb = zzbquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk().zzc(this.zza);
    }
}
