package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.m;

/* loaded from: classes8.dex */
final class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m.g f45013a;

    n(m.g gVar) {
        this.f45013a = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f45013a.c(valueAnimator.getAnimatedFraction());
    }
}
