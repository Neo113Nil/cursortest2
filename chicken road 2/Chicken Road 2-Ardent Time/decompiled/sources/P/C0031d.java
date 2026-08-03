package P;

/* renamed from: P.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1243a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P.C0033f f1244b;

    public C0031d(P.C0033f c0033f) {
        this.f1244b = c0033f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.f1243a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.f1243a) {
            this.f1243a = false;
            return;
        }
        P.C0033f c0033f = this.f1244b;
        if (((java.lang.Float) c0033f.f1267u.getAnimatedValue()).floatValue() == 0.0f) {
            c0033f.f1268v = 0;
            c0033f.e(0);
        } else {
            c0033f.f1268v = 2;
            c0033f.f1261n.invalidate();
        }
    }
}
