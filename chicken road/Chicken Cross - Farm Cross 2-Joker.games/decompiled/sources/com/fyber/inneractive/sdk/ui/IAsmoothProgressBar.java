package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* loaded from: classes4.dex */
public class IAsmoothProgressBar extends ProgressBar {
    public static final AccelerateDecelerateInterpolator c = new AccelerateDecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f5928a;
    public ValueAnimator b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f5928a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        ValueAnimator valueAnimator = this.f5928a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f5928a;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
            this.f5928a = ofInt;
            ofInt.setInterpolator(c);
            this.f5928a.addUpdateListener(new g(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.f5928a.start();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.b;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
            this.b = ofInt;
            ofInt.setInterpolator(c);
            this.b.addUpdateListener(new h(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.b.start();
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
