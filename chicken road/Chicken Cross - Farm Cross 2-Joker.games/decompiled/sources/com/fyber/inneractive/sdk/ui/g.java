package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;

/* loaded from: classes4.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAsmoothProgressBar f5937a;

    public g(IAsmoothProgressBar iAsmoothProgressBar) {
        this.f5937a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
