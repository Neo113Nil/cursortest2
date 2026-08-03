package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zza implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzb zza;

    zza(com.google.android.gms.ads.internal.util.zzb zzbVar) {
        java.util.Objects.requireNonNull(zzbVar);
        this.zza = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.util.zzb zzbVar = this.zza;
        zzbVar.zzc(java.lang.Thread.currentThread());
        zzbVar.zza();
    }
}
