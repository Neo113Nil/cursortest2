package com.google.android.material.timepicker;

/* loaded from: classes8.dex */
class RadialViewGroup extends androidx.constraintlayout.widget.ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final java.lang.String SKIP_TAG = "skip";
    private com.google.android.material.shape.MaterialShapeDrawable background;
    private int radius;
    private final java.lang.Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(android.content.Context context) {
        this(context, null);
    }

    public RadialViewGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.view.LayoutInflater.from(context).inflate(com.google.android.material.R.layout.material_radial_view_group, this);
        androidx.core.view.ViewCompat.setBackground(this, createBackground());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.RadialViewGroup, i, 0);
        this.radius = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new java.lang.Runnable() { // from class: com.google.android.material.timepicker.RadialViewGroup$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.timepicker.RadialViewGroup.this.updateLayoutParams();
            }
        };
        obtainStyledAttributes.recycle();
    }

    private android.graphics.drawable.Drawable createBackground() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new com.google.android.material.shape.RelativeCornerSize(0.5f));
        this.background.setFillColor(android.content.res.ColorStateList.valueOf(-1));
        return this.background;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.background.setFillColor(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(androidx.core.view.ViewCompat.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    private void updateLayoutParamsAsync() {
        android.os.Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    protected void updateLayoutParams() {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.clone(this);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getId() != com.google.android.material.R.id.circle_center && !shouldSkipView(childAt)) {
                int i2 = (java.lang.Integer) childAt.getTag(com.google.android.material.R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new java.util.ArrayList());
                }
                ((java.util.List) hashMap.get(i2)).add(childAt);
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            addConstraints((java.util.List) entry.getValue(), constraintSet, getLeveledRadius(((java.lang.Integer) entry.getKey()).intValue()));
        }
        constraintSet.applyTo(this);
    }

    private void addConstraints(java.util.List<android.view.View> list, androidx.constraintlayout.widget.ConstraintSet constraintSet, int i) {
        java.util.Iterator<android.view.View> it = list.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            constraintSet.constrainCircle(it.next().getId(), com.google.android.material.R.id.circle_center, i, f);
            f += 360.0f / list.size();
        }
    }

    public void setRadius(int i) {
        this.radius = i;
        updateLayoutParams();
    }

    public int getRadius() {
        return this.radius;
    }

    int getLeveledRadius(int i) {
        return i == 2 ? java.lang.Math.round(this.radius * LEVEL_RADIUS_RATIO) : this.radius;
    }

    private static boolean shouldSkipView(android.view.View view) {
        return "skip".equals(view.getTag());
    }
}
