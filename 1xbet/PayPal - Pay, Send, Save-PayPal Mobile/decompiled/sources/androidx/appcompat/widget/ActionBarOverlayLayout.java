package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements androidx.appcompat.widget.DecorContentParent, androidx.core.view.NestedScrollingParent, androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    static final int[] Camera2StreamConfigurationMap = {androidx.appcompat.R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    private static final androidx.core.view.WindowInsetsCompat getOutputFormats = new androidx.core.view.WindowInsetsCompat.Builder().setSystemWindowInsets(androidx.core.graphics.Insets.of(0, 1, 0, 1)).build();
    private static final android.graphics.Rect getOutputMinFrameDuration = new android.graphics.Rect();
    private int AMEXKernel;
    private androidx.core.view.WindowInsetsCompat ArtificialStackFrames;
    private final android.graphics.Rect CoroutineDebuggingKt;
    private int _BOUNDARY;
    private final android.graphics.Rect _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.ActionBarOverlayLayout.NoSystemUiLayoutFlagView f2666a;
    private final android.graphics.Rect accessartificialFrame;
    private boolean b;
    private final android.graphics.Rect c;
    private androidx.core.view.WindowInsetsCompat coroutineBoundary;
    private final android.graphics.Rect coroutineCreation;
    private android.graphics.drawable.Drawable d;
    private androidx.core.view.WindowInsetsCompat getARTIFICIAL_FRAME_PACKAGE_NAME;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    android.view.ViewPropertyAnimator getHighSpeedVideoFpsRanges;
    androidx.appcompat.widget.ActionBarContainer getHighSpeedVideoFpsRangesFor;
    final android.animation.AnimatorListenerAdapter getHighSpeedVideoSizes;
    private final java.lang.Runnable getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback getInputSizeshNQ4ISI;
    private androidx.core.view.WindowInsetsCompat getOutputMinFrameDurationlomOqCM;
    private final android.graphics.Rect getOutputSizes;
    private final android.graphics.Rect getOutputSizeshNQ4ISI;
    private androidx.appcompat.widget.ContentFrameLayout getOutputStallDuration;
    private final android.graphics.Rect getOutputStallDurationlomOqCM;
    private androidx.appcompat.widget.DecorToolbar getValidOutputFormatsForInputhNQ4ISI;
    private final androidx.core.view.NestedScrollingParentHelper init;
    private int isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private final java.lang.Runnable kernelVersion;
    private android.widget.OverScroller toString;
    private boolean unwrapAs;

    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean z);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i);

        void showForSystem();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    static final class NoSystemUiLayoutFlagView extends android.view.View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }

        NoSystemUiLayoutFlagView(android.content.Context context) {
            super(context);
            setWillNotDraw(true);
        }
    }

    public ActionBarOverlayLayout(android.content.Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AMEXKernel = 0;
        this.getOutputStallDurationlomOqCM = new android.graphics.Rect();
        this.coroutineCreation = new android.graphics.Rect();
        this.getOutputSizeshNQ4ISI = new android.graphics.Rect();
        this.c = new android.graphics.Rect();
        this.getOutputSizes = new android.graphics.Rect();
        this.accessartificialFrame = new android.graphics.Rect();
        this.CoroutineDebuggingKt = new android.graphics.Rect();
        this._CREATION = new android.graphics.Rect();
        this.getOutputMinFrameDurationlomOqCM = androidx.core.view.WindowInsetsCompat.CONSUMED;
        this.coroutineBoundary = androidx.core.view.WindowInsetsCompat.CONSUMED;
        this.ArtificialStackFrames = androidx.core.view.WindowInsetsCompat.CONSUMED;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = androidx.core.view.WindowInsetsCompat.CONSUMED;
        this.getHighSpeedVideoSizes = new android.animation.AnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighSpeedVideoFpsRanges = null;
                androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighResolutionOutputSizeshNQ4ISI = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighSpeedVideoFpsRanges = null;
                androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighResolutionOutputSizeshNQ4ISI = false;
            }
        };
        this.kernelVersion = new java.lang.Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighSpeedVideoFpsRangesFor();
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = androidx.appcompat.widget.ActionBarOverlayLayout.this;
                actionBarOverlayLayout.getHighSpeedVideoFpsRanges = actionBarOverlayLayout.getHighSpeedVideoFpsRangesFor.animate().translationY(0.0f).setListener(androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighSpeedVideoSizes);
            }
        };
        this.getHighSpeedVideoSizesFor = new java.lang.Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighSpeedVideoFpsRangesFor();
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = androidx.appcompat.widget.ActionBarOverlayLayout.this;
                actionBarOverlayLayout.getHighSpeedVideoFpsRanges = actionBarOverlayLayout.getHighSpeedVideoFpsRangesFor.animate().translationY(-androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighSpeedVideoFpsRangesFor.getHeight()).setListener(androidx.appcompat.widget.ActionBarOverlayLayout.this.getHighSpeedVideoSizes);
            }
        };
        getHighResolutionOutputSizeshNQ4ISI(context);
        this.init = new androidx.core.view.NestedScrollingParentHelper(this);
        androidx.appcompat.widget.ActionBarOverlayLayout.NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new androidx.appcompat.widget.ActionBarOverlayLayout.NoSystemUiLayoutFlagView(context);
        this.f2666a = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(Camera2StreamConfigurationMap);
        this.getInputFormats = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.d = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.toString = new android.widget.OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHighSpeedVideoFpsRangesFor();
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.getInputSizeshNQ4ISI = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.getInputSizeshNQ4ISI.onWindowVisibilityChanged(this.AMEXKernel);
            int i = this._BOUNDARY;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                androidx.core.view.ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.b = z;
    }

    public boolean isInOverlayMode() {
        return this.b;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.unwrapAs = z;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getHighResolutionOutputSizeshNQ4ISI(getContext());
        androidx.core.view.ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        Camera2StreamConfigurationMap();
        int i2 = this._BOUNDARY;
        this._BOUNDARY = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback actionBarVisibilityCallback = this.getInputSizeshNQ4ISI;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.enableContentAnimations(!z2);
            if (z || !z2) {
                this.getInputSizeshNQ4ISI.showForSystem();
            } else {
                this.getInputSizeshNQ4ISI.hideForSystem();
            }
        }
        if (((i ^ i2) & 256) == 0 || this.getInputSizeshNQ4ISI == null) {
            return;
        }
        androidx.core.view.ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.AMEXKernel = i;
        androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback actionBarVisibilityCallback = this.getInputSizeshNQ4ISI;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i);
        }
    }

    private static boolean Camera2StreamConfigurationMap(android.view.View view, android.graphics.Rect rect, boolean z) {
        boolean z2;
        androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams layoutParams = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.leftMargin != rect.left) {
            layoutParams.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z2 = true;
        }
        if (layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || layoutParams.bottomMargin == rect.bottom) {
            return z2;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        Camera2StreamConfigurationMap();
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, new android.graphics.Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), false);
        androidx.core.view.ViewCompat.computeSystemWindowInsets(this, windowInsetsCompat, this.getOutputStallDurationlomOqCM);
        androidx.core.view.WindowInsetsCompat inset = windowInsetsCompat.inset(this.getOutputStallDurationlomOqCM.left, this.getOutputStallDurationlomOqCM.top, this.getOutputStallDurationlomOqCM.right, this.getOutputStallDurationlomOqCM.bottom);
        this.getOutputMinFrameDurationlomOqCM = inset;
        if (!this.coroutineBoundary.equals(inset)) {
            this.coroutineBoundary = this.getOutputMinFrameDurationlomOqCM;
            Camera2StreamConfigurationMap2 = true;
        }
        if (!this.coroutineCreation.equals(this.getOutputStallDurationlomOqCM)) {
            this.coroutineCreation.set(this.getOutputStallDurationlomOqCM);
        }
        requestLayout();
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams generateDefaultLayoutParams() {
        return new androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        Camera2StreamConfigurationMap();
        measureChildWithMargins(this.getHighSpeedVideoFpsRangesFor, i, 0, i2, 0);
        androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams layoutParams = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) this.getHighSpeedVideoFpsRangesFor.getLayoutParams();
        int max = java.lang.Math.max(0, this.getHighSpeedVideoFpsRangesFor.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = java.lang.Math.max(0, this.getHighSpeedVideoFpsRangesFor.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, this.getHighSpeedVideoFpsRangesFor.getMeasuredState());
        boolean z = (androidx.core.view.ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0;
        if (z) {
            measuredHeight = this.getInputFormats;
            if (this.unwrapAs && this.getHighSpeedVideoFpsRangesFor.getTabContainer() != null) {
                measuredHeight += this.getInputFormats;
            }
        } else {
            measuredHeight = this.getHighSpeedVideoFpsRangesFor.getVisibility() != 8 ? this.getHighSpeedVideoFpsRangesFor.getMeasuredHeight() : 0;
        }
        this.getOutputSizeshNQ4ISI.set(this.getOutputStallDurationlomOqCM);
        this.ArtificialStackFrames = this.getOutputMinFrameDurationlomOqCM;
        if (!this.b && !z) {
            androidx.core.view.ViewCompat.computeSystemWindowInsets(this.f2666a, getOutputFormats, this.c);
            if (!this.c.equals(getOutputMinFrameDuration)) {
                this.getOutputSizeshNQ4ISI.top += measuredHeight;
                android.graphics.Rect rect = this.getOutputSizeshNQ4ISI;
                rect.bottom = rect.bottom;
                this.ArtificialStackFrames = this.ArtificialStackFrames.inset(0, measuredHeight, 0, 0);
                Camera2StreamConfigurationMap(this.getOutputStallDuration, this.getOutputSizeshNQ4ISI, true);
                if (!this.getARTIFICIAL_FRAME_PACKAGE_NAME.equals(this.ArtificialStackFrames)) {
                    androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.ArtificialStackFrames;
                    this.getARTIFICIAL_FRAME_PACKAGE_NAME = windowInsetsCompat;
                    androidx.core.view.ViewCompat.dispatchApplyWindowInsets(this.getOutputStallDuration, windowInsetsCompat);
                }
                measureChildWithMargins(this.getOutputStallDuration, i, 0, i2, 0);
                androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams layoutParams2 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) this.getOutputStallDuration.getLayoutParams();
                int max3 = java.lang.Math.max(max, this.getOutputStallDuration.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
                int max4 = java.lang.Math.max(max2, this.getOutputStallDuration.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
                int combineMeasuredStates2 = android.view.View.combineMeasuredStates(combineMeasuredStates, this.getOutputStallDuration.getMeasuredState());
                setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        this.ArtificialStackFrames = new androidx.core.view.WindowInsetsCompat.Builder(this.ArtificialStackFrames).setSystemWindowInsets(androidx.core.graphics.Insets.of(this.ArtificialStackFrames.getSystemWindowInsetLeft(), this.ArtificialStackFrames.getSystemWindowInsetTop() + measuredHeight, this.ArtificialStackFrames.getSystemWindowInsetRight(), this.ArtificialStackFrames.getSystemWindowInsetBottom())).build();
        Camera2StreamConfigurationMap(this.getOutputStallDuration, this.getOutputSizeshNQ4ISI, true);
        if (!this.getARTIFICIAL_FRAME_PACKAGE_NAME.equals(this.ArtificialStackFrames)) {
        }
        measureChildWithMargins(this.getOutputStallDuration, i, 0, i2, 0);
        androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams layoutParams22 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) this.getOutputStallDuration.getLayoutParams();
        int max32 = java.lang.Math.max(max, this.getOutputStallDuration.getMeasuredWidth() + layoutParams22.leftMargin + layoutParams22.rightMargin);
        int max42 = java.lang.Math.max(max2, this.getOutputStallDuration.getMeasuredHeight() + layoutParams22.topMargin + layoutParams22.bottomMargin);
        int combineMeasuredStates22 = android.view.View.combineMeasuredStates(combineMeasuredStates, this.getOutputStallDuration.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(max32 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates22), android.view.View.resolveSizeAndState(java.lang.Math.max(max42 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams layoutParams = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.d != null) {
            int bottom = this.getHighSpeedVideoFpsRangesFor.getVisibility() == 0 ? (int) (this.getHighSpeedVideoFpsRangesFor.getBottom() + this.getHighSpeedVideoFpsRangesFor.getTranslationY() + 0.5f) : 0;
            this.d.setBounds(0, bottom, getWidth(), this.d.getIntrinsicHeight() + bottom);
            this.d.draw(canvas);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        if ((i & 2) == 0 || this.getHighSpeedVideoFpsRangesFor.getVisibility() != 0) {
            return false;
        }
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        this.init.onNestedScrollAccepted(view, view2, i);
        this.isOutputSupportedFor = getActionBarHideOffset();
        getHighSpeedVideoFpsRangesFor();
        androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback actionBarVisibilityCallback = this.getInputSizeshNQ4ISI;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        int i5 = this.isOutputSupportedFor + i2;
        this.isOutputSupportedFor = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View view) {
        if (this.isOutputSupportedForhNQ4ISI && !this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.isOutputSupportedFor <= this.getHighSpeedVideoFpsRangesFor.getHeight()) {
                getHighSpeedVideoFpsRangesFor();
                postDelayed(this.kernelVersion, 600L);
            } else {
                getHighSpeedVideoFpsRangesFor();
                postDelayed(this.getHighSpeedVideoSizesFor, 600L);
            }
        }
        androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback actionBarVisibilityCallback = this.getInputSizeshNQ4ISI;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStopped();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        if (!this.isOutputSupportedForhNQ4ISI || !z) {
            return false;
        }
        this.toString.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.toString.getFinalY() > this.getHighSpeedVideoFpsRangesFor.getHeight()) {
            getHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoSizesFor.run();
        } else {
            getHighSpeedVideoFpsRangesFor();
            this.kernelVersion.run();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        return true;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.init.getNestedScrollAxes();
    }

    private void Camera2StreamConfigurationMap() {
        if (this.getOutputStallDuration == null) {
            this.getOutputStallDuration = (androidx.appcompat.widget.ContentFrameLayout) findViewById(androidx.appcompat.R.id.action_bar_activity_content);
            this.getHighSpeedVideoFpsRangesFor = (androidx.appcompat.widget.ActionBarContainer) findViewById(androidx.appcompat.R.id.action_bar_container);
            this.getValidOutputFormatsForInputhNQ4ISI = getHighSpeedVideoFpsRangesFor(findViewById(androidx.appcompat.R.id.action_bar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static androidx.appcompat.widget.DecorToolbar getHighSpeedVideoFpsRangesFor(android.view.View view) {
        if (view instanceof androidx.appcompat.widget.DecorToolbar) {
            return (androidx.appcompat.widget.DecorToolbar) view;
        }
        if (view instanceof androidx.appcompat.widget.Toolbar) {
            return ((androidx.appcompat.widget.Toolbar) view).getWrapper();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.isOutputSupportedForhNQ4ISI) {
            this.isOutputSupportedForhNQ4ISI = z;
            if (z) {
                return;
            }
            getHighSpeedVideoFpsRangesFor();
            setActionBarHideOffset(0);
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public int getActionBarHideOffset() {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.getHighSpeedVideoFpsRangesFor;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoFpsRangesFor.setTranslationY(-java.lang.Math.max(0, java.lang.Math.min(i, this.getHighSpeedVideoFpsRangesFor.getHeight())));
    }

    final void getHighSpeedVideoFpsRangesFor() {
        removeCallbacks(this.kernelVersion);
        removeCallbacks(this.getHighSpeedVideoSizesFor);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.getHighSpeedVideoFpsRanges;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(android.view.Window.Callback callback) {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(java.lang.CharSequence charSequence) {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public java.lang.CharSequence getTitle() {
        Camera2StreamConfigurationMap();
        return this.getValidOutputFormatsForInputhNQ4ISI.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void initFeature(int i) {
        Camera2StreamConfigurationMap();
        if (i == 2) {
            this.getValidOutputFormatsForInputhNQ4ISI.initProgress();
        } else if (i == 5) {
            this.getValidOutputFormatsForInputhNQ4ISI.initIndeterminateProgress();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasIcon() {
        Camera2StreamConfigurationMap();
        return this.getValidOutputFormatsForInputhNQ4ISI.hasIcon();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasLogo() {
        Camera2StreamConfigurationMap();
        return this.getValidOutputFormatsForInputhNQ4ISI.hasLogo();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int i) {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.setIcon(i);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.setIcon(drawable);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int i) {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.setLogo(i);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean canShowOverflowMenu() {
        Camera2StreamConfigurationMap();
        return this.getValidOutputFormatsForInputhNQ4ISI.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
        Camera2StreamConfigurationMap();
        return this.getValidOutputFormatsForInputhNQ4ISI.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
        Camera2StreamConfigurationMap();
        return this.getValidOutputFormatsForInputhNQ4ISI.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean showOverflowMenu() {
        Camera2StreamConfigurationMap();
        return this.getValidOutputFormatsForInputhNQ4ISI.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hideOverflowMenu() {
        Camera2StreamConfigurationMap();
        return this.getValidOutputFormatsForInputhNQ4ISI.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.setMenuPrepared();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenu(android.view.Menu menu, androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.setMenu(menu, callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void dismissPopups() {
        Camera2StreamConfigurationMap();
        this.getValidOutputFormatsForInputhNQ4ISI.dismissPopupMenus();
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }
}
