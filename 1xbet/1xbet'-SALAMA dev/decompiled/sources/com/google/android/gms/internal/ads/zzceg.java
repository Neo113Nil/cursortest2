package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class zzceg implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbwy zza;
    final /* synthetic */ zzcej zzb;

    public zzceg(zzcej zzcejVar, zzbwy zzbwyVar) {
        this.zza = zzbwyVar;
        this.zzb = zzcejVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzaa(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
