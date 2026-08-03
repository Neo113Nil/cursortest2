package com.inmobi.media;

/* loaded from: classes5.dex */
public final class So implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f4964a;
    public final /* synthetic */ android.view.ViewGroup b;
    public final /* synthetic */ android.view.ViewTreeObserver.OnWindowFocusChangeListener c;

    public So(android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener) {
        this.f4964a = viewGroup;
        this.b = viewGroup2;
        this.c = onWindowFocusChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.f4964a.removeOnAttachStateChangeListener(this);
        this.b.getViewTreeObserver().removeOnWindowFocusChangeListener(this.c);
    }
}
