package androidx.core.widget;

/* loaded from: classes3.dex */
public class NestedScrollView extends android.widget.FrameLayout implements androidx.core.view.NestedScrollingParent3, androidx.core.view.NestedScrollingChild3, androidx.core.view.ScrollingView {
    private static final float Camera2StreamConfigurationMap = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));
    private static final androidx.core.widget.NestedScrollView.AccessibilityDelegate getHighSpeedVideoFpsRanges = new androidx.core.widget.NestedScrollView.AccessibilityDelegate();
    private static final int[] getOutputFormats = {android.R.attr.fillViewport};
    private final androidx.core.view.NestedScrollingParentHelper ArtificialStackFrames;
    private final float CoroutineDebuggingKt;
    private int _BOUNDARY;
    private boolean _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private android.view.VelocityTracker f2731a;
    private androidx.core.widget.NestedScrollView.SavedState accessartificialFrame;
    private final android.graphics.Rect b;
    private final int[] coroutineBoundary;
    private final int[] coroutineCreation;
    private float d;
    private android.widget.OverScroller getARTIFICIAL_FRAME_PACKAGE_NAME;
    androidx.core.view.ScrollFeedbackProviderCompat getHighResolutionOutputSizeshNQ4ISI;
    androidx.core.view.DifferentialMotionFlingController getHighSpeedVideoFpsRangesFor;
    final androidx.core.widget.NestedScrollView.DifferentialMotionFlingTargetImpl getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private android.view.View getInputFormats;
    private final androidx.core.view.NestedScrollingChildHelper getInputSizeshNQ4ISI;
    private int getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private long getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private androidx.core.widget.NestedScrollView.OnScrollChangeListener getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    public android.widget.EdgeEffect mEdgeGlowBottom;
    public android.widget.EdgeEffect mEdgeGlowTop;
    private int toString;
    private int unwrapAs;

    public interface OnScrollChangeListener {
        void onScrollChange(androidx.core.widget.NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(android.content.Context context) {
        this(context, null);
    }

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new android.graphics.Rect();
        this.getOutputSizes = true;
        this.getOutputStallDuration = false;
        this.getInputFormats = null;
        this.getOutputMinFrameDurationlomOqCM = false;
        this._CREATION = true;
        this.getOutputMinFrameDuration = -1;
        this.coroutineBoundary = new int[2];
        this.coroutineCreation = new int[2];
        androidx.core.widget.NestedScrollView.DifferentialMotionFlingTargetImpl differentialMotionFlingTargetImpl = new androidx.core.widget.NestedScrollView.DifferentialMotionFlingTargetImpl();
        this.getHighSpeedVideoSizes = differentialMotionFlingTargetImpl;
        this.getHighSpeedVideoFpsRangesFor = new androidx.core.view.DifferentialMotionFlingController(getContext(), differentialMotionFlingTargetImpl);
        this.mEdgeGlowTop = androidx.core.widget.EdgeEffectCompat.create(context, attributeSet);
        this.mEdgeGlowBottom = androidx.core.widget.EdgeEffectCompat.create(context, attributeSet);
        this.CoroutineDebuggingKt = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.widget.OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this._BOUNDARY = viewConfiguration.getScaledTouchSlop();
        this.isOutputSupportedForhNQ4ISI = viewConfiguration.getScaledMinimumFlingVelocity();
        this.isOutputSupportedFor = viewConfiguration.getScaledMaximumFlingVelocity();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getOutputFormats, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.ArtificialStackFrames = new androidx.core.view.NestedScrollingParentHelper(this);
        this.getInputSizeshNQ4ISI = new androidx.core.view.NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.getInputSizeshNQ4ISI.dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.getInputSizeshNQ4ISI.startNestedScroll(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.getInputSizeshNQ4ISI.stopNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.getInputSizeshNQ4ISI.hasNestedScrollingParent(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.getInputSizeshNQ4ISI.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.getInputSizeshNQ4ISI.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.getInputSizeshNQ4ISI.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.getInputSizeshNQ4ISI.isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.getInputSizeshNQ4ISI.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.getInputSizeshNQ4ISI.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.getInputSizeshNQ4ISI.dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        getHighSpeedVideoFpsRanges(i4, i5, iArr);
    }

    private void getHighSpeedVideoFpsRanges(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.getInputSizeshNQ4ISI.dispatchNestedScroll(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i, int i2) {
        this.ArtificialStackFrames.onNestedScrollAccepted(view, view2, i, i2);
        startNestedScroll(2, i2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View view, int i) {
        this.ArtificialStackFrames.onStopNestedScroll(view, i);
        stopNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        getHighSpeedVideoFpsRanges(i4, i5, null);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        getHighSpeedVideoFpsRanges(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        fling((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.ArtificialStackFrames.getNestedScrollAxes();
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(androidx.core.widget.NestedScrollView.OnScrollChangeListener onScrollChangeListener) {
        this.getValidOutputFormatsForInputhNQ4ISI = onScrollChangeListener;
    }

    public boolean isFillViewport() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setFillViewport(boolean z) {
        if (z != this.getHighSpeedVideoSizesFor) {
            this.getHighSpeedVideoSizesFor = z;
            requestLayout();
        }
    }

    public boolean isSmoothScrollingEnabled() {
        return this._CREATION;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this._CREATION = z;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        androidx.core.widget.NestedScrollView.OnScrollChangeListener onScrollChangeListener = this.getValidOutputFormatsForInputhNQ4ISI;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.getHighSpeedVideoSizesFor || android.view.View.MeasureSpec.getMode(i2) == 0 || getChildCount() <= 0) {
            return;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
        if (measuredHeight < measuredHeight2) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int i3 = layoutParams.leftMargin;
            childAt.measure(getChildMeasureSpec(i, paddingLeft + paddingRight + i3 + layoutParams.rightMargin, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean executeKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z;
        this.b.setEmpty();
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
                if (z) {
                    if (isFocused() && keyEvent.getKeyCode() != 4) {
                        android.view.View findFocus = findFocus();
                        if (findFocus == this) {
                            findFocus = null;
                        }
                        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                        if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                            return true;
                        }
                    }
                    return false;
                }
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        if (keyEvent.isAltPressed()) {
                            return fullScroll(33);
                        }
                        return arrowScroll(33);
                    }
                    if (keyCode == 20) {
                        if (keyEvent.isAltPressed()) {
                            return fullScroll(130);
                        }
                        return arrowScroll(130);
                    }
                    if (keyCode == 62) {
                        pageScroll(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return fullScroll(33);
                    }
                    if (keyCode == 93) {
                        return fullScroll(130);
                    }
                    if (keyCode == 122) {
                        pageScroll(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        pageScroll(130);
                        return false;
                    }
                }
                return false;
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.getOutputMinFrameDurationlomOqCM) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                android.view.View childAt = getChildAt(0);
                if (y >= childAt.getTop() - scrollY && y < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.getOutputStallDurationlomOqCM = y;
                    this.getOutputMinFrameDuration = motionEvent.getPointerId(0);
                    android.view.VelocityTracker velocityTracker = this.f2731a;
                    if (velocityTracker == null) {
                        this.f2731a = android.view.VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.f2731a.addMovement(motionEvent);
                    this.getARTIFICIAL_FRAME_PACKAGE_NAME.computeScrollOffset();
                    if (!getHighResolutionOutputSizeshNQ4ISI(motionEvent) && this.getARTIFICIAL_FRAME_PACKAGE_NAME.isFinished()) {
                        z = false;
                    }
                    this.getOutputMinFrameDurationlomOqCM = z;
                    startNestedScroll(2, 0);
                }
            }
            if (!getHighResolutionOutputSizeshNQ4ISI(motionEvent) && this.getARTIFICIAL_FRAME_PACKAGE_NAME.isFinished()) {
                z = false;
            }
            this.getOutputMinFrameDurationlomOqCM = z;
            android.view.VelocityTracker velocityTracker2 = this.f2731a;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f2731a = null;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.getOutputMinFrameDuration;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (java.lang.Math.abs(y2 - this.getOutputStallDurationlomOqCM) > this._BOUNDARY && (2 & getNestedScrollAxes()) == 0) {
                            this.getOutputMinFrameDurationlomOqCM = true;
                            this.getOutputStallDurationlomOqCM = y2;
                            if (this.f2731a == null) {
                                this.f2731a = android.view.VelocityTracker.obtain();
                            }
                            this.f2731a.addMovement(motionEvent);
                            this.unwrapAs = 0;
                            android.view.ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        Camera2StreamConfigurationMap(motionEvent);
                    }
                }
            }
            this.getOutputMinFrameDurationlomOqCM = false;
            this.getOutputMinFrameDuration = -1;
            android.view.VelocityTracker velocityTracker3 = this.f2731a;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2731a = null;
            }
            if (this.getARTIFICIAL_FRAME_PACKAGE_NAME.springBack(getScrollX(), getScrollY(), 0, 0, 0, getHighSpeedVideoFpsRanges())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        }
        return this.getOutputMinFrameDurationlomOqCM;
    }

    private void Camera2StreamConfigurationMap() {
        this.getOutputMinFrameDuration = -1;
        this.getOutputMinFrameDurationlomOqCM = false;
        android.view.VelocityTracker velocityTracker = this.f2731a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2731a = null;
        }
        stopNestedScroll(0);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    }

    private int getHighSpeedVideoFpsRanges(int i, int i2, android.view.MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        android.view.VelocityTracker velocityTracker;
        if (i4 == 1) {
            startNestedScroll(2, i4);
        }
        if (dispatchNestedPreScroll(0, i, this.coroutineCreation, this.coroutineBoundary, i4)) {
            i5 = i - this.coroutineCreation[1];
            i6 = this.coroutineBoundary[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && getHighSpeedVideoFpsRanges() > 0)) && !z;
        boolean z3 = getHighSpeedVideoFpsRanges(i5, 0, scrollY, highSpeedVideoFpsRanges) && !hasNestedScrollingParent(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.view.ScrollFeedbackProviderCompat.createProvider(this);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        int[] iArr = this.coroutineCreation;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, this.coroutineBoundary, i4, iArr);
        int i7 = this.coroutineBoundary[1];
        int i8 = i5 - this.coroutineCreation[1];
        int i9 = scrollY + i8;
        if (i9 < 0) {
            if (z2) {
                androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.view.ScrollFeedbackProviderCompat.createProvider(this);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
        } else if (i9 > highSpeedVideoFpsRanges && z2) {
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.view.ScrollFeedbackProviderCompat.createProvider(this);
                }
                this.getHighResolutionOutputSizeshNQ4ISI.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
            }
            if (!this.mEdgeGlowTop.isFinished()) {
                this.mEdgeGlowTop.onRelease();
            }
        }
        if (!this.mEdgeGlowTop.isFinished() || !this.mEdgeGlowBottom.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z3 && i4 == 0 && (velocityTracker = this.f2731a) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            stopNestedScroll(i4);
            this.mEdgeGlowTop.onRelease();
            this.mEdgeGlowBottom.onRelease();
        }
        return i6 + i7;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(android.widget.EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float distance = androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect);
        float height = getHeight();
        double log = java.lang.Math.log((java.lang.Math.abs(-i) * 0.35f) / (this.CoroutineDebuggingKt * 0.015f));
        double d = Camera2StreamConfigurationMap;
        return ((float) (((double) (this.CoroutineDebuggingKt * 0.015f)) * java.lang.Math.exp((d / (d - 1.0d)) * log))) < distance * height;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(android.view.MotionEvent motionEvent) {
        boolean z;
        if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
            return z;
        }
        androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void Camera2StreamConfigurationMap(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.getOutputMinFrameDuration) {
            int i = actionIndex == 0 ? 1 : 0;
            this.getOutputStallDurationlomOqCM = (int) motionEvent.getY(i);
            this.getOutputMinFrameDuration = motionEvent.getPointerId(i);
            android.view.VelocityTracker velocityTracker = this.f2731a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        int i;
        int i2;
        float f;
        if (motionEvent.getAction() == 8 && !this.getOutputMinFrameDurationlomOqCM) {
            if (androidx.core.view.MotionEventCompat.isFromSource(motionEvent, 2)) {
                i = 9;
                f = motionEvent.getAxisValue(9);
                i2 = (int) motionEvent.getX();
            } else if (androidx.core.view.MotionEventCompat.isFromSource(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i2 = getWidth() / 2;
                i = 26;
                f = axisValue;
            } else {
                i = 0;
                i2 = 0;
                f = 0.0f;
            }
            if (f != 0.0f) {
                getHighSpeedVideoFpsRanges(-((int) (f * getHighSpeedVideoSizes())), i, motionEvent, i2, 1, androidx.core.view.MotionEventCompat.isFromSource(motionEvent, 8194));
                this.getHighSpeedVideoFpsRangesFor.onMotionEvent(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    final float getHighSpeedVideoSizes() {
        if (this.d == 0.0f) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.Context context = getContext();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new java.lang.IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.d = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.d;
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    private boolean getHighSpeedVideoFpsRanges(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            z = true;
            i2 = 0;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !hasNestedScrollingParent(1)) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.springBack(i2, i4, 0, 0, 0, getHighSpeedVideoFpsRanges());
        }
        onOverScrolled(i2, i4, z, z2);
        return z || z2;
    }

    final int getHighSpeedVideoFpsRanges() {
        if (getChildCount() <= 0) {
            return 0;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int height = childAt.getHeight();
        int i = layoutParams.topMargin;
        return java.lang.Math.max(0, ((height + i) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public boolean pageScroll(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                android.view.View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.b.top + height > bottom) {
                    this.b.top = bottom - height;
                }
            }
        } else {
            this.b.top = getScrollY() - height;
            if (this.b.top < 0) {
                this.b.top = 0;
            }
        }
        android.graphics.Rect rect = this.b;
        rect.bottom = rect.top + height;
        return getHighResolutionOutputSizeshNQ4ISI(i, this.b.top, this.b.bottom);
    }

    public boolean fullScroll(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.b.top = 0;
        this.b.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            android.view.View childAt = getChildAt(childCount - 1);
            this.b.bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            android.graphics.Rect rect = this.b;
            rect.top = rect.bottom - height;
        }
        return getHighResolutionOutputSizeshNQ4ISI(i, this.b.top, this.b.bottom);
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        java.util.ArrayList<android.view.View> focusables = getFocusables(2);
        int size = focusables.size();
        android.view.View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            android.view.View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        android.view.View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            getHighSpeedVideoFpsRanges(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    public boolean arrowScroll(int i) {
        android.view.View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && getHighResolutionOutputSizeshNQ4ISI(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.b);
            offsetDescendantRectToMyCoords(findNextFocus, this.b);
            getHighSpeedVideoFpsRanges(computeScrollDeltaToGetChildRectOnScreen(this.b), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                maxScrollAmount = java.lang.Math.min((childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            getHighSpeedVideoFpsRanges(maxScrollAmount, -1, null, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!getHighResolutionOutputSizeshNQ4ISI(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(android.view.View view, int i, int i2) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        return this.b.bottom + i >= getScrollY() && this.b.top - i <= getScrollY() + i2;
    }

    public final void smoothScrollBy(int i, int i2) {
        getHighSpeedVideoSizes(i, i2, 250, false);
    }

    public final void smoothScrollBy(int i, int i2, int i3) {
        getHighSpeedVideoSizes(i, i2, i3, false);
    }

    void getHighSpeedVideoSizes(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.getOutputSizeshNQ4ISI > 250) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i4 = layoutParams.topMargin;
            int i5 = layoutParams.bottomMargin;
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.startScroll(getScrollX(), scrollY, 0, java.lang.Math.max(0, java.lang.Math.min(i2 + scrollY, java.lang.Math.max(0, ((height + i4) + i5) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, i3);
            if (z) {
                startNestedScroll(2, 1);
            } else {
                stopNestedScroll(1);
            }
            this.toString = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.getARTIFICIAL_FRAME_PACKAGE_NAME.isFinished()) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.abortAnimation();
                stopNestedScroll(1);
            }
            scrollBy(i, i2);
        }
        this.getOutputSizeshNQ4ISI = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        android.view.View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = java.lang.Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return java.lang.Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(android.view.View view, int i, int i2) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(android.view.View view, int i, int i2, int i3, int i4) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        view.measure(getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void computeScroll() {
        int round;
        int i;
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME.isFinished()) {
            return;
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.computeScrollOffset();
        int currY = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getCurrY();
        int i2 = currY - this.toString;
        int height = getHeight();
        if (i2 <= 0 || androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) {
            if (i2 < 0 && androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
                float f = height;
                round = java.lang.Math.round((f / 4.0f) * androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, (i2 * 4.0f) / f, 0.5f));
                if (round != i2) {
                    this.mEdgeGlowBottom.finish();
                }
            }
            int i3 = i2;
            this.toString = currY;
            int[] iArr = this.coroutineCreation;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i3, iArr, null, 1);
            i = i3 - this.coroutineCreation[1];
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                androidx.core.widget.NestedScrollView.Api35Impl.Camera2StreamConfigurationMap(this, java.lang.Math.abs(this.getARTIFICIAL_FRAME_PACKAGE_NAME.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                getHighSpeedVideoFpsRanges(i, getScrollX(), scrollY, highSpeedVideoFpsRanges);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                int[] iArr2 = this.coroutineCreation;
                iArr2[1] = 0;
                dispatchNestedScroll(0, scrollY2, 0, i4, this.coroutineBoundary, 1, iArr2);
                i = i4 - this.coroutineCreation[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && highSpeedVideoFpsRanges > 0)) {
                    if (i < 0) {
                        if (this.mEdgeGlowTop.isFinished()) {
                            this.mEdgeGlowTop.onAbsorb((int) this.getARTIFICIAL_FRAME_PACKAGE_NAME.getCurrVelocity());
                        }
                    } else if (this.mEdgeGlowBottom.isFinished()) {
                        this.mEdgeGlowBottom.onAbsorb((int) this.getARTIFICIAL_FRAME_PACKAGE_NAME.getCurrVelocity());
                    }
                }
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.abortAnimation();
                stopNestedScroll(1);
            }
            if (this.getARTIFICIAL_FRAME_PACKAGE_NAME.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                stopNestedScroll(1);
                return;
            }
        }
        round = java.lang.Math.round(((-height) / 4.0f) * androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, ((-i2) * 4.0f) / height, 0.5f));
        if (round != i2) {
            this.mEdgeGlowTop.finish();
        }
        i2 -= round;
        int i32 = i2;
        this.toString = currY;
        int[] iArr3 = this.coroutineCreation;
        iArr3[1] = 0;
        dispatchNestedPreScroll(0, i32, iArr3, null, 1);
        i = i32 - this.coroutineCreation[1];
        int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
        if (android.os.Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME.isFinished()) {
        }
    }

    private void getHighSpeedVideoSizes(android.view.View view) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.b);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return java.lang.Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i = 0 - (i4 - rect.bottom);
        } else {
            i = 0 - (scrollY - rect.top);
        }
        return java.lang.Math.max(i, -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.getOutputSizes) {
            getHighSpeedVideoSizes(view2);
        } else {
            this.getInputFormats = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        android.view.View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (true ^ getHighResolutionOutputSizeshNQ4ISI(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = computeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
                return true;
            }
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.getOutputSizes = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.getOutputSizes = false;
        android.view.View view = this.getInputFormats;
        if (view != null && getHighSpeedVideoFpsRanges(view, this)) {
            getHighSpeedVideoSizes(this.getInputFormats);
        }
        this.getInputFormats = null;
        if (!this.getOutputStallDuration) {
            if (this.accessartificialFrame != null) {
                scrollTo(getScrollX(), this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI);
                this.accessartificialFrame = null;
            }
            if (getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int i7 = ((i4 - i2) - paddingTop) - paddingBottom;
            if (i7 < i5 && scrollY >= 0) {
                i6 = i7 + scrollY > i5 ? i5 - i7 : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.getOutputStallDuration = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getOutputStallDuration = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        android.view.View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !getHighResolutionOutputSizeshNQ4ISI(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(findFocus, this.b);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.b);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            if (this._CREATION) {
                smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            } else {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(android.view.View view, android.view.View view2) {
        if (view == view2) {
            return true;
        }
        java.lang.Object parent = view.getParent();
        return (parent instanceof android.view.ViewGroup) && getHighSpeedVideoFpsRanges((android.view.View) parent, view2);
    }

    public void fling(int i) {
        if (getChildCount() > 0) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            startNestedScroll(2, 1);
            this.toString = getScrollY();
            postInvalidateOnAnimation();
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                androidx.core.widget.NestedScrollView.Api35Impl.Camera2StreamConfigurationMap(this, java.lang.Math.abs(this.getARTIFICIAL_FRAME_PACKAGE_NAME.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i3 = layoutParams.leftMargin;
            int i4 = layoutParams.rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i5 = layoutParams.topMargin;
            int i6 = layoutParams.bottomMargin;
            int i7 = (width - paddingLeft) - paddingRight;
            int i8 = width2 + i3 + i4;
            if (i7 >= i8 || i < 0) {
                i = 0;
            } else if (i7 + i > i8) {
                i = i8 - i7;
            }
            int i9 = (height - paddingTop) - paddingBottom;
            int i10 = height2 + i5 + i6;
            if (i9 >= i10 || i2 < 0) {
                i2 = 0;
            } else if (i9 + i2 > i10) {
                i2 = i10 - i9;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.mEdgeGlowTop.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = java.lang.Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            } else {
                i = 0;
            }
            canvas.translate(i, min);
            this.mEdgeGlowTop.setSize(width, height);
            if (this.mEdgeGlowTop.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.mEdgeGlowBottom.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = java.lang.Math.max(getHighSpeedVideoFpsRanges(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.mEdgeGlowBottom.setSize(width2, height2);
        if (this.mEdgeGlowBottom.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.core.widget.NestedScrollView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.core.widget.NestedScrollView.SavedState savedState = (androidx.core.widget.NestedScrollView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.accessartificialFrame = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.core.widget.NestedScrollView.SavedState savedState = new androidx.core.widget.NestedScrollView.SavedState(super.onSaveInstanceState());
        savedState.getHighResolutionOutputSizeshNQ4ISI = getScrollY();
        return savedState;
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.SavedState>() { // from class: androidx.core.widget.NestedScrollView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ androidx.core.widget.NestedScrollView.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.core.widget.NestedScrollView.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.core.widget.NestedScrollView.SavedState[] newArray(int i) {
                return new androidx.core.widget.NestedScrollView.SavedState[i];
            }
        };
        public int getHighResolutionOutputSizeshNQ4ISI;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("}");
            return sb.toString();
        }
    }

    static class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            android.graphics.Rect rect = new android.graphics.Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int paddingBottom = nestedScrollView.getPaddingBottom();
                    int max = java.lang.Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.getHighSpeedVideoSizes(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), 250, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int paddingBottom2 = nestedScrollView.getPaddingBottom();
            int paddingTop = nestedScrollView.getPaddingTop();
            int min = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - paddingBottom2) - paddingTop), nestedScrollView.getHighSpeedVideoFpsRanges());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.getHighSpeedVideoSizes(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int highSpeedVideoFpsRanges;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
            accessibilityNodeInfoCompat.setClassName(android.widget.ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (highSpeedVideoFpsRanges = nestedScrollView.getHighSpeedVideoFpsRanges()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
            }
            if (nestedScrollView.getScrollY() < highSpeedVideoFpsRanges) {
                accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
            accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getHighSpeedVideoFpsRanges() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.AccessibilityRecordCompat.setMaxScrollX(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.AccessibilityRecordCompat.setMaxScrollY(accessibilityEvent, nestedScrollView.getHighSpeedVideoFpsRanges());
        }
    }

    /* loaded from: classes7.dex */
    class DifferentialMotionFlingTargetImpl implements androidx.core.view.DifferentialMotionFlingTarget {
        DifferentialMotionFlingTargetImpl() {
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public boolean startDifferentialMotionFling(float f) {
            if (f == 0.0f) {
                return false;
            }
            stopDifferentialMotionFling();
            androidx.core.widget.NestedScrollView.this.fling((int) f);
            return true;
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public void stopDifferentialMotionFling() {
            androidx.core.widget.NestedScrollView.this.getARTIFICIAL_FRAME_PACKAGE_NAME.abortAnimation();
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public float getScaledScrollFactor() {
            return -androidx.core.widget.NestedScrollView.this.getHighSpeedVideoSizes();
        }
    }

    static final class Api35Impl {
        private Api35Impl() {
        }

        public static void Camera2StreamConfigurationMap(android.view.View view, float f) {
            try {
                view.setFrameContentVelocity(f);
            } catch (java.lang.LinkageError unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        float onPullDistance;
        int round;
        int i;
        android.view.ViewParent parent2;
        if (this.f2731a == null) {
            this.f2731a = android.view.VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.unwrapAs = 0;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.unwrapAs);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                android.view.VelocityTracker velocityTracker = this.f2731a;
                velocityTracker.computeCurrentVelocity(1000, this.isOutputSupportedFor);
                int yVelocity = (int) velocityTracker.getYVelocity(this.getOutputMinFrameDuration);
                if (java.lang.Math.abs(yVelocity) >= this.isOutputSupportedForhNQ4ISI) {
                    if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
                        if (getHighResolutionOutputSizeshNQ4ISI(this.mEdgeGlowTop, yVelocity)) {
                            this.mEdgeGlowTop.onAbsorb(yVelocity);
                        } else {
                            fling(-yVelocity);
                        }
                    } else if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            fling(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        if (getHighResolutionOutputSizeshNQ4ISI(this.mEdgeGlowBottom, i3)) {
                            this.mEdgeGlowBottom.onAbsorb(i3);
                        } else {
                            fling(i3);
                        }
                    }
                } else if (this.getARTIFICIAL_FRAME_PACKAGE_NAME.springBack(getScrollX(), getScrollY(), 0, 0, 0, getHighSpeedVideoFpsRanges())) {
                    postInvalidateOnAnimation();
                }
                Camera2StreamConfigurationMap();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.getOutputMinFrameDuration);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i4 = this.getOutputStallDurationlomOqCM - y;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
                        onPullDistance = -androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, -height, x);
                        if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) {
                            this.mEdgeGlowTop.onRelease();
                        }
                    } else {
                        if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
                            onPullDistance = androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, height, 1.0f - x);
                            if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
                                this.mEdgeGlowBottom.onRelease();
                            }
                        }
                        round = java.lang.Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i = i4 - round;
                        if (!this.getOutputMinFrameDurationlomOqCM && java.lang.Math.abs(i) > this._BOUNDARY) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.getOutputMinFrameDurationlomOqCM = true;
                            if (i <= 0) {
                                i -= this._BOUNDARY;
                            } else {
                                i += this._BOUNDARY;
                            }
                        }
                        int i5 = i;
                        if (this.getOutputMinFrameDurationlomOqCM) {
                            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i5, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.getOutputStallDurationlomOqCM = y - highSpeedVideoFpsRanges;
                            this.unwrapAs += highSpeedVideoFpsRanges;
                        }
                    }
                    f = onPullDistance;
                    round = java.lang.Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    i = i4 - round;
                    if (!this.getOutputMinFrameDurationlomOqCM) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.getOutputMinFrameDurationlomOqCM = true;
                        if (i <= 0) {
                        }
                    }
                    int i52 = i;
                    if (this.getOutputMinFrameDurationlomOqCM) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.getOutputMinFrameDurationlomOqCM && getChildCount() > 0 && this.getARTIFICIAL_FRAME_PACKAGE_NAME.springBack(getScrollX(), getScrollY(), 0, 0, 0, getHighSpeedVideoFpsRanges())) {
                    postInvalidateOnAnimation();
                }
                Camera2StreamConfigurationMap();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.getOutputStallDurationlomOqCM = (int) motionEvent.getY(actionIndex);
                this.getOutputMinFrameDuration = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                Camera2StreamConfigurationMap(motionEvent);
                this.getOutputStallDurationlomOqCM = (int) motionEvent.getY(motionEvent.findPointerIndex(this.getOutputMinFrameDuration));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.getOutputMinFrameDurationlomOqCM && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.getARTIFICIAL_FRAME_PACKAGE_NAME.isFinished()) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.abortAnimation();
                stopNestedScroll(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.getOutputStallDurationlomOqCM = y2;
            this.getOutputMinFrameDuration = pointerId;
            startNestedScroll(2, 0);
        }
        android.view.VelocityTracker velocityTracker2 = this.f2731a;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        android.view.VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f2731a) != null) {
            velocityTracker.recycle();
            this.f2731a = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void smoothScrollTo(int i, int i2) {
        getHighSpeedVideoSizes(i - getScrollX(), i2 - getScrollY(), 250, false);
    }

    public final void smoothScrollTo(int i, int i2, int i3) {
        getHighSpeedVideoSizes(i - getScrollX(), i2 - getScrollY(), i3, false);
    }
}
