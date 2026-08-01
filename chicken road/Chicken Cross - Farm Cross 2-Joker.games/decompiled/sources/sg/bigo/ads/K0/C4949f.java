package sg.bigo.ads.K0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* renamed from: sg.bigo.ads.K0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4949f extends ChangeBounds implements ValueAnimator.AnimatorUpdateListener {
    public void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
    }

    public void a(Object obj, Object obj2) {
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        try {
            a(transitionValues, transitionValues2);
        } catch (Exception unused) {
        }
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (createAnimator instanceof ValueAnimator) {
            ((ValueAnimator) createAnimator).addUpdateListener(this);
        }
        return createAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
            a(objectAnimator.getTarget(), objectAnimator.getAnimatedValue());
        }
    }
}
