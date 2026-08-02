package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIlllIIII implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.microblink.blinkid.secured.lIIlllIlll llIIlIlIIl;

    public IIIlllIIII(com.microblink.blinkid.secured.lIIlllIlll liilllilll) {
        this.llIIlIlIIl = liilllilll;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        com.microblink.blinkid.view.viewfinder.quadview.QuadViewAnimationListener quadViewAnimationListener = this.llIIlIlIIl.lllIIlIIlI;
        if (quadViewAnimationListener != null) {
            quadViewAnimationListener.onAnimationEnd();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.microblink.blinkid.view.viewfinder.quadview.QuadViewAnimationListener quadViewAnimationListener = this.llIIlIlIIl.lllIIlIIlI;
        if (quadViewAnimationListener != null) {
            quadViewAnimationListener.onAnimationEnd();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        com.microblink.blinkid.view.viewfinder.quadview.QuadViewAnimationListener quadViewAnimationListener = this.llIIlIlIIl.lllIIlIIlI;
        if (quadViewAnimationListener != null) {
            quadViewAnimationListener.onAnimationEnd();
            this.llIIlIlIIl.lllIIlIIlI.onAnimationStart();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        com.microblink.blinkid.view.viewfinder.quadview.QuadViewAnimationListener quadViewAnimationListener = this.llIIlIlIIl.lllIIlIIlI;
        if (quadViewAnimationListener != null) {
            quadViewAnimationListener.onAnimationStart();
        }
    }
}
