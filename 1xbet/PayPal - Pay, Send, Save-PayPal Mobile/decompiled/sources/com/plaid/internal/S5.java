package com.plaid.internal;

/* loaded from: classes16.dex */
public final class S5 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f5920a;
    public final /* synthetic */ com.plaid.internal.P5 b;

    public S5(android.view.View view, com.plaid.internal.P5 p5) {
        this.f5920a = view;
        this.b = p5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        this.f5920a.removeOnAttachStateChangeListener(this);
        com.plaid.internal.P5 p5 = this.b;
        p5.post(new com.plaid.internal.R5(p5));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
    }
}
