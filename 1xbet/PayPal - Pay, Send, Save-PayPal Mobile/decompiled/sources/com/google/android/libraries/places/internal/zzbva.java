package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbva implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvb zzb;

    zzbva(com.google.android.libraries.places.internal.zzbvb zzbvbVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zza = zzbnpVar;
        java.util.Objects.requireNonNull(zzbvbVar);
        this.zzb = zzbvbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
