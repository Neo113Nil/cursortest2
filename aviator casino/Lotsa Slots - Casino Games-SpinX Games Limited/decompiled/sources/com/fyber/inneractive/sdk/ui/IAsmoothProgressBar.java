package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public class IAsmoothProgressBar extends android.widget.ProgressBar {
    public static final android.view.animation.AccelerateDecelerateInterpolator c = new android.view.animation.AccelerateDecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public android.animation.ValueAnimator f4271a;
    public android.animation.ValueAnimator b;

    public IAsmoothProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f4271a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        android.animation.ValueAnimator valueAnimator = this.f4271a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f4271a;
        if (valueAnimator2 == null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(getProgress(), i);
            this.f4271a = ofInt;
            ofInt.setInterpolator(c);
            this.f4271a.addUpdateListener(new com.fyber.inneractive.sdk.ui.g(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.f4271a.start();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i) {
        android.animation.ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.b;
        if (valueAnimator2 == null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(getProgress(), i);
            this.b = ofInt;
            ofInt.setInterpolator(c);
            this.b.addUpdateListener(new com.fyber.inneractive.sdk.ui.h(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.b.start();
    }

    public IAsmoothProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
