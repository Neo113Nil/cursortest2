package com.google.android.material.shape;

/* loaded from: classes8.dex */
class ShapeableDelegateV22 extends com.google.android.material.shape.ShapeableDelegate {
    private boolean canUseViewOutline = false;
    private float cornerRadius = 0.0f;

    ShapeableDelegateV22(android.view.View view) {
        initMaskOutlineProvider(view);
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
        return !this.canUseViewOutline || this.forceCompatClippingEnabled;
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(android.view.View view) {
        this.cornerRadius = getDefaultCornerRadius();
        this.canUseViewOutline = isShapeRoundRect() || offsetZeroCornerEdgeBoundsIfPossible();
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    private float getDefaultCornerRadius() {
        if (this.shapeAppearanceModel == null || this.maskBounds == null) {
            return 0.0f;
        }
        return this.shapeAppearanceModel.topRightCornerSize.getCornerSize(this.maskBounds);
    }

    private boolean isShapeRoundRect() {
        if (this.maskBounds.isEmpty() || this.shapeAppearanceModel == null) {
            return false;
        }
        return this.shapeAppearanceModel.isRoundRect(this.maskBounds);
    }

    private boolean offsetZeroCornerEdgeBoundsIfPossible() {
        if (this.maskBounds.isEmpty() || this.shapeAppearanceModel == null || !this.offsetZeroCornerEdgeBoundsEnabled || this.shapeAppearanceModel.isRoundRect(this.maskBounds) || !shapeUsesAllRoundedCornerTreatments(this.shapeAppearanceModel)) {
            return false;
        }
        float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.maskBounds);
        float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.maskBounds);
        float cornerSize3 = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.maskBounds);
        float cornerSize4 = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.maskBounds);
        if (cornerSize == 0.0f && cornerSize3 == 0.0f && cornerSize2 == cornerSize4) {
            this.maskBounds.set(this.maskBounds.left - cornerSize2, this.maskBounds.top, this.maskBounds.right, this.maskBounds.bottom);
            this.cornerRadius = cornerSize2;
            return true;
        }
        if (cornerSize == 0.0f && cornerSize2 == 0.0f && cornerSize3 == cornerSize4) {
            this.maskBounds.set(this.maskBounds.left, this.maskBounds.top - cornerSize3, this.maskBounds.right, this.maskBounds.bottom);
            this.cornerRadius = cornerSize3;
            return true;
        }
        if (cornerSize2 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize3) {
            this.maskBounds.set(this.maskBounds.left, this.maskBounds.top, this.maskBounds.right + cornerSize, this.maskBounds.bottom);
            this.cornerRadius = cornerSize;
            return true;
        }
        if (cornerSize3 != 0.0f || cornerSize4 != 0.0f || cornerSize != cornerSize2) {
            return false;
        }
        this.maskBounds.set(this.maskBounds.left, this.maskBounds.top, this.maskBounds.right, this.maskBounds.bottom + cornerSize);
        this.cornerRadius = cornerSize;
        return true;
    }

    float getCornerRadius() {
        return this.cornerRadius;
    }

    private static boolean shapeUsesAllRoundedCornerTreatments(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        return (shapeAppearanceModel.getTopLeftCorner() instanceof com.google.android.material.shape.RoundedCornerTreatment) && (shapeAppearanceModel.getTopRightCorner() instanceof com.google.android.material.shape.RoundedCornerTreatment) && (shapeAppearanceModel.getBottomLeftCorner() instanceof com.google.android.material.shape.RoundedCornerTreatment) && (shapeAppearanceModel.getBottomRightCorner() instanceof com.google.android.material.shape.RoundedCornerTreatment);
    }

    private void initMaskOutlineProvider(android.view.View view) {
        view.setOutlineProvider(new android.view.ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV22.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(android.view.View view2, android.graphics.Outline outline) {
                if (com.google.android.material.shape.ShapeableDelegateV22.this.shapeAppearanceModel == null || com.google.android.material.shape.ShapeableDelegateV22.this.maskBounds.isEmpty()) {
                    return;
                }
                outline.setRoundRect((int) com.google.android.material.shape.ShapeableDelegateV22.this.maskBounds.left, (int) com.google.android.material.shape.ShapeableDelegateV22.this.maskBounds.top, (int) com.google.android.material.shape.ShapeableDelegateV22.this.maskBounds.right, (int) com.google.android.material.shape.ShapeableDelegateV22.this.maskBounds.bottom, com.google.android.material.shape.ShapeableDelegateV22.this.cornerRadius);
            }
        });
    }
}
