package com.bytedance.sdk.openadsdk.core.hc.sf.oo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.oo;

/* loaded from: classes4.dex */
public class pcc extends View {
    private float gbb;
    private RectF gm;
    private int hc;
    private int kj;
    private int oo;
    private String ork;
    private Paint pcc;
    private float qf;
    private Paint sf;
    private ValueAnimator tmg;
    private oo vh;
    private int vj;
    private int vy;
    private float wh;

    public pcc(Context context) {
        super(context);
        this.oo = com.bytedance.adsdk.ugeno.qf.pcc.pcc("#FFD813");
        this.vj = com.bytedance.adsdk.ugeno.qf.pcc.pcc("rgba(0, 0, 0, 0.5)");
        this.wh = 3.0f;
        this.qf = 0.0f;
        this.kj = 0;
        this.vy = 100;
        this.ork = "line";
        this.hc = 1000;
        setBackgroundColor(0);
        pcc();
    }

    private void pcc() {
        Paint paint = new Paint(1);
        this.pcc = paint;
        paint.setColor(this.vj);
        this.pcc.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.sf = paint2;
        paint2.setColor(this.oo);
        this.sf.setStyle(Paint.Style.FILL);
        this.gm = new RectF();
        this.gbb = this.kj;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[0]);
        this.tmg = ofFloat;
        ofFloat.setDuration(this.hc);
        this.tmg.setInterpolator(new LinearInterpolator());
        this.tmg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                pcc.this.gbb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcc.this.invalidate();
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.ork, "ring") || TextUtils.equals(this.ork, "ring_reverse")) {
            pcc(canvas);
        } else {
            sf(canvas);
        }
    }

    private void pcc(Canvas canvas) {
        float f;
        int i;
        float f2 = this.wh / 2.0f;
        this.gm.set(f2, f2, getWidth() - f2, getHeight() - f2);
        this.pcc.setStyle(Paint.Style.STROKE);
        this.pcc.setStrokeWidth(this.wh);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f2, this.pcc);
        if (TextUtils.equals(this.ork, "ring_reverse")) {
            f = this.gbb * (-360.0f);
            i = this.vy;
        } else {
            f = this.gbb * 360.0f;
            i = this.vy;
        }
        float f3 = f / i;
        this.sf.setStyle(Paint.Style.STROKE);
        this.sf.setStrokeWidth(this.wh);
        if (this.qf <= 0.0f) {
            this.sf.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.sf.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.gm, -90.0f, f3, false, this.sf);
    }

    private void sf(Canvas canvas) {
        this.pcc.setStyle(Paint.Style.FILL);
        float width = getWidth();
        float f = this.wh;
        float f2 = this.qf;
        canvas.drawRoundRect(0.0f, 0.0f, width, f, f2, f2, this.pcc);
        float width2 = (getWidth() * this.gbb) / this.vy;
        this.sf.setStyle(Paint.Style.FILL);
        if (TextUtils.equals(this.ork, "line_reverse")) {
            float width3 = getWidth();
            float f3 = this.wh;
            float f4 = this.qf;
            canvas.drawRoundRect(getWidth() - width2, 0.0f, width3, f3, f4, f4, this.sf);
            return;
        }
        float f5 = this.wh;
        float f6 = this.qf;
        canvas.drawRoundRect(0.0f, 0.0f, width2, f5, f6, f6, this.sf);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        oo ooVar = this.vh;
        if (ooVar != null) {
            int[] pcc = ooVar.pcc(i, i2);
            super.onMeasure(pcc[0], pcc[1]);
        } else {
            super.onMeasure(i, i2);
        }
        if (TextUtils.equals(this.ork, "ring") || TextUtils.equals(this.ork, "ring_reverse")) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(min, min);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.wh);
        }
        oo ooVar2 = this.vh;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    public void setProgress(int i) {
        int min = Math.min(i, this.vy);
        this.kj = min;
        if (min < 0) {
            this.kj = 0;
        }
        ValueAnimator valueAnimator = this.tmg;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.tmg.setFloatValues(this.gbb, this.kj);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.gbb + " progress=" + i);
            this.tmg.start();
        }
    }

    public pcc pcc(int i) {
        this.sf.setColor(i);
        return this;
    }

    public pcc sf(int i) {
        this.pcc.setColor(i);
        return this;
    }

    public pcc pcc(float f) {
        this.wh = f;
        invalidate();
        return this;
    }

    public pcc sf(float f) {
        this.qf = f;
        return this;
    }

    public void setMaxProgress(int i) {
        this.vy = i;
        invalidate();
    }

    public pcc pcc(String str) {
        this.ork = str;
        return this;
    }

    public int getProgress() {
        return this.kj;
    }

    public int getMaxProgress() {
        return this.vy;
    }

    public void pcc(oo ooVar) {
        this.vh = ooVar;
    }

    public void setAnimationDuration(int i) {
        this.hc = i;
        this.tmg.setDuration(i);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.tmg;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
