package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class AnimatingProgressBar extends ProgressBar {

    /* renamed from: c, reason: collision with root package name */
    private static final AccelerateDecelerateInterpolator f3387c = new AccelerateDecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    private ValueAnimator f3388a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3389b;

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3389b = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f3388a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i3) {
        if (!this.f3389b) {
            super.setProgress(i3);
            return;
        }
        ValueAnimator valueAnimator = this.f3388a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i3) {
                return;
            }
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i3);
            this.f3388a = ofInt;
            ofInt.setInterpolator(f3387c);
            this.f3388a.addUpdateListener(new a(this));
        }
        this.f3388a.setIntValues(getProgress(), i3);
        this.f3388a.start();
    }

    public final void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f3388a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
