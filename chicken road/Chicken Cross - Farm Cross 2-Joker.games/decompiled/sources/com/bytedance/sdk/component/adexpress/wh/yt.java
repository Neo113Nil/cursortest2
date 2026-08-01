package com.bytedance.sdk.component.adexpress.wh;

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
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class yt extends ImageView {
    private int gm;
    private Matrix oo;
    private Paint pcc;
    private int sf;

    public yt(Context context) {
        this(context, null);
    }

    public yt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public yt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.sf = 25;
        this.gm = 25;
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setAntiAlias(true);
        this.pcc.setFilterBitmap(true);
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

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable != null) {
            Bitmap pcc = pcc(drawable);
            if (pcc != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(pcc, tileMode, tileMode);
                float max = (pcc.getWidth() == getWidth() && pcc.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / pcc.getWidth(), (getHeight() * 1.0f) / pcc.getHeight());
                this.oo.setScale(max, max);
                bitmapShader.setLocalMatrix(this.oo);
                this.pcc.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.sf, this.gm, this.pcc);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
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
