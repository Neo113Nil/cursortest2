package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyw implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzd zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbyx zzb;

    zzbyw(com.google.android.libraries.places.internal.zzbyx zzbyxVar, com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        this.zza = zzbzdVar;
        java.util.Objects.requireNonNull(zzbyxVar);
        this.zzb = zzbyxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzb.zzx(this.zza);
    }
}
