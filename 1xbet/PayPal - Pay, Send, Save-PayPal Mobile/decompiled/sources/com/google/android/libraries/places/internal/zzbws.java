package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbws implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbxc zza;

    zzbws(com.google.android.libraries.places.internal.zzbxc zzbxcVar) {
        java.util.Objects.requireNonNull(zzbxcVar);
        this.zza = zzbxcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbxc zzbxcVar = this.zza;
        zzbxcVar.zzl(null);
        if (zzbxcVar.zzk().zzb()) {
            zzbxcVar.zzd();
        }
    }
}
