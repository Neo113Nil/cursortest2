package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbwr implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbxc zza;

    zzbwr(com.google.android.libraries.places.internal.zzbxc zzbxcVar) {
        java.util.Objects.requireNonNull(zzbxcVar);
        this.zza = zzbxcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbxc zzbxcVar = this.zza;
        zzbxcVar.zzn(null);
        zzbxcVar.zzk().zzc();
        zzbxcVar.zzd();
    }
}
