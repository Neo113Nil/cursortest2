package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzsa implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzrw zza;
    final /* synthetic */ java.lang.Runnable zzb;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzrw zzrwVar = this.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzrwVar, "");
        com.google.android.libraries.places.internal.zzrv zzc = com.google.android.libraries.places.internal.zzrh.zzc(com.google.android.libraries.places.internal.zzrh.zzd(), (com.google.android.libraries.places.internal.zzrv) zzrwVar);
        try {
            this.zzb.run();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
        }
    }

    public final java.lang.String toString() {
        java.lang.Runnable runnable = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(runnable.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(runnable);
        sb.append("]");
        return sb.toString();
    }

    zzsa(com.google.android.libraries.places.internal.zzrw zzrwVar, java.lang.Runnable runnable) {
        this.zza = zzrwVar;
        this.zzb = runnable;
    }
}
