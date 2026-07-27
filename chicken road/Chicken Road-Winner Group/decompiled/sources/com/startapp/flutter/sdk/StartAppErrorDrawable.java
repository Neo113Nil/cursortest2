package com.startapp.flutter.sdk;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* loaded from: classes.dex */
class StartAppErrorDrawable extends Drawable {
    private final float oneDp;
    private final Paint paintRect;
    private final Paint paintText;
    private final String text;
    private final Rect textBounds;

    public StartAppErrorDrawable(Resources resources, String str) {
        this.text = str;
        float applyDimension = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.oneDp = applyDimension;
        Paint paint = new Paint();
        this.paintRect = paint;
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(8.0f * applyDimension);
        paint.setPathEffect(new DashPathEffect(new float[]{16.0f * applyDimension, applyDimension * 4.0f}, 0.0f));
        Paint paint2 = new Paint();
        this.paintText = paint2;
        paint2.setColor(-65536);
        this.textBounds = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.paintText.setTextSize(Math.min(this.oneDp * 20.0f, bounds.height() / 3.0f));
        Paint paint = this.paintText;
        String str = this.text;
        paint.getTextBounds(str, 0, str.length(), this.textBounds);
        canvas.drawRect(0.0f, 0.0f, bounds.width(), bounds.height(), this.paintRect);
        canvas.drawText(this.text, (bounds.width() - this.textBounds.width()) / 2.0f, (this.textBounds.height() + bounds.height()) / 2.0f, this.paintText);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
