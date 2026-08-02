package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbon zza;

    zzcbb(com.google.android.libraries.places.internal.zzcbc zzcbcVar, com.google.android.libraries.places.internal.zzbon zzbonVar) {
        this.zza = zzbonVar;
        java.util.Objects.requireNonNull(zzcbcVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
