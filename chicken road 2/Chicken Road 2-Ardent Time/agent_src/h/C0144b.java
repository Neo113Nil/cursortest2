package h;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f3119a;

    public C0144b(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3119a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f3119a;
        actionBarOverlayLayout.t = null;
        actionBarOverlayLayout.f2013j = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f3119a;
        actionBarOverlayLayout.t = null;
        actionBarOverlayLayout.f2013j = false;
    }
}
