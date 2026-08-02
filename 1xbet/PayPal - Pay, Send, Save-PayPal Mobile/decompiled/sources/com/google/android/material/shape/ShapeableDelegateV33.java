package com.google.android.material.shape;

/* loaded from: classes8.dex */
class ShapeableDelegateV33 extends com.google.android.material.shape.ShapeableDelegate {
    ShapeableDelegateV33(android.view.View view) {
        initMaskOutlineProvider(view);
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
        return this.forceCompatClippingEnabled;
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(android.view.View view) {
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    private void initMaskOutlineProvider(android.view.View view) {
        view.setOutlineProvider(new android.view.ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV33.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(android.view.View view2, android.graphics.Outline outline) {
                if (com.google.android.material.shape.ShapeableDelegateV33.this.shapePath.isEmpty()) {
                    return;
                }
                outline.setPath(com.google.android.material.shape.ShapeableDelegateV33.this.shapePath);
            }
        });
    }
}
