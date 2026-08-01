package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/* loaded from: classes4.dex */
public class jr extends com.bytedance.sdk.openadsdk.core.wh.kj {
    private int gm;
    private Paint pcc;
    private RectF sf;

    public jr(Context context) {
        this(context, null);
    }

    public jr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gm = 0;
        pcc();
    }

    private void pcc() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.pcc.setColor(Color.parseColor("#99333333"));
        this.pcc.setAntiAlias(true);
        this.pcc.setStrokeWidth(0.0f);
        this.sf = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.kj, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText("00");
            this.gm = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i3 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i3, measuredHeight);
            this.sf.set(0.0f, 0.0f, i3, measuredHeight);
            return;
        }
        this.sf.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.sf;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.sf.bottom / 2.0f, this.pcc);
        canvas.translate((this.sf.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}
