package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqq implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqt zzb;

    zzbqq(com.google.android.libraries.places.internal.zzbqt zzbqtVar, java.lang.Object obj) {
        this.zza = obj;
        java.util.Objects.requireNonNull(zzbqtVar);
        this.zzb = zzbqtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf().zzb(this.zza);
    }
}
