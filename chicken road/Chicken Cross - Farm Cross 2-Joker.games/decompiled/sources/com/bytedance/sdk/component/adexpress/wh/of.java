package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;

/* loaded from: classes4.dex */
public class of extends FrameLayout {
    private float gm;
    private float kj;
    private float oo;
    LinearLayout pcc;
    private double qf;
    LinearLayout sf;
    private Drawable vj;
    private Drawable wh;
    private static final int vy = (com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf("", 0.0f, true)[1] / 2) + 1;
    private static final int ork = (com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf("", 0.0f, true)[1] / 2) + 3;

    public of(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pcc = new LinearLayout(getContext());
        this.sf = new LinearLayout(getContext());
        this.pcc.setOrientation(0);
        this.pcc.setGravity(GravityCompat.START);
        this.sf.setOrientation(0);
        this.sf.setGravity(GravityCompat.START);
        this.vj = com.bytedance.sdk.component.utils.tz.gm(context, "tt_star_thick");
        this.wh = com.bytedance.sdk.component.utils.tz.gm(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.vj;
    }

    public Drawable getStarFillDrawable() {
        return this.wh;
    }

    public void pcc(double d, int i, int i2, int i3) {
        float f = i2;
        this.gm = (int) com.bytedance.sdk.component.adexpress.oo.qf.gm(getContext(), f);
        this.oo = (int) com.bytedance.sdk.component.adexpress.oo.qf.gm(getContext(), f);
        this.qf = d;
        this.kj = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.sf.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.pcc.addView(starImageView2);
        }
        addView(this.pcc);
        addView(this.sf);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.gm, (int) this.oo));
        imageView.setPadding(1, vy, 1, ork);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.pcc.measure(i, i2);
        double d = this.qf;
        float f = this.gm;
        this.sf.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d) * f) + 1.0f + ((f - 2.0f) * (d - ((int) d)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.pcc.getMeasuredHeight(), 1073741824));
        if (this.kj > 0.0f) {
            this.pcc.setPadding(0, ((int) (r7.getMeasuredHeight() - this.kj)) / 2, 0, 0);
            this.sf.setPadding(0, ((int) (this.pcc.getMeasuredHeight() - this.kj)) / 2, 0, 0);
        }
    }
}
