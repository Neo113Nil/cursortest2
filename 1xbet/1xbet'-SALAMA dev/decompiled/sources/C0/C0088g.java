package C0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: C0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0088g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0089h f1263a;

    public C0088g(C0089h c0089h) {
        this.f1263a = c0089h;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0089h c0089h = this.f1263a;
        c0089h.f1267b.setAlpha(iFloatValue);
        c0089h.f1268c.setAlpha(iFloatValue);
        c0089h.f1278n.invalidate();
    }
}
