package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzbum implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zza;

    zzbum(com.google.android.libraries.places.internal.zzbvr zzbvrVar) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zza = zzbvrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
        if (zzbvrVar.zzO()) {
            return;
        }
        zzbvrVar.zzP(true);
        zzbvrVar.zzi();
    }
}
