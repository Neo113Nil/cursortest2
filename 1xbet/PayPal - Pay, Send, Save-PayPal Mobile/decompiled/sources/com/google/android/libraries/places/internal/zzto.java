package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzto implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zztn zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zztp zzb;

    zzto(com.google.android.libraries.places.internal.zztp zztpVar, com.google.android.libraries.places.internal.zztn zztnVar) {
        this.zza = zztnVar;
        java.util.Objects.requireNonNull(zztpVar);
        this.zzb = zztpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().remove(this.zza);
    }
}
