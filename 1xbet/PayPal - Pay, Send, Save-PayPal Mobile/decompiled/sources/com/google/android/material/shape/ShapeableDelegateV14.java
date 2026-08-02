package com.google.android.material.shape;

/* loaded from: classes8.dex */
class ShapeableDelegateV14 extends com.google.android.material.shape.ShapeableDelegate {
    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
        return true;
    }

    ShapeableDelegateV14() {
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(android.view.View view) {
        if (this.shapeAppearanceModel == null || this.maskBounds.isEmpty() || !shouldUseCompatClipping()) {
            return;
        }
        view.invalidate();
    }
}
