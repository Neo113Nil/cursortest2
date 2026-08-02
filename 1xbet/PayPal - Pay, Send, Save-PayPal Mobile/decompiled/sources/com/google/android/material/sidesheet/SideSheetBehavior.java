package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
public class SideSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> implements com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = com.google.android.material.R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private android.content.res.ColorStateList backgroundTint;
    private final java.util.Set<com.google.android.material.sidesheet.SideSheetCallback> callbacks;
    private int childWidth;
    private int coplanarSiblingViewId;
    private java.lang.ref.WeakReference<android.view.View> coplanarSiblingViewRef;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;
    private com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private com.google.android.material.sidesheet.SheetDelegate sheetDelegate;
    private com.google.android.material.motion.MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final com.google.android.material.sidesheet.SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    private android.view.VelocityTracker velocityTracker;
    private androidx.customview.widget.ViewDragHelper viewDragHelper;
    private java.lang.ref.WeakReference<V> viewRef;

    float getHideThreshold() {
        return 0.5f;
    }

    int getSignificantVelocityThreshold() {
        return 500;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new com.google.android.material.sidesheet.SideSheetBehavior.StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new java.util.LinkedHashSet();
        this.dragCallback = new androidx.customview.widget.ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i) {
                return (com.google.android.material.sidesheet.SideSheetBehavior.this.state == 1 || com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef == null || com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
                android.view.View coplanarSiblingView = com.google.android.material.sidesheet.SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    com.google.android.material.sidesheet.SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                com.google.android.material.sidesheet.SideSheetBehavior.this.dispatchOnSlide(view, i);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1 && com.google.android.material.sidesheet.SideSheetBehavior.this.draggable) {
                    com.google.android.material.sidesheet.SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(android.view.View view, float f, float f2) {
                int calculateTargetStateOnViewReleased = com.google.android.material.sidesheet.SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f, f2);
                com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = com.google.android.material.sidesheet.SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, calculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i, int i2) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
                return androidx.core.math.MathUtils.clamp(i, com.google.android.material.sidesheet.SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), com.google.android.material.sidesheet.SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(android.view.View view) {
                return com.google.android.material.sidesheet.SideSheetBehavior.this.childWidth + com.google.android.material.sidesheet.SideSheetBehavior.this.getInnerMargin();
            }
        };
    }

    public SideSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new com.google.android.material.sidesheet.SideSheetBehavior.StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new java.util.LinkedHashSet();
        this.dragCallback = new androidx.customview.widget.ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i) {
                return (com.google.android.material.sidesheet.SideSheetBehavior.this.state == 1 || com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef == null || com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
                android.view.View coplanarSiblingView = com.google.android.material.sidesheet.SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    com.google.android.material.sidesheet.SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                com.google.android.material.sidesheet.SideSheetBehavior.this.dispatchOnSlide(view, i);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1 && com.google.android.material.sidesheet.SideSheetBehavior.this.draggable) {
                    com.google.android.material.sidesheet.SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(android.view.View view, float f, float f2) {
                int calculateTargetStateOnViewReleased = com.google.android.material.sidesheet.SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f, f2);
                com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = com.google.android.material.sidesheet.SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, calculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i, int i2) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
                return androidx.core.math.MathUtils.clamp(i, com.google.android.material.sidesheet.SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), com.google.android.material.sidesheet.SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(android.view.View view) {
                return com.google.android.material.sidesheet.SideSheetBehavior.this.childWidth + com.google.android.material.sidesheet.SideSheetBehavior.this.getInnerMargin();
            }
        };
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, com.google.android.material.R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = com.google.android.material.shape.ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            setCoplanarSiblingViewId(obtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        this.maximumVelocity = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void setSheetEdge(V v, int i) {
        setSheetEdge(androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) v.getLayoutParams()).gravity, i) == 3 ? 1 : 0);
    }

    private void setSheetEdge(int i) {
        com.google.android.material.sidesheet.SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i) {
            if (i == 0) {
                this.sheetDelegate = new com.google.android.material.sidesheet.RightSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                com.google.android.material.shape.ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i == 1) {
                this.sheetDelegate = new com.google.android.material.sidesheet.LeftSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                    return;
                }
                com.google.android.material.shape.ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                updateMaterialShapeDrawable(builder2.build());
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid sheet edge position value: ");
            sb.append(i);
            sb.append(". Must be 0 or 1.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    private int getGravityFromSheetEdge() {
        com.google.android.material.sidesheet.SheetDelegate sheetDelegate = this.sheetDelegate;
        return (sheetDelegate == null || sheetDelegate.getSheetEdge() == 0) ? 5 : 3;
    }

    private boolean hasRightMargin() {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && viewLayoutParams.rightMargin > 0;
    }

    private boolean hasLeftMargin() {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && viewLayoutParams.leftMargin > 0;
    }

    private androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams getViewLayoutParams() {
        V v;
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null || !(v.getLayoutParams() instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)) {
            return null;
        }
        return (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) v.getLayoutParams();
    }

    private void updateMaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public void expand() {
        setState(3);
    }

    public void hide() {
        setState(5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
        return new com.google.android.material.sidesheet.SideSheetBehavior.SavedState(super.onSaveInstanceState(coordinatorLayout, v), (com.google.android.material.sidesheet.SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.os.Parcelable parcelable) {
        com.google.android.material.sidesheet.SideSheetBehavior.SavedState savedState = (com.google.android.material.sidesheet.SideSheetBehavior.SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        }
        int i = (savedState.state == 1 || savedState.state == 2) ? 5 : savedState.state;
        this.state = i;
        this.lastStableState = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        v.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingTop + paddingBottom + i6 + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = java.lang.Math.min(size, i3);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        if (androidx.core.view.ViewCompat.getFitsSystemWindows(coordinatorLayout) && !androidx.core.view.ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new java.lang.ref.WeakReference<>(v);
            this.sideContainerBackHelper = new com.google.android.material.motion.MaterialSideContainerBackHelper(v);
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                androidx.core.view.ViewCompat.setBackground(v, materialShapeDrawable);
                com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float f = this.elevation;
                if (f == -1.0f) {
                    f = androidx.core.view.ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.setElevation(f);
            } else {
                android.content.res.ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    androidx.core.view.ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            updateSheetVisibility(v);
            updateAccessibilityActions();
            if (androidx.core.view.ViewCompat.getImportantForAccessibility(v) == 0) {
                androidx.core.view.ViewCompat.setImportantForAccessibility(v, 1);
            }
            ensureAccessibilityPaneTitleIsSet(v);
        }
        setSheetEdge(v, i);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = androidx.customview.widget.ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(v);
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(coordinatorLayout);
        this.childWidth = v.getWidth();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.innerMargin = marginLayoutParams != null ? this.sheetDelegate.calculateInnerMargin(marginLayoutParams) : 0;
        androidx.core.view.ViewCompat.offsetLeftAndRight(v, calculateCurrentOffset(outerEdge, v));
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        for (com.google.android.material.sidesheet.SideSheetCallback sideSheetCallback : this.callbacks) {
            if (sideSheetCallback instanceof com.google.android.material.sidesheet.SideSheetCallback) {
                sideSheetCallback.onLayout(v);
            }
        }
        return true;
    }

    private void updateSheetVisibility(android.view.View view) {
        int i = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(android.view.View view) {
        if (androidx.core.view.ViewCompat.getAccessibilityPaneTitle(view) == null) {
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        int i;
        android.view.View findViewById;
        if (this.coplanarSiblingViewRef != null || (i = this.coplanarSiblingViewId) == -1 || (findViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new java.lang.ref.WeakReference<>(findViewById);
    }

    int getChildWidth() {
        return this.childWidth;
    }

    int getParentWidth() {
        return this.parentWidth;
    }

    int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    int getInnerMargin() {
        return this.innerMargin;
    }

    private int calculateCurrentOffset(int i, V v) {
        int i2 = this.state;
        if (i2 == 1 || i2 == 2) {
            return i - this.sheetDelegate.getOuterEdge(v);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected value: ");
        sb.append(this.state);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        androidx.customview.widget.ViewDragHelper viewDragHelper;
        if (!shouldInterceptTouchEvent(v)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = android.view.VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        } else {
            this.initialX = (int) motionEvent.getX();
        }
        return (this.ignoreEvents || (viewDragHelper = this.viewDragHelper) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) ? false : true;
    }

    private boolean shouldInterceptTouchEvent(V v) {
        return (v.isShown() || androidx.core.view.ViewCompat.getAccessibilityPaneTitle(v) != null) && this.draggable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = android.view.VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    private boolean isDraggedFarEnough(android.view.MotionEvent motionEvent) {
        return shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, motionEvent.getX()) > ((float) this.viewDragHelper.getTouchSlop());
    }

    private float calculateDragDistance(float f, float f2) {
        return java.lang.Math.abs(f - f2);
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(com.google.android.material.sidesheet.SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(com.google.android.material.sidesheet.SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i) {
        if (i == 1 || i == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
        } else {
            runAfterLayout(this.viewRef.get(), new java.lang.Runnable() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.material.sidesheet.SideSheetBehavior.this.m10286xc0f1d0a9(i);
                }
            });
        }
    }

    /* renamed from: lambda$setState$0$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ void m10286xc0f1d0a9(int i) {
        V v = this.viewRef.get();
        if (v != null) {
            startSettling(v, i, false);
        }
    }

    private void runAfterLayout(V v, java.lang.Runnable runnable) {
        if (isLayingOut(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean isLayingOut(V v) {
        android.view.ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && androidx.core.view.ViewCompat.isAttachedToWindow(v);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    void setStateInternal(int i) {
        V v;
        if (this.state != i) {
            this.state = i;
            if (i == 3 || i == 5) {
                this.lastStableState = i;
            }
            java.lang.ref.WeakReference<V> weakReference = this.viewRef;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            updateSheetVisibility(v);
            java.util.Iterator<com.google.android.material.sidesheet.SideSheetCallback> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onStateChanged(v, i);
            }
            updateAccessibilityActions();
        }
    }

    private void resetVelocity() {
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    boolean shouldHide(android.view.View view, float f) {
        return this.sheetDelegate.shouldHide(view, f);
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private void createMaterialShapeDrawableIfNeeded(android.content.Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        android.content.res.ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    float getXVelocity() {
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(android.view.View view, int i, boolean z) {
        if (isSettling(view, i, z)) {
            setStateInternal(2);
            this.stateSettlingTracker.continueSettlingToState(i);
        } else {
            setStateInternal(i);
        }
    }

    private boolean isSettling(android.view.View view, int i, boolean z) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i);
        androidx.customview.widget.ViewDragHelper viewDragHelper = getViewDragHelper();
        if (viewDragHelper != null) {
            return z ? viewDragHelper.settleCapturedViewAt(outerEdgeOffsetForState, view.getTop()) : viewDragHelper.smoothSlideViewTo(view, outerEdgeOffsetForState, view.getTop());
        }
        return false;
    }

    int getOuterEdgeOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new java.lang.IllegalArgumentException("Invalid state to get outer edge offset: ".concat(java.lang.String.valueOf(i)));
    }

    androidx.customview.widget.ViewDragHelper getViewDragHelper() {
        return this.viewDragHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(android.view.View view, float f, float f2) {
        if (isExpandingOutwards(f)) {
            return 3;
        }
        if (shouldHide(view, f)) {
            return (this.sheetDelegate.isSwipeSignificant(f, f2) || this.sheetDelegate.isReleasedCloseToInnerEdge(view)) ? 5 : 3;
        }
        if (f != 0.0f && com.google.android.material.sidesheet.SheetUtils.isSwipeMostlyHorizontal(f, f2)) {
            return 5;
        }
        int left = view.getLeft();
        return java.lang.Math.abs(left - getExpandedOffset()) < java.lang.Math.abs(left - this.sheetDelegate.getHiddenOffset()) ? 3 : 5;
    }

    private boolean isExpandingOutwards(float f) {
        return this.sheetDelegate.isExpandingOutwards(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(android.view.View view, int i) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        float calculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i);
        java.util.Iterator<com.google.android.material.sidesheet.SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSlide(view, calculateSlideOffset);
        }
    }

    public void setCoplanarSiblingViewId(int i) {
        this.coplanarSiblingViewId = i;
        clearCoplanarSiblingView();
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v = weakReference.get();
            if (i == -1 || !androidx.core.view.ViewCompat.isLaidOut(v)) {
                return;
            }
            v.requestLayout();
        }
    }

    public void setCoplanarSiblingView(android.view.View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new java.lang.ref.WeakReference<>(view);
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v = weakReference.get();
            if (androidx.core.view.ViewCompat.isLaidOut(v)) {
                v.requestLayout();
            }
        }
    }

    public android.view.View getCoplanarSiblingView() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void clearCoplanarSiblingView() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.view.BackEventCompat backEventCompat) {
        com.google.android.material.motion.MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.view.BackEventCompat backEventCompat) {
        com.google.android.material.motion.MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(backEventCompat, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
    }

    private void updateCoplanarSiblingBackProgress() {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v = this.viewRef.get();
        android.view.View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((this.childWidth * v.getScaleX()) + this.innerMargin));
        coplanarSiblingView.requestLayout();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        com.google.android.material.motion.MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        androidx.view.BackEventCompat onHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked == null || android.os.Build.VERSION.SDK_INT < 34) {
            setState(5);
        } else {
            this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, getGravityFromSheetEdge(), new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    com.google.android.material.sidesheet.SideSheetBehavior.this.setStateInternal(5);
                    if (com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef == null || com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef.get() == null) {
                        return;
                    }
                    ((android.view.View) com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef.get()).requestLayout();
                }
            }, getCoplanarFinishAnimatorUpdateListener());
        }
    }

    private android.animation.ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        final android.view.View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int coplanarSiblingAdjacentMargin = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
        return new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.sidesheet.SideSheetBehavior.this.m10285xc3af8fb4(marginLayoutParams, coplanarSiblingAdjacentMargin, coplanarSiblingView, valueAnimator);
            }
        };
    }

    /* renamed from: lambda$getCoplanarFinishAnimatorUpdateListener$1$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ void m10285xc3af8fb4(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, com.google.android.material.animation.AnimationUtils.lerp(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        com.google.android.material.motion.MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    com.google.android.material.motion.MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    class StateSettlingTracker {
        private final java.lang.Runnable continueSettlingRunnable = new java.lang.Runnable() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.sidesheet.SideSheetBehavior.StateSettlingTracker.this.m10287xe5f914a3();
            }
        };
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        StateSettlingTracker() {
        }

        /* renamed from: lambda$new$0$com-google-android-material-sidesheet-SideSheetBehavior$StateSettlingTracker, reason: not valid java name */
        /* synthetic */ void m10287xe5f914a3() {
            this.isContinueSettlingRunnablePosted = false;
            if (com.google.android.material.sidesheet.SideSheetBehavior.this.viewDragHelper == null || !com.google.android.material.sidesheet.SideSheetBehavior.this.viewDragHelper.continueSettling(true)) {
                if (com.google.android.material.sidesheet.SideSheetBehavior.this.state == 2) {
                    com.google.android.material.sidesheet.SideSheetBehavior.this.setStateInternal(this.targetState);
                    return;
                }
                return;
            }
            continueSettlingToState(this.targetState);
        }

        void continueSettlingToState(int i) {
            if (com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef == null || com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            androidx.core.view.ViewCompat.postOnAnimation((android.view.View) com.google.android.material.sidesheet.SideSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.sidesheet.SideSheetBehavior.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.sidesheet.SideSheetBehavior.SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.sidesheet.SideSheetBehavior.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.sidesheet.SideSheetBehavior.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.sidesheet.SideSheetBehavior.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.sidesheet.SideSheetBehavior.SavedState(parcel, (java.lang.ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.sidesheet.SideSheetBehavior.SavedState[] newArray(int i) {
                return new com.google.android.material.sidesheet.SideSheetBehavior.SavedState[i];
            }
        };
        final int state;

        public SavedState(android.os.Parcel parcel) {
            this(parcel, (java.lang.ClassLoader) null);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(android.os.Parcelable parcelable, com.google.android.material.sidesheet.SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = ((com.google.android.material.sidesheet.SideSheetBehavior) sideSheetBehavior).state;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    public static <V extends android.view.View> com.google.android.material.sidesheet.SideSheetBehavior<V> from(V v) {
        android.view.ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof com.google.android.material.sidesheet.SideSheetBehavior)) {
            throw new java.lang.IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        return (com.google.android.material.sidesheet.SideSheetBehavior) behavior;
    }

    private void updateAccessibilityActions() {
        V v;
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        androidx.core.view.ViewCompat.removeAccessibilityAction(v, 262144);
        androidx.core.view.ViewCompat.removeAccessibilityAction(v, 1048576);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    private void replaceAccessibilityActionForState(V v, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        androidx.core.view.ViewCompat.replaceAccessibilityAction(v, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i));
    }

    private androidx.core.view.accessibility.AccessibilityViewCommand createAccessibilityViewCommandForState(final int i) {
        return new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                return com.google.android.material.sidesheet.SideSheetBehavior.this.m10284x564aa398(i, view, commandArguments);
            }
        };
    }

    /* renamed from: lambda$createAccessibilityViewCommandForState$2$com-google-android-material-sidesheet-SideSheetBehavior, reason: not valid java name */
    /* synthetic */ boolean m10284x564aa398(int i, android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
        setState(i);
        return true;
    }
}
