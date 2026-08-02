package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
final class zzbrj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zza;

    zzbrj(com.google.android.libraries.places.internal.zzbrt zzbrtVar) {
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zza = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzp();
    }
}
