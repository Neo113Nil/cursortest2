package com.google.android.material.progressindicator;

/* loaded from: classes8.dex */
public final class IndeterminateDrawable<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange {
    private com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> animatorDelegate;
    private com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate;
    private android.graphics.drawable.Drawable staticDummyDrawable;

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setColorFilter(android.graphics.ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    IndeterminateDrawable(android.content.Context context, com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseProgressIndicatorSpec, com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate, com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate);
        setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context context, com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new com.google.android.material.progressindicator.LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context context, com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec, com.google.android.material.progressindicator.LinearDrawingDelegate linearDrawingDelegate) {
        com.google.android.material.progressindicator.IndeterminateAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate;
        if (linearProgressIndicatorSpec.indeterminateAnimationType == 0) {
            linearIndeterminateDisjointAnimatorDelegate = new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec);
        } else {
            linearIndeterminateDisjointAnimatorDelegate = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec);
        }
        return new com.google.android.material.progressindicator.IndeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate, linearIndeterminateDisjointAnimatorDelegate);
    }

    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context context, com.google.android.material.progressindicator.CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new com.google.android.material.progressindicator.CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context context, com.google.android.material.progressindicator.CircularProgressIndicatorSpec circularProgressIndicatorSpec, com.google.android.material.progressindicator.CircularDrawingDelegate circularDrawingDelegate) {
        com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> indeterminateDrawable = new com.google.android.material.progressindicator.IndeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate, new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate(circularProgressIndicatorSpec));
        indeterminateDrawable.setStaticDummyDrawable(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(context.getResources(), com.google.android.material.R.drawable.indeterminate_static, null));
        return indeterminateDrawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    final boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        android.graphics.drawable.Drawable drawable;
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (!z || !z3) {
            return visibleInternal;
        }
        this.animatorDelegate.startAnimator();
        return visibleInternal;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(getBounds());
                androidx.core.graphics.drawable.DrawableCompat.setTint(this.staticDummyDrawable, this.baseSpec.indicatorColors[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            int i = this.baseSpec.indicatorTrackGapSize;
            int alpha = getAlpha();
            if (i == 0) {
                this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, alpha, 0);
            } else {
                com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator = this.animatorDelegate.activeIndicators.get(0);
                com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator2 = this.animatorDelegate.activeIndicators.get(this.animatorDelegate.activeIndicators.size() - 1);
                com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
                if (drawingDelegate instanceof com.google.android.material.progressindicator.LinearDrawingDelegate) {
                    drawingDelegate.fillTrack(canvas, this.paint, 0.0f, activeIndicator.startFraction, this.baseSpec.trackColor, alpha, i);
                    this.drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f, this.baseSpec.trackColor, alpha, i);
                } else {
                    drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f + activeIndicator.startFraction, this.baseSpec.trackColor, 0, i);
                    alpha = 0;
                }
            }
            for (int i2 = 0; i2 < this.animatorDelegate.activeIndicators.size(); i2++) {
                com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator3 = this.animatorDelegate.activeIndicators.get(i2);
                this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator3, getAlpha());
                if (i2 > 0 && i > 0) {
                    this.drawingDelegate.fillTrack(canvas, this.paint, this.animatorDelegate.activeIndicators.get(i2 - 1).endFraction, activeIndicator3.startFraction, this.baseSpec.trackColor, alpha, i);
                }
            }
            canvas.restore();
        }
    }

    private boolean isSystemAnimatorDisabled() {
        return this.animatorDurationScaleProvider != null && this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) == 0.0f;
    }

    public final android.graphics.drawable.Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    public final void setStaticDummyDrawable(android.graphics.drawable.Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    final com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    final void setAnimatorDelegate(com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> indeterminateAnimatorDelegate) {
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
    }

    final com.google.android.material.progressindicator.DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    final void setDrawingDelegate(com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }
}
