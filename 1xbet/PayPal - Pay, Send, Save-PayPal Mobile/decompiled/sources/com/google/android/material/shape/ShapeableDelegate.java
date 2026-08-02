package com.google.android.material.shape;

/* loaded from: classes8.dex */
public abstract class ShapeableDelegate {
    com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    boolean forceCompatClippingEnabled = false;
    boolean offsetZeroCornerEdgeBoundsEnabled = false;
    android.graphics.RectF maskBounds = new android.graphics.RectF();
    final android.graphics.Path shapePath = new android.graphics.Path();

    abstract void invalidateClippingMethod(android.view.View view);

    abstract boolean shouldUseCompatClipping();

    public static com.google.android.material.shape.ShapeableDelegate create(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return new com.google.android.material.shape.ShapeableDelegateV33(view);
        }
        return new com.google.android.material.shape.ShapeableDelegateV22(view);
    }

    public boolean isForceCompatClippingEnabled() {
        return this.forceCompatClippingEnabled;
    }

    public void setForceCompatClippingEnabled(android.view.View view, boolean z) {
        if (z != this.forceCompatClippingEnabled) {
            this.forceCompatClippingEnabled = z;
            invalidateClippingMethod(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(android.view.View view, boolean z) {
        this.offsetZeroCornerEdgeBoundsEnabled = z;
        invalidateClippingMethod(view);
    }

    public void onShapeAppearanceChanged(android.view.View view, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void onMaskChanged(android.view.View view, android.graphics.RectF rectF) {
        this.maskBounds = rectF;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    private void updateShapePath() {
        if (!isMaskBoundsValid() || this.shapeAppearanceModel == null) {
            return;
        }
        com.google.android.material.shape.ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
    }

    private boolean isMaskBoundsValid() {
        return this.maskBounds.left <= this.maskBounds.right && this.maskBounds.top <= this.maskBounds.bottom;
    }

    public void maybeClip(android.graphics.Canvas canvas, com.google.android.material.canvas.CanvasCompat.CanvasOperation canvasOperation) {
        if (shouldUseCompatClipping() && !this.shapePath.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.shapePath);
            canvasOperation.run(canvas);
            canvas.restore();
            return;
        }
        canvasOperation.run(canvas);
    }
}
