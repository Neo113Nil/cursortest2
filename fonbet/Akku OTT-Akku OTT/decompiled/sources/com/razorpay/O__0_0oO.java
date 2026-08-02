package com.razorpay;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes4.dex */
class O__0_0oO extends Animation {
    private View $O0Oo$oo0o;
    private int O$$$__o0Oo;
    private int _$O0_o;

    public O__0_0oO(View view, int i) {
        this.$O0Oo$oo0o = view;
        this.O$$$__o0Oo = i;
        this._$O0_o = view.getWidth();
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.$O0Oo$oo0o.getLayoutParams().width = this._$O0_o + ((int) ((this.O$$$__o0Oo - r3) * f));
        this.$O0Oo$oo0o.requestLayout();
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
