package com.google.android.material.carousel;

/* loaded from: classes8.dex */
public class MaskableFrameLayout extends android.widget.FrameLayout implements com.google.android.material.carousel.Maskable, com.google.android.material.shape.Shapeable {
    private static final int NOT_SET = -1;
    private final android.graphics.RectF maskRect;
    private float maskXPercentage;
    private com.google.android.material.carousel.OnMaskChangedListener onMaskChangedListener;
    private java.lang.Boolean savedForceCompatClippingEnabled;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private final com.google.android.material.shape.ShapeableDelegate shapeableDelegate;

    public MaskableFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public MaskableFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maskXPercentage = -1.0f;
        this.maskRect = new android.graphics.RectF();
        this.shapeableDelegate = com.google.android.material.shape.ShapeableDelegate.create(this);
        this.savedForceCompatClippingEnabled = null;
        setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel.builder(context, attributeSet, i, 0, 0).build());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.maskXPercentage != -1.0f) {
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        rect.set((int) this.maskRect.left, (int) this.maskRect.top, (int) this.maskRect.right, (int) this.maskRect.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.Boolean bool = this.savedForceCompatClippingEnabled;
        if (bool != null) {
            this.shapeableDelegate.setForceCompatClippingEnabled(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.savedForceCompatClippingEnabled = java.lang.Boolean.valueOf(this.shapeableDelegate.isForceCompatClippingEnabled());
        this.shapeableDelegate.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        com.google.android.material.shape.ShapeAppearanceModel withTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.carousel.MaskableFrameLayout$$ExternalSyntheticLambda0
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final com.google.android.material.shape.CornerSize apply(com.google.android.material.shape.CornerSize cornerSize) {
                return com.google.android.material.carousel.MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
            }
        });
        this.shapeAppearanceModel = withTransformedCornerSizes;
        this.shapeableDelegate.onShapeAppearanceChanged(this, withTransformedCornerSizes);
    }

    static /* synthetic */ com.google.android.material.shape.CornerSize lambda$setShapeAppearanceModel$0(com.google.android.material.shape.CornerSize cornerSize) {
        return cornerSize instanceof com.google.android.material.shape.AbsoluteCornerSize ? com.google.android.material.shape.ClampedCornerSize.createFromCornerSize((com.google.android.material.shape.AbsoluteCornerSize) cornerSize) : cornerSize;
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Override // com.google.android.material.carousel.Maskable
    @java.lang.Deprecated
    public void setMaskXPercentage(float f) {
        float clamp = androidx.core.math.MathUtils.clamp(f, 0.0f, 1.0f);
        if (this.maskXPercentage != clamp) {
            this.maskXPercentage = clamp;
            updateMaskRectForMaskXPercentage();
        }
    }

    private void updateMaskRectForMaskXPercentage() {
        if (this.maskXPercentage != -1.0f) {
            float lerp = com.google.android.material.animation.AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.maskXPercentage);
            setMaskRectF(new android.graphics.RectF(lerp, 0.0f, getWidth() - lerp, getHeight()));
        }
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(android.graphics.RectF rectF) {
        this.maskRect.set(rectF);
        onMaskChanged();
    }

    @Override // com.google.android.material.carousel.Maskable
    @java.lang.Deprecated
    public float getMaskXPercentage() {
        return this.maskXPercentage;
    }

    @Override // com.google.android.material.carousel.Maskable
    public android.graphics.RectF getMaskRectF() {
        return this.maskRect;
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(com.google.android.material.carousel.OnMaskChangedListener onMaskChangedListener) {
        this.onMaskChangedListener = onMaskChangedListener;
    }

    private void onMaskChanged() {
        this.shapeableDelegate.onMaskChanged(this, this.maskRect);
        com.google.android.material.carousel.OnMaskChangedListener onMaskChangedListener = this.onMaskChangedListener;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.maskRect);
        }
    }

    public void setForceCompatClipping(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new com.google.android.material.canvas.CanvasCompat.CanvasOperation() { // from class: com.google.android.material.carousel.MaskableFrameLayout$$ExternalSyntheticLambda1
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(android.graphics.Canvas canvas2) {
                com.google.android.material.carousel.MaskableFrameLayout.this.m10219x418c47c0(canvas2);
            }
        });
    }

    /* renamed from: lambda$dispatchDraw$1$com-google-android-material-carousel-MaskableFrameLayout, reason: not valid java name */
    /* synthetic */ void m10219x418c47c0(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
