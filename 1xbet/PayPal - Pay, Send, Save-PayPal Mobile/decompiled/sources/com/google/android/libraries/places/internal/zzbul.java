package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzbul implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zza;

    zzbul(com.google.android.libraries.places.internal.zzbvr zzbvrVar) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zza = zzbvrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
        zzbvrVar.zzW().zza(2, "Entering SHUTDOWN state");
        zzbvrVar.zzB().zza(com.google.android.libraries.places.internal.zzbjn.SHUTDOWN);
    }
}
