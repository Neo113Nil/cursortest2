package androidx.fragment.app;

import P.ViewTreeObserverOnPreDrawListenerC0368y;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f9302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9305d;

    public B(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.f9305d = true;
        this.f9302a = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f9305d = true;
        if (this.f9303b) {
            return !this.f9304c;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f9303b = true;
            ViewTreeObserverOnPreDrawListenerC0368y.a(this.f9302a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f9303b;
        ViewGroup viewGroup = this.f9302a;
        if (z4 || !this.f9305d) {
            viewGroup.endViewTransition(null);
            this.f9304c = true;
        } else {
            this.f9305d = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f7) {
        this.f9305d = true;
        if (this.f9303b) {
            return !this.f9304c;
        }
        if (!super.getTransformation(j, transformation, f7)) {
            this.f9303b = true;
            ViewTreeObserverOnPreDrawListenerC0368y.a(this.f9302a, this);
        }
        return true;
    }
}
