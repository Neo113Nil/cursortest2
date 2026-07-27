package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;

/* loaded from: classes4.dex */
public class nac extends com.bytedance.sdk.openadsdk.core.wh.oo {
    private int gm;
    private final Matrix oo;
    private final Paint pcc;
    private int sf;
    private final RectF vj;
    private BitmapShader wh;

    public nac(Context context) {
        this(context, null);
    }

    public nac(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nac(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.sf = 25;
        this.gm = 25;
        this.vj = new RectF();
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.oo = new Matrix();
    }

    public void setXRound(int i) {
        this.sf = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.gm = i;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.vj.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap pcc;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.wh == null && (pcc = pcc(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.wh = new BitmapShader(pcc, tileMode, tileMode);
            float max = (pcc.getWidth() == getWidth() && pcc.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / pcc.getWidth(), (getHeight() * 1.0f) / pcc.getHeight());
            this.oo.setScale(max, max);
            this.wh.setLocalMatrix(this.oo);
        }
        BitmapShader bitmapShader = this.wh;
        if (bitmapShader != null) {
            this.pcc.setShader(bitmapShader);
            canvas.drawRoundRect(this.vj, this.sf, this.gm, this.pcc);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.wh = null;
    }

    private Bitmap pcc(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return createBitmap;
    }
}
