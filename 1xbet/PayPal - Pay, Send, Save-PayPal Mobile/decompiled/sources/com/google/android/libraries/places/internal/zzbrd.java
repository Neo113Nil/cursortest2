package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrd implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zza;

    zzbrd(com.google.android.libraries.places.internal.zzbrt zzbrtVar) {
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zza = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzq().zzr();
    }
}
