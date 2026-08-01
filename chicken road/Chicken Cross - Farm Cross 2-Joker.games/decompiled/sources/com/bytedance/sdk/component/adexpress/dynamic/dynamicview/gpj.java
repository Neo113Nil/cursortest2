package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public class gpj extends Drawable {
    private int gm;
    private RectF oo;
    private Paint pcc;
    private int sf;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public gpj(int i, int i2) {
        this.gm = i;
        this.sf = i2;
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setColor(0);
        this.pcc.setAntiAlias(true);
        this.pcc.setShadowLayer(i2, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.pcc.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.sf;
        this.oo = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.oo;
        int i = this.gm;
        canvas.drawRoundRect(rectF, i, i, this.pcc);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.pcc.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.pcc.setColorFilter(colorFilter);
    }
}
