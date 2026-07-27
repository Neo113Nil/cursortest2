package com.bytedance.sdk.component.adexpress.wh;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes4.dex */
public class nac extends View {
    private ValueAnimator gm;
    private float kj;
    private ValueAnimator oo;
    private int ork;
    private float pcc;
    private float qf;
    private float sf;
    private Paint vj;
    private Animator.AnimatorListener vy;
    private long wh;

    public nac(Context context, int i) {
        super(context);
        this.wh = 300L;
        this.qf = 0.0f;
        this.ork = i;
        pcc();
    }

    public void pcc() {
        Paint paint = new Paint(1);
        this.vj = paint;
        paint.setStyle(Paint.Style.FILL);
        this.vj.setColor(this.ork);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.pcc = i / 2.0f;
        this.sf = i2 / 2.0f;
        this.kj = (float) (Math.hypot(i, i2) / 2.0d);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.pcc, this.sf, this.qf, this.vj);
    }

    public void sf() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.kj);
        this.gm = ofFloat;
        ofFloat.setDuration(this.wh);
        this.gm.setInterpolator(new LinearInterpolator());
        this.gm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.wh.nac.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                nac.this.qf = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nac.this.invalidate();
            }
        });
        this.gm.start();
    }

    public void gm() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.kj, 0.0f);
        this.oo = ofFloat;
        ofFloat.setDuration(this.wh);
        this.oo.setInterpolator(new LinearInterpolator());
        this.oo.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.wh.nac.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                nac.this.qf = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nac.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.vy;
        if (animatorListener != null) {
            this.oo.addListener(animatorListener);
        }
        this.oo.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.vy = animatorListener;
    }
}
