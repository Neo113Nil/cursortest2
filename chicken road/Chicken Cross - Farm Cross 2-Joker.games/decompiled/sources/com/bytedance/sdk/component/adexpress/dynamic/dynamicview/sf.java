package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes4.dex */
public class sf extends GradientDrawable {
    protected Path pcc;
    private final Paint sf;

    public sf() {
        this.pcc = new Path();
        Paint paint = new Paint(1);
        this.sf = paint;
        paint.setColor(-1);
    }

    public sf(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.pcc = new Path();
        Paint paint = new Paint(1);
        this.sf = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.pcc;
        if (path == null || path.isEmpty()) {
            pcc(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.sf, 31);
        pcc(canvas);
        this.sf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.pcc, this.sf);
        this.sf.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    protected void pcc(Canvas canvas) {
        super.draw(canvas);
    }

    public void pcc(int i, int i2, int i3, int i4) {
        this.pcc.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }
}
