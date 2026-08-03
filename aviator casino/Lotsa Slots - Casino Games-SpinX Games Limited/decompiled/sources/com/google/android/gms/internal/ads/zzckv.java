package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzckv implements android.view.View.OnAttachStateChangeListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcdn zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzclf zzb;

    zzckv(com.google.android.gms.internal.ads.zzclf zzclfVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        this.zza = zzcdnVar;
        java.util.Objects.requireNonNull(zzclfVar);
        this.zzb = zzclfVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
