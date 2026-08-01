package com.fyber.inneractive.sdk.renderers;

import android.view.View;

/* loaded from: classes4.dex */
public final class k implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f5899a;

    public k(n nVar) {
        this.f5899a = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.removeOnLayoutChangeListener(this.f5899a.z);
    }
}
