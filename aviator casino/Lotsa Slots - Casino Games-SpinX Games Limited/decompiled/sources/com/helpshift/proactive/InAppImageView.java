package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class InAppImageView extends androidx.appcompat.widget.AppCompatImageView {
    private float mAspectRatio;
    private android.graphics.Bitmap mBitmap;
    private float[] mRadii;
    private int strokeColor;
    private final android.graphics.Paint strokePaint;
    private int strokeWidth;

    public InAppImageView(android.content.Context context) {
        super(context);
        this.mAspectRatio = 1.0f;
        this.mRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.strokeColor = 0;
        this.strokeWidth = 0;
        this.strokePaint = new android.graphics.Paint(1);
        this.mBitmap = null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        if (size > 0) {
            float f = this.mAspectRatio;
            if (f > 0.0f) {
                setMeasuredDimension(size, (int) (size / f));
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.mBitmap == null) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        android.graphics.RectF applyScaleToBitmap = applyScaleToBitmap(width, height, this.mBitmap.getWidth(), this.mBitmap.getHeight());
        int save = canvas.save();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(rectF, this.mRadii, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawBitmap(this.mBitmap, (android.graphics.Rect) null, applyScaleToBitmap, (android.graphics.Paint) null);
        canvas.restoreToCount(save);
        int i = this.strokeWidth;
        if (i > 0) {
            this.strokePaint.setStrokeWidth(i);
            this.strokePaint.setColor(this.strokeColor);
            canvas.drawPath(path, this.strokePaint);
        }
    }

    /* renamed from: com.helpshift.proactive.InAppImageView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private android.graphics.RectF applyScaleToBitmap(float f, float f2, float f3, float f4) {
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, f2);
        int i = com.helpshift.proactive.InAppImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType[getScaleType().ordinal()];
        if (i == 1) {
            float min = java.lang.Math.min(f / f3, f2 / f4);
            float f5 = f3 * min;
            float f6 = f4 * min;
            float f7 = (f - f5) / 2.0f;
            float f8 = (f2 - f6) / 2.0f;
            rectF.set(f7, f8, f5 + f7, f6 + f8);
        } else if (i == 2) {
            float max = java.lang.Math.max(f / f3, f2 / f4);
            float f9 = f3 * max;
            float f10 = f4 * max;
            float f11 = (f - f9) / 2.0f;
            float f12 = (f2 - f10) / 2.0f;
            rectF.set(f11, f12, f9 + f11, f10 + f12);
        } else if (i == 3) {
            rectF.set(0.0f, 0.0f, f, f2);
        }
        return rectF;
    }

    public void setAspectRatio(float f) {
        this.mAspectRatio = f;
    }

    public void setCornerRadius(float[] fArr) {
        this.mRadii = fArr;
    }

    public void setStroke(int i, int i2) {
        this.strokeColor = i;
        this.strokeWidth = i2;
        this.strokePaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.strokePaint.setStrokeWidth(this.strokeWidth);
        this.strokePaint.setColor(this.strokeColor);
        invalidate();
    }

    public void setBitmap(android.graphics.Bitmap bitmap) {
        this.mBitmap = bitmap;
        invalidate();
    }
}
