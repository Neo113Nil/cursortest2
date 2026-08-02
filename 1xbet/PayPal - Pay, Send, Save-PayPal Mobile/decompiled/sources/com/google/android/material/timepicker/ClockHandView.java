package com.google.android.material.timepicker;

/* loaded from: classes8.dex */
class ClockHandView extends android.view.View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final android.animation.TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final java.util.List<com.google.android.material.timepicker.ClockHandView.OnRotateListener> listeners;
    private com.google.android.material.timepicker.ClockHandView.OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final android.graphics.Paint paint;
    private final android.animation.ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final android.graphics.RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    public interface OnActionUpListener {
        void onActionUp(float f, boolean z);
    }

    public interface OnRotateListener {
        void onRotate(float f, boolean z);
    }

    public ClockHandView(android.content.Context context) {
        this(context, null);
    }

    public ClockHandView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialClockStyle);
    }

    public ClockHandView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rotationAnimator = new android.animation.ValueAnimator();
        this.listeners = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        this.selectorBox = new android.graphics.RectF();
        this.currentLevel = 1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.ClockHandView, i, com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context, com.google.android.material.R.attr.motionDurationLong2, 200);
        this.animationInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(com.google.android.material.R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(com.google.android.material.R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.rotationAnimator.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    public void setHandRotation(float f) {
        setHandRotation(f, false);
    }

    public void setHandRotation(float f, boolean z) {
        android.animation.ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            setHandRotationInternal(f, false);
            return;
        }
        android.util.Pair<java.lang.Float, java.lang.Float> valuesForAnimation = getValuesForAnimation(f);
        this.rotationAnimator.setFloatValues(((java.lang.Float) valuesForAnimation.first).floatValue(), ((java.lang.Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                com.google.android.material.timepicker.ClockHandView.this.m10303xb17f7076(valueAnimator2);
            }
        });
        this.rotationAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }

    /* renamed from: lambda$setHandRotation$0$com-google-android-material-timepicker-ClockHandView, reason: not valid java name */
    /* synthetic */ void m10303xb17f7076(android.animation.ValueAnimator valueAnimator) {
        setHandRotationInternal(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private android.util.Pair<java.lang.Float, java.lang.Float> getValuesForAnimation(float f) {
        float handRotation = getHandRotation();
        if (java.lang.Math.abs(handRotation - f) > 180.0f) {
            if (handRotation > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (handRotation < 180.0f && f > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new android.util.Pair<>(java.lang.Float.valueOf(handRotation), java.lang.Float.valueOf(f));
    }

    private void setHandRotationInternal(float f, boolean z) {
        float f2 = f % 360.0f;
        this.originalDeg = f2;
        this.degRad = java.lang.Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = width + (((float) java.lang.Math.cos(this.degRad)) * leveledCircleRadius);
        float sin = height + (leveledCircleRadius * ((float) java.lang.Math.sin(this.degRad)));
        android.graphics.RectF rectF = this.selectorBox;
        float f3 = this.selectorRadius;
        rectF.set(cos - f3, sin - f3, cos + f3, sin + f3);
        java.util.Iterator<com.google.android.material.timepicker.ClockHandView.OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f2, z);
        }
        invalidate();
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.animatingOnTouchUp = z;
    }

    public void addOnRotateListener(com.google.android.material.timepicker.ClockHandView.OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public void setOnActionUpListener(com.google.android.material.timepicker.ClockHandView.OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public float getHandRotation() {
        return this.originalDeg;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    private void drawSelector(android.graphics.Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (float) java.lang.Math.cos(this.degRad);
        float f2 = height;
        float sin = (float) java.lang.Math.sin(this.degRad);
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle((cos * leveledCircleRadius) + f, (leveledCircleRadius * sin) + f2, this.selectorRadius, this.paint);
        double sin2 = java.lang.Math.sin(this.degRad);
        double cos2 = java.lang.Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f, f2, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.paint);
        canvas.drawCircle(f, f2, this.centerDotRadius, this.paint);
    }

    public android.graphics.RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    public void setCircleRadius(int i) {
        this.circleRadius = i;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        com.google.android.material.timepicker.ClockHandView.OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x;
            this.downY = y;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z = false;
            z2 = false;
            z3 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.downX);
            int i2 = (int) (y - this.downY);
            this.isInTapRegion = (i * i) + (i2 * i2) > this.scaledTouchSlop;
            boolean z4 = this.changedDuringTouch;
            z = actionMasked == 1;
            if (this.isMultiLevel) {
                adjustLevel(x, y);
            }
            z3 = false;
            z2 = z4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean handleTouchInput = handleTouchInput(x, y, z2, z3, z) | this.changedDuringTouch;
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x, y), this.isInTapRegion);
        }
        return true;
    }

    private void adjustLevel(float f, float f2) {
        this.currentLevel = com.google.android.material.math.MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) getLeveledCircleRadius(2)) + com.google.android.material.internal.ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
    }

    private boolean handleTouchInput(float f, float f2, boolean z, boolean z2, boolean z3) {
        float degreesFromXY = getDegreesFromXY(f, f2);
        boolean z4 = false;
        boolean z5 = getHandRotation() != degreesFromXY;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.animatingOnTouchUp) {
            z4 = true;
        }
        setHandRotation(degreesFromXY, z4);
        return true;
    }

    private int getDegreesFromXY(float f, float f2) {
        int degrees = (int) java.lang.Math.toDegrees(java.lang.Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    int getCurrentLevel() {
        return this.currentLevel;
    }

    void setCurrentLevel(int i) {
        this.currentLevel = i;
        invalidate();
    }

    void setMultiLevel(boolean z) {
        if (this.isMultiLevel && !z) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z;
        invalidate();
    }

    private int getLeveledCircleRadius(int i) {
        return i == 2 ? java.lang.Math.round(this.circleRadius * 0.66f) : this.circleRadius;
    }
}
