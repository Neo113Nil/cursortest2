package sg.bigo.ads.v;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final class q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.E0.k f13354a;
    public final /* synthetic */ u b;

    public q(u uVar, m mVar) {
        this.b = uVar;
        this.f13354a = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            int intValue = ((Integer) animatedValue).intValue();
            sg.bigo.ads.E0.k kVar = this.f13354a;
            if (kVar != null) {
                kVar.b(intValue);
            }
            this.b.getClass();
        }
    }
}
