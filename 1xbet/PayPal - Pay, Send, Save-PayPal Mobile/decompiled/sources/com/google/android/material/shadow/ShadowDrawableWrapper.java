package com.google.android.material.shadow;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class ShadowDrawableWrapper extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
    static final double COS_45 = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    final android.graphics.RectF contentBounds;
    float cornerRadius;
    final android.graphics.Paint cornerShadowPaint;
    android.graphics.Path cornerShadowPath;
    private boolean dirty;
    final android.graphics.Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ShadowDrawableWrapper(android.content.Context context, android.graphics.drawable.Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.dirty = true;
        this.addPaddingForCorners = true;
        this.printedShadowClipWarning = false;
        this.shadowStartColor = androidx.core.content.ContextCompat.getColor(context, com.google.android.material.R.color.design_fab_shadow_start_color);
        this.shadowMiddleColor = androidx.core.content.ContextCompat.getColor(context, com.google.android.material.R.color.design_fab_shadow_mid_color);
        this.shadowEndColor = androidx.core.content.ContextCompat.getColor(context, com.google.android.material.R.color.design_fab_shadow_end_color);
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.cornerShadowPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.cornerRadius = java.lang.Math.round(f);
        this.contentBounds = new android.graphics.RectF();
        android.graphics.Paint paint2 = new android.graphics.Paint(paint);
        this.edgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    private static int toEven(float f) {
        int round = java.lang.Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.addPaddingForCorners = z;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.cornerShadowPaint.setAlpha(i);
        this.edgeShadowPaint.setAlpha(i);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        this.dirty = true;
    }

    public void setShadowSize(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new java.lang.IllegalArgumentException("invalid shadow size");
        }
        float even = toEven(f);
        float even2 = toEven(f2);
        if (even > even2) {
            if (!this.printedShadowClipWarning) {
                this.printedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.rawShadowSize == even && this.rawMaxShadowSize == even2) {
            return;
        }
        this.rawShadowSize = even;
        this.rawMaxShadowSize = even2;
        this.shadowSize = java.lang.Math.round(even * 1.5f);
        this.maxShadowSize = even2;
        this.dirty = true;
        invalidateSelf();
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.rawMaxShadowSize);
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        int ceil = (int) java.lang.Math.ceil(calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int ceil2 = (int) java.lang.Math.ceil(calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - COS_45) * f2)) : f * 1.5f;
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - COS_45) * f2)) : f;
    }

    public void setCornerRadius(float f) {
        float round = java.lang.Math.round(f);
        if (this.cornerRadius == round) {
            return;
        }
        this.cornerRadius = round;
        this.dirty = true;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public final void setRotation(float f) {
        if (this.rotation != f) {
            this.rotation = f;
            invalidateSelf();
        }
    }

    private void drawShadow(android.graphics.Canvas canvas) {
        float f;
        int i;
        float f2;
        int i2;
        float f3;
        float f4;
        int i3;
        int save = canvas.save();
        canvas.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f5 = this.cornerRadius;
        float f6 = (-f5) - this.shadowSize;
        float f7 = f5 * 2.0f;
        boolean z = this.contentBounds.width() - f7 > 0.0f;
        boolean z2 = this.contentBounds.height() - f7 > 0.0f;
        float f8 = this.rawShadowSize;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (SHADOW_TOP_SCALE * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        canvas.translate(this.contentBounds.left + f5, this.contentBounds.top + f5);
        canvas.scale(f9, f10);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            f = f11;
            i = save;
            f2 = 1.0f;
            canvas.drawRect(0.0f, f6, this.contentBounds.width() - f7, -this.cornerRadius, this.edgeShadowPaint);
            i2 = save2;
        } else {
            f = f11;
            i = save;
            f2 = 1.0f;
            i2 = save2;
        }
        canvas.restoreToCount(i2);
        int save3 = canvas.save();
        canvas.translate(this.contentBounds.right - f5, this.contentBounds.bottom - f5);
        float f12 = f;
        canvas.scale(f9, f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z) {
            canvas.scale(f2 / f9, f2);
            f3 = f12;
            f4 = f10;
            i3 = save3;
            canvas.drawRect(0.0f, f6, this.contentBounds.width() - f7, this.shadowSize + (-this.cornerRadius), this.edgeShadowPaint);
        } else {
            f3 = f12;
            f4 = f10;
            i3 = save3;
        }
        canvas.restoreToCount(i3);
        int save4 = canvas.save();
        canvas.translate(this.contentBounds.left + f5, this.contentBounds.bottom - f5);
        canvas.scale(f9, f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z2) {
            canvas.scale(1.0f / f3, 1.0f);
            canvas.drawRect(0.0f, f6, this.contentBounds.height() - f7, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        canvas.translate(this.contentBounds.right - f5, this.contentBounds.top + f5);
        float f13 = f4;
        canvas.scale(f9, f13);
        canvas.rotate(90.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z2) {
            canvas.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.contentBounds.height() - f7, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i);
    }

    private void buildShadowCorners() {
        float f = this.cornerRadius;
        float f2 = -f;
        android.graphics.RectF rectF = new android.graphics.RectF(f2, f2, f, f);
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        float f3 = -this.shadowSize;
        rectF2.inset(f3, f3);
        android.graphics.Path path = this.cornerShadowPath;
        if (path == null) {
            this.cornerShadowPath = new android.graphics.Path();
        } else {
            path.reset();
        }
        this.cornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, 0.0f);
        this.cornerShadowPath.rLineTo(-this.shadowSize, 0.0f);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f4 = -rectF2.top;
        if (f4 > 0.0f) {
            float f5 = this.cornerRadius / f4;
            this.cornerShadowPaint.setShader(new android.graphics.RadialGradient(0.0f, 0.0f, f4, new int[]{0, this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, f5, ((1.0f - f5) / 2.0f) + f5, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        }
        this.edgeShadowPaint.setShader(new android.graphics.LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        this.edgeShadowPaint.setAntiAlias(false);
    }

    private void buildComponents(android.graphics.Rect rect) {
        float f = this.rawMaxShadowSize * 1.5f;
        this.contentBounds.set(rect.left + this.rawMaxShadowSize, rect.top + f, rect.right - this.rawMaxShadowSize, rect.bottom - f);
        getDrawable().setBounds((int) this.contentBounds.left, (int) this.contentBounds.top, (int) this.contentBounds.right, (int) this.contentBounds.bottom);
        buildShadowCorners();
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.rawShadowSize, f);
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinWidth() {
        float f = this.rawMaxShadowSize;
        return (java.lang.Math.max(f, this.cornerRadius + (f / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 2.0f);
    }

    public float getMinHeight() {
        float f = this.rawMaxShadowSize;
        return (java.lang.Math.max(f, this.cornerRadius + ((f * 1.5f) / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 1.5f * 2.0f);
    }
}
