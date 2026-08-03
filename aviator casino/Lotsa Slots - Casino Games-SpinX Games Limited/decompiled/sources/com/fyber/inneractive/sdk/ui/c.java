package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f4275a;
    public final /* synthetic */ com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal b;

    public c(com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal, android.animation.AnimatorSet animatorSet) {
        this.b = fyberAdIdentifierLocal;
        this.f4275a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal = this.b;
        if (fyberAdIdentifierLocal.o) {
            fyberAdIdentifierLocal.m.setImageResource(com.fyber.inneractive.sdk.R.drawable.ia_fyber_info_button);
            com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.b;
            com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal.a(fyberAdIdentifierLocal2.m, fyberAdIdentifierLocal2.g);
        } else {
            android.graphics.Bitmap bitmap = fyberAdIdentifierLocal.r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.m.setImageResource(com.fyber.inneractive.sdk.R.drawable.ia_digital_turbine_logo);
            }
            com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal.a(this.b.m, null);
        }
        this.f4275a.start();
        this.b.p = this.f4275a;
    }
}
