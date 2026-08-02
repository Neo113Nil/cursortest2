package com.google.android.material.slider;

/* loaded from: classes8.dex */
abstract class BaseSlider<S extends com.google.android.material.slider.BaseSlider<S, L, T>, L extends com.google.android.material.slider.BaseOnChangeListener<S>, T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> extends android.view.View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final java.lang.String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final java.lang.String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final java.lang.String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private com.google.android.material.slider.BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;
    private final com.google.android.material.slider.BaseSlider.AccessibilityHelper accessibilityHelper;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final android.graphics.Paint activeTicksPaint;
    private final android.graphics.Paint activeTrackPaint;
    private final java.util.List<L> changeListeners;
    private final android.graphics.RectF cornerRect;
    private android.graphics.drawable.Drawable customThumbDrawable;
    private java.util.List<android.graphics.drawable.Drawable> customThumbDrawablesForValues;
    private final com.google.android.material.shape.MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackHeight;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private com.google.android.material.slider.LabelFormatter formatter;
    private android.content.res.ColorStateList haloColor;
    private final android.graphics.Paint haloPaint;
    private int haloRadius;
    private final android.graphics.Paint inactiveTicksPaint;
    private final android.graphics.Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;
    private int labelStyle;
    private final java.util.List<com.google.android.material.tooltip.TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private android.animation.ValueAnimator labelsInAnimator;
    private android.animation.ValueAnimator labelsOutAnimator;
    private android.view.MotionEvent lastEvent;
    private int minTickSpacing;
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetHeight;
    private final android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    private final android.graphics.Paint stopIndicatorPaint;
    private int thumbHeight;
    private boolean thumbIsPressed;
    private final android.graphics.Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;
    private android.content.res.ColorStateList tickColorActive;
    private android.content.res.ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final java.util.List<T> touchListeners;
    private float touchPosition;
    private android.content.res.ColorStateList trackColorActive;
    private android.content.res.ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackInsideCornerSize;
    private final android.graphics.Path trackPath;
    private final android.graphics.RectF trackRect;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private java.util.ArrayList<java.lang.Float> values;
    private int widgetHeight;
    static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_Slider;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = com.google.android.material.R.attr.motionDurationMedium4;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = com.google.android.material.R.attr.motionDurationShort3;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedAccelerateInterpolator;

    enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public BaseSlider(android.content.Context context) {
        this(context, null);
    }

    public BaseSlider(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.sliderStyle);
    }

    public BaseSlider(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.labels = new java.util.ArrayList();
        this.changeListeners = new java.util.ArrayList();
        this.touchListeners = new java.util.ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = -1;
        this.defaultThumbTrackGapSize = -1;
        this.thumbIsPressed = false;
        this.values = new java.util.ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.tickVisible = true;
        this.isLongPress = false;
        this.trackPath = new android.graphics.Path();
        this.trackRect = new android.graphics.RectF();
        this.cornerRect = new android.graphics.RectF();
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        this.defaultThumbDrawable = materialShapeDrawable;
        this.customThumbDrawablesForValues = java.util.Collections.emptyList();
        this.separationUnit = 0;
        this.onScrollChangedListener = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.BaseSlider$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                com.google.android.material.slider.BaseSlider.this.updateLabels();
            }
        };
        android.content.Context context2 = getContext();
        this.inactiveTrackPaint = new android.graphics.Paint();
        this.activeTrackPaint = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.thumbPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.haloPaint = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.inactiveTicksPaint = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.activeTicksPaint = paint4;
        paint4.setStyle(android.graphics.Paint.Style.STROKE);
        paint4.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.stopIndicatorPaint = paint5;
        paint5.setStyle(android.graphics.Paint.Style.FILL);
        paint5.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        loadResources(context2.getResources());
        processAttributes(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = android.view.ViewConfiguration.get(context2).getScaledTouchSlop();
        com.google.android.material.slider.BaseSlider.AccessibilityHelper accessibilityHelper = new com.google.android.material.slider.BaseSlider.AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void loadResources(android.content.res.Resources resources) {
        this.minWidgetHeight = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_slider_thumb_radius);
        this.defaultTrackHeight = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_slider_track_height);
        this.defaultTickActiveRadius = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_slider_tick_radius);
        this.defaultTickInactiveRadius = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_slider_tick_radius);
        this.minTickSpacing = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_slider_tick_min_spacing);
        this.labelPadding = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_slider_label_padding);
    }

    private void processAttributes(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.Slider, i, DEF_STYLE_RES, new int[0]);
        this.labelStyle = obtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.Slider_labelStyle, com.google.android.material.R.style.Widget_MaterialComponents_Tooltip);
        this.valueFrom = obtainStyledAttributes.getFloat(com.google.android.material.R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = obtainStyledAttributes.getFloat(com.google.android.material.R.styleable.Slider_android_valueTo, 1.0f);
        setValues(java.lang.Float.valueOf(this.valueFrom));
        this.stepSize = obtainStyledAttributes.getFloat(com.google.android.material.R.styleable.Slider_android_stepSize, 0.0f);
        this.minTouchTargetSize = (int) java.lang.Math.ceil(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Slider_minTouchTargetSize, (float) java.lang.Math.ceil(com.google.android.material.internal.ViewUtils.dpToPx(getContext(), 48))));
        boolean hasValue = obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Slider_trackColor);
        int i2 = hasValue ? com.google.android.material.R.styleable.Slider_trackColor : com.google.android.material.R.styleable.Slider_trackColorInactive;
        int i3 = hasValue ? com.google.android.material.R.styleable.Slider_trackColor : com.google.android.material.R.styleable.Slider_trackColorActive;
        android.content.res.ColorStateList colorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, i2);
        if (colorStateList == null) {
            colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, com.google.android.material.R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        android.content.res.ColorStateList colorStateList2 = com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, i3);
        if (colorStateList2 == null) {
            colorStateList2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, com.google.android.material.R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.defaultThumbDrawable.setFillColor(com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, com.google.android.material.R.styleable.Slider_thumbColor));
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, com.google.android.material.R.styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Slider_thumbStrokeWidth, 0.0f));
        android.content.res.ColorStateList colorStateList3 = com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, com.google.android.material.R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, com.google.android.material.R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        this.tickVisible = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Slider_tickVisible, true);
        boolean hasValue2 = obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Slider_tickColor);
        int i4 = hasValue2 ? com.google.android.material.R.styleable.Slider_tickColor : com.google.android.material.R.styleable.Slider_tickColorInactive;
        int i5 = hasValue2 ? com.google.android.material.R.styleable.Slider_tickColor : com.google.android.material.R.styleable.Slider_tickColorActive;
        android.content.res.ColorStateList colorStateList4 = com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, i4);
        if (colorStateList4 == null) {
            colorStateList4 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, com.google.android.material.R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        android.content.res.ColorStateList colorStateList5 = com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, i5);
        if (colorStateList5 == null) {
            colorStateList5 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, com.google.android.material.R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_haloRadius, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_tickRadiusActive, this.trackStopIndicatorSize / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Slider_tickRadiusInactive, this.trackStopIndicatorSize / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(com.google.android.material.R.styleable.Slider_labelBehavior, 0));
        if (!obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int max = this.minTrackSidePadding + java.lang.Math.max(java.lang.Math.max(java.lang.Math.max((this.thumbWidth / 2) - this.defaultThumbRadius, 0), java.lang.Math.max((this.trackHeight - this.defaultTrackHeight) / 2, 0)), java.lang.Math.max(java.lang.Math.max(this.tickActiveRadius - this.defaultTickActiveRadius, 0), java.lang.Math.max(this.tickInactiveRadius - this.defaultTickInactiveRadius, 0)));
        if (this.trackSidePadding == max) {
            return false;
        }
        this.trackSidePadding = max;
        if (!androidx.core.view.ViewCompat.isLaidOut(this)) {
            return true;
        }
        updateTrackWidth(getWidth());
        return true;
    }

    private void validateValueFrom() {
        float f = this.valueFrom;
        float f2 = this.valueTo;
        if (f >= f2) {
            throw new java.lang.IllegalStateException(java.lang.String.format(EXCEPTION_ILLEGAL_VALUE_FROM, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)));
        }
    }

    private void validateValueTo() {
        float f = this.valueTo;
        float f2 = this.valueFrom;
        if (f <= f2) {
            throw new java.lang.IllegalStateException(java.lang.String.format(EXCEPTION_ILLEGAL_VALUE_TO, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)));
        }
    }

    private boolean valueLandsOnTick(float f) {
        return isMultipleOfStepSize(new java.math.BigDecimal(java.lang.Float.toString(f)).subtract(new java.math.BigDecimal(java.lang.Float.toString(this.valueFrom)), java.math.MathContext.DECIMAL64).doubleValue());
    }

    private boolean isMultipleOfStepSize(double d) {
        double doubleValue = new java.math.BigDecimal(java.lang.Double.toString(d)).divide(new java.math.BigDecimal(java.lang.Float.toString(this.stepSize)), java.math.MathContext.DECIMAL64).doubleValue();
        return java.lang.Math.abs(((double) java.lang.Math.round(doubleValue)) - doubleValue) < THRESHOLD;
    }

    private void validateStepSize() {
        if (this.stepSize <= 0.0f || valueLandsOnTick(this.valueTo)) {
            return;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format(EXCEPTION_ILLEGAL_STEP_SIZE, java.lang.Float.valueOf(this.stepSize), java.lang.Float.valueOf(this.valueFrom), java.lang.Float.valueOf(this.valueTo)));
    }

    private void validateValues() {
        java.util.Iterator<java.lang.Float> it = this.values.iterator();
        while (it.hasNext()) {
            java.lang.Float next = it.next();
            if (next.floatValue() < this.valueFrom || next.floatValue() > this.valueTo) {
                throw new java.lang.IllegalStateException(java.lang.String.format(EXCEPTION_ILLEGAL_VALUE, next, java.lang.Float.valueOf(this.valueFrom), java.lang.Float.valueOf(this.valueTo)));
            }
            if (this.stepSize > 0.0f && !valueLandsOnTick(next.floatValue())) {
                float f = this.valueFrom;
                float f2 = this.stepSize;
                throw new java.lang.IllegalStateException(java.lang.String.format(EXCEPTION_ILLEGAL_DISCRETE_VALUE, next, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f2)));
            }
        }
    }

    private void validateMinSeparation() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new java.lang.IllegalStateException(java.lang.String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION, java.lang.Float.valueOf(minSeparation)));
        }
        float f = this.stepSize;
        if (f <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.separationUnit != 1) {
            throw new java.lang.IllegalStateException(java.lang.String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT, java.lang.Float.valueOf(minSeparation), java.lang.Float.valueOf(f)));
        }
        if (minSeparation < f || !isMultipleOfStepSize(minSeparation)) {
            float f2 = this.stepSize;
            throw new java.lang.IllegalStateException(java.lang.String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE, java.lang.Float.valueOf(minSeparation), java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f2)));
        }
    }

    private void warnAboutFloatingPointError() {
        float f = this.stepSize;
        if (f != 0.0f) {
            if (((int) f) != f) {
                new java.lang.Object[]{"stepSize", java.lang.Float.valueOf(f)};
            }
            float f2 = this.valueFrom;
            if (((int) f2) != f2) {
                new java.lang.Object[]{"valueFrom", java.lang.Float.valueOf(f2)};
            }
            float f3 = this.valueTo;
            if (((int) f3) != f3) {
                new java.lang.Object[]{"valueTo", java.lang.Float.valueOf(f3)};
            }
        }
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValueFrom();
            validateValueTo();
            validateStepSize();
            validateValues();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public void setValueFrom(float f) {
        this.valueFrom = f;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public float getValueTo() {
        return this.valueTo;
    }

    public void setValueTo(float f) {
        this.valueTo = f;
        this.dirtyConfig = true;
        postInvalidate();
    }

    java.util.List<java.lang.Float> getValues() {
        return new java.util.ArrayList(this.values);
    }

    void setValues(java.lang.Float... fArr) {
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        java.util.Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    void setValues(java.util.List<java.lang.Float> list) {
        setValuesInternal(new java.util.ArrayList<>(list));
    }

    private void setValuesInternal(java.util.ArrayList<java.lang.Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalArgumentException("At least one value must be set");
        }
        java.util.Collections.sort(arrayList);
        if (this.values.size() == arrayList.size() && this.values.equals(arrayList)) {
            return;
        }
        this.values = arrayList;
        this.dirtyConfig = true;
        this.focusedThumbIdx = 0;
        updateHaloHotspot();
        createLabelPool();
        dispatchOnChangedProgrammatically();
        postInvalidate();
    }

    private void createLabelPool() {
        if (this.labels.size() > this.values.size()) {
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> subList = this.labels.subList(this.values.size(), this.labels.size());
            for (com.google.android.material.tooltip.TooltipDrawable tooltipDrawable : subList) {
                if (androidx.core.view.ViewCompat.isAttachedToWindow(this)) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            subList.clear();
        }
        while (true) {
            if (this.labels.size() >= this.values.size()) {
                break;
            }
            com.google.android.material.tooltip.TooltipDrawable createFromAttributes = com.google.android.material.tooltip.TooltipDrawable.createFromAttributes(getContext(), null, 0, this.labelStyle);
            this.labels.add(createFromAttributes);
            if (androidx.core.view.ViewCompat.isAttachedToWindow(this)) {
                attachLabelToContentView(createFromAttributes);
            }
        }
        int i = this.labels.size() != 1 ? 1 : 0;
        java.util.Iterator<com.google.android.material.tooltip.TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i);
        }
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(EXCEPTION_ILLEGAL_STEP_SIZE, java.lang.Float.valueOf(f), java.lang.Float.valueOf(this.valueFrom), java.lang.Float.valueOf(this.valueTo)));
        }
        if (this.stepSize != f) {
            this.stepSize = f;
            this.dirtyConfig = true;
            postInvalidate();
        }
    }

    void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    void setCustomThumbDrawable(android.graphics.drawable.Drawable drawable) {
        this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
        this.customThumbDrawablesForValues.clear();
        postInvalidate();
    }

    void setCustomThumbDrawablesForValues(int... iArr) {
        android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    void setCustomThumbDrawablesForValues(android.graphics.drawable.Drawable... drawableArr) {
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = new java.util.ArrayList();
        for (android.graphics.drawable.Drawable drawable : drawableArr) {
            this.customThumbDrawablesForValues.add(initializeCustomThumbDrawable(drawable));
        }
        postInvalidate();
    }

    private android.graphics.drawable.Drawable initializeCustomThumbDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        adjustCustomThumbDrawableBounds(newDrawable);
        return newDrawable;
    }

    private void adjustCustomThumbDrawableBounds(android.graphics.drawable.Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        } else {
            float max = java.lang.Math.max(this.thumbWidth, this.thumbHeight) / java.lang.Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.values.size()) {
            throw new java.lang.IllegalArgumentException("index out of range");
        }
        this.focusedThumbIdx = i;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    protected void setActiveThumbIndex(int i) {
        this.activeThumbIdx = i;
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public void addOnChangeListener(L l) {
        this.changeListeners.add(l);
    }

    public void removeOnChangeListener(L l) {
        this.changeListeners.remove(l);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void addOnSliderTouchListener(T t) {
        this.touchListeners.add(t);
    }

    public void removeOnSliderTouchListener(T t) {
        this.touchListeners.remove(t);
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    public boolean hasLabelFormatter() {
        return this.formatter != null;
    }

    public void setLabelFormatter(com.google.android.material.slider.LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public float getThumbElevation() {
        return this.defaultThumbDrawable.getElevation();
    }

    public void setThumbElevation(float f) {
        this.defaultThumbDrawable.setElevation(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public int getThumbRadius() {
        return this.thumbWidth / 2;
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public int getThumbWidth() {
        return this.thumbWidth;
    }

    public void setThumbWidth(int i) {
        if (i == this.thumbWidth) {
            return;
        }
        this.thumbWidth = i;
        this.defaultThumbDrawable.setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel.builder().setAllCorners(0, this.thumbWidth / 2.0f).build());
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        android.graphics.drawable.Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        java.util.Iterator<android.graphics.drawable.Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout();
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public int getThumbHeight() {
        return this.thumbHeight;
    }

    public void setThumbHeight(int i) {
        if (i == this.thumbHeight) {
            return;
        }
        this.thumbHeight = i;
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, i);
        android.graphics.drawable.Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        java.util.Iterator<android.graphics.drawable.Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout();
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(android.content.res.ColorStateList colorStateList) {
        this.defaultThumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public android.content.res.ColorStateList getThumbStrokeColor() {
        return this.defaultThumbDrawable.getStrokeColor();
    }

    public void setThumbStrokeWidth(float f) {
        this.defaultThumbDrawable.setStrokeWidth(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public float getThumbStrokeWidth() {
        return this.defaultThumbDrawable.getStrokeWidth();
    }

    public int getHaloRadius() {
        return this.haloRadius;
    }

    public void setHaloRadius(int i) {
        if (i == this.haloRadius) {
            return;
        }
        this.haloRadius = i;
        android.graphics.drawable.Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof android.graphics.drawable.RippleDrawable)) {
            com.google.android.material.drawable.DrawableUtils.setRippleDrawableRadius((android.graphics.drawable.RippleDrawable) background, this.haloRadius);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public void setLabelBehavior(int i) {
        if (this.labelBehavior != i) {
            this.labelBehavior = i;
            requestLayout();
        }
    }

    private boolean shouldAlwaysShowLabel() {
        return this.labelBehavior == 3;
    }

    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public int getTrackWidth() {
        return this.trackWidth;
    }

    public int getTrackHeight() {
        return this.trackHeight;
    }

    public void setTrackHeight(int i) {
        if (this.trackHeight != i) {
            this.trackHeight = i;
            invalidateTrack();
            updateWidgetLayout();
        }
    }

    public int getTickActiveRadius() {
        return this.tickActiveRadius;
    }

    public void setTickActiveRadius(int i) {
        if (this.tickActiveRadius != i) {
            this.tickActiveRadius = i;
            this.activeTicksPaint.setStrokeWidth(i * 2);
            updateWidgetLayout();
        }
    }

    public int getTickInactiveRadius() {
        return this.tickInactiveRadius;
    }

    public void setTickInactiveRadius(int i) {
        if (this.tickInactiveRadius != i) {
            this.tickInactiveRadius = i;
            this.inactiveTicksPaint.setStrokeWidth(i * 2);
            updateWidgetLayout();
        }
    }

    private void updateWidgetLayout() {
        boolean maybeIncreaseWidgetHeight = maybeIncreaseWidgetHeight();
        boolean maybeIncreaseTrackSidePadding = maybeIncreaseTrackSidePadding();
        if (maybeIncreaseWidgetHeight) {
            requestLayout();
        } else if (maybeIncreaseTrackSidePadding) {
            postInvalidate();
        }
    }

    private boolean maybeIncreaseWidgetHeight() {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i = this.trackHeight;
        int i2 = this.thumbHeight;
        int paddingTop2 = getPaddingTop();
        int max = java.lang.Math.max(this.minWidgetHeight, java.lang.Math.max(i + paddingTop + paddingBottom, i2 + paddingTop2 + getPaddingBottom()));
        if (max == this.widgetHeight) {
            return false;
        }
        this.widgetHeight = max;
        return true;
    }

    public android.content.res.ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public void setHaloTintList(android.content.res.ColorStateList colorStateList) {
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        android.graphics.drawable.Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof android.graphics.drawable.RippleDrawable)) {
            ((android.graphics.drawable.RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.haloPaint.setColor(getColorForState(colorStateList));
        this.haloPaint.setAlpha(63);
        invalidate();
    }

    public android.content.res.ColorStateList getThumbTintList() {
        return this.defaultThumbDrawable.getFillColor();
    }

    public void setThumbTintList(android.content.res.ColorStateList colorStateList) {
        if (colorStateList.equals(this.defaultThumbDrawable.getFillColor())) {
            return;
        }
        this.defaultThumbDrawable.setFillColor(colorStateList);
        invalidate();
    }

    public android.content.res.ColorStateList getTickTintList() {
        if (!this.tickColorInactive.equals(this.tickColorActive)) {
            throw new java.lang.IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        }
        return this.tickColorActive;
    }

    public void setTickTintList(android.content.res.ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public android.content.res.ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    public void setTickActiveTintList(android.content.res.ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorActive)) {
            return;
        }
        this.tickColorActive = colorStateList;
        this.activeTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public android.content.res.ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    public void setTickInactiveTintList(android.content.res.ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public boolean isTickVisible() {
        return this.tickVisible;
    }

    public void setTickVisible(boolean z) {
        if (this.tickVisible != z) {
            this.tickVisible = z;
            postInvalidate();
        }
    }

    public android.content.res.ColorStateList getTrackTintList() {
        if (!this.trackColorInactive.equals(this.trackColorActive)) {
            throw new java.lang.IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        }
        return this.trackColorActive;
    }

    public void setTrackTintList(android.content.res.ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public android.content.res.ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    public void setTrackActiveTintList(android.content.res.ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorActive)) {
            return;
        }
        this.trackColorActive = colorStateList;
        this.activeTrackPaint.setColor(getColorForState(colorStateList));
        this.stopIndicatorPaint.setColor(getColorForState(this.trackColorActive));
        invalidate();
    }

    public android.content.res.ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public void setTrackInactiveTintList(android.content.res.ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorInactive)) {
            return;
        }
        this.trackColorInactive = colorStateList;
        this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public int getThumbTrackGapSize() {
        return this.thumbTrackGapSize;
    }

    public void setThumbTrackGapSize(int i) {
        if (this.thumbTrackGapSize == i) {
            return;
        }
        this.thumbTrackGapSize = i;
        invalidate();
    }

    public int getTrackStopIndicatorSize() {
        return this.trackStopIndicatorSize;
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.trackStopIndicatorSize == i) {
            return;
        }
        this.trackStopIndicatorSize = i;
        this.stopIndicatorPaint.setStrokeWidth(i);
        invalidate();
    }

    public int getTrackInsideCornerSize() {
        return this.trackInsideCornerSize;
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.trackInsideCornerSize == i) {
            return;
        }
        this.trackInsideCornerSize = i;
        invalidate();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        com.google.android.material.internal.ViewOverlayImpl contentViewOverlay;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (contentViewOverlay = com.google.android.material.internal.ViewUtils.getContentViewOverlay(this)) == null) {
            return;
        }
        java.util.Iterator<com.google.android.material.tooltip.TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            contentViewOverlay.remove(it.next());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
        java.util.Iterator<com.google.android.material.tooltip.TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            attachLabelToContentView(it.next());
        }
    }

    private void attachLabelToContentView(com.google.android.material.tooltip.TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(com.google.android.material.internal.ViewUtils.getContentView(this));
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        com.google.android.material.slider.BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.labelsAreAnimatedIn = false;
        java.util.Iterator<com.google.android.material.tooltip.TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        super.onDetachedFromWindow();
    }

    private void detachLabelFromContentView(com.google.android.material.tooltip.TooltipDrawable tooltipDrawable) {
        com.google.android.material.internal.ViewOverlayImpl contentViewOverlay = com.google.android.material.internal.ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(com.google.android.material.internal.ViewUtils.getContentView(this));
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(this.widgetHeight + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        updateTrackWidth(i);
        updateHaloHotspot();
    }

    private void maybeCalculateTicksCoordinates() {
        if (this.stepSize > 0.0f) {
            validateConfigurationIfDirty();
            int min = java.lang.Math.min((int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f), (this.trackWidth / this.minTickSpacing) + 1);
            float[] fArr = this.ticksCoordinates;
            if (fArr == null || fArr.length != min * 2) {
                this.ticksCoordinates = new float[min * 2];
            }
            float f = this.trackWidth / (min - 1);
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.ticksCoordinates;
                fArr2[i] = this.trackSidePadding + ((i / 2.0f) * f);
                fArr2[i + 1] = calculateTrackCenter();
            }
        }
    }

    private void updateTrackWidth(int i) {
        this.trackWidth = java.lang.Math.max(i - (this.trackSidePadding * 2), 0);
        maybeCalculateTicksCoordinates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (shouldDrawCompatHalo() || getMeasuredWidth() <= 0) {
            return;
        }
        android.graphics.drawable.Drawable background = getBackground();
        if (background instanceof android.graphics.drawable.RippleDrawable) {
            int normalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding);
            int calculateTrackCenter = calculateTrackCenter();
            int i = this.haloRadius;
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(background, normalizeValue - i, calculateTrackCenter - i, normalizeValue + i, calculateTrackCenter + i);
        }
    }

    private int calculateTrackCenter() {
        return (this.widgetHeight / 2) + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            maybeCalculateTicksCoordinates();
        }
        super.onDraw(canvas);
        int calculateTrackCenter = calculateTrackCenter();
        float floatValue = this.values.get(0).floatValue();
        java.util.ArrayList<java.lang.Float> arrayList = this.values;
        float floatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (floatValue2 < this.valueTo || (this.values.size() > 1 && floatValue > this.valueFrom)) {
            drawInactiveTrack(canvas, this.trackWidth, calculateTrackCenter);
        }
        if (floatValue2 > this.valueFrom) {
            drawActiveTrack(canvas, this.trackWidth, calculateTrackCenter);
        }
        maybeDrawTicks(canvas);
        maybeDrawStopIndicator(canvas, calculateTrackCenter);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawCompatHalo(canvas, this.trackWidth, calculateTrackCenter);
        }
        updateLabels();
        drawThumbs(canvas, this.trackWidth, calculateTrackCenter);
    }

    private float[] getActiveRange() {
        float floatValue = this.values.get(0).floatValue();
        java.util.ArrayList<java.lang.Float> arrayList = this.values;
        float floatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.values.size() == 1) {
            floatValue = this.valueFrom;
        }
        float normalizeValue = normalizeValue(floatValue);
        float normalizeValue2 = normalizeValue(floatValue2);
        return isRtl() ? new float[]{normalizeValue2, normalizeValue} : new float[]{normalizeValue, normalizeValue2};
    }

    private void drawInactiveTrack(android.graphics.Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        float f = i;
        float f2 = this.trackSidePadding + (activeRange[1] * f);
        if (f2 < r1 + i) {
            if (hasGapBetweenThumbAndTrack()) {
                float f3 = i2;
                float f4 = this.trackHeight / 2.0f;
                this.trackRect.set(f2 + this.thumbTrackGapSize, f3 - f4, this.trackSidePadding + i + f4, f3 + f4);
                updateTrack(canvas, this.inactiveTrackPaint, this.trackRect, com.google.android.material.slider.BaseSlider.FullCornerDirection.RIGHT);
            } else {
                this.inactiveTrackPaint.setStyle(android.graphics.Paint.Style.STROKE);
                this.inactiveTrackPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                float f5 = i2;
                canvas.drawLine(f2, f5, this.trackSidePadding + i, f5, this.inactiveTrackPaint);
            }
        }
        float f6 = this.trackSidePadding;
        float f7 = (activeRange[0] * f) + f6;
        if (f7 > f6) {
            if (hasGapBetweenThumbAndTrack()) {
                float f8 = this.trackHeight / 2.0f;
                float f9 = i2;
                this.trackRect.set(this.trackSidePadding - f8, f9 - f8, f7 - this.thumbTrackGapSize, f9 + f8);
                updateTrack(canvas, this.inactiveTrackPaint, this.trackRect, com.google.android.material.slider.BaseSlider.FullCornerDirection.LEFT);
                return;
            }
            this.inactiveTrackPaint.setStyle(android.graphics.Paint.Style.STROKE);
            this.inactiveTrackPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            float f10 = i2;
            canvas.drawLine(this.trackSidePadding, f10, f7, f10, this.inactiveTrackPaint);
        }
    }

    private float normalizeValue(float f) {
        float f2 = this.valueFrom;
        float f3 = (f - f2) / (this.valueTo - f2);
        return isRtl() ? 1.0f - f3 : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawActiveTrack(android.graphics.Canvas canvas, int i, int i2) {
        int i3;
        float[] activeRange = getActiveRange();
        float f = this.trackSidePadding;
        float f2 = i;
        float f3 = f + (activeRange[1] * f2);
        float f4 = f + (activeRange[0] * f2);
        if (hasGapBetweenThumbAndTrack()) {
            com.google.android.material.slider.BaseSlider.FullCornerDirection fullCornerDirection = com.google.android.material.slider.BaseSlider.FullCornerDirection.NONE;
            if (this.values.size() == 1) {
                fullCornerDirection = isRtl() ? com.google.android.material.slider.BaseSlider.FullCornerDirection.RIGHT : com.google.android.material.slider.BaseSlider.FullCornerDirection.LEFT;
            }
            for (int i4 = 0; i4 < this.values.size(); i4++) {
                if (this.values.size() > 1) {
                    if (i4 > 0) {
                        f4 = valueToX(this.values.get(i4 - 1).floatValue());
                    }
                    float valueToX = valueToX(this.values.get(i4).floatValue());
                    if (isRtl()) {
                        f3 = f4;
                        f4 = valueToX;
                    } else {
                        f3 = valueToX;
                    }
                }
                int i5 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[fullCornerDirection.ordinal()];
                if (i5 == 1) {
                    i3 = this.thumbTrackGapSize;
                    f4 += i3;
                } else if (i5 != 2) {
                    if (i5 == 3) {
                        f4 += this.thumbTrackGapSize;
                        f3 += this.trackHeight / 2.0f;
                    }
                    if (f4 >= f3) {
                        float f5 = i2;
                        float f6 = this.trackHeight / 2.0f;
                        this.trackRect.set(f4, f5 - f6, f3, f5 + f6);
                        updateTrack(canvas, this.activeTrackPaint, this.trackRect, fullCornerDirection);
                    }
                } else {
                    f4 -= this.trackHeight / 2.0f;
                    i3 = this.thumbTrackGapSize;
                }
                f3 -= i3;
                if (f4 >= f3) {
                }
            }
            return;
        }
        this.activeTrackPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.activeTrackPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        float f7 = i2;
        canvas.drawLine(f4, f7, f3, f7, this.activeTrackPaint);
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;

        static {
            int[] iArr = new int[com.google.android.material.slider.BaseSlider.FullCornerDirection.values().length];
            $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection = iArr;
            try {
                iArr[com.google.android.material.slider.BaseSlider.FullCornerDirection.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[com.google.android.material.slider.BaseSlider.FullCornerDirection.LEFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[com.google.android.material.slider.BaseSlider.FullCornerDirection.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[com.google.android.material.slider.BaseSlider.FullCornerDirection.BOTH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private boolean hasGapBetweenThumbAndTrack() {
        return this.thumbTrackGapSize > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateTrack(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.RectF rectF, com.google.android.material.slider.BaseSlider.FullCornerDirection fullCornerDirection) {
        int i;
        float f;
        float f2 = this.trackHeight / 2.0f;
        int i2 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[fullCornerDirection.ordinal()];
        if (i2 == 1) {
            i = this.trackInsideCornerSize;
            f2 = i;
        } else if (i2 == 2) {
            i = this.trackInsideCornerSize;
        } else {
            if (i2 == 3) {
                f = f2;
                f2 = this.trackInsideCornerSize;
            } else {
                f = f2;
            }
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            this.trackPath.reset();
            if (rectF.width() < f2 + f) {
                this.trackPath.addRoundRect(rectF, getCornerRadii(f2, f), android.graphics.Path.Direction.CW);
                canvas.drawPath(this.trackPath, paint);
                return;
            }
            float min = java.lang.Math.min(f2, f);
            float max = java.lang.Math.max(f2, f);
            canvas.save();
            this.trackPath.addRoundRect(rectF, min, min, android.graphics.Path.Direction.CW);
            canvas.clipPath(this.trackPath);
            int i3 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[fullCornerDirection.ordinal()];
            if (i3 == 2) {
                this.cornerRect.set(rectF.left, rectF.top, rectF.left + (2.0f * max), rectF.bottom);
            } else if (i3 == 3) {
                this.cornerRect.set(rectF.right - (2.0f * max), rectF.top, rectF.right, rectF.bottom);
            } else {
                this.cornerRect.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
            }
            canvas.drawRoundRect(this.cornerRect, max, max, paint);
            canvas.restore();
            return;
        }
        f = i;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        this.trackPath.reset();
        if (rectF.width() < f2 + f) {
        }
    }

    private float[] getCornerRadii(float f, float f2) {
        return new float[]{f, f, f2, f2, f2, f2, f, f};
    }

    private void maybeDrawTicks(android.graphics.Canvas canvas) {
        if (!this.tickVisible || this.stepSize <= 0.0f) {
            return;
        }
        float[] activeRange = getActiveRange();
        int ceil = (int) java.lang.Math.ceil(activeRange[0] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
        int floor = (int) java.lang.Math.floor(activeRange[1] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
        if (ceil > 0) {
            canvas.drawPoints(this.ticksCoordinates, 0, ceil * 2, this.inactiveTicksPaint);
        }
        if (ceil <= floor) {
            canvas.drawPoints(this.ticksCoordinates, ceil * 2, ((floor - ceil) + 1) * 2, this.activeTicksPaint);
        }
        int i = (floor + 1) * 2;
        float[] fArr = this.ticksCoordinates;
        if (i < fArr.length) {
            canvas.drawPoints(fArr, i, fArr.length - i, this.inactiveTicksPaint);
        }
    }

    private void maybeDrawStopIndicator(android.graphics.Canvas canvas, int i) {
        if (this.trackStopIndicatorSize > 0) {
            if (this.values.size() > 0) {
                java.util.ArrayList<java.lang.Float> arrayList = this.values;
                float floatValue = arrayList.get(arrayList.size() - 1).floatValue();
                float f = this.valueTo;
                if (floatValue < f) {
                    canvas.drawPoint(valueToX(f), i, this.stopIndicatorPaint);
                }
            }
            if (this.values.size() > 1) {
                float floatValue2 = this.values.get(0).floatValue();
                float f2 = this.valueFrom;
                if (floatValue2 > f2) {
                    canvas.drawPoint(valueToX(f2), i, this.stopIndicatorPaint);
                }
            }
        }
    }

    private void drawThumbs(android.graphics.Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.values.size(); i3++) {
            float floatValue = this.values.get(i3).floatValue();
            android.graphics.drawable.Drawable drawable = this.customThumbDrawable;
            if (drawable != null) {
                drawThumbDrawable(canvas, i, i2, floatValue, drawable);
            } else if (i3 < this.customThumbDrawablesForValues.size()) {
                drawThumbDrawable(canvas, i, i2, floatValue, this.customThumbDrawablesForValues.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.trackSidePadding + (normalizeValue(floatValue) * i), i2, getThumbRadius(), this.thumbPaint);
                }
                drawThumbDrawable(canvas, i, i2, floatValue, this.defaultThumbDrawable);
            }
        }
    }

    private void drawThumbDrawable(android.graphics.Canvas canvas, int i, int i2, float f, android.graphics.drawable.Drawable drawable) {
        canvas.save();
        canvas.translate((this.trackSidePadding + ((int) (normalizeValue(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void maybeDrawCompatHalo(android.graphics.Canvas canvas, int i, int i2) {
        if (shouldDrawCompatHalo()) {
            int normalizeValue = (int) (this.trackSidePadding + (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i));
            if (android.os.Build.VERSION.SDK_INT < 28) {
                int i3 = this.haloRadius;
                canvas.clipRect(normalizeValue - i3, i2 - i3, normalizeValue + i3, i3 + i2, android.graphics.Region.Op.UNION);
            }
            canvas.drawCircle(normalizeValue, i2, this.haloRadius, this.haloPaint);
        }
    }

    private boolean shouldDrawCompatHalo() {
        return this.forceDrawCompatHalo || !(getBackground() instanceof android.graphics.drawable.RippleDrawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r2 != 3) goto L53;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int i;
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f;
        float max = java.lang.Math.max(0.0f, f);
        this.touchPosition = max;
        this.touchPosition = java.lang.Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownX = x;
            if (!isPotentialVerticalScroll(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    snapTouchPosition();
                    updateHaloHotspot();
                    if (hasGapBetweenThumbAndTrack()) {
                        int i2 = this.thumbWidth;
                        this.defaultThumbWidth = i2;
                        this.defaultThumbTrackGapSize = this.thumbTrackGapSize;
                        int round = java.lang.Math.round(i2 * 0.5f);
                        int i3 = this.thumbWidth;
                        setThumbWidth(round);
                        setThumbTrackGapSize(this.thumbTrackGapSize - ((i3 - round) / 2));
                    }
                    invalidate();
                    onStartTrackingTouch();
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.thumbIsPressed) {
                        if (isPotentialVerticalScroll(motionEvent) && java.lang.Math.abs(x - this.touchDownX) < this.scaledTouchSlop) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        onStartTrackingTouch();
                    }
                    if (pickActiveThumb()) {
                        this.thumbIsPressed = true;
                        snapTouchPosition();
                        updateHaloHotspot();
                        invalidate();
                    }
                }
            }
            this.thumbIsPressed = false;
            android.view.MotionEvent motionEvent2 = this.lastEvent;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && java.lang.Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && java.lang.Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop && pickActiveThumb()) {
                onStartTrackingTouch();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                updateHaloHotspot();
                if (hasGapBetweenThumbAndTrack() && (i = this.defaultThumbWidth) != -1 && this.defaultThumbTrackGapSize != -1) {
                    setThumbWidth(i);
                    setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                }
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
            }
            invalidate();
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = android.view.MotionEvent.obtain(motionEvent);
        return true;
    }

    private double snapPosition(float f) {
        float f2 = this.stepSize;
        if (f2 <= 0.0f) {
            return f;
        }
        return java.lang.Math.round(f * r0) / ((int) ((this.valueTo - this.valueFrom) / f2));
    }

    protected boolean pickActiveThumb() {
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float valueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float abs = java.lang.Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.values.size(); i++) {
            float abs2 = java.lang.Math.abs(this.values.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float valueToX2 = valueToX(this.values.get(i).floatValue());
            if (java.lang.Float.compare(abs2, abs) > 0) {
                break;
            }
            boolean z = !isRtl() ? valueToX2 - valueToX >= 0.0f : valueToX2 - valueToX <= 0.0f;
            if (java.lang.Float.compare(abs2, abs) < 0) {
                this.activeThumbIdx = i;
            } else {
                if (java.lang.Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (java.lang.Math.abs(valueToX2 - valueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        return false;
                    }
                    if (z) {
                        this.activeThumbIdx = i;
                    }
                }
            }
            abs = abs2;
        }
        return this.activeThumbIdx != -1;
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.touchPosition;
        if (isRtl()) {
            f = 1.0f - f;
        }
        float f2 = this.valueTo;
        float f3 = this.valueFrom;
        return (f * (f2 - f3)) + f3;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    private boolean snapActiveThumbToValue(float f) {
        return snapThumbToValue(this.activeThumbIdx, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i, float f) {
        this.focusedThumbIdx = i;
        if (java.lang.Math.abs(f - this.values.get(i).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i, java.lang.Float.valueOf(getClampedValue(i, f)));
        dispatchOnChangedFromUser(i);
        return true;
    }

    private float getClampedValue(int i, float f) {
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return androidx.core.math.MathUtils.clamp(f, i3 < 0 ? this.valueFrom : this.values.get(i3).floatValue() + minSeparation, i2 >= this.values.size() ? this.valueTo : this.values.get(i2).floatValue() - minSeparation);
    }

    private float dimenToValue(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.trackSidePadding) / this.trackWidth;
        float f3 = this.valueFrom;
        return (f2 * (f3 - this.valueTo)) + f3;
    }

    protected void setSeparationUnit(int i) {
        this.separationUnit = i;
        this.dirtyConfig = true;
        postInvalidate();
    }

    private float getValueOfTouchPosition() {
        double snapPosition = snapPosition(this.touchPosition);
        if (isRtl()) {
            snapPosition = 1.0d - snapPosition;
        }
        float f = this.valueTo;
        return (float) ((snapPosition * (f - r3)) + this.valueFrom);
    }

    private float valueToX(float f) {
        return (normalizeValue(f) * this.trackWidth) + this.trackSidePadding;
    }

    private static float getAnimatorCurrentValueOrDefault(android.animation.ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    private android.animation.ValueAnimator createLabelAnimator(boolean z) {
        int resolveThemeDuration;
        android.animation.TimeInterpolator resolveThemeInterpolator;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(getAnimatorCurrentValueOrDefault(z ? this.labelsOutAnimator : this.labelsInAnimator, z ? 0.0f : 1.0f), z ? 1.0f : 0.0f);
        if (z) {
            resolveThemeDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_ENTER_DURATION_ATTR, 83);
            resolveThemeInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_ENTER_EASING_ATTR, com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            resolveThemeDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_EXIT_DURATION_ATTR, 117);
            resolveThemeInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_EXIT_EASING_ATTR, com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        ofFloat.setDuration(resolveThemeDuration);
        ofFloat.setInterpolator(resolveThemeInterpolator);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                java.util.Iterator it = com.google.android.material.slider.BaseSlider.this.labels.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.tooltip.TooltipDrawable) it.next()).setRevealFraction(floatValue);
                }
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(com.google.android.material.slider.BaseSlider.this);
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLabels() {
        int i = this.labelBehavior;
        if (i == 0 || i == 1) {
            if (this.activeThumbIdx != -1 && isEnabled()) {
                ensureLabelsAdded();
                return;
            } else {
                ensureLabelsRemoved();
                return;
            }
        }
        if (i == 2) {
            ensureLabelsRemoved();
            return;
        }
        if (i == 3) {
            if (isEnabled() && isSliderVisibleOnScreen()) {
                ensureLabelsAdded();
                return;
            } else {
                ensureLabelsRemoved();
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected labelBehavior: ");
        sb.append(this.labelBehavior);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private boolean isSliderVisibleOnScreen() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.google.android.material.internal.ViewUtils.getContentView(this).getHitRect(rect);
        return getLocalVisibleRect(rect);
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            android.animation.ValueAnimator createLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = createLabelAnimator;
            this.labelsInAnimator = null;
            createLabelAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    super.onAnimationEnd(animator);
                    com.google.android.material.internal.ViewOverlayImpl contentViewOverlay = com.google.android.material.internal.ViewUtils.getContentViewOverlay(com.google.android.material.slider.BaseSlider.this);
                    java.util.Iterator it = com.google.android.material.slider.BaseSlider.this.labels.iterator();
                    while (it.hasNext()) {
                        contentViewOverlay.remove((com.google.android.material.tooltip.TooltipDrawable) it.next());
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
    }

    private void ensureLabelsAdded() {
        if (!this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = true;
            android.animation.ValueAnimator createLabelAnimator = createLabelAnimator(true);
            this.labelsInAnimator = createLabelAnimator;
            this.labelsOutAnimator = null;
            createLabelAnimator.start();
        }
        java.util.Iterator<com.google.android.material.tooltip.TooltipDrawable> it = this.labels.iterator();
        for (int i = 0; i < this.values.size() && it.hasNext(); i++) {
            if (i != this.focusedThumbIdx) {
                setValueForLabel(it.next(), this.values.get(i).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Not enough labels(%d) to display all the values(%d)", java.lang.Integer.valueOf(this.labels.size()), java.lang.Integer.valueOf(this.values.size())));
        }
        setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String formatValue(float f) {
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f);
        }
        return java.lang.String.format(((float) ((int) f)) == f ? "%.0f" : com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.lang.Float.valueOf(f));
    }

    private void setValueForLabel(com.google.android.material.tooltip.TooltipDrawable tooltipDrawable, float f) {
        tooltipDrawable.setText(formatValue(f));
        positionLabel(tooltipDrawable, f);
        com.google.android.material.internal.ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    private void positionLabel(com.google.android.material.tooltip.TooltipDrawable tooltipDrawable, float f) {
        int normalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int calculateTrackCenter = calculateTrackCenter() - (this.labelPadding + (this.thumbHeight / 2));
        tooltipDrawable.setBounds(normalizeValue, calculateTrackCenter - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + normalizeValue, calculateTrackCenter);
        android.graphics.Rect rect = new android.graphics.Rect(tooltipDrawable.getBounds());
        com.google.android.material.internal.DescendantOffsetUtils.offsetDescendantRect(com.google.android.material.internal.ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackHeight);
        this.activeTrackPaint.setStrokeWidth(this.trackHeight);
    }

    private boolean isInVerticalScrollingContainer() {
        for (android.view.ViewParent parent = getParent(); parent instanceof android.view.ViewGroup; parent = parent.getParent()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMouseEvent(android.view.MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private boolean isPotentialVerticalScroll(android.view.MotionEvent motionEvent) {
        return !isMouseEvent(motionEvent) && isInVerticalScrollingContainer();
    }

    private void dispatchOnChangedProgrammatically() {
        for (L l : this.changeListeners) {
            java.util.Iterator<java.lang.Float> it = this.values.iterator();
            while (it.hasNext()) {
                l.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    private void dispatchOnChangedFromUser(int i) {
        java.util.Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.values.get(i).floatValue(), true);
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        scheduleAccessibilityEventSender(i);
    }

    private void onStartTrackingTouch() {
        java.util.Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        java.util.Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        this.stopIndicatorPaint.setColor(getColorForState(this.trackColorActive));
        for (com.google.android.material.tooltip.TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.defaultThumbDrawable.isStateful()) {
            this.defaultThumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    private int getColorForState(android.content.res.ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    void forceDrawCompatHalo(boolean z) {
        this.forceDrawCompatHalo = z;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            java.lang.Boolean onKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i, keyEvent);
            return onKeyDownNoActiveThumb != null ? onKeyDownNoActiveThumb.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        java.lang.Float calculateIncrementForKey = calculateIncrementForKey(i);
        if (calculateIncrementForKey != null) {
            if (snapActiveThumbToValue(this.values.get(this.activeThumbIdx).floatValue() + calculateIncrementForKey.floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return moveFocus(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.activeThumbIdx = -1;
        postInvalidate();
        return true;
    }

    private java.lang.Boolean onKeyDownNoActiveThumb(int i, android.view.KeyEvent keyEvent) {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (i == 61) {
            if (keyEvent.hasNoModifiers()) {
                return java.lang.Boolean.valueOf(moveFocus(1));
            }
            if (keyEvent.isShiftPressed()) {
                return java.lang.Boolean.valueOf(moveFocus(-1));
            }
            return java.lang.Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    moveFocus(-1);
                    return bool;
                }
                if (i != 70) {
                    switch (i) {
                        case 21:
                            moveFocusInAbsoluteDirection(-1);
                            break;
                        case 22:
                            moveFocusInAbsoluteDirection(1);
                            break;
                    }
                    return bool;
                }
            }
            moveFocus(1);
            return bool;
        }
        this.activeThumbIdx = this.focusedThumbIdx;
        postInvalidate();
        return bool;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i, keyEvent);
    }

    final boolean isRtl() {
        return androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
    }

    private boolean moveFocus(int i) {
        int i2 = this.focusedThumbIdx;
        int clamp = (int) androidx.core.math.MathUtils.clamp(i2 + i, 0L, this.values.size() - 1);
        this.focusedThumbIdx = clamp;
        if (clamp == i2) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = clamp;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i) {
        if (isRtl()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return moveFocus(i);
    }

    private java.lang.Float calculateIncrementForKey(int i) {
        float calculateStepIncrement = this.isLongPress ? calculateStepIncrement(20) : calculateStepIncrement();
        if (i == 21) {
            if (!isRtl()) {
                calculateStepIncrement = -calculateStepIncrement;
            }
            return java.lang.Float.valueOf(calculateStepIncrement);
        }
        if (i == 22) {
            if (isRtl()) {
                calculateStepIncrement = -calculateStepIncrement;
            }
            return java.lang.Float.valueOf(calculateStepIncrement);
        }
        if (i == 69) {
            return java.lang.Float.valueOf(-calculateStepIncrement);
        }
        if (i == 70 || i == 81) {
            return java.lang.Float.valueOf(calculateStepIncrement);
        }
        return null;
    }

    private float calculateStepIncrement() {
        float f = this.stepSize;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i) {
        float calculateStepIncrement = calculateStepIncrement();
        return (this.valueTo - this.valueFrom) / calculateStepIncrement <= i ? calculateStepIncrement : java.lang.Math.round(r1 / r4) * calculateStepIncrement;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.activeThumbIdx = -1;
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
        } else {
            focusThumbOnFocusGained(i);
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
        }
    }

    private void focusThumbOnFocusGained(int i) {
        if (i == 1) {
            moveFocus(Integer.MAX_VALUE);
            return;
        }
        if (i == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i == 17) {
            moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
        } else {
            if (i != 66) {
                return;
            }
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    @Override // android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        return this.accessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private void scheduleAccessibilityEventSender(int i) {
        com.google.android.material.slider.BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new com.google.android.material.slider.BaseSlider.AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(i);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    class AccessibilityEventSender implements java.lang.Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        void setVirtualViewId(int i) {
            this.virtualViewId = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.android.material.slider.BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.slider.BaseSlider.SliderState sliderState = new com.google.android.material.slider.BaseSlider.SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new java.util.ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.google.android.material.slider.BaseSlider.SliderState sliderState = (com.google.android.material.slider.BaseSlider.SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
    }

    static class SliderState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.slider.BaseSlider.SliderState> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.slider.BaseSlider.SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.slider.BaseSlider.SliderState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.slider.BaseSlider.SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.slider.BaseSlider.SliderState[] newArray(int i) {
                return new com.google.android.material.slider.BaseSlider.SliderState[i];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        java.util.ArrayList<java.lang.Float> values;

        SliderState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(android.os.Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, java.lang.Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }
    }

    void updateBoundsForVirtualViewId(int i, android.graphics.Rect rect) {
        int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i).floatValue()) * this.trackWidth));
        int calculateTrackCenter = calculateTrackCenter();
        int max = java.lang.Math.max(this.thumbWidth / 2, this.minTouchTargetSize / 2);
        int max2 = java.lang.Math.max(this.thumbHeight / 2, this.minTouchTargetSize / 2);
        rect.set(normalizeValue - max, calculateTrackCenter - max2, normalizeValue + max, calculateTrackCenter + max2);
    }

    static class AccessibilityHelper extends androidx.customview.widget.ExploreByTouchHelper {
        private final com.google.android.material.slider.BaseSlider<?, ?, ?> slider;
        final android.graphics.Rect virtualViewBounds;

        AccessibilityHelper(com.google.android.material.slider.BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new android.graphics.Rect();
            this.slider = baseSlider;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.slider.getValues().size(); i++) {
                this.slider.updateBoundsForVirtualViewId(i, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(java.util.List<java.lang.Integer> list) {
            for (int i = 0; i < this.slider.getValues().size(); i++) {
                list.add(java.lang.Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            java.util.List<java.lang.Float> values = this.slider.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(android.widget.SeekBar.class.getName());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb.append(this.slider.getContentDescription());
                sb.append(",");
            }
            java.lang.String formatValue = this.slider.formatValue(floatValue);
            java.lang.String string = this.slider.getContext().getString(com.google.android.material.R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i);
            }
            sb.append(java.lang.String.format(java.util.Locale.US, "%s, %s", string, formatValue));
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.slider.updateBoundsForVirtualViewId(i, this.virtualViewBounds);
            accessibilityNodeInfoCompat.setBoundsInParent(this.virtualViewBounds);
        }

        private java.lang.String startOrEndDescription(int i) {
            if (i == this.slider.getValues().size() - 1) {
                return this.slider.getContext().getString(com.google.android.material.R.string.material_slider_range_end);
            }
            if (i == 0) {
                return this.slider.getContext().getString(com.google.android.material.R.string.material_slider_range_start);
            }
            return "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, android.os.Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float calculateStepIncrement = this.slider.calculateStepIncrement(20);
                if (i2 == 8192) {
                    calculateStepIncrement = -calculateStepIncrement;
                }
                if (this.slider.isRtl()) {
                    calculateStepIncrement = -calculateStepIncrement;
                }
                if (!this.slider.snapThumbToValue(i, androidx.core.math.MathUtils.clamp(this.slider.getValues().get(i).floatValue() + calculateStepIncrement, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                    return false;
                }
                this.slider.updateHaloHotspot();
                this.slider.postInvalidate();
                invalidateVirtualView(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                if (this.slider.snapThumbToValue(i, bundle.getFloat(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                    this.slider.updateHaloHotspot();
                    this.slider.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
            }
            return false;
        }
    }
}
