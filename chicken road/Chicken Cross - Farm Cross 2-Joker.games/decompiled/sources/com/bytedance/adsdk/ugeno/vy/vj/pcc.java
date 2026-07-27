package com.bytedance.adsdk.ugeno.vy.vj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.qf.kj;

/* loaded from: classes4.dex */
public class pcc extends FrameLayout {
    private double gm;
    private oo kj;
    private float oo;
    private float pcc;
    private Context qf;
    private float sf;
    private LinearLayout vj;
    private LinearLayout wh;

    public pcc(Context context) {
        super(context);
        this.qf = context;
        this.vj = new LinearLayout(context);
        this.wh = new LinearLayout(context);
        this.vj.setOrientation(0);
        this.vj.setGravity(GravityCompat.START);
        this.wh.setOrientation(0);
        this.wh.setGravity(GravityCompat.START);
    }

    public void pcc(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.vj.removeAllViews();
        this.wh.removeAllViews();
        this.pcc = (int) kj.pcc(this.qf, f);
        this.sf = (int) kj.pcc(this.qf, f);
        this.gm = d;
        this.oo = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            pcc(starImageView, "tt_ugen_rating_star");
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.wh.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            pcc(starImageView2, "tt_ugen_rating_star");
            starImageView2.setColorFilter(i2);
            this.vj.addView(starImageView2);
        }
        addView(this.vj);
        addView(this.wh);
        requestLayout();
    }

    public void pcc(ImageView imageView, String str) {
        imageView.setImageResource(com.bytedance.adsdk.ugeno.qf.oo.sf(this.qf, str));
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.pcc, (int) this.sf);
        layoutParams.leftMargin = (int) this.oo;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) this.oo;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.pcc(i, i2);
        }
        super.onMeasure(i, i2);
        this.vj.measure(i, i2);
        double floor = Math.floor(this.gm);
        this.wh.measure(View.MeasureSpec.makeMeasureSpec((int) (((r0 + r0 + r2) * floor) + this.oo + ((this.gm - floor) * this.pcc)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.vj.getMeasuredHeight(), 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.pcc(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.kj;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }

    public void pcc(oo ooVar) {
        this.kj = ooVar;
    }
}
