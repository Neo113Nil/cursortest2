package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbuy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbuz zza;

    zzbuy(com.google.android.libraries.places.internal.zzbuz zzbuzVar) {
        java.util.Objects.requireNonNull(zzbuzVar);
        this.zza = zzbuzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzn();
    }
}
