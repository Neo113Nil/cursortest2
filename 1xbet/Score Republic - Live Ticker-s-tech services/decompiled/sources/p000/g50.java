package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g50 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: j */
    public final ViewGroup f2625j;

    /* JADX INFO: renamed from: k */
    public final View f2626k;

    /* JADX INFO: renamed from: l */
    public boolean f2627l;

    /* JADX INFO: renamed from: m */
    public boolean f2628m;

    /* JADX INFO: renamed from: n */
    public boolean f2629n;

    public g50(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2629n = true;
        this.f2625j = viewGroup;
        this.f2626k = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f2629n = true;
        if (this.f2627l) {
            return !this.f2628m;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f2627l = true;
            pu0.m3992a(this.f2625j, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f2627l;
        ViewGroup viewGroup = this.f2625j;
        if (z || !this.f2629n) {
            viewGroup.endViewTransition(this.f2626k);
            this.f2628m = true;
        } else {
            this.f2629n = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f2629n = true;
        if (this.f2627l) {
            return !this.f2628m;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f2627l = true;
            pu0.m3992a(this.f2625j, this);
        }
        return true;
    }
}
