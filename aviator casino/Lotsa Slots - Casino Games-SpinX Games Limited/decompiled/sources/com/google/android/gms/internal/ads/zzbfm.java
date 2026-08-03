package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbfm implements java.lang.Runnable {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbfq zzb;

    zzbfm(com.google.android.gms.internal.ads.zzbfq zzbfqVar, android.view.View view) {
        this.zza = view;
        java.util.Objects.requireNonNull(zzbfqVar);
        this.zzb = zzbfqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
