package com.bytedance.sdk.component.adexpress.wh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes4.dex */
public class dax extends View {
    private RectF gm;
    private float oo;
    private Context pcc;
    private boolean qf;
    private Paint sf;
    private ValueAnimator vj;
    private int wh;

    public dax(Context context) {
        super(context);
        this.wh = 1500;
        this.pcc = context;
        Paint paint = new Paint();
        this.sf = paint;
        paint.setAntiAlias(true);
        this.sf.setStyle(Paint.Style.STROKE);
        this.sf.setStrokeWidth(10.0f);
        this.sf.setColor(Color.parseColor("#80FFFFFF"));
        this.gm = new RectF();
    }

    public void pcc() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.vj = ofFloat;
        ofFloat.setDuration(this.wh);
        this.vj.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.wh.dax.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                dax.this.oo = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dax.this.requestLayout();
            }
        });
        this.vj.start();
    }

    public void sf() {
        ValueAnimator valueAnimator = this.vj;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void gm() {
        this.qf = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.wh = i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.qf) {
            return;
        }
        canvas.drawArc(this.gm, 270.0f, this.oo, false, this.sf);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.gm.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
