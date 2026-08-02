package com.google.android.material.bottomsheet;

/* loaded from: classes8.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> implements com.google.android.material.motion.MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    java.lang.ref.WeakReference<android.view.View> accessibilityDelegateViewRef;
    int activePointerId;
    private android.content.res.ColorStateList backgroundTint;
    com.google.android.material.motion.MaterialBottomContainerBackHelper bottomContainerBackHelper;
    private final java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    float elevation;
    final android.util.SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private java.util.Map<android.view.View, java.lang.Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private android.animation.ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    java.lang.ref.WeakReference<android.view.View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private android.view.VelocityTracker velocityTracker;
    androidx.customview.widget.ViewDragHelper viewDragHelper;
    java.lang.ref.WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        void onLayout(android.view.View view) {
        }

        public abstract void onSlide(android.view.View view, float f);

        public abstract void onStateChanged(android.view.View view, int i);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SaveFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface StableState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface State {
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public boolean shouldExpandOnUpwardDrag(long j, float f) {
        return false;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new java.util.ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new android.util.SparseIntArray();
        this.dragCallback = new androidx.customview.widget.ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i) {
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 1 || com.google.android.material.bottomsheet.BottomSheetBehavior.this.touchingScrollingChild) {
                    return false;
                }
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 3 && com.google.android.material.bottomsheet.BottomSheetBehavior.this.activePointerId == i) {
                    android.view.View view2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this.nestedScrollingChildRef != null ? com.google.android.material.bottomsheet.BottomSheetBehavior.this.nestedScrollingChildRef.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = java.lang.System.currentTimeMillis();
                return com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef != null && com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef.get() == view;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1 && com.google.android.material.bottomsheet.BottomSheetBehavior.this.draggable) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            private boolean releasedLow(android.view.View view) {
                return view.getTop() > (com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight + com.google.android.material.bottomsheet.BottomSheetBehavior.this.getExpandedOffset()) / 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
            
                if (r6 > r4.this$0.halfExpandedOffset) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x012c, code lost:
            
                r6 = 6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
            
                if (java.lang.Math.abs(r5.getTop() - r4.this$0.getExpandedOffset()) >= java.lang.Math.abs(r5.getTop() - r4.this$0.halfExpandedOffset)) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
            
                if (r4.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00ef, code lost:
            
                if (java.lang.Math.abs(r6 - r4.this$0.fitToContentsOffset) < java.lang.Math.abs(r6 - r4.this$0.collapsedOffset)) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
            
                if (r4.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L61;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x012a, code lost:
            
                if (r4.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
            
                if (r4.this$0.shouldExpandOnUpwardDrag(r0 - r2, (r6 * 100.0f) / r4.this$0.parentHeight) != false) goto L55;
             */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(android.view.View view, float f, float f2) {
                int i;
                if (f2 < 0.0f) {
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        int top = view.getTop();
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long j = this.viewCapturedMillis;
                        if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        }
                    }
                    i = 3;
                } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.hideable && com.google.android.material.bottomsheet.BottomSheetBehavior.this.shouldHide(view, f2)) {
                    if ((java.lang.Math.abs(f) >= java.lang.Math.abs(f2) || f2 <= com.google.android.material.bottomsheet.BottomSheetBehavior.this.significantVelocityThreshold) && !releasedLow(view)) {
                        if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        }
                        i = 3;
                    } else {
                        i = 5;
                    }
                } else if (f2 != 0.0f && java.lang.Math.abs(f) <= java.lang.Math.abs(f2)) {
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        int top2 = view.getTop();
                        if (java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) < java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                        }
                    }
                    i = 4;
                } else {
                    int top3 = view.getTop();
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        if (top3 < com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) {
                            if (top3 >= java.lang.Math.abs(top3 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            }
                            i = 3;
                        } else {
                            if (java.lang.Math.abs(top3 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) < java.lang.Math.abs(top3 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            }
                            i = 4;
                        }
                    }
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
                bottomSheetBehavior.startSettling(view, i, bottomSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i, int i2) {
                return androidx.core.math.MathUtils.clamp(i, com.google.android.material.bottomsheet.BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(android.view.View view) {
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.canBeHiddenByDragging()) {
                    return com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight;
                }
                return com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
            }
        };
    }

    public BottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new java.util.ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new android.util.SparseIntArray();
        this.dragCallback = new androidx.customview.widget.ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(android.view.View view, int i) {
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 1 || com.google.android.material.bottomsheet.BottomSheetBehavior.this.touchingScrollingChild) {
                    return false;
                }
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 3 && com.google.android.material.bottomsheet.BottomSheetBehavior.this.activePointerId == i) {
                    android.view.View view2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this.nestedScrollingChildRef != null ? com.google.android.material.bottomsheet.BottomSheetBehavior.this.nestedScrollingChildRef.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = java.lang.System.currentTimeMillis();
                return com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef != null && com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef.get() == view;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1 && com.google.android.material.bottomsheet.BottomSheetBehavior.this.draggable) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            private boolean releasedLow(android.view.View view) {
                return view.getTop() > (com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight + com.google.android.material.bottomsheet.BottomSheetBehavior.this.getExpandedOffset()) / 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
            
                if (r6 > r4.this$0.halfExpandedOffset) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x012c, code lost:
            
                r6 = 6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
            
                if (java.lang.Math.abs(r5.getTop() - r4.this$0.getExpandedOffset()) >= java.lang.Math.abs(r5.getTop() - r4.this$0.halfExpandedOffset)) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
            
                if (r4.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00ef, code lost:
            
                if (java.lang.Math.abs(r6 - r4.this$0.fitToContentsOffset) < java.lang.Math.abs(r6 - r4.this$0.collapsedOffset)) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
            
                if (r4.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L61;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x012a, code lost:
            
                if (r4.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
            
                if (r4.this$0.shouldExpandOnUpwardDrag(r0 - r2, (r6 * 100.0f) / r4.this$0.parentHeight) != false) goto L55;
             */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(android.view.View view, float f, float f2) {
                int i;
                if (f2 < 0.0f) {
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        int top = view.getTop();
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long j = this.viewCapturedMillis;
                        if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        }
                    }
                    i = 3;
                } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.hideable && com.google.android.material.bottomsheet.BottomSheetBehavior.this.shouldHide(view, f2)) {
                    if ((java.lang.Math.abs(f) >= java.lang.Math.abs(f2) || f2 <= com.google.android.material.bottomsheet.BottomSheetBehavior.this.significantVelocityThreshold) && !releasedLow(view)) {
                        if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        }
                        i = 3;
                    } else {
                        i = 5;
                    }
                } else if (f2 != 0.0f && java.lang.Math.abs(f) <= java.lang.Math.abs(f2)) {
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        int top2 = view.getTop();
                        if (java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) < java.lang.Math.abs(top2 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                        }
                    }
                    i = 4;
                } else {
                    int top3 = view.getTop();
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.fitToContents) {
                        if (top3 < com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) {
                            if (top3 >= java.lang.Math.abs(top3 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            }
                            i = 3;
                        } else {
                            if (java.lang.Math.abs(top3 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.halfExpandedOffset) < java.lang.Math.abs(top3 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset)) {
                            }
                            i = 4;
                        }
                    }
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
                bottomSheetBehavior.startSettling(view, i, bottomSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(android.view.View view, int i, int i2) {
                return androidx.core.math.MathUtils.clamp(i, com.google.android.material.bottomsheet.BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(android.view.View view) {
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.canBeHiddenByDragging()) {
                    return com.google.android.material.bottomsheet.BottomSheetBehavior.this.parentHeight;
                }
                return com.google.android.material.bottomsheet.BottomSheetBehavior.this.collapsedOffset;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_min_touch_target_size);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, com.google.android.material.R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = com.google.android.material.shape.ShapeAppearanceModel.builder(context, attributeSet, com.google.android.material.R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && peekValue.data == -1) {
            setPeekHeight(peekValue.data);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        android.util.TypedValue peekValue2 = obtainStyledAttributes.peekValue(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
        return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(super.onSaveInstanceState(coordinatorLayout, v), (com.google.android.material.bottomsheet.BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.os.Parcelable parcelable) {
        com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState savedState = (com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        if (savedState.state == 1 || savedState.state == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            int i = savedState.state;
            this.state = i;
            this.lastStableState = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        v.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingTop + paddingBottom + i6 + marginLayoutParams.bottomMargin + i4, this.maxHeight, marginLayoutParams.height));
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
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v);
            androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(v, new com.google.android.material.bottomsheet.InsetsAnimationCallback(v));
            this.viewRef = new java.lang.ref.WeakReference<>(v);
            this.bottomContainerBackHelper = new com.google.android.material.motion.MaterialBottomContainerBackHelper(v);
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
            updateAccessibilityActions();
            if (androidx.core.view.ViewCompat.getImportantForAccessibility(v) == 0) {
                androidx.core.view.ViewCompat.setImportantForAccessibility(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = androidx.customview.widget.ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int i2 = this.parentHeight;
        int i3 = this.insetTop;
        if (i2 - height < i3) {
            if (this.paddingTopSystemWindowInsets) {
                int i4 = this.maxHeight;
                if (i4 != -1) {
                    i2 = java.lang.Math.min(i2, i4);
                }
                this.childHeight = i2;
            } else {
                int i5 = i2 - i3;
                int i6 = this.maxHeight;
                if (i6 != -1) {
                    i5 = java.lang.Math.min(i5, i6);
                }
                this.childHeight = i5;
            }
        }
        this.fitToContentsOffset = java.lang.Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i7 = this.state;
        if (i7 == 3) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, getExpandedOffset());
        } else if (i7 == 6) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, this.halfExpandedOffset);
        } else if (this.hideable && i7 == 5) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, this.parentHeight);
        } else if (i7 == 4) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, this.collapsedOffset);
        } else if (i7 == 1 || i7 == 2) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new java.lang.ref.WeakReference<>(findScrollingChild(v));
        for (int i8 = 0; i8 < this.callbacks.size(); i8++) {
            this.callbacks.get(i8).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        int i;
        androidx.customview.widget.ViewDragHelper viewDragHelper;
        if (!v.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = android.view.VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                java.lang.ref.WeakReference<android.view.View> weakReference = this.nestedScrollingChildRef;
                android.view.View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        java.lang.ref.WeakReference<android.view.View> weakReference2 = this.nestedScrollingChildRef;
        android.view.View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i = this.initialY) == -1 || java.lang.Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.viewDragHelper.getTouchSlop())) ? false : true;
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
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = android.view.VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && java.lang.Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            java.lang.ref.WeakReference<android.view.View> weakReference = this.nestedScrollingChildRef;
            android.view.View view2 = weakReference != null ? weakReference.get() : null;
            if (!isNestedScrollingCheckEnabled() || view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < getExpandedOffset()) {
                        int expandedOffset = top - getExpandedOffset();
                        iArr[1] = expandedOffset;
                        androidx.core.view.ViewCompat.offsetTopAndBottom(v, -expandedOffset);
                        setStateInternal(3);
                    } else {
                        if (!this.draggable) {
                            return;
                        }
                        iArr[1] = i2;
                        androidx.core.view.ViewCompat.offsetTopAndBottom(v, -i2);
                        setStateInternal(1);
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    if (i4 <= this.collapsedOffset || canBeHiddenByDragging()) {
                        if (!this.draggable) {
                            return;
                        }
                        iArr[1] = i2;
                        androidx.core.view.ViewCompat.offsetTopAndBottom(v, -i2);
                        setStateInternal(1);
                    } else {
                        int i5 = top - this.collapsedOffset;
                        iArr[1] = i5;
                        androidx.core.view.ViewCompat.offsetTopAndBottom(v, -i5);
                        setStateInternal(4);
                    }
                }
                dispatchOnSlide(v.getTop());
                this.lastNestedScrollDy = i2;
                this.nestedScrolled = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (r3.getTop() > r1.halfExpandedOffset) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (java.lang.Math.abs(r2 - r1.fitToContentsOffset) < java.lang.Math.abs(r2 - r1.collapsedOffset)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
    
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:
    
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.collapsedOffset)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        if (java.lang.Math.abs(r2 - r1.halfExpandedOffset) < java.lang.Math.abs(r2 - r1.collapsedOffset)) goto L49;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i) {
        java.lang.ref.WeakReference<android.view.View> weakReference;
        int i2 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get() && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents) {
                }
                startSettling(v, i2, false);
                this.nestedScrolled = false;
            }
            if (this.hideable && shouldHide(v, getYVelocity())) {
                i2 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v.getTop();
                if (!this.fitToContents) {
                    int i3 = this.halfExpandedOffset;
                    if (top < i3) {
                        if (top >= java.lang.Math.abs(top - this.collapsedOffset)) {
                        }
                    }
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = v.getTop();
                }
                i2 = 4;
            }
            startSettling(v, i2, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, float f, float f2) {
        java.lang.ref.WeakReference<android.view.View> weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get()) {
            return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public final void setPeekHeight(int i, boolean z) {
        if (i == -1) {
            if (this.peekHeightAuto) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = java.lang.Math.max(0, i);
        }
        updatePeekHeight(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v = this.viewRef.get()) == null) {
                return;
            }
            if (z) {
                setState(4);
            } else {
                v.requestLayout();
            }
        }
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public void setHalfExpandedRatio(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new java.lang.IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i;
        updateDrawableForTargetState(this.state, true);
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return java.lang.Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float calculateSlideOffset() {
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public void setSignificantVelocityThreshold(int i) {
        this.significantVelocityThreshold = i;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @java.lang.Deprecated
    public void setBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void addBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public void removeBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setState(int i) {
        if (i == 1 || i == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.hideable || i != 5) {
            final int i2 = (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) ? 3 : i;
            java.lang.ref.WeakReference<V> weakReference = this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                setStateInternal(i);
            } else {
                final V v = this.viewRef.get();
                runAfterLayout(v, new java.lang.Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.google.android.material.bottomsheet.BottomSheetBehavior.this.startSettling(v, i2, false);
                    }
                });
            }
        }
    }

    private void runAfterLayout(V v, java.lang.Runnable runnable) {
        if (isLayouting(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean isLayouting(V v) {
        android.view.ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && androidx.core.view.ViewCompat.isAttachedToWindow(v);
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public void setShouldRemoveExpandedCorners(boolean z) {
        if (this.shouldRemoveExpandedCorners != z) {
            this.shouldRemoveExpandedCorners = z;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    public int getState() {
        return this.state;
    }

    void setStateInternal(int i) {
        V v;
        if (this.state != i) {
            this.state = i;
            if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.lastStableState = i;
            }
            java.lang.ref.WeakReference<V> weakReference = this.viewRef;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            if (i == 3) {
                updateImportantForAccessibility(true);
            } else if (i == 6 || i == 5 || i == 4) {
                updateImportantForAccessibility(false);
            }
            updateDrawableForTargetState(i, true);
            for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
                this.callbacks.get(i2).onStateChanged(v, i);
            }
            updateAccessibilityActions();
        }
    }

    private void updateDrawableForTargetState(int i, boolean z) {
        boolean isExpandedAndShouldRemoveCorners;
        android.animation.ValueAnimator valueAnimator;
        if (i == 2 || this.expandedCornersRemoved == (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
        if (z && (valueAnimator = this.interpolatorAnimator) != null) {
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            } else {
                this.interpolatorAnimator.setFloatValues(this.materialShapeDrawable.getInterpolation(), isExpandedAndShouldRemoveCorners ? calculateInterpolationWithCornersRemoved() : 1.0f);
                this.interpolatorAnimator.start();
                return;
            }
        }
        android.animation.ValueAnimator valueAnimator2 = this.interpolatorAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.interpolatorAnimator.cancel();
        }
        this.materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
    }

    private float calculateInterpolationWithCornersRemoved() {
        java.lang.ref.WeakReference<V> weakReference;
        android.view.WindowInsets rootWindowInsets;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null || weakReference.get() == null || android.os.Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v = this.viewRef.get();
        if (!isAtTopOfScreen() || (rootWindowInsets = v.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return java.lang.Math.max(calculateCornerInterpolation(this.materialShapeDrawable.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), calculateCornerInterpolation(this.materialShapeDrawable.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
    }

    private float calculateCornerInterpolation(float f, android.view.RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private boolean isAtTopOfScreen() {
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.viewRef.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3) {
            return this.shouldRemoveExpandedCorners || isAtTopOfScreen();
        }
        return false;
    }

    private int calculatePeekHeight() {
        int i;
        if (this.peekHeightAuto) {
            return java.lang.Math.min(java.lang.Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        if (!this.gestureInsetBottomIgnored && !this.paddingBottomSystemWindowInsets && (i = this.gestureInsetBottom) > 0) {
            return java.lang.Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
        }
        return this.peekHeight + this.insetBottom;
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = java.lang.Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private float calculateSlideOffsetWithTop(int i) {
        float f;
        float f2;
        int i2 = this.collapsedOffset;
        if (i > i2 || i2 == getExpandedOffset()) {
            int i3 = this.collapsedOffset;
            f = i3 - i;
            f2 = this.parentHeight - i3;
        } else {
            int i4 = this.collapsedOffset;
            f = i4 - i;
            f2 = i4 - getExpandedOffset();
        }
        return f / f2;
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState savedState) {
        int i = this.saveFlags;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.peekHeight = savedState.peekHeight;
            }
            int i2 = this.saveFlags;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.fitToContents = savedState.fitToContents;
            }
            int i3 = this.saveFlags;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.hideable = savedState.hideable;
            }
            int i4 = this.saveFlags;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.skipCollapsed = savedState.skipCollapsed;
            }
        }
    }

    boolean shouldHide(android.view.View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (isHideableWhenDragging() && view.getTop() >= this.collapsedOffset) {
            return java.lang.Math.abs((((float) view.getTop()) + (f * this.hideFriction)) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
        }
        return false;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.view.BackEventCompat backEventCompat) {
        com.google.android.material.motion.MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.view.BackEventCompat backEventCompat) {
        com.google.android.material.motion.MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        com.google.android.material.motion.MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        androidx.view.BackEventCompat onHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked == null || android.os.Build.VERSION.SDK_INT < 34) {
            setState(this.hideable ? 5 : 4);
        } else if (this.hideable) {
            this.bottomContainerBackHelper.finishBackProgressNotPersistent(onHandleBackInvoked, new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.setStateInternal(5);
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef == null || com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef.get() == null) {
                        return;
                    }
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef.get().requestLayout();
                }
            });
        } else {
            this.bottomContainerBackHelper.finishBackProgressPersistent(onHandleBackInvoked, null);
            setState(4);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        com.google.android.material.motion.MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    com.google.android.material.motion.MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    android.view.View findScrollingChild(android.view.View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (androidx.core.view.ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private void createMaterialShapeDrawableIfNeeded(android.content.Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModelDefault);
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

    com.google.android.material.shape.MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    private void createShapeValueAnimator() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.materialShapeDrawable != null) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    private void setWindowInsetsListener(android.view.View view) {
        final boolean z = (android.os.Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z) {
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(view, new com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
                
                    if (r6 != false) goto L35;
                 */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
                    boolean z2;
                    androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars());
                    androidx.core.graphics.Insets insets2 = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures());
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.insetTop = insets.top;
                    boolean isLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(view2);
                    int paddingBottom = view2.getPaddingBottom();
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingRight = view2.getPaddingRight();
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        com.google.android.material.bottomsheet.BottomSheetBehavior.this.insetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
                        paddingBottom = relativePadding.bottom + com.google.android.material.bottomsheet.BottomSheetBehavior.this.insetBottom;
                    }
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                        paddingLeft = (isLayoutRtl ? relativePadding.end : relativePadding.start) + insets.left;
                    }
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                        paddingRight = (isLayoutRtl ? relativePadding.start : relativePadding.end) + insets.right;
                    }
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    boolean z3 = true;
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.marginLeftSystemWindowInsets || marginLayoutParams.leftMargin == insets.left) {
                        z2 = false;
                    } else {
                        marginLayoutParams.leftMargin = insets.left;
                        z2 = true;
                    }
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.marginRightSystemWindowInsets || marginLayoutParams.rightMargin == insets.right) {
                        z3 = z2;
                    } else {
                        marginLayoutParams.rightMargin = insets.right;
                    }
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.marginTopSystemWindowInsets && marginLayoutParams.topMargin != insets.top) {
                        marginLayoutParams.topMargin = insets.top;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                    view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                    if (z) {
                        com.google.android.material.bottomsheet.BottomSheetBehavior.this.gestureInsetBottom = insets2.bottom;
                    }
                    if (!com.google.android.material.bottomsheet.BottomSheetBehavior.this.paddingBottomSystemWindowInsets && !z) {
                        return windowInsetsCompat;
                    }
                    com.google.android.material.bottomsheet.BottomSheetBehavior.this.updatePeekHeight(false);
                    return windowInsetsCompat;
                }
            });
        }
    }

    private float getYVelocity() {
        android.view.VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(android.view.View view, int i, boolean z) {
        int topOffsetForState = getTopOffsetForState(i);
        androidx.customview.widget.ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null && (!z ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), topOffsetForState) : viewDragHelper.settleCapturedViewAt(view.getLeft(), topOffsetForState))) {
            setStateInternal(2);
            updateDrawableForTargetState(i, true);
            this.stateSettlingTracker.continueSettlingToState(i);
            return;
        }
        setStateInternal(i);
    }

    private int getTopOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 4) {
            return this.collapsedOffset;
        }
        if (i == 5) {
            return this.parentHeight;
        }
        if (i == 6) {
            return this.halfExpandedOffset;
        }
        throw new java.lang.IllegalArgumentException("Invalid state to get top offset: ".concat(java.lang.String.valueOf(i)));
    }

    void dispatchOnSlide(int i) {
        V v = this.viewRef.get();
        if (v == null || this.callbacks.isEmpty()) {
            return;
        }
        float calculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onSlide(v, calculateSlideOffsetWithTop);
        }
    }

    int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        return isHideable() && isHideableWhenDragging();
    }

    public void setHideableInternal(boolean z) {
        this.hideable = z;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    class StateSettlingTracker {
        private final java.lang.Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new java.lang.Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewDragHelper != null && com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewDragHelper.continueSettling(true)) {
                        com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker stateSettlingTracker = com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                    } else if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.state == 2) {
                        com.google.android.material.bottomsheet.BottomSheetBehavior.this.setStateInternal(com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.this.targetState);
                    }
                }
            };
        }

        void continueSettlingToState(int i) {
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef == null || com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            androidx.core.view.ViewCompat.postOnAnimation(com.google.android.material.bottomsheet.BottomSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(parcel, (java.lang.ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState[] newArray(int i) {
                return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState[i];
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(android.os.Parcel parcel) {
            this(parcel, (java.lang.ClassLoader) null);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(android.os.Parcelable parcelable, com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((com.google.android.material.bottomsheet.BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((com.google.android.material.bottomsheet.BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((com.google.android.material.bottomsheet.BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @java.lang.Deprecated
        public SavedState(android.os.Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }
    }

    public static <V extends android.view.View> com.google.android.material.bottomsheet.BottomSheetBehavior<V> from(V v) {
        android.view.ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof com.google.android.material.bottomsheet.BottomSheetBehavior)) {
            throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (com.google.android.material.bottomsheet.BottomSheetBehavior) behavior;
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    private void updateImportantForAccessibility(boolean z) {
        java.util.Map<android.view.View, java.lang.Integer> map;
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            android.view.ViewParent parent = weakReference.get().getParent();
            if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.importantForAccessibilityMap != null) {
                        return;
                    } else {
                        this.importantForAccessibilityMap = new java.util.HashMap(childCount);
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.viewRef.get()) {
                        if (z) {
                            this.importantForAccessibilityMap.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.updateImportantForAccessibilityOnSiblings) {
                                androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 4);
                            }
                        } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                            androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.importantForAccessibilityMap = null;
                } else if (this.updateImportantForAccessibilityOnSiblings) {
                    this.viewRef.get().sendAccessibilityEvent(8);
                }
            }
        }
    }

    void setAccessibilityDelegateView(android.view.View view) {
        java.lang.ref.WeakReference<android.view.View> weakReference;
        if (view == null && (weakReference = this.accessibilityDelegateViewRef) != null) {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        } else {
            this.accessibilityDelegateViewRef = new java.lang.ref.WeakReference<>(view);
            updateAccessibilityActions(view, 1);
        }
    }

    private void updateAccessibilityActions() {
        java.lang.ref.WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        java.lang.ref.WeakReference<android.view.View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateAccessibilityActions(android.view.View view, int i) {
        if (view != null) {
            clearAccessibilityAction(view, i);
            if (!this.fitToContents && this.state != 6) {
                this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, com.google.android.material.R.string.bottomsheet_action_expand_halfway, 6));
            }
            if (this.hideable && isHideableWhenDragging() && this.state != 5) {
                replaceAccessibilityActionForState(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
            }
            int i2 = this.state;
            if (i2 == 3) {
                replaceAccessibilityActionForState(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, this.fitToContents ? 4 : 6);
                return;
            }
            if (i2 == 4) {
                replaceAccessibilityActionForState(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, this.fitToContents ? 3 : 6);
            } else {
                if (i2 != 6) {
                    return;
                }
                replaceAccessibilityActionForState(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
                replaceAccessibilityActionForState(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
            }
        }
    }

    private void clearAccessibilityAction(android.view.View view, int i) {
        if (view != null) {
            androidx.core.view.ViewCompat.removeAccessibilityAction(view, 524288);
            androidx.core.view.ViewCompat.removeAccessibilityAction(view, 262144);
            androidx.core.view.ViewCompat.removeAccessibilityAction(view, 1048576);
            int i2 = this.expandHalfwayActionIds.get(i, -1);
            if (i2 != -1) {
                androidx.core.view.ViewCompat.removeAccessibilityAction(view, i2);
                this.expandHalfwayActionIds.delete(i);
            }
        }
    }

    private void replaceAccessibilityActionForState(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        androidx.core.view.ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i));
    }

    private int addAccessibilityActionForState(android.view.View view, int i, int i2) {
        return androidx.core.view.ViewCompat.addAccessibilityAction(view, view.getResources().getString(i), createAccessibilityViewCommandForState(i2));
    }

    private androidx.core.view.accessibility.AccessibilityViewCommand createAccessibilityViewCommandForState(final int i) {
        return new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                com.google.android.material.bottomsheet.BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
    }
}
