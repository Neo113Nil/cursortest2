package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcgx implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzchb zzb;

    zzcgx(com.google.android.gms.internal.ads.zzchb zzchbVar, boolean z) {
        this.zza = z;
        java.util.Objects.requireNonNull(zzchbVar);
        this.zzb = zzchbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new java.lang.String[]{com.ironsource.C3023e8.k, java.lang.String.valueOf(this.zza)});
    }
}
