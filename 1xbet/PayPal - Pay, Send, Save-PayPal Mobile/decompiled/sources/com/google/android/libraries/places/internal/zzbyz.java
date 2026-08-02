package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyz implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzd zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzc zzb;

    zzbyz(com.google.android.libraries.places.internal.zzbzc zzbzcVar, com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        this.zza = zzbzdVar;
        java.util.Objects.requireNonNull(zzbzcVar);
        this.zzb = zzbzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzx(this.zza);
    }
}
