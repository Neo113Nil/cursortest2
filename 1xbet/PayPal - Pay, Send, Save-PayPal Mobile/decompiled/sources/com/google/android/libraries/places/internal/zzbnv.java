package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbnv implements java.lang.Runnable {
    final java.lang.Runnable zza;
    boolean zzb;
    boolean zzc;

    zzbnv(java.lang.Runnable runnable) {
        this.zza = (java.lang.Runnable) com.google.common.base.Preconditions.checkNotNull(runnable, "task");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zzc = true;
        this.zza.run();
    }
}
