package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbxt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbxu zzb;

    zzbxt(com.google.android.gms.internal.ads.zzbxu zzbxuVar, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        java.util.Objects.requireNonNull(zzbxuVar);
        this.zzb = zzbxuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzb.zza(), this.zza, true, null);
    }
}
