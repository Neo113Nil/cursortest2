package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzf zza;

    zzbyk(com.google.android.libraries.places.internal.zzbzf zzbzfVar) {
        java.util.Objects.requireNonNull(zzbzfVar);
        this.zza = zzbzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zza;
        if (zzbzfVar.zzad()) {
            return;
        }
        zzbzfVar.zzY().zzd();
    }
}
