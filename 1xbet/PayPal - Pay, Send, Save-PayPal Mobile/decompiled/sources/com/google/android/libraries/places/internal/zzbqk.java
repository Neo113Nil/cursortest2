package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqk implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqu zzb;

    zzbqk(com.google.android.libraries.places.internal.zzbqu zzbquVar, java.lang.Object obj) {
        this.zza = obj;
        java.util.Objects.requireNonNull(zzbquVar);
        this.zzb = zzbquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk().zzb(this.zza);
    }
}
