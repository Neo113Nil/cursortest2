package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcln implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcef zza;
    final /* synthetic */ zzclx zzb;

    zzcln(zzclx zzclxVar, zzcef zzcefVar) {
        this.zza = zzcefVar;
        Objects.requireNonNull(zzclxVar);
        this.zzb = zzclxVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
