package sg.bigo.ads.t;

import android.view.animation.Animation;

/* loaded from: classes3.dex */
public final class o extends sg.bigo.ads.V.a {
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ v g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, p pVar) {
        super(0.0f, 1.0f);
        this.g = vVar;
        this.f = pVar;
    }

    @Override // sg.bigo.ads.V.a
    public final void a(float f, float f2, int i, int i2) {
        this.g.b((int) (i - f), (int) (i2 - f2));
    }

    @Override // sg.bigo.ads.V.a, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
    }
}
