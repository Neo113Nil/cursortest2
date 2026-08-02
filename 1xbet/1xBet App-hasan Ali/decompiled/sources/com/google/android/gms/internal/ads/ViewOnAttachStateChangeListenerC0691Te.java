package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0691Te implements View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0758ad f11654k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1028gf f11655l;

    public ViewOnAttachStateChangeListenerC0691Te(C1028gf c1028gf, InterfaceC0758ad interfaceC0758ad) {
        this.f11654k = interfaceC0758ad;
        this.f11655l = c1028gf;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f11655l.Q(view, this.f11654k, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
