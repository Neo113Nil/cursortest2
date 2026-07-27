package sg.bigo.ads.m;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sg.bigo.ads.m.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5333l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f13090a;
    public final /* synthetic */ Animator.AnimatorListener b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ e0 f;

    public C5333l(e0 e0Var, AtomicBoolean atomicBoolean, C5331j c5331j, long j, long j2, int i) {
        this.f = e0Var;
        this.f13090a = atomicBoolean;
        this.b = c5331j;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f13090a.get()) {
            return;
        }
        if (this.f.x.get()) {
            this.f13090a.set(true);
            valueAnimator.removeListener(this.b);
            valueAnimator.cancel();
            this.f.y.add(new RunnableC5332k(this));
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            this.f.q.scrollTo(((Integer) animatedValue).intValue() + this.e, this.f.q.getScrollY());
        }
    }
}
