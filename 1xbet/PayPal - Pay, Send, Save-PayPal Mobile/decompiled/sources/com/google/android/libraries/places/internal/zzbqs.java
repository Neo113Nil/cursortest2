package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqs implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqt zza;

    zzbqs(com.google.android.libraries.places.internal.zzbqt zzbqtVar) {
        java.util.Objects.requireNonNull(zzbqtVar);
        this.zza = zzbqtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf().zzd();
    }
}
