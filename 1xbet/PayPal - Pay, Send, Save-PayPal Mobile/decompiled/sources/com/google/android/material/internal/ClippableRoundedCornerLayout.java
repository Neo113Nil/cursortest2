package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class ClippableRoundedCornerLayout extends android.widget.FrameLayout {
    private float cornerRadius;
    private android.graphics.Path path;

    public ClippableRoundedCornerLayout(android.content.Context context) {
        super(context);
    }

    public ClippableRoundedCornerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void resetClipBoundsAndCornerRadius() {
        this.path = null;
        this.cornerRadius = 0.0f;
        invalidate();
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void updateCornerRadius(float f) {
        updateClipBoundsAndCornerRadius(getLeft(), getTop(), getRight(), getBottom(), f);
    }

    public void updateClipBoundsAndCornerRadius(android.graphics.Rect rect, float f) {
        updateClipBoundsAndCornerRadius(rect.left, rect.top, rect.right, rect.bottom, f);
    }

    public void updateClipBoundsAndCornerRadius(float f, float f2, float f3, float f4, float f5) {
        updateClipBoundsAndCornerRadius(new android.graphics.RectF(f, f2, f3, f4), f5);
    }

    public void updateClipBoundsAndCornerRadius(android.graphics.RectF rectF, float f) {
        if (this.path == null) {
            this.path = new android.graphics.Path();
        }
        this.cornerRadius = f;
        this.path.reset();
        this.path.addRoundRect(rectF, f, f, android.graphics.Path.Direction.CW);
        this.path.close();
        invalidate();
    }
}
