package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal f4277a;

    public d(com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f4277a = fyberAdIdentifierLocal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f4277a;
        fyberAdIdentifierLocal.p = null;
        fyberAdIdentifierLocal.o = !fyberAdIdentifierLocal.o;
    }
}
