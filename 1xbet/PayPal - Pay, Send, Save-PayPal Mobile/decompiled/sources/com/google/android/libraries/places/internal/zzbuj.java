package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzbuj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zza;

    zzbuj(com.google.android.libraries.places.internal.zzbvr zzbvrVar) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zza = zzbvrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzl(true);
    }
}
