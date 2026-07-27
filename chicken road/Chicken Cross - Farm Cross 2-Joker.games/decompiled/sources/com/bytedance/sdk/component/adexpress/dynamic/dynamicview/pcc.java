package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes4.dex */
public class pcc extends sf {
    private final Bitmap gm;
    private final Rect sf = new Rect();
    private final Paint oo = new Paint(1);

    public pcc(Bitmap bitmap, sf sfVar) {
        this.gm = bitmap;
        if (sfVar != null) {
            this.pcc = sfVar.pcc;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        int width = rect.width();
        int width2 = this.gm.getWidth();
        int height2 = this.gm.getHeight();
        this.sf.set(0, 0, width2, height2);
        if (height2 >= height && width2 >= width) {
            if (width2 > width) {
                this.sf.left = (width2 - width) / 2;
                Rect rect2 = this.sf;
                rect2.right = rect2.left + width;
            }
            if (height2 > height) {
                this.sf.top = (height2 - height) / 2;
                Rect rect3 = this.sf;
                rect3.bottom = rect3.top + height;
                return;
            }
            return;
        }
        float f = height;
        float f2 = f * 1.0f;
        float f3 = height2;
        float f4 = f2 / f3;
        float f5 = width;
        float f6 = 1.0f * f5;
        float f7 = width2;
        if (Math.max(f4, f6 / f7) > f4) {
            int i = (int) ((f2 / f5) * f7);
            this.sf.top = (height2 - i) / 2;
            Rect rect4 = this.sf;
            rect4.bottom = rect4.top + i;
            return;
        }
        int i2 = (int) ((f6 / f) * f3);
        this.sf.left = (width2 - i2) / 2;
        Rect rect5 = this.sf;
        rect5.right = rect5.left + i2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf
    protected void pcc(Canvas canvas) {
        canvas.drawBitmap(this.gm, this.sf, getBounds(), this.oo);
    }
}
