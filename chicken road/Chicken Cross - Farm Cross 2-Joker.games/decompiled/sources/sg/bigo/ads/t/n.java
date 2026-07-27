package sg.bigo.ads.t;

import android.view.animation.Animation;

/* loaded from: classes3.dex */
public final class n extends sg.bigo.ads.V.a {
    public final /* synthetic */ v f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar) {
        super(1.0f, 0.0f);
        this.f = vVar;
    }

    @Override // sg.bigo.ads.V.a
    public final void a(float f, float f2, int i, int i2) {
        this.f.b((int) (i - f), (int) (i2 - f2));
    }

    @Override // sg.bigo.ads.V.a, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.f.J0.set(true);
    }
}
