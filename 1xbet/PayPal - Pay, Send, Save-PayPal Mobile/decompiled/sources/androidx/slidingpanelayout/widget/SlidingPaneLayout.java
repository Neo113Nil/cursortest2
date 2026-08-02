package androidx.slidingpanelayout.widget;

/* loaded from: classes7.dex */
public class SlidingPaneLayout extends android.view.ViewGroup implements androidx.customview.widget.Openable {
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static boolean getOutputSizeshNQ4ISI;
    private android.graphics.drawable.Drawable ArtificialStackFrames;
    androidx.window.layout.FoldingFeature Camera2StreamConfigurationMap;
    private float CoroutineDebuggingKt;
    private android.graphics.drawable.Drawable accessartificialFrame;
    private int coroutineBoundary;
    private final android.graphics.Rect coroutineCreation;
    int getHighResolutionOutputSizeshNQ4ISI;
    final androidx.customview.widget.ViewDragHelper getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    final java.util.List<androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener> getHighSpeedVideoSizes;
    final java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable> getHighSpeedVideoSizesFor;
    android.view.View getInputFormats;
    boolean getInputSizeshNQ4ISI;
    int getOutputFormats;
    float getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private androidx.slidingpanelayout.widget.FoldingFeatureObserver getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;
    private float getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedFor;
    private androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener isOutputSupportedForhNQ4ISI;
    private float toString;
    private androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener unwrapAs;

    public interface PanelSlideListener {
        void onPanelClosed(android.view.View view);

        void onPanelOpened(android.view.View view);

        void onPanelSlide(android.view.View view, float f);
    }

    public static class SimplePanelSlideListener implements androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(android.view.View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(android.view.View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(android.view.View view, float f) {
        }
    }

    static {
        getOutputSizeshNQ4ISI = android.os.Build.VERSION.SDK_INT >= 29;
    }

    public final void setLockMode(int i) {
        this.isOutputSupportedFor = i;
    }

    public final int getLockMode() {
        return this.isOutputSupportedFor;
    }

    public SlidingPaneLayout(android.content.Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.coroutineBoundary = 0;
        this.getOutputMinFrameDuration = 1.0f;
        this.getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArrayList();
        this.getOutputStallDurationlomOqCM = true;
        this.coroutineCreation = new android.graphics.Rect();
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList<>();
        this.unwrapAs = new androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.1
            @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
            public void onFoldingFeatureChange(androidx.window.layout.FoldingFeature foldingFeature) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.Camera2StreamConfigurationMap = foldingFeature;
                androidx.transition.ChangeBounds changeBounds = new androidx.transition.ChangeBounds();
                changeBounds.setDuration(300L);
                changeBounds.setInterpolator(androidx.core.view.animation.PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
                androidx.transition.TransitionManager.beginDelayedTransition(androidx.slidingpanelayout.widget.SlidingPaneLayout.this, changeBounds);
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.requestLayout();
            }
        };
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.slidingpanelayout.widget.SlidingPaneLayout.AccessibilityDelegate());
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        androidx.customview.widget.ViewDragHelper create = androidx.customview.widget.ViewDragHelper.create(this, 0.5f, new androidx.slidingpanelayout.widget.SlidingPaneLayout.DragHelperCallback());
        this.getHighSpeedVideoFpsRanges = create;
        create.setMinVelocity(f * 400.0f);
        androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver = new androidx.slidingpanelayout.widget.FoldingFeatureObserver(androidx.window.layout.WindowInfoTracker.getOrCreate(context), androidx.core.content.ContextCompat.getMainExecutor(context));
        this.getOutputStallDuration = foldingFeatureObserver;
        foldingFeatureObserver.setOnFoldingFeatureChangeListener(this.unwrapAs);
    }

    public void setParallaxDistance(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @java.lang.Deprecated
    public void setSliderFadeColor(int i) {
        this.coroutineBoundary = i;
    }

    @java.lang.Deprecated
    public int getSliderFadeColor() {
        return this.coroutineBoundary;
    }

    @java.lang.Deprecated
    public void setCoveredFadeColor(int i) {
        this.getOutputMinFrameDurationlomOqCM = i;
    }

    @java.lang.Deprecated
    public int getCoveredFadeColor() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @java.lang.Deprecated
    public void setPanelSlideListener(androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener2 = this.isOutputSupportedForhNQ4ISI;
        if (panelSlideListener2 != null) {
            removePanelSlideListener(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            addPanelSlideListener(panelSlideListener);
        }
        this.isOutputSupportedForhNQ4ISI = panelSlideListener;
    }

    public void addPanelSlideListener(androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener) {
        this.getHighSpeedVideoSizes.add(panelSlideListener);
    }

    public void removePanelSlideListener(androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener panelSlideListener) {
        this.getHighSpeedVideoSizes.remove(panelSlideListener);
    }

    final void getHighSpeedVideoSizes() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker(view), i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (view.getParent() instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker) {
            super.removeView((android.view.View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        android.app.Activity activity;
        super.onAttachedToWindow();
        this.getOutputStallDurationlomOqCM = true;
        if (this.getOutputStallDuration != null) {
            android.content.Context context = getContext();
            while (true) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof android.app.Activity) {
                        activity = (android.app.Activity) context;
                        break;
                    }
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                this.getOutputStallDuration.registerLayoutStateChangeCallback(activity);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getOutputStallDurationlomOqCM = true;
        androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver = this.getOutputStallDuration;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.unregisterLayoutStateChangeCallback();
        }
        int size = this.getHighSpeedVideoSizesFor.size();
        for (int i = 0; i < size; i++) {
            this.getHighSpeedVideoSizesFor.get(i).run();
        }
        this.getHighSpeedVideoSizesFor.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r13.width != 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0266  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int makeMeasureSpec;
        java.util.ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        int minimumWidth;
        int minimumWidth2;
        int makeMeasureSpec2;
        int i11;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        ?? r7 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            i3 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i3;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int max = java.lang.Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.getInputFormats = null;
        int i12 = 0;
        boolean z = false;
        int i13 = max;
        float f = 0.0f;
        while (true) {
            i4 = 8;
            if (i12 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i12);
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt.getLayoutParams();
            int i14 = size;
            if (childAt.getVisibility() == 8) {
                layoutParams.getHighSpeedVideoFpsRanges = r7;
            } else {
                if (layoutParams.weight > 0.0f) {
                    f += layoutParams.weight;
                }
                int max2 = java.lang.Math.max(max - (layoutParams.leftMargin + layoutParams.rightMargin), (int) r7);
                if (layoutParams.width == -2) {
                    makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(max2, mode == 0 ? mode : Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(max2, mode);
                } else {
                    makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                i11 = mode;
                childAt.measure(makeMeasureSpec2, getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i3 = java.lang.Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i3 = measuredHeight;
                    }
                }
                i13 -= measuredWidth;
                if (i12 != 0) {
                    boolean z2 = i13 < 0;
                    layoutParams.getHighSpeedVideoSizes = z2;
                    z |= z2;
                    if (layoutParams.getHighSpeedVideoSizes) {
                        this.getInputFormats = childAt;
                    }
                }
                i12++;
                size = i14;
                mode = i11;
                r7 = 0;
            }
            i11 = mode;
            i12++;
            size = i14;
            mode = i11;
            r7 = 0;
        }
        int i15 = size;
        if (z || f > 0.0f) {
            int i16 = 0;
            while (i16 < childCount) {
                android.view.View childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() == i4) {
                    i7 = i13;
                } else {
                    androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams2 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth2 = (layoutParams2.width != 0 || layoutParams2.weight <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z) {
                        i5 = max - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                        i6 = android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else if (layoutParams2.weight > 0.0f) {
                        i5 = ((int) ((layoutParams2.weight * java.lang.Math.max(0, i13)) / f)) + measuredWidth2;
                        i6 = android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else {
                        i5 = measuredWidth2;
                        i6 = 0;
                    }
                    int paddingTop2 = getPaddingTop() + getPaddingBottom();
                    androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams3 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt2.getLayoutParams();
                    i7 = i13;
                    if (layoutParams3.width == 0 && layoutParams3.weight > 0.0f) {
                        makeMeasureSpec = getChildMeasureSpec(i2, paddingTop2, layoutParams3.height);
                        if (measuredWidth2 == i5) {
                            childAt2.measure(i6, makeMeasureSpec);
                            int measuredHeight2 = childAt2.getMeasuredHeight();
                            if (measuredHeight2 > i3) {
                                if (mode2 == Integer.MIN_VALUE) {
                                    measuredHeight2 = java.lang.Math.min(measuredHeight2, paddingTop);
                                } else if (mode2 != 0) {
                                }
                                i3 = measuredHeight2;
                            }
                        }
                    }
                    makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                    if (measuredWidth2 == i5) {
                    }
                }
                i16++;
                i13 = i7;
                i4 = 8;
            }
        }
        androidx.window.layout.FoldingFeature foldingFeature = this.Camera2StreamConfigurationMap;
        if (foldingFeature != null && foldingFeature.isSeparating() && this.Camera2StreamConfigurationMap.getBounds().left != 0 && this.Camera2StreamConfigurationMap.getBounds().top == 0) {
            androidx.window.layout.FoldingFeature foldingFeature2 = this.Camera2StreamConfigurationMap;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i17 = iArr[0];
            android.graphics.Rect rect = new android.graphics.Rect(i17, iArr[1], getWidth() + i17, iArr[1] + getWidth());
            android.graphics.Rect rect2 = new android.graphics.Rect(foldingFeature2.getBounds());
            boolean intersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && intersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 != null) {
                android.graphics.Rect rect3 = new android.graphics.Rect(getPaddingLeft(), getPaddingTop(), java.lang.Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new java.util.ArrayList(java.util.Arrays.asList(rect3, new android.graphics.Rect(java.lang.Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
                if (arrayList != null && !z) {
                    for (i8 = 0; i8 < childCount; i8++) {
                        android.view.View childAt3 = getChildAt(i8);
                        if (childAt3.getVisibility() != 8) {
                            android.graphics.Rect rect4 = (android.graphics.Rect) arrayList.get(i8);
                            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams4 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt3.getLayoutParams();
                            int i18 = layoutParams4.leftMargin;
                            int i19 = layoutParams4.rightMargin;
                            int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                            childAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), makeMeasureSpec3);
                            if ((childAt3.getMeasuredWidthAndState() & 16777216) != 1) {
                                boolean z3 = childAt3 instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker;
                                if (z3) {
                                    i10 = 0;
                                    minimumWidth = androidx.core.view.ViewCompat.getMinimumWidth(((androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker) childAt3).getChildAt(0));
                                } else {
                                    i10 = 0;
                                    minimumWidth = androidx.core.view.ViewCompat.getMinimumWidth(childAt3);
                                }
                                if (minimumWidth != 0) {
                                    int width2 = rect4.width();
                                    if (z3) {
                                        minimumWidth2 = androidx.core.view.ViewCompat.getMinimumWidth(((androidx.slidingpanelayout.widget.SlidingPaneLayout.TouchBlocker) childAt3).getChildAt(i10));
                                    } else {
                                        minimumWidth2 = androidx.core.view.ViewCompat.getMinimumWidth(childAt3);
                                    }
                                    i9 = width2 < minimumWidth2 ? 1073741824 : 1073741824;
                                }
                                childAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), makeMeasureSpec3);
                            }
                            childAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(max - (i18 + i19), i9), makeMeasureSpec3);
                            if (i8 != 0) {
                                layoutParams4.getHighSpeedVideoSizes = true;
                                this.getInputFormats = childAt3;
                                z = true;
                            }
                        }
                    }
                }
                setMeasuredDimension(i15, i3 + getPaddingTop() + getPaddingBottom());
                this.getOutputSizes = z;
                if (this.getHighSpeedVideoFpsRanges.getViewDragState() != 0 || z) {
                }
                this.getHighSpeedVideoFpsRanges.abort();
                return;
            }
        }
        arrayList = null;
        if (arrayList != null) {
            while (i8 < childCount) {
            }
        }
        setMeasuredDimension(i15, i3 + getPaddingTop() + getPaddingBottom());
        this.getOutputSizes = z;
        if (this.getHighSpeedVideoFpsRanges.getViewDragState() != 0) {
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.getOutputStallDurationlomOqCM = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.getOutputSizes) {
            return;
        }
        this.getInputSizeshNQ4ISI = view == this.getInputFormats;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.getOutputSizes && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.getOutputSizes || (this.getHighSpeedVideoFpsRangesFor && actionMasked != 0)) {
            this.getHighSpeedVideoFpsRanges.cancel();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.getHighSpeedVideoFpsRanges.cancel();
            return false;
        }
        if (actionMasked == 0) {
            this.getHighSpeedVideoFpsRangesFor = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.toString = x;
            this.getValidOutputFormatsForInputhNQ4ISI = y;
            if (this.getHighSpeedVideoFpsRanges.isViewUnder(this.getInputFormats, (int) x, (int) y) && getHighSpeedVideoFpsRangesFor(this.getInputFormats)) {
                z = true;
                return !this.getHighSpeedVideoFpsRanges.shouldInterceptTouchEvent(motionEvent) || z;
            }
        } else if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float abs = java.lang.Math.abs(x2 - this.toString);
            float abs2 = java.lang.Math.abs(y2 - this.getValidOutputFormatsForInputhNQ4ISI);
            if (abs > this.getHighSpeedVideoFpsRanges.getTouchSlop() && abs2 > abs) {
                this.getHighSpeedVideoFpsRanges.cancel();
                this.getHighSpeedVideoFpsRangesFor = true;
                return false;
            }
        }
        z = false;
        if (this.getHighSpeedVideoFpsRanges.shouldInterceptTouchEvent(motionEvent)) {
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.getOutputSizes) {
            return super.onTouchEvent(motionEvent);
        }
        this.getHighSpeedVideoFpsRanges.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.toString = x;
            this.getValidOutputFormatsForInputhNQ4ISI = y;
            return true;
        }
        if (actionMasked == 1 && getHighSpeedVideoFpsRangesFor(this.getInputFormats)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.toString;
            float f2 = y2 - this.getValidOutputFormatsForInputhNQ4ISI;
            int touchSlop = this.getHighSpeedVideoFpsRanges.getTouchSlop();
            if ((f * f) + (f2 * f2) < touchSlop * touchSlop && this.getHighSpeedVideoFpsRanges.isViewUnder(this.getInputFormats, (int) x2, (int) y2)) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
        return true;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI() {
        if (!this.getOutputSizes) {
            this.getInputSizeshNQ4ISI = false;
        }
        if (!this.getOutputStallDurationlomOqCM && !getHighSpeedVideoSizes(1.0f)) {
            return false;
        }
        this.getInputSizeshNQ4ISI = false;
        return true;
    }

    @java.lang.Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openPane();
    }

    @java.lang.Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closePane();
    }

    public boolean closePane() {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return !this.getOutputSizes || this.getOutputMinFrameDuration == 0.0f;
    }

    @java.lang.Deprecated
    public boolean canSlide() {
        return this.getOutputSizes;
    }

    public boolean isSlideable() {
        return this.getOutputSizes;
    }

    static void getHighSpeedVideoFpsRanges(android.view.View view) {
        androidx.core.view.ViewCompat.setLayerPaint(view, ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor);
    }

    private boolean getHighSpeedVideoSizes(float f) {
        int paddingLeft;
        if (!this.getOutputSizes) {
            return false;
        }
        boolean z = androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.getInputFormats.getLayoutParams();
        if (z) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + layoutParams.rightMargin) + (f * this.getOutputFormats)) + this.getInputFormats.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + layoutParams.leftMargin + (f * this.getOutputFormats));
        }
        androidx.customview.widget.ViewDragHelper viewDragHelper = this.getHighSpeedVideoFpsRanges;
        android.view.View view = this.getInputFormats;
        if (!viewDragHelper.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        getHighSpeedVideoSizes();
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.getHighSpeedVideoFpsRanges.continueSettling(true)) {
            if (!this.getOutputSizes) {
                this.getHighSpeedVideoFpsRanges.abort();
            } else {
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    @java.lang.Deprecated
    public void setShadowDrawable(android.graphics.drawable.Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(android.graphics.drawable.Drawable drawable) {
        this.ArtificialStackFrames = drawable;
    }

    public void setShadowDrawableRight(android.graphics.drawable.Drawable drawable) {
        this.accessartificialFrame = drawable;
    }

    @java.lang.Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
            drawable = this.accessartificialFrame;
        } else {
            drawable = this.ArtificialStackFrames;
        }
        android.view.View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
            i2 = childAt.getRight();
            i = intrinsicWidth + i2;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i = left;
            i2 = i3;
        }
        drawable.setBounds(i2, top, i, bottom);
        drawable.draw(canvas);
    }

    protected boolean canScroll(android.view.View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z) {
            return view.canScrollHorizontally(androidx.core.view.ViewCompat.getLayoutDirection(this) == 1 ? i : -i);
        }
        return false;
    }

    final boolean getHighSpeedVideoFpsRangesFor(android.view.View view) {
        if (view == null) {
            return false;
        }
        return this.getOutputSizes && ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRanges && this.getOutputMinFrameDuration > 0.0f;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState savedState = new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(super.onSaveInstanceState());
        savedState.getHighSpeedVideoFpsRangesFor = isSlideable() ? isOpen() : this.getInputSizeshNQ4ISI;
        savedState.getHighResolutionOutputSizeshNQ4ISI = this.isOutputSupportedFor;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState savedState = (androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.getHighSpeedVideoFpsRangesFor) {
            openPane();
        } else {
            closePane();
        }
        this.getInputSizeshNQ4ISI = savedState.getHighSpeedVideoFpsRangesFor;
        setLockMode(savedState.getHighResolutionOutputSizeshNQ4ISI);
    }

    class DragHelperCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        DragHelperCallback() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View view, int i) {
            if (getHighSpeedVideoSizes()) {
                return ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).getHighSpeedVideoSizes;
            }
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getHighSpeedVideoFpsRanges.getViewDragState() == 0) {
                if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getOutputMinFrameDuration == 1.0f) {
                    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                    slidingPaneLayout.getHighSpeedVideoSizes(slidingPaneLayout.getInputFormats);
                    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout2 = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                    android.view.View view = slidingPaneLayout2.getInputFormats;
                    java.util.Iterator<androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener> it = slidingPaneLayout2.getHighSpeedVideoSizes.iterator();
                    while (it.hasNext()) {
                        it.next().onPanelClosed(view);
                    }
                    slidingPaneLayout2.sendAccessibilityEvent(32);
                    androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getInputSizeshNQ4ISI = false;
                    return;
                }
                androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout3 = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
                android.view.View view2 = slidingPaneLayout3.getInputFormats;
                java.util.Iterator<androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener> it2 = slidingPaneLayout3.getHighSpeedVideoSizes.iterator();
                while (it2.hasNext()) {
                    it2.next().onPanelOpened(view2);
                }
                slidingPaneLayout3.sendAccessibilityEvent(32);
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getInputSizeshNQ4ISI = true;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View view, int i) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getHighSpeedVideoSizes();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = androidx.slidingpanelayout.widget.SlidingPaneLayout.this;
            if (slidingPaneLayout.getInputFormats == null) {
                slidingPaneLayout.getOutputMinFrameDuration = 0.0f;
            } else {
                boolean z = androidx.core.view.ViewCompat.getLayoutDirection(slidingPaneLayout) == 1;
                androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) slidingPaneLayout.getInputFormats.getLayoutParams();
                int width = slidingPaneLayout.getInputFormats.getWidth();
                if (z) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = (i - ((z ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (z ? layoutParams.rightMargin : layoutParams.leftMargin))) / slidingPaneLayout.getOutputFormats;
                slidingPaneLayout.getOutputMinFrameDuration = paddingRight;
                if (slidingPaneLayout.getHighResolutionOutputSizeshNQ4ISI != 0) {
                    slidingPaneLayout.getHighSpeedVideoFpsRanges(paddingRight);
                }
                android.view.View view2 = slidingPaneLayout.getInputFormats;
                java.util.Iterator<androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener> it = slidingPaneLayout.getHighSpeedVideoSizes.iterator();
                while (it.hasNext()) {
                    it.next().onPanelSlide(view2, slidingPaneLayout.getOutputMinFrameDuration);
                }
            }
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View view, float f, float f2) {
            int paddingLeft;
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
            if (androidx.core.view.ViewCompat.getLayoutDirection(androidx.slidingpanelayout.widget.SlidingPaneLayout.this) == 1) {
                int paddingRight = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getOutputMinFrameDuration > 0.5f)) {
                    paddingRight += androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getOutputFormats;
                }
                paddingLeft = (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getWidth() - paddingRight) - androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getInputFormats.getWidth();
            } else {
                paddingLeft = layoutParams.leftMargin + androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getOutputMinFrameDuration > 0.5f)) {
                    paddingLeft += androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getOutputFormats;
                }
            }
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getHighSpeedVideoFpsRanges.settleCapturedViewAt(paddingLeft, view.getTop());
            androidx.slidingpanelayout.widget.SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View view) {
            return androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getOutputFormats;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
            androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getInputFormats.getLayoutParams();
            if (androidx.core.view.ViewCompat.getLayoutDirection(androidx.slidingpanelayout.widget.SlidingPaneLayout.this) == 1) {
                int width = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getWidth() - ((androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getInputFormats.getWidth());
                return java.lang.Math.max(java.lang.Math.min(i, width), width - androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getOutputFormats);
            }
            int paddingLeft = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return java.lang.Math.min(java.lang.Math.max(i, paddingLeft), androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getOutputFormats + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i, int i2) {
            if (getHighSpeedVideoSizes()) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getHighSpeedVideoFpsRanges.captureChildView(androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getInputFormats, i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            if (getHighSpeedVideoSizes()) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getHighSpeedVideoFpsRanges.captureChildView(androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getInputFormats, i2);
            }
        }

        private boolean getHighSpeedVideoSizes() {
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getHighSpeedVideoFpsRangesFor || androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getLockMode() == 3) {
                return false;
            }
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isOpen() && androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return androidx.slidingpanelayout.widget.SlidingPaneLayout.this.isOpen() || androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getLockMode() != 2;
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int[] Camera2StreamConfigurationMap = {android.R.attr.layout_weight};
        boolean getHighSpeedVideoFpsRanges;
        android.graphics.Paint getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.weight = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Camera2StreamConfigurationMap);
            this.weight = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
                return new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState[i];
            }
        };
        int getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRangesFor;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel) {
            super(parcel, null);
            this.getHighSpeedVideoFpsRangesFor = parcel.readInt() != 0;
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighSpeedVideoFpsRangesFor ? 1 : 0);
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final android.graphics.Rect Camera2StreamConfigurationMap = new android.graphics.Rect();

        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, obtain);
            android.graphics.Rect rect = this.Camera2StreamConfigurationMap;
            obtain.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(obtain.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(obtain.getPackageName());
            accessibilityNodeInfoCompat.setClassName(obtain.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(obtain.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(obtain.isEnabled());
            accessibilityNodeInfoCompat.setClickable(obtain.isClickable());
            accessibilityNodeInfoCompat.setFocusable(obtain.isFocusable());
            accessibilityNodeInfoCompat.setFocused(obtain.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(obtain.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(obtain.isLongClickable());
            accessibilityNodeInfoCompat.addAction(obtain.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(obtain.getMovementGranularities());
            obtain.recycle();
            accessibilityNodeInfoCompat.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            accessibilityNodeInfoCompat.setSource(view);
            java.lang.Object parentForAccessibility = androidx.core.view.ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof android.view.View) {
                accessibilityNodeInfoCompat.setParent((android.view.View) parentForAccessibility);
            }
            int childCount = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getChildAt(i);
                if (!androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getHighSpeedVideoFpsRangesFor(childAt) && childAt.getVisibility() == 0) {
                    androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            if (androidx.slidingpanelayout.widget.SlidingPaneLayout.this.getHighSpeedVideoFpsRangesFor(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    static class TouchBlocker extends android.widget.FrameLayout {
        @Override // android.view.View
        public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            return true;
        }

        TouchBlocker(android.view.View view) {
            super(view.getContext());
            addView(view);
        }
    }

    class DisableLayerRunnable implements java.lang.Runnable {
        final /* synthetic */ androidx.slidingpanelayout.widget.SlidingPaneLayout Camera2StreamConfigurationMap;
        final android.view.View getHighSpeedVideoFpsRanges;

        @Override // java.lang.Runnable
        public void run() {
            if (this.getHighSpeedVideoFpsRanges.getParent() == this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRanges.setLayerType(0, null);
                androidx.slidingpanelayout.widget.SlidingPaneLayout.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
            }
            this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor.remove(this);
        }
    }

    final void getHighSpeedVideoFpsRanges(float f) {
        boolean z = androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt != this.getInputFormats) {
                float f2 = this.CoroutineDebuggingKt;
                float f3 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.CoroutineDebuggingKt = f;
                int i2 = ((int) ((1.0f - f2) * f3)) - ((int) ((1.0f - f) * f3));
                if (z) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        androidx.core.view.WindowInsetsCompat rootWindowInsets;
        androidx.core.view.WindowInsetsCompat rootWindowInsets2;
        androidx.core.graphics.Insets insets = null;
        if ((androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) ^ isOpen()) {
            this.getHighSpeedVideoFpsRanges.setEdgeTrackingEnabled(1);
            if (getOutputSizeshNQ4ISI && (rootWindowInsets2 = androidx.core.view.ViewCompat.getRootWindowInsets(this)) != null) {
                insets = rootWindowInsets2.getSystemGestureInsets();
            }
            if (insets != null) {
                androidx.customview.widget.ViewDragHelper viewDragHelper = this.getHighSpeedVideoFpsRanges;
                viewDragHelper.setEdgeSize(java.lang.Math.max(viewDragHelper.getDefaultEdgeSize(), insets.left));
            }
        } else {
            this.getHighSpeedVideoFpsRanges.setEdgeTrackingEnabled(2);
            if (getOutputSizeshNQ4ISI && (rootWindowInsets = androidx.core.view.ViewCompat.getRootWindowInsets(this)) != null) {
                insets = rootWindowInsets.getSystemGestureInsets();
            }
            if (insets != null) {
                androidx.customview.widget.ViewDragHelper viewDragHelper2 = this.getHighSpeedVideoFpsRanges;
                viewDragHelper2.setEdgeSize(java.lang.Math.max(viewDragHelper2.getDefaultEdgeSize(), insets.right));
            }
        }
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.getOutputSizes && !layoutParams.getHighSpeedVideoSizes && this.getInputFormats != null) {
            canvas.getClipBounds(this.coroutineCreation);
            if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
                android.graphics.Rect rect = this.coroutineCreation;
                rect.left = java.lang.Math.max(rect.left, this.getInputFormats.getRight());
            } else {
                android.graphics.Rect rect2 = this.coroutineCreation;
                rect2.right = java.lang.Math.min(rect2.right, this.getInputFormats.getLeft());
            }
            canvas.clipRect(this.coroutineCreation);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2 = androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
        int i9 = i3 - i;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.getOutputStallDurationlomOqCM) {
            this.getOutputMinFrameDuration = (this.getOutputSizes && this.getInputSizeshNQ4ISI) ? 0.0f : 1.0f;
        }
        int i10 = paddingRight;
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.getHighSpeedVideoSizes) {
                    int i12 = i9 - paddingLeft;
                    int min = (java.lang.Math.min(paddingRight, i12) - i10) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.getOutputFormats = min;
                    int i13 = z2 ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.getHighSpeedVideoFpsRanges = ((i10 + i13) + min) + (measuredWidth / 2) > i12;
                    int i14 = (int) (min * this.getOutputMinFrameDuration);
                    i10 += i13 + i14;
                    this.getOutputMinFrameDuration = i14 / this.getOutputFormats;
                } else if (!this.getOutputSizes || (i5 = this.getHighResolutionOutputSizeshNQ4ISI) == 0) {
                    i10 = paddingRight;
                } else {
                    i6 = (int) ((1.0f - this.getOutputMinFrameDuration) * i5);
                    i10 = paddingRight;
                    if (z2) {
                        i7 = i10 - i6;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (i9 - i10) + i6;
                        i7 = i8 - measuredWidth;
                    }
                    childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                    androidx.window.layout.FoldingFeature foldingFeature = this.Camera2StreamConfigurationMap;
                    paddingRight += childAt.getWidth() + java.lang.Math.abs((foldingFeature == null && foldingFeature.getOrientation() == androidx.window.layout.FoldingFeature.Orientation.VERTICAL && this.Camera2StreamConfigurationMap.isSeparating()) ? this.Camera2StreamConfigurationMap.getBounds().width() : 0);
                }
                i6 = 0;
                if (z2) {
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                androidx.window.layout.FoldingFeature foldingFeature2 = this.Camera2StreamConfigurationMap;
                paddingRight += childAt.getWidth() + java.lang.Math.abs((foldingFeature2 == null && foldingFeature2.getOrientation() == androidx.window.layout.FoldingFeature.Orientation.VERTICAL && this.Camera2StreamConfigurationMap.isSeparating()) ? this.Camera2StreamConfigurationMap.getBounds().width() : 0);
            }
        }
        if (this.getOutputStallDurationlomOqCM) {
            if (this.getOutputSizes && this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration);
            }
            getHighSpeedVideoSizes(this.getInputFormats);
        }
        this.getOutputStallDurationlomOqCM = false;
    }

    public boolean openPane() {
        if (!this.getOutputSizes) {
            this.getInputSizeshNQ4ISI = true;
        }
        if (!this.getOutputStallDurationlomOqCM && !getHighSpeedVideoSizes(0.0f)) {
            return false;
        }
        this.getInputSizeshNQ4ISI = true;
        return true;
    }

    final void getHighSpeedVideoSizes(android.view.View view) {
        int i;
        int i2;
        int i3;
        int i4;
        android.view.View childAt;
        int i5;
        boolean z;
        int i6;
        android.view.View view2 = view;
        boolean z2 = androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
        int width = z2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount && (childAt = getChildAt(i7)) != view2) {
            if (childAt.getVisibility() != 8) {
                int max = java.lang.Math.max(z2 ? paddingLeft : width, childAt.getLeft());
                int max2 = java.lang.Math.max(paddingTop, childAt.getTop());
                i5 = width;
                z = z2;
                if (!z2) {
                    width = paddingLeft;
                }
                i6 = paddingLeft;
                childAt.setVisibility((max < i || max2 < i3 || java.lang.Math.min(width, childAt.getRight()) > i2 || java.lang.Math.min(height - paddingBottom, childAt.getBottom()) > i4) ? 0 : 4);
            } else {
                i5 = width;
                z = z2;
                i6 = paddingLeft;
            }
            i7++;
            view2 = view;
            width = i5;
            z2 = z;
            paddingLeft = i6;
        }
    }
}
