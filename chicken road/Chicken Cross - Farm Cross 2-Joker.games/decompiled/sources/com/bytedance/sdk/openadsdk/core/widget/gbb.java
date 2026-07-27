package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public class gbb extends com.bytedance.sdk.openadsdk.core.wh.oo {
    private Paint pcc;
    private RectF sf;

    public gbb(Context context) {
        super(context);
        pcc();
    }

    private void pcc() {
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.pcc.setColor(Color.parseColor("#99333333"));
        this.pcc.setAntiAlias(true);
        this.pcc.setStrokeWidth(0.0f);
        this.sf = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.oo, android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.sf.right == getMeasuredWidth() && this.sf.bottom == getMeasuredHeight()) {
            return;
        }
        this.sf.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.sf;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.sf.bottom / 2.0f, this.pcc);
        super.onDraw(canvas);
    }
}
