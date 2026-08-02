package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlIIIIIIl extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ java.lang.Runnable llIIlIlIIl;

    public lIlIIIIIIl(java.lang.Runnable runnable) {
        this.llIIlIlIIl = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.llIIlIlIIl;
        if (runnable != null) {
            runnable.run();
        }
    }
}
