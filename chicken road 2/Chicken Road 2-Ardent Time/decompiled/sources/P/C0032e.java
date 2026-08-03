package P;

/* renamed from: P.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P.C0033f f1245a;

    public C0032e(P.C0033f c0033f) {
        this.f1245a = c0033f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int floatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        P.C0033f c0033f = this.f1245a;
        c0033f.f1249b.setAlpha(floatValue);
        c0033f.f1250c.setAlpha(floatValue);
        c0033f.f1261n.invalidate();
    }
}
