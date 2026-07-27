package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import sg.bigo.ads.N0.a;
import sg.bigo.ads.N0.b;

/* loaded from: classes3.dex */
public class RoundedImageView extends ImageView implements a {

    /* renamed from: a, reason: collision with root package name */
    public float f12714a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    private RectF getImageRectF() {
        float f;
        float f2;
        float f3;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = getDrawable();
        float f4 = 0.0f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float[] fArr = new float[9];
            Matrix imageMatrix = getImageMatrix();
            if (imageMatrix != null && !imageMatrix.isIdentity()) {
                imageMatrix.getValues(fArr);
            }
            float f5 = fArr[2];
            float f6 = fArr[5];
            float f7 = fArr[0];
            float f8 = fArr[4];
            float max = Float.isNaN(f5) ? 0.0f : Math.max(0.0f, f5);
            f3 = Float.isNaN(f6) ? 0.0f : Math.max(0.0f, f6);
            f = Math.min((Float.isNaN(f7) || f7 <= 0.0f) ? intrinsicWidth + max : (intrinsicWidth * f7) + max, measuredWidth);
            f2 = Math.min((Float.isNaN(f8) || f8 <= 0.0f) ? intrinsicHeight + f3 : (intrinsicHeight * f8) + f3, measuredHeight);
            f4 = max;
        } else {
            f = measuredWidth;
            f2 = measuredHeight;
            f3 = 0.0f;
        }
        return new RectF(f4, f3, f, f2);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Path clipPath = getClipPath();
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        super.draw(canvas);
        RectF imageRectF = getImageRectF();
        if (this.e > 0.0f && !imageRectF.isEmpty()) {
            Paint paint = new Paint();
            paint.setColor(this.f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.e);
            paint.setAntiAlias(true);
            float f = this.f12714a;
            canvas.drawRoundRect(imageRectF, f, f, paint);
        }
        canvas.restoreToCount(save);
    }

    @Override // sg.bigo.ads.N0.a
    public Path getClipPath() {
        RectF imageRectF = getImageRectF();
        if (Float.isNaN(this.f12714a) || Float.isNaN(this.b) || Float.isNaN(this.d) || Float.isNaN(this.c) || imageRectF == null || imageRectF.isEmpty()) {
            return null;
        }
        Path path = new Path();
        float f = Float.isNaN(this.f12714a) ? 0.0f : this.f12714a;
        float f2 = Float.isNaN(this.b) ? 0.0f : this.b;
        float f3 = Float.isNaN(this.d) ? 0.0f : this.d;
        float f4 = Float.isNaN(this.c) ? 0.0f : this.c;
        path.addRoundRect(imageRectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        return path;
    }

    public void setCornerRadius(float f) {
        this.f12714a = f;
        this.b = f;
        this.c = f;
        this.d = f;
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (getOutlineProvider() instanceof b) {
            return;
        }
        super.setOutlineProvider(new b());
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
    }

    public void setStrokeColor(int i) {
        this.f = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.e = f;
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        if (getOutlineProvider() instanceof b) {
            return;
        }
        super.setOutlineProvider(new b());
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12714a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.f = -1;
    }
}
