package androidx.customview.widget;

/* loaded from: classes7.dex */
public class ViewDragHelper {
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final android.view.animation.Interpolator getHighSpeedVideoSizes = new android.view.animation.Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private int ArtificialStackFrames;
    private final android.widget.OverScroller CoroutineDebuggingKt;
    private android.view.VelocityTracker coroutineBoundary;
    private int coroutineCreation;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.customview.widget.ViewDragHelper.Callback getHighSpeedVideoFpsRanges;
    private android.view.View getHighSpeedVideoFpsRangesFor;
    private int[] getHighSpeedVideoSizesFor;
    private int[] getInputFormats;
    private int[] getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private android.view.animation.Interpolator getOutputMinFrameDurationlomOqCM;
    private float[] getOutputSizes;
    private float[] getOutputSizeshNQ4ISI;
    private float[] getOutputStallDuration;
    private float[] getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private float isOutputSupportedFor;
    private final float isOutputSupportedForhNQ4ISI;
    private final android.view.ViewGroup toString;
    private boolean unwrapAs;
    private int Camera2StreamConfigurationMap = -1;
    private final java.lang.Runnable accessartificialFrame = new java.lang.Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            androidx.customview.widget.ViewDragHelper.this.getHighSpeedVideoSizes(0);
        }
    };

    public static abstract class Callback {
        public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(android.view.View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(android.view.View view) {
            return 0;
        }

        public int getViewVerticalDragRange(android.view.View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(android.view.View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
        }

        public void onViewReleased(android.view.View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(android.view.View view, int i);
    }

    public static androidx.customview.widget.ViewDragHelper create(android.view.ViewGroup viewGroup, androidx.customview.widget.ViewDragHelper.Callback callback) {
        return new androidx.customview.widget.ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    public static androidx.customview.widget.ViewDragHelper create(android.view.ViewGroup viewGroup, float f, androidx.customview.widget.ViewDragHelper.Callback callback) {
        androidx.customview.widget.ViewDragHelper create = create(viewGroup, callback);
        create.ArtificialStackFrames = (int) (create.ArtificialStackFrames * (1.0f / f));
        return create;
    }

    private ViewDragHelper(android.content.Context context, android.view.ViewGroup viewGroup, androidx.customview.widget.ViewDragHelper.Callback callback) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("Parent view may not be null");
        }
        if (callback != null) {
            this.toString = viewGroup;
            this.getHighSpeedVideoFpsRanges = callback;
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getOutputMinFrameDuration = i;
            this.ArtificialStackFrames = viewConfiguration.getScaledTouchSlop();
            this.isOutputSupportedForhNQ4ISI = viewConfiguration.getScaledMaximumFlingVelocity();
            this.isOutputSupportedFor = viewConfiguration.getScaledMinimumFlingVelocity();
            this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoSizes;
            this.CoroutineDebuggingKt = new android.widget.OverScroller(context, new android.view.animation.Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.3
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    return androidx.customview.widget.ViewDragHelper.this.getOutputMinFrameDurationlomOqCM.getInterpolation(f);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("Callback may not be null");
    }

    public void setMinVelocity(float f) {
        this.isOutputSupportedFor = f;
    }

    public float getMinVelocity() {
        return this.isOutputSupportedFor;
    }

    public int getViewDragState() {
        return this.getOutputFormats;
    }

    public void setEdgeTrackingEnabled(int i) {
        this.coroutineCreation = i;
    }

    public int getEdgeSize() {
        return this.getOutputMinFrameDuration;
    }

    public void setEdgeSize(int i) {
        this.getOutputMinFrameDuration = i;
    }

    public int getDefaultEdgeSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void captureChildView(android.view.View view, int i) {
        if (view.getParent() != this.toString) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sb.append(this.toString);
            sb.append(")");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = view;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges.onViewCaptured(view, i);
        getHighSpeedVideoSizes(1);
    }

    public android.view.View getCapturedView() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getActivePointerId() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getTouchSlop() {
        return this.ArtificialStackFrames;
    }

    public void cancel() {
        this.Camera2StreamConfigurationMap = -1;
        float[] fArr = this.getOutputSizeshNQ4ISI;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.getOutputStallDurationlomOqCM, 0.0f);
            java.util.Arrays.fill(this.getOutputStallDuration, 0.0f);
            java.util.Arrays.fill(this.getOutputSizes, 0.0f);
            java.util.Arrays.fill(this.getInputSizeshNQ4ISI, 0);
            java.util.Arrays.fill(this.getInputFormats, 0);
            java.util.Arrays.fill(this.getHighSpeedVideoSizesFor, 0);
            this.getValidOutputFormatsForInputhNQ4ISI = 0;
        }
        android.view.VelocityTracker velocityTracker = this.coroutineBoundary;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.coroutineBoundary = null;
        }
    }

    public void abort() {
        cancel();
        if (this.getOutputFormats == 2) {
            int currX = this.CoroutineDebuggingKt.getCurrX();
            int currY = this.CoroutineDebuggingKt.getCurrY();
            this.CoroutineDebuggingKt.abortAnimation();
            int currX2 = this.CoroutineDebuggingKt.getCurrX();
            int currY2 = this.CoroutineDebuggingKt.getCurrY();
            this.getHighSpeedVideoFpsRanges.onViewPositionChanged(this.getHighSpeedVideoFpsRangesFor, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoSizes;
        getHighSpeedVideoSizes(0);
    }

    public boolean smoothSlideViewTo(android.view.View view, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = view;
        this.Camera2StreamConfigurationMap = -1;
        boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i, i2, 0, 0);
        if (!Camera2StreamConfigurationMap && this.getOutputFormats == 0 && this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        return Camera2StreamConfigurationMap;
    }

    public boolean smoothSlideViewTo(android.view.View view, int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
        boolean z;
        this.getHighSpeedVideoFpsRangesFor = view;
        this.Camera2StreamConfigurationMap = -1;
        int left = view.getLeft();
        int top = this.getHighSpeedVideoFpsRangesFor.getTop();
        int i4 = i - left;
        int i5 = i2 - top;
        if (i4 == 0 && i5 == 0) {
            this.CoroutineDebuggingKt.abortAnimation();
            z = false;
            getHighSpeedVideoSizes(0);
        } else {
            if (interpolator != null) {
                this.getOutputMinFrameDurationlomOqCM = interpolator;
            } else {
                this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoSizes;
            }
            this.CoroutineDebuggingKt.startScroll(left, top, i4, i5, i3);
            getHighSpeedVideoSizes(2);
            z = true;
        }
        if (!z && this.getOutputFormats == 0 && this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        return z;
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        if (!this.unwrapAs) {
            throw new java.lang.IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return Camera2StreamConfigurationMap(i, i2, (int) this.coroutineBoundary.getXVelocity(this.Camera2StreamConfigurationMap), (int) this.coroutineBoundary.getYVelocity(this.Camera2StreamConfigurationMap));
    }

    private boolean Camera2StreamConfigurationMap(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.getHighSpeedVideoFpsRangesFor.getLeft();
        int top = this.getHighSpeedVideoFpsRangesFor.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        int i7 = 0;
        if (i5 == 0 && i6 == 0) {
            this.CoroutineDebuggingKt.abortAnimation();
            getHighSpeedVideoSizes(0);
            return false;
        }
        android.view.View view = this.getHighSpeedVideoFpsRangesFor;
        int i8 = (int) this.isOutputSupportedFor;
        int i9 = (int) this.isOutputSupportedForhNQ4ISI;
        int abs = java.lang.Math.abs(i3);
        if (abs < i8) {
            i9 = 0;
        } else {
            if (abs > i9) {
                if (i3 <= 0) {
                    i3 = -i9;
                }
            }
            i9 = i3;
        }
        int i10 = (int) this.isOutputSupportedFor;
        int i11 = (int) this.isOutputSupportedForhNQ4ISI;
        int abs2 = java.lang.Math.abs(i4);
        if (abs2 >= i10) {
            if (abs2 > i11) {
                if (i4 > 0) {
                    i7 = i11;
                } else {
                    i4 = -i11;
                }
            }
            i7 = i4;
        }
        int abs3 = java.lang.Math.abs(i5);
        int abs4 = java.lang.Math.abs(i6);
        int abs5 = java.lang.Math.abs(i9);
        int abs6 = java.lang.Math.abs(i7);
        int i12 = abs5 + abs6;
        int i13 = abs3 + abs4;
        if (i9 != 0) {
            f = abs5;
            f2 = i12;
        } else {
            f = abs3;
            f2 = i13;
        }
        float f5 = f / f2;
        if (i7 != 0) {
            f3 = abs6;
            f4 = i12;
        } else {
            f3 = abs4;
            f4 = i13;
        }
        this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoSizes;
        this.CoroutineDebuggingKt.startScroll(left, top, i5, i6, (int) ((getHighResolutionOutputSizeshNQ4ISI(i5, i9, this.getHighSpeedVideoFpsRanges.getViewHorizontalDragRange(view)) * f5) + (getHighResolutionOutputSizeshNQ4ISI(i6, i7, this.getHighSpeedVideoFpsRanges.getViewVerticalDragRange(view)) * (f3 / f4))));
        getHighSpeedVideoSizes(2);
        return true;
    }

    private int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        float width = this.toString.getWidth() / 2;
        float sin = (float) java.lang.Math.sin((java.lang.Math.min(1.0f, java.lang.Math.abs(i) / r0) - 0.5f) * 0.47123894f);
        int abs2 = java.lang.Math.abs(i2);
        if (abs2 > 0) {
            abs = java.lang.Math.round(java.lang.Math.abs((width + (sin * width)) / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((java.lang.Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return java.lang.Math.min(abs, 600);
    }

    private static float Camera2StreamConfigurationMap(float f, float f2, float f3) {
        float abs = java.lang.Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public void flingCapturedView(int i, int i2, int i3, int i4) {
        if (!this.unwrapAs) {
            throw new java.lang.IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoSizes;
        this.CoroutineDebuggingKt.fling(this.getHighSpeedVideoFpsRangesFor.getLeft(), this.getHighSpeedVideoFpsRangesFor.getTop(), (int) this.coroutineBoundary.getXVelocity(this.Camera2StreamConfigurationMap), (int) this.coroutineBoundary.getYVelocity(this.Camera2StreamConfigurationMap), i, i3, i2, i4);
        getHighSpeedVideoSizes(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean continueSettling(boolean z) {
        if (this.getOutputFormats == 2) {
            boolean computeScrollOffset = this.CoroutineDebuggingKt.computeScrollOffset();
            int currX = this.CoroutineDebuggingKt.getCurrX();
            int currY = this.CoroutineDebuggingKt.getCurrY();
            int left = currX - this.getHighSpeedVideoFpsRangesFor.getLeft();
            int top = currY - this.getHighSpeedVideoFpsRangesFor.getTop();
            if (left != 0) {
                androidx.core.view.ViewCompat.offsetLeftAndRight(this.getHighSpeedVideoFpsRangesFor, left);
            }
            if (top != 0) {
                androidx.core.view.ViewCompat.offsetTopAndBottom(this.getHighSpeedVideoFpsRangesFor, top);
            }
            if (left != 0 || top != 0) {
                this.getHighSpeedVideoFpsRanges.onViewPositionChanged(this.getHighSpeedVideoFpsRangesFor, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.CoroutineDebuggingKt.getFinalX() && currY == this.CoroutineDebuggingKt.getFinalY()) {
                this.CoroutineDebuggingKt.abortAnimation();
            }
            if (z) {
                this.toString.post(this.accessartificialFrame);
            } else {
                getHighSpeedVideoSizes(0);
            }
        }
        return this.getOutputFormats == 2;
    }

    private void Camera2StreamConfigurationMap(float f, float f2) {
        this.unwrapAs = true;
        this.getHighSpeedVideoFpsRanges.onViewReleased(this.getHighSpeedVideoFpsRangesFor, f, f2);
        this.unwrapAs = false;
        if (this.getOutputFormats == 1) {
            getHighSpeedVideoSizes(0);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(int i) {
        if (this.getOutputSizeshNQ4ISI == null || !isPointerDown(i)) {
            return;
        }
        this.getOutputSizeshNQ4ISI[i] = 0.0f;
        this.getOutputStallDurationlomOqCM[i] = 0.0f;
        this.getOutputStallDuration[i] = 0.0f;
        this.getOutputSizes[i] = 0.0f;
        this.getInputSizeshNQ4ISI[i] = 0;
        this.getInputFormats[i] = 0;
        this.getHighSpeedVideoSizesFor[i] = 0;
        this.getValidOutputFormatsForInputhNQ4ISI = (~(1 << i)) & this.getValidOutputFormatsForInputhNQ4ISI;
    }

    private void getHighSpeedVideoSizes(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (isPointerDown(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.getOutputStallDuration[pointerId] = x;
                this.getOutputSizes[pointerId] = y;
            }
        }
    }

    public boolean isPointerDown(int i) {
        return ((1 << i) & this.getValidOutputFormatsForInputhNQ4ISI) != 0;
    }

    final void getHighSpeedVideoSizes(int i) {
        this.toString.removeCallbacks(this.accessartificialFrame);
        if (this.getOutputFormats != i) {
            this.getOutputFormats = i;
            this.getHighSpeedVideoFpsRanges.onViewDragStateChanged(i);
            if (this.getOutputFormats == 0) {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }
    }

    private boolean getHighSpeedVideoSizes(android.view.View view, int i) {
        if (view == this.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap == i) {
            return true;
        }
        if (view == null || !this.getHighSpeedVideoFpsRanges.tryCaptureView(view, i)) {
            return false;
        }
        this.Camera2StreamConfigurationMap = i;
        captureChildView(view, i);
        return true;
    }

    protected boolean canScroll(android.view.View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z) {
            return view.canScrollHorizontally(-i) || view.canScrollVertically(-i2);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d1, code lost:
    
        if (r12 != r11) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View findTopChildUnder;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.coroutineBoundary == null) {
            this.coroutineBoundary = android.view.VelocityTracker.obtain();
        }
        this.coroutineBoundary.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            getHighSpeedVideoFpsRangesFor(x, y, pointerId);
            android.view.View findTopChildUnder2 = findTopChildUnder((int) x, (int) y);
            if (findTopChildUnder2 == this.getHighSpeedVideoFpsRangesFor && this.getOutputFormats == 2) {
                getHighSpeedVideoSizes(findTopChildUnder2, pointerId);
            }
            int i = this.getInputSizeshNQ4ISI[pointerId] & this.coroutineCreation;
            if (i != 0) {
                this.getHighSpeedVideoFpsRanges.onEdgeTouched(i, pointerId);
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId2 = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            getHighSpeedVideoFpsRangesFor(x2, y2, pointerId2);
                            int i2 = this.getOutputFormats;
                            if (i2 == 0) {
                                int i3 = this.getInputSizeshNQ4ISI[pointerId2] & this.coroutineCreation;
                                if (i3 != 0) {
                                    this.getHighSpeedVideoFpsRanges.onEdgeTouched(i3, pointerId2);
                                }
                            } else if (i2 == 2 && (findTopChildUnder = findTopChildUnder((int) x2, (int) y2)) == this.getHighSpeedVideoFpsRangesFor) {
                                getHighSpeedVideoSizes(findTopChildUnder, pointerId2);
                            }
                        } else if (actionMasked == 6) {
                            getHighSpeedVideoFpsRangesFor(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.getOutputSizeshNQ4ISI != null && this.getOutputStallDurationlomOqCM != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        int pointerId3 = motionEvent.getPointerId(i4);
                        if (isPointerDown(pointerId3)) {
                            float x3 = motionEvent.getX(i4);
                            float y3 = motionEvent.getY(i4);
                            float f = x3 - this.getOutputSizeshNQ4ISI[pointerId3];
                            float f2 = y3 - this.getOutputStallDurationlomOqCM[pointerId3];
                            android.view.View findTopChildUnder3 = findTopChildUnder((int) x3, (int) y3);
                            boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(findTopChildUnder3, f, f2);
                            if (highSpeedVideoFpsRangesFor) {
                                int left = findTopChildUnder3.getLeft();
                                int i5 = (int) f;
                                int clampViewPositionHorizontal = this.getHighSpeedVideoFpsRanges.clampViewPositionHorizontal(findTopChildUnder3, left + i5, i5);
                                int top = findTopChildUnder3.getTop();
                                int i6 = (int) f2;
                                int clampViewPositionVertical = this.getHighSpeedVideoFpsRanges.clampViewPositionVertical(findTopChildUnder3, top + i6, i6);
                                int viewHorizontalDragRange = this.getHighSpeedVideoFpsRanges.getViewHorizontalDragRange(findTopChildUnder3);
                                int viewVerticalDragRange = this.getHighSpeedVideoFpsRanges.getViewVerticalDragRange(findTopChildUnder3);
                                if (viewHorizontalDragRange != 0) {
                                    if (viewHorizontalDragRange > 0) {
                                    }
                                }
                                if (viewVerticalDragRange == 0) {
                                    break;
                                }
                                if (viewVerticalDragRange > 0 && clampViewPositionVertical == top) {
                                    break;
                                }
                            }
                            getHighSpeedVideoSizes(f, f2, pointerId3);
                            if (this.getOutputFormats == 1) {
                                break;
                            }
                            if (highSpeedVideoFpsRangesFor && getHighSpeedVideoSizes(findTopChildUnder3, pointerId3)) {
                                break;
                            }
                        }
                    }
                    getHighSpeedVideoSizes(motionEvent);
                }
            }
            cancel();
        }
        return this.getOutputFormats == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r14.Camera2StreamConfigurationMap == (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        getHighSpeedVideoFpsRangesFor();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processTouchEvent(android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.coroutineBoundary == null) {
            this.coroutineBoundary = android.view.VelocityTracker.obtain();
        }
        this.coroutineBoundary.addMovement(motionEvent);
        int i = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            android.view.View findTopChildUnder = findTopChildUnder((int) x, (int) y);
            getHighSpeedVideoFpsRangesFor(x, y, pointerId);
            getHighSpeedVideoSizes(findTopChildUnder, pointerId);
            int i2 = this.getInputSizeshNQ4ISI[pointerId] & this.coroutineCreation;
            if (i2 != 0) {
                this.getHighSpeedVideoFpsRanges.onEdgeTouched(i2, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.getOutputFormats == 1) {
                getHighSpeedVideoFpsRangesFor();
            }
            cancel();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.getOutputFormats == 1) {
                    Camera2StreamConfigurationMap(0.0f, 0.0f);
                }
                cancel();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                getHighSpeedVideoFpsRangesFor(x2, y2, pointerId2);
                if (this.getOutputFormats == 0) {
                    getHighSpeedVideoSizes(findTopChildUnder((int) x2, (int) y2), pointerId2);
                    int i3 = this.getInputSizeshNQ4ISI[pointerId2] & this.coroutineCreation;
                    if (i3 != 0) {
                        this.getHighSpeedVideoFpsRanges.onEdgeTouched(i3, pointerId2);
                        return;
                    }
                    return;
                }
                if (isCapturedViewUnder((int) x2, (int) y2)) {
                    getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.getOutputFormats == 1 && pointerId3 == this.Camera2StreamConfigurationMap) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i >= pointerCount) {
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i);
                        if (pointerId4 != this.Camera2StreamConfigurationMap) {
                            android.view.View findTopChildUnder2 = findTopChildUnder((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                            android.view.View view = this.getHighSpeedVideoFpsRangesFor;
                            if (findTopChildUnder2 == view && getHighSpeedVideoSizes(view, pointerId4)) {
                            }
                        }
                        i++;
                    }
                }
                getHighSpeedVideoFpsRangesFor(pointerId3);
                return;
            }
            return;
        }
        if (this.getOutputFormats != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i);
                if (isPointerDown(pointerId5)) {
                    float x3 = motionEvent.getX(i);
                    float y3 = motionEvent.getY(i);
                    float f = x3 - this.getOutputSizeshNQ4ISI[pointerId5];
                    float f2 = y3 - this.getOutputStallDurationlomOqCM[pointerId5];
                    getHighSpeedVideoSizes(f, f2, pointerId5);
                    if (this.getOutputFormats == 1) {
                        break;
                    }
                    android.view.View findTopChildUnder3 = findTopChildUnder((int) x3, (int) y3);
                    if (getHighSpeedVideoFpsRangesFor(findTopChildUnder3, f, f2) && getHighSpeedVideoSizes(findTopChildUnder3, pointerId5)) {
                        break;
                    }
                }
                i++;
            }
        } else {
            if (!isPointerDown(this.Camera2StreamConfigurationMap) || (findPointerIndex = motionEvent.findPointerIndex(this.Camera2StreamConfigurationMap)) == -1) {
                return;
            }
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.getOutputStallDuration;
            int i4 = this.Camera2StreamConfigurationMap;
            int i5 = (int) (x4 - fArr[i4]);
            int i6 = (int) (y4 - this.getOutputSizes[i4]);
            int left = this.getHighSpeedVideoFpsRangesFor.getLeft() + i5;
            int top = this.getHighSpeedVideoFpsRangesFor.getTop() + i6;
            int left2 = this.getHighSpeedVideoFpsRangesFor.getLeft();
            int top2 = this.getHighSpeedVideoFpsRangesFor.getTop();
            if (i5 != 0) {
                left = this.getHighSpeedVideoFpsRanges.clampViewPositionHorizontal(this.getHighSpeedVideoFpsRangesFor, left, i5);
                androidx.core.view.ViewCompat.offsetLeftAndRight(this.getHighSpeedVideoFpsRangesFor, left - left2);
            }
            int i7 = left;
            if (i6 != 0) {
                top = this.getHighSpeedVideoFpsRanges.clampViewPositionVertical(this.getHighSpeedVideoFpsRangesFor, top, i6);
                androidx.core.view.ViewCompat.offsetTopAndBottom(this.getHighSpeedVideoFpsRangesFor, top - top2);
            }
            int i8 = top;
            if (i5 != 0 || i6 != 0) {
                this.getHighSpeedVideoFpsRanges.onViewPositionChanged(this.getHighSpeedVideoFpsRangesFor, i7, i8, i7 - left2, i8 - top2);
            }
        }
        getHighSpeedVideoSizes(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    private void getHighSpeedVideoSizes(float f, float f2, int i) {
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(f, f2, i, 1);
        boolean z = highSpeedVideoFpsRangesFor;
        if (getHighSpeedVideoFpsRangesFor(f2, f, i, 4)) {
            z = (highSpeedVideoFpsRangesFor ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (getHighSpeedVideoFpsRangesFor(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (getHighSpeedVideoFpsRangesFor(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.getInputFormats;
            iArr[i] = iArr[i] | r0;
            this.getHighSpeedVideoFpsRanges.onEdgeDragStarted(r0, i);
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(float f, float f2, int i, int i2) {
        float abs = java.lang.Math.abs(f);
        float abs2 = java.lang.Math.abs(f2);
        if ((this.getInputSizeshNQ4ISI[i] & i2) == i2 && (this.coroutineCreation & i2) != 0 && (this.getHighSpeedVideoSizesFor[i] & i2) != i2 && (this.getInputFormats[i] & i2) != i2) {
            float f3 = this.ArtificialStackFrames;
            if (abs > f3 || abs2 > f3) {
                if (abs < abs2 * 0.5f && this.getHighSpeedVideoFpsRanges.onEdgeLock(i2)) {
                    int[] iArr = this.getHighSpeedVideoSizesFor;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.getInputFormats[i] & i2) == 0 && abs > this.ArtificialStackFrames) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean getHighSpeedVideoFpsRangesFor(android.view.View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.getHighSpeedVideoFpsRanges.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.getHighSpeedVideoFpsRanges.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? java.lang.Math.abs(f) > ((float) this.ArtificialStackFrames) : z2 && java.lang.Math.abs(f2) > ((float) this.ArtificialStackFrames);
        }
        int i = this.ArtificialStackFrames;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    public boolean checkTouchSlop(int i) {
        float[] fArr = this.getOutputSizeshNQ4ISI;
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (checkTouchSlop(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i, int i2) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        if (!isPointerDown(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float[] fArr4 = this.getOutputSizeshNQ4ISI;
        if (fArr4 != null && (fArr = this.getOutputStallDurationlomOqCM) != null && (fArr2 = this.getOutputStallDuration) != null && (fArr3 = this.getOutputSizes) != null) {
            float f = fArr2[i2] - fArr4[i2];
            float f2 = fArr3[i2] - fArr[i2];
            if (z && z2) {
                int i3 = this.ArtificialStackFrames;
                return (f * f) + (f2 * f2) > ((float) (i3 * i3));
            }
            if (z) {
                return java.lang.Math.abs(f) > ((float) this.ArtificialStackFrames);
            }
            if (z2 && java.lang.Math.abs(f2) > this.ArtificialStackFrames) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int i) {
        int[] iArr = this.getInputSizeshNQ4ISI;
        if (iArr == null) {
            return false;
        }
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (isEdgeTouched(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int i, int i2) {
        int[] iArr;
        return (!isPointerDown(i2) || (iArr = this.getInputSizeshNQ4ISI) == null || (i & iArr[i2]) == 0) ? false : true;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        this.coroutineBoundary.computeCurrentVelocity(1000, this.isOutputSupportedForhNQ4ISI);
        Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(this.coroutineBoundary.getXVelocity(this.Camera2StreamConfigurationMap), this.isOutputSupportedFor, this.isOutputSupportedForhNQ4ISI), Camera2StreamConfigurationMap(this.coroutineBoundary.getYVelocity(this.Camera2StreamConfigurationMap), this.isOutputSupportedFor, this.isOutputSupportedForhNQ4ISI));
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        return isViewUnder(this.getHighSpeedVideoFpsRangesFor, i, i2);
    }

    public boolean isViewUnder(android.view.View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public android.view.View findTopChildUnder(int i, int i2) {
        for (int childCount = this.toString.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = this.toString.getChildAt(this.getHighSpeedVideoFpsRanges.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private void getHighSpeedVideoFpsRangesFor(float f, float f2, int i) {
        float[] fArr = this.getOutputSizeshNQ4ISI;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.getOutputStallDurationlomOqCM;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.getOutputStallDuration;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.getOutputSizes;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.getInputSizeshNQ4ISI;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.getInputFormats;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.getHighSpeedVideoSizesFor;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.getOutputSizeshNQ4ISI = fArr2;
            this.getOutputStallDurationlomOqCM = fArr3;
            this.getOutputStallDuration = fArr4;
            this.getOutputSizes = fArr5;
            this.getInputSizeshNQ4ISI = iArr;
            this.getInputFormats = iArr2;
            this.getHighSpeedVideoSizesFor = iArr3;
        }
        float[] fArr9 = this.getOutputSizeshNQ4ISI;
        this.getOutputStallDuration[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.getOutputStallDurationlomOqCM;
        this.getOutputSizes[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.getInputSizeshNQ4ISI;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.toString.getLeft() + this.getOutputMinFrameDuration ? 1 : 0;
        if (i4 < this.toString.getTop() + this.getOutputMinFrameDuration) {
            i5 |= 4;
        }
        if (i3 > this.toString.getRight() - this.getOutputMinFrameDuration) {
            i5 |= 2;
        }
        if (i4 > this.toString.getBottom() - this.getOutputMinFrameDuration) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.getValidOutputFormatsForInputhNQ4ISI |= 1 << i;
    }
}
