package com.bytedance.adsdk.ugeno.pcc;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes4.dex */
public class kj implements qf {
    private float gm;
    private float oo;
    private View pcc;
    private float sf;
    private float vj;
    private float wh;

    public kj(View view) {
        this.pcc = view;
    }

    public void pcc(float f) {
        View view = this.pcc;
        if (view == null) {
            return;
        }
        this.sf = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }

    public float pcc() {
        return this.sf;
    }

    public void sf(float f) {
        View view = this.pcc;
        if (view == null) {
            return;
        }
        this.gm = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRipple() {
        return this.gm;
    }

    public void gm(float f) {
        View view = this.pcc;
        if (view == null) {
            return;
        }
        this.oo = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getShine() {
        return this.oo;
    }

    public void oo(float f) {
        this.vj = f;
        this.pcc.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getStretch() {
        return this.vj;
    }

    public void vj(float f) {
        this.wh = f;
        this.pcc.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRubIn() {
        return this.wh;
    }

    public void pcc(int i) {
        View view = this.pcc;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }
}
