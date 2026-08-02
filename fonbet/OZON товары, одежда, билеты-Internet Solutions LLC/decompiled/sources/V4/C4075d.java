package V4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.Y;

/* renamed from: V4.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4075d extends E {

    /* renamed from: V4.d$a */
    private static class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f28025a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28026b = false;

        a(View view) {
            this.f28025a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f28025a;
            y.e(view, 1.0f);
            if (this.f28026b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i11 = Y.f42258g;
            View view = this.f28025a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f28026b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public C4075d(int i11) {
        e(i11);
    }

    private ObjectAnimator f(View view, float f7, float f11) {
        if (f7 == f11) {
            return null;
        }
        y.e(view, f7);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y.f28073b, f11);
        ofFloat.addListener(new a(view));
        addListener(new C4074c(view));
        return ofFloat;
    }

    @Override // V4.E
    public final ObjectAnimator c(View view, s sVar) {
        Float f7;
        float floatValue = (sVar == null || (f7 = (Float) sVar.f28062a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f7.floatValue();
        return f(view, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
    }

    @Override // V4.E, V4.l
    public final void captureStartValues(@NonNull s sVar) {
        super.captureStartValues(sVar);
        sVar.f28062a.put("android:fade:transitionAlpha", Float.valueOf(y.b(sVar.f28063b)));
    }

    @Override // V4.E
    public final ObjectAnimator d(View view, s sVar) {
        y.c();
        Float f7 = (Float) sVar.f28062a.get("android:fade:transitionAlpha");
        return f(view, f7 != null ? f7.floatValue() : 1.0f, 0.0f);
    }
}
