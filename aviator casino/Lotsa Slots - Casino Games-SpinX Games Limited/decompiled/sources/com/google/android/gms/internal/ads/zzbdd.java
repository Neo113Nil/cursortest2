package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbdd implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbde zza;

    zzbdd(com.google.android.gms.internal.ads.zzbde zzbdeVar) {
        java.util.Objects.requireNonNull(zzbdeVar);
        this.zza = zzbdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
