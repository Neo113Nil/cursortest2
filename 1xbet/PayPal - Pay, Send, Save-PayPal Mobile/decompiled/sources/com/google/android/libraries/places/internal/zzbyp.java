package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyp {
    final java.lang.Object zza;
    java.util.concurrent.Future zzb;
    boolean zzc;

    final void zza(java.util.concurrent.Future future) {
        boolean z;
        synchronized (this.zza) {
            z = this.zzc;
            if (!z) {
                this.zzb = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }

    @javax.annotation.CheckForNull
    final java.util.concurrent.Future zzb() {
        this.zzc = true;
        return this.zzb;
    }

    zzbyp(java.lang.Object obj) {
        this.zza = obj;
    }
}
