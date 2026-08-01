package sg.bigo.ads.n;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sg.bigo.ads.n.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5380h0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f13171a;
    public final /* synthetic */ Animator.AnimatorListener b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ U0 f;

    public C5380h0(U0 u0, AtomicBoolean atomicBoolean, C5376f0 c5376f0, long j, long j2, int i) {
        this.f = u0;
        this.f13171a = atomicBoolean;
        this.b = c5376f0;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f13171a.get()) {
            return;
        }
        if (this.f.N.get()) {
            this.f13171a.set(true);
            valueAnimator.removeListener(this.b);
            valueAnimator.cancel();
            this.f.O.add(new RunnableC5378g0(this));
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            this.f.C.scrollTo(((Integer) animatedValue).intValue() + this.e, this.f.C.getScrollY());
        }
    }
}
