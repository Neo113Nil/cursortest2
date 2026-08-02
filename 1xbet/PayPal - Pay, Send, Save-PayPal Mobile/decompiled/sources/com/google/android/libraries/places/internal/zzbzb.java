package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbzb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzc zza;

    zzbzb(com.google.android.libraries.places.internal.zzbzc zzbzcVar) {
        java.util.Objects.requireNonNull(zzbzcVar);
        this.zza = zzbzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zza.zzb;
        if (zzbzfVar.zzad()) {
            return;
        }
        zzbzfVar.zzY().zzd();
    }
}
