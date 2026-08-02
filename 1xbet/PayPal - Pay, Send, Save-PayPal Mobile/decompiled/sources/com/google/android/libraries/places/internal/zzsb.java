package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzsb implements java.lang.Runnable {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzrv zzb;
    final /* synthetic */ java.lang.Runnable zzc;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (((com.google.android.libraries.places.internal.zzsh) this.zza.element) != null) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzrv zzrvVar = this.zzb;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzrvVar, "");
        java.lang.Runnable runnable = this.zzc;
        com.google.android.libraries.places.internal.zzrv zzc = com.google.android.libraries.places.internal.zzrh.zzc(com.google.android.libraries.places.internal.zzrh.zzd(), zzrvVar);
        try {
            runnable.run();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
        }
    }

    public final java.lang.String toString() {
        java.lang.Runnable runnable = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(runnable.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(runnable);
        sb.append("]");
        return sb.toString();
    }

    zzsb(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.google.android.libraries.places.internal.zzrv zzrvVar, java.lang.Runnable runnable) {
        this.zza = objectRef;
        this.zzb = zzrvVar;
        this.zzc = runnable;
    }
}
