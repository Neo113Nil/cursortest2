package com.bytedance.sdk.openadsdk.jr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes4.dex */
public class pcc extends View {
    private float gm;
    private final Paint pcc;
    private float sf;

    public pcc(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void setProgress(float f) {
        this.gm = getWidth() * f;
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.sf = (1.0f * f) / 2.0f;
        this.pcc.setStrokeWidth(f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.gm;
        if (f > 0.0f) {
            float f2 = this.sf;
            canvas.drawLine(0.0f, f2, f, f2, this.pcc);
        }
    }
}
