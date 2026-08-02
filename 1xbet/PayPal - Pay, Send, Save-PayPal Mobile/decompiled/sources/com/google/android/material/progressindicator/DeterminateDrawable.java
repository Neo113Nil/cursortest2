package com.google.android.material.progressindicator;

/* loaded from: classes8.dex */
public final class DeterminateDrawable<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange {
    static final float GAP_RAMP_DOWN_THRESHOLD = 0.01f;
    private static final androidx.dynamicanimation.animation.FloatPropertyCompat<com.google.android.material.progressindicator.DeterminateDrawable<?>> INDICATOR_LENGTH_IN_LEVEL = new androidx.dynamicanimation.animation.FloatPropertyCompat<com.google.android.material.progressindicator.DeterminateDrawable<?>>("indicatorLevel") { // from class: com.google.android.material.progressindicator.DeterminateDrawable.1
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(com.google.android.material.progressindicator.DeterminateDrawable<?> determinateDrawable) {
            return determinateDrawable.getIndicatorFraction() * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(com.google.android.material.progressindicator.DeterminateDrawable<?> determinateDrawable, float f) {
            determinateDrawable.setIndicatorFraction(f / 10000.0f);
        }
    };
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private final com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator;
    private com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate;
    private boolean skipAnimationOnLevelChange;
    private final androidx.dynamicanimation.animation.SpringAnimation springAnimation;
    private final androidx.dynamicanimation.animation.SpringForce springForce;

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

    DeterminateDrawable(android.content.Context context, com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseProgressIndicatorSpec, com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.skipAnimationOnLevelChange = false;
        setDrawingDelegate(drawingDelegate);
        this.activeIndicator = new com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator();
        androidx.dynamicanimation.animation.SpringForce springForce = new androidx.dynamicanimation.animation.SpringForce();
        this.springForce = springForce;
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        androidx.dynamicanimation.animation.SpringAnimation springAnimation = new androidx.dynamicanimation.animation.SpringAnimation(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = springAnimation;
        springAnimation.setSpring(springForce);
        setGrowFraction(1.0f);
    }

    public static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context context, com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new com.google.android.material.progressindicator.LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context context, com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec, com.google.android.material.progressindicator.LinearDrawingDelegate linearDrawingDelegate) {
        return new com.google.android.material.progressindicator.DeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate);
    }

    public static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context context, com.google.android.material.progressindicator.CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new com.google.android.material.progressindicator.CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    static com.google.android.material.progressindicator.DeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context context, com.google.android.material.progressindicator.CircularProgressIndicatorSpec circularProgressIndicatorSpec, com.google.android.material.progressindicator.CircularDrawingDelegate circularDrawingDelegate) {
        return new com.google.android.material.progressindicator.DeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate);
    }

    public final void addSpringAnimationEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.springAnimation.addEndListener(onAnimationEndListener);
    }

    public final void removeSpringAnimationEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.springAnimation.removeEndListener(onAnimationEndListener);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    final boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.skipAnimationOnLevelChange = true;
            return visibleInternal;
        }
        this.skipAnimationOnLevelChange = false;
        this.springForce.setStiffness(50.0f / systemAnimatorDurationScale);
        return visibleInternal;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.springAnimation.skipToEnd();
        setIndicatorFraction(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.skipAnimationOnLevelChange) {
            this.springAnimation.skipToEnd();
            setIndicatorFraction(i / 10000.0f);
            return true;
        }
        this.springAnimation.setStartValue(getIndicatorFraction() * 10000.0f);
        this.springAnimation.animateToFinalPosition(i);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    final void setLevelByFraction(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        int clamp;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            this.paint.setStyle(android.graphics.Paint.Style.FILL);
            this.paint.setAntiAlias(true);
            this.activeIndicator.color = this.baseSpec.indicatorColors[0];
            if (this.baseSpec.indicatorTrackGapSize > 0) {
                if (this.drawingDelegate instanceof com.google.android.material.progressindicator.LinearDrawingDelegate) {
                    clamp = this.baseSpec.indicatorTrackGapSize;
                } else {
                    clamp = (int) ((this.baseSpec.indicatorTrackGapSize * androidx.core.math.MathUtils.clamp(getIndicatorFraction(), 0.0f, 0.01f)) / 0.01f);
                }
                this.drawingDelegate.fillTrack(canvas, this.paint, getIndicatorFraction(), 1.0f, this.baseSpec.trackColor, getAlpha(), clamp);
            } else {
                this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, getAlpha(), 0);
            }
            this.drawingDelegate.fillIndicator(canvas, this.paint, this.activeIndicator, getAlpha());
            this.drawingDelegate.drawStopIndicator(canvas, this.paint, this.baseSpec.indicatorColors[0], getAlpha());
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.activeIndicator.endFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorFraction(float f) {
        this.activeIndicator.endFraction = f;
        invalidateSelf();
    }

    final com.google.android.material.progressindicator.DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    final void setDrawingDelegate(com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }
}
