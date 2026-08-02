package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvf implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvl zza;

    zzbvf(com.google.android.libraries.places.internal.zzbvl zzbvlVar) {
        java.util.Objects.requireNonNull(zzbvlVar);
        this.zza = zzbvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zze();
    }
}
