package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.n f4242a;

    public k(com.fyber.inneractive.sdk.renderers.n nVar) {
        this.f4242a = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        view.removeOnAttachStateChangeListener(this);
        view.removeOnLayoutChangeListener(this.f4242a.z);
    }
}
