package androidx.swiperefreshlayout.widget;

/* loaded from: classes7.dex */
public class SwipeRefreshLayout extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent3, androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingChild3, androidx.core.view.NestedScrollingChild2, androidx.core.view.NestedScrollingParent, androidx.core.view.NestedScrollingChild {
    public static final int DEFAULT = 1;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    public static final int LARGE = 0;
    private static final int[] getOutputMinFrameDurationlomOqCM = {android.R.attr.enabled};
    private boolean AMEXKernel;
    private android.view.View AMEXKernela;
    private float ArtificialStackFrames;
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener Camera2StreamConfigurationMap;
    private final android.view.animation.DecelerateInterpolator CoroutineDebuggingKt;
    private boolean _BOUNDARY;
    private final androidx.core.view.NestedScrollingChildHelper _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.core.view.NestedScrollingParentHelper f2760a;
    private float accessartificialFrame;
    private final int[] b;
    private final int[] c;
    private boolean coroutineBoundary;
    private boolean coroutineCreation;
    private android.view.animation.Animation.AnimationListener d;
    private float exchange;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    androidx.swiperefreshlayout.widget.CircleImageView getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    androidx.swiperefreshlayout.widget.CircularProgressDrawable getInputFormats;
    float getInputSizeshNQ4ISI;
    int getOutputFormats;
    boolean getOutputMinFrameDuration;
    boolean getOutputSizes;
    private android.view.animation.Animation getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private android.view.animation.Animation getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private android.view.animation.Animation init;
    private final android.view.animation.Animation isOutputSupportedFor;
    private final android.view.animation.Animation isOutputSupportedForhNQ4ISI;
    private final int[] kernelVersion;
    protected int mFrom;
    protected int mOriginalOffsetTop;
    private android.view.animation.Animation release;
    private int requestPINEntry;
    private android.view.animation.Animation resetTransaction;
    private float startTransaction;
    private int toString;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnChildScrollUpCallback unwrapAs;

    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, android.view.View view);
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    final void getHighSpeedVideoSizes() {
        this.getHighSpeedVideoFpsRangesFor.clearAnimation();
        this.getInputFormats.stop();
        this.getHighSpeedVideoFpsRangesFor.setVisibility(8);
        this.getHighSpeedVideoFpsRangesFor.getBackground().setAlpha(255);
        this.getInputFormats.setAlpha(255);
        if (!this.getOutputMinFrameDuration) {
            int i = this.mOriginalOffsetTop - this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor.bringToFront();
            androidx.core.view.ViewCompat.offsetTopAndBottom(this.getHighSpeedVideoFpsRangesFor, i);
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getTop();
        } else {
            this.getHighSpeedVideoFpsRangesFor.setScaleX(0.0f);
            this.getHighSpeedVideoFpsRangesFor.setScaleY(0.0f);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getTop();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        getHighSpeedVideoSizes();
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState>() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState[] newArray(int i) {
                return new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState[i];
            }
        };
        final boolean getHighSpeedVideoFpsRanges;

        SavedState(android.os.Parcelable parcelable, boolean z) {
            super(parcelable);
            this.getHighSpeedVideoFpsRanges = z;
        }

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.getHighSpeedVideoFpsRanges = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.getHighSpeedVideoFpsRanges ? (byte) 1 : (byte) 0);
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        return new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState(super.onSaveInstanceState(), this.getHighSpeedVideoSizesFor);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState savedState = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.getHighSpeedVideoFpsRanges);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHighSpeedVideoSizes();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.getOutputMinFrameDuration = z;
        this.mOriginalOffsetTop = i;
        this.getOutputFormats = i2;
        this.getOutputSizes = true;
        getHighSpeedVideoSizes();
        this.getHighSpeedVideoSizesFor = false;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    public int getProgressViewEndOffset() {
        return this.getOutputFormats;
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.getOutputFormats = i;
        this.getOutputMinFrameDuration = z;
        this.getHighSpeedVideoFpsRangesFor.invalidate();
    }

    public void setSlingshotDistance(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.getValidOutputFormatsForInputhNQ4ISI = (int) (displayMetrics.density * 56.0f);
            } else {
                this.getValidOutputFormatsForInputhNQ4ISI = (int) (displayMetrics.density * 40.0f);
            }
            this.getHighSpeedVideoFpsRangesFor.setImageDrawable(null);
            this.getInputFormats.setStyle(i);
            this.getHighSpeedVideoFpsRangesFor.setImageDrawable(this.getInputFormats);
        }
    }

    public SwipeRefreshLayout(android.content.Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoSizesFor = false;
        this.exchange = -1.0f;
        this.kernelVersion = new int[2];
        this.c = new int[2];
        this.b = new int[2];
        this.getOutputStallDuration = -1;
        this.toString = -1;
        this.d = new android.view.animation.Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                if (androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getHighSpeedVideoSizesFor) {
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getInputFormats.setAlpha(255);
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getInputFormats.start();
                    if (androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getHighSpeedVideoSizes && androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.Camera2StreamConfigurationMap != null) {
                        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.Camera2StreamConfigurationMap.onRefresh();
                    }
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this;
                    swipeRefreshLayout.getHighResolutionOutputSizeshNQ4ISI = swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.getTop();
                    return;
                }
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getHighSpeedVideoSizes();
            }
        };
        this.isOutputSupportedForhNQ4ISI = new android.view.animation.Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                int i;
                if (!androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getOutputSizes) {
                    i = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getOutputFormats - java.lang.Math.abs(androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.mOriginalOffsetTop);
                } else {
                    i = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getOutputFormats;
                }
                int top = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getHighSpeedVideoFpsRangesFor.getTop();
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this;
                swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.bringToFront();
                androidx.core.view.ViewCompat.offsetTopAndBottom(swipeRefreshLayout.getHighSpeedVideoFpsRangesFor, (androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.mFrom + ((int) ((i - androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.mFrom) * f))) - top);
                swipeRefreshLayout.getHighResolutionOutputSizeshNQ4ISI = swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.getTop();
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getInputFormats.setArrowScale(1.0f - f);
            }
        };
        this.isOutputSupportedFor = new android.view.animation.Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getHighSpeedVideoFpsRangesFor(f);
            }
        };
        this.requestPINEntry = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = getResources().getInteger(android.R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.CoroutineDebuggingKt = new android.view.animation.DecelerateInterpolator(2.0f);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.getValidOutputFormatsForInputhNQ4ISI = (int) (displayMetrics.density * 40.0f);
        this.getHighSpeedVideoFpsRangesFor = new androidx.swiperefreshlayout.widget.CircleImageView(getContext());
        androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable = new androidx.swiperefreshlayout.widget.CircularProgressDrawable(getContext());
        this.getInputFormats = circularProgressDrawable;
        circularProgressDrawable.setStyle(1);
        this.getHighSpeedVideoFpsRangesFor.setImageDrawable(this.getInputFormats);
        this.getHighSpeedVideoFpsRangesFor.setVisibility(8);
        addView(this.getHighSpeedVideoFpsRangesFor);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.getOutputFormats = i;
        this.exchange = i;
        this.f2760a = new androidx.core.view.NestedScrollingParentHelper(this);
        this._CREATION = new androidx.core.view.NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.getValidOutputFormatsForInputhNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.mOriginalOffsetTop = i2;
        getHighSpeedVideoFpsRangesFor(1.0f);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getOutputMinFrameDurationlomOqCM);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int i3 = this.toString;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public void setOnRefreshListener(androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener onRefreshListener) {
        this.Camera2StreamConfigurationMap = onRefreshListener;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.getHighSpeedVideoSizesFor != z) {
            this.getHighSpeedVideoSizesFor = z;
            if (!this.getOutputSizes) {
                i = this.getOutputFormats + this.mOriginalOffsetTop;
            } else {
                i = this.getOutputFormats;
            }
            int i2 = i - this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor.bringToFront();
            androidx.core.view.ViewCompat.offsetTopAndBottom(this.getHighSpeedVideoFpsRangesFor, i2);
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getTop();
            this.getHighSpeedVideoSizes = false;
            android.view.animation.Animation.AnimationListener animationListener = this.d;
            this.getHighSpeedVideoFpsRangesFor.setVisibility(0);
            this.getInputFormats.setAlpha(255);
            android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.2
                @Override // android.view.animation.Animation
                public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this;
                    swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.setScaleX(f);
                    swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.setScaleY(f);
                }
            };
            this.init = animation;
            animation.setDuration(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            if (animationListener != null) {
                this.getHighSpeedVideoFpsRangesFor.setAnimationListener(animationListener);
            }
            this.getHighSpeedVideoFpsRangesFor.clearAnimation();
            this.getHighSpeedVideoFpsRangesFor.startAnimation(this.init);
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(z, false);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2) {
        if (this.getHighSpeedVideoSizesFor != z) {
            this.getHighSpeedVideoSizes = z2;
            getHighSpeedVideoFpsRanges();
            this.getHighSpeedVideoSizesFor = z;
            if (z) {
                Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this.d);
            } else {
                getHighSpeedVideoSizes(this.d);
            }
        }
    }

    final void getHighSpeedVideoSizes(android.view.animation.Animation.AnimationListener animationListener) {
        android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this;
                float f2 = 1.0f - f;
                swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.setScaleX(f2);
                swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.setScaleY(f2);
            }
        };
        this.release = animation;
        animation.setDuration(150L);
        this.getHighSpeedVideoFpsRangesFor.setAnimationListener(animationListener);
        this.getHighSpeedVideoFpsRangesFor.clearAnimation();
        this.getHighSpeedVideoFpsRangesFor.startAnimation(this.release);
    }

    private android.view.animation.Animation getHighSpeedVideoFpsRanges(final int i, final int i2) {
        android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, android.view.animation.Transformation transformation) {
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getInputFormats.setAlpha((int) (i + ((i2 - r0) * f)));
            }
        };
        animation.setDuration(300L);
        this.getHighSpeedVideoFpsRangesFor.setAnimationListener(null);
        this.getHighSpeedVideoFpsRangesFor.clearAnimation();
        this.getHighSpeedVideoFpsRangesFor.startAnimation(animation);
        return animation;
    }

    @java.lang.Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.ContextCompat.getColor(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.getHighSpeedVideoFpsRangesFor.setBackgroundColor(i);
    }

    @java.lang.Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        android.content.Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = androidx.core.content.ContextCompat.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        getHighSpeedVideoFpsRanges();
        this.getInputFormats.setColorSchemeColors(iArr);
    }

    public boolean isRefreshing() {
        return this.getHighSpeedVideoSizesFor;
    }

    private void getHighSpeedVideoFpsRanges() {
        if (this.AMEXKernela == null) {
            for (int i = 0; i < getChildCount(); i++) {
                android.view.View childAt = getChildAt(i);
                if (!childAt.equals(this.getHighSpeedVideoFpsRangesFor)) {
                    this.AMEXKernela = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.exchange = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.AMEXKernela == null) {
                getHighSpeedVideoFpsRanges();
            }
            android.view.View view = this.AMEXKernela;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingLeft2 = getPaddingLeft();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - paddingLeft2) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.getHighSpeedVideoFpsRangesFor.getMeasuredWidth();
            int measuredHeight2 = this.getHighSpeedVideoFpsRangesFor.getMeasuredHeight();
            androidx.swiperefreshlayout.widget.CircleImageView circleImageView = this.getHighSpeedVideoFpsRangesFor;
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.getHighResolutionOutputSizeshNQ4ISI;
            circleImageView.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.AMEXKernela == null) {
            getHighSpeedVideoFpsRanges();
        }
        android.view.View view = this.AMEXKernela;
        if (view != null) {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.getHighSpeedVideoFpsRangesFor.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.getValidOutputFormatsForInputhNQ4ISI, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.getValidOutputFormatsForInputhNQ4ISI, 1073741824));
            this.toString = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.getHighSpeedVideoFpsRangesFor) {
                    this.toString = i3;
                    return;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public boolean canChildScrollUp() {
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnChildScrollUpCallback onChildScrollUpCallback = this.unwrapAs;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.canChildScrollUp(this, this.AMEXKernela);
        }
        android.view.View view = this.AMEXKernela;
        if (view instanceof android.widget.ListView) {
            return androidx.core.widget.ListViewCompat.canScrollList((android.widget.ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnChildScrollUpCallback onChildScrollUpCallback) {
        this.unwrapAs = onChildScrollUpCallback;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        getHighSpeedVideoFpsRanges();
        int actionMasked = motionEvent.getActionMasked();
        if (this.AMEXKernel && actionMasked == 0) {
            this.AMEXKernel = false;
        }
        if (!isEnabled() || this.AMEXKernel || canChildScrollUp() || this.getHighSpeedVideoSizesFor || this._BOUNDARY) {
            return false;
        }
        if (actionMasked == 0) {
            int top = this.mOriginalOffsetTop - this.getHighSpeedVideoFpsRangesFor.getTop();
            this.getHighSpeedVideoFpsRangesFor.bringToFront();
            androidx.core.view.ViewCompat.offsetTopAndBottom(this.getHighSpeedVideoFpsRangesFor, top);
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getTop();
            int pointerId = motionEvent.getPointerId(0);
            this.getOutputStallDuration = pointerId;
            this.coroutineBoundary = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.accessartificialFrame = motionEvent.getY(findPointerIndex2);
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.getOutputStallDuration;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    Camera2StreamConfigurationMap(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        getHighResolutionOutputSizeshNQ4ISI(motionEvent);
                    }
                }
            }
            this.coroutineBoundary = false;
            this.getOutputStallDuration = -1;
        }
        return this.coroutineBoundary;
    }

    @java.lang.Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.coroutineCreation = z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        android.view.ViewParent parent;
        android.view.View view = this.AMEXKernela;
        if (view != null && !androidx.core.view.ViewCompat.isNestedScrollingEnabled(view)) {
            if (this.coroutineCreation || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int i6 = iArr[1];
            dispatchNestedScroll(i, i2, i3, i4, this.c, i5, iArr);
            int i7 = i4 - (iArr[1] - i6);
            if ((i7 == 0 ? i4 + this.c[1] : i7) >= 0 || canChildScrollUp()) {
                return;
            }
            float abs = this.startTransaction + java.lang.Math.abs(r1);
            this.startTransaction = abs;
            getHighSpeedVideoSizes(abs);
            iArr[1] = iArr[1] + i7;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
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
        onNestedScroll(view, i, i2, i3, i4, i5, this.b);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        return (!isEnabled() || this.AMEXKernel || this.getHighSpeedVideoSizesFor || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        this.f2760a.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(i & 2);
        this.startTransaction = 0.0f;
        this._BOUNDARY = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.startTransaction;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.startTransaction = 0.0f;
                } else {
                    this.startTransaction = f - f2;
                    iArr[1] = i2;
                }
                getHighSpeedVideoSizes(this.startTransaction);
            }
        }
        if (this.getOutputSizes && i2 > 0 && this.startTransaction == 0.0f && java.lang.Math.abs(i2 - iArr[1]) > 0) {
            this.getHighSpeedVideoFpsRangesFor.setVisibility(8);
        }
        int[] iArr2 = this.kernelVersion;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f2760a.getNestedScrollAxes();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View view) {
        this.f2760a.onStopNestedScroll(view);
        this._BOUNDARY = false;
        float f = this.startTransaction;
        if (f > 0.0f) {
            getHighResolutionOutputSizeshNQ4ISI(f);
            this.startTransaction = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (i5 == 0) {
            this._CREATION.dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return i2 == 0 && startNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        if (i == 0) {
            stopNestedScroll();
        }
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return i == 0 && hasNestedScrollingParent();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return i5 == 0 && this._CREATION.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return i3 == 0 && dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this._CREATION.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this._CREATION.isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this._CREATION.startNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this._CREATION.stopNestedScroll();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this._CREATION.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this._CREATION.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this._CREATION.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this._CREATION.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this._CREATION.dispatchNestedPreFling(f, f2);
    }

    private void getHighSpeedVideoSizes(float f) {
        android.view.animation.Animation animation;
        android.view.animation.Animation animation2;
        this.getInputFormats.setArrowEnabled(true);
        float min = java.lang.Math.min(1.0f, java.lang.Math.abs(f / this.exchange));
        float max = (java.lang.Math.max((float) (min - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = java.lang.Math.abs(f);
        float f2 = this.exchange;
        int i = this.getHighSpeedVideoFpsRanges;
        if (i <= 0) {
            if (this.getOutputSizes) {
                i = this.getOutputFormats - this.mOriginalOffsetTop;
            } else {
                i = this.getOutputFormats;
            }
        }
        float f3 = i;
        double max2 = java.lang.Math.max(0.0f, java.lang.Math.min(abs - f2, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - java.lang.Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.mOriginalOffsetTop;
        int i3 = (int) ((min * f3) + (f3 * pow * 2.0f));
        if (this.getHighSpeedVideoFpsRangesFor.getVisibility() != 0) {
            this.getHighSpeedVideoFpsRangesFor.setVisibility(0);
        }
        if (!this.getOutputMinFrameDuration) {
            this.getHighSpeedVideoFpsRangesFor.setScaleX(1.0f);
            this.getHighSpeedVideoFpsRangesFor.setScaleY(1.0f);
        }
        if (this.getOutputMinFrameDuration) {
            float min2 = java.lang.Math.min(1.0f, f / this.exchange);
            this.getHighSpeedVideoFpsRangesFor.setScaleX(min2);
            this.getHighSpeedVideoFpsRangesFor.setScaleY(min2);
        }
        if (f < this.exchange) {
            if (this.getInputFormats.getAlpha() > 76 && ((animation2 = this.getOutputSizeshNQ4ISI) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                this.getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(this.getInputFormats.getAlpha(), 76);
            }
        } else if (this.getInputFormats.getAlpha() < 255 && ((animation = this.getOutputStallDurationlomOqCM) == null || !animation.hasStarted() || animation.hasEnded())) {
            this.getOutputStallDurationlomOqCM = getHighSpeedVideoFpsRanges(this.getInputFormats.getAlpha(), 255);
        }
        this.getInputFormats.setStartEndTrim(0.0f, java.lang.Math.min(0.8f, max * 0.8f));
        this.getInputFormats.setArrowScale(java.lang.Math.min(1.0f, max));
        this.getInputFormats.setProgressRotation((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        int i4 = (i2 + i3) - this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor.bringToFront();
        androidx.core.view.ViewCompat.offsetTopAndBottom(this.getHighSpeedVideoFpsRangesFor, i4);
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getTop();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(float f) {
        if (f > this.exchange) {
            getHighResolutionOutputSizeshNQ4ISI(true, true);
            return;
        }
        this.getHighSpeedVideoSizesFor = false;
        this.getInputFormats.setStartEndTrim(0.0f, 0.0f);
        android.view.animation.Animation.AnimationListener animationListener = !this.getOutputMinFrameDuration ? new android.view.animation.Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                if (androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getOutputMinFrameDuration) {
                    return;
                }
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getHighSpeedVideoSizes((android.view.animation.Animation.AnimationListener) null);
            }
        } : null;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!this.getOutputMinFrameDuration) {
            this.mFrom = i;
            this.isOutputSupportedFor.reset();
            this.isOutputSupportedFor.setDuration(200L);
            this.isOutputSupportedFor.setInterpolator(this.CoroutineDebuggingKt);
            if (animationListener != null) {
                this.getHighSpeedVideoFpsRangesFor.setAnimationListener(animationListener);
            }
            this.getHighSpeedVideoFpsRangesFor.clearAnimation();
            this.getHighSpeedVideoFpsRangesFor.startAnimation(this.isOutputSupportedFor);
        } else {
            this.mFrom = i;
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getScaleX();
            android.view.animation.Animation animation = new android.view.animation.Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.8
                @Override // android.view.animation.Animation
                public void applyTransformation(float f2, android.view.animation.Transformation transformation) {
                    float f3 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getInputSizeshNQ4ISI;
                    float f4 = -androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getInputSizeshNQ4ISI;
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this;
                    float f5 = f3 + (f4 * f2);
                    swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.setScaleX(f5);
                    swipeRefreshLayout.getHighSpeedVideoFpsRangesFor.setScaleY(f5);
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout.this.getHighSpeedVideoFpsRangesFor(f2);
                }
            };
            this.resetTransaction = animation;
            animation.setDuration(150L);
            if (animationListener != null) {
                this.getHighSpeedVideoFpsRangesFor.setAnimationListener(animationListener);
            }
            this.getHighSpeedVideoFpsRangesFor.clearAnimation();
            this.getHighSpeedVideoFpsRangesFor.startAnimation(this.resetTransaction);
        }
        this.getInputFormats.setArrowEnabled(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.AMEXKernel && actionMasked == 0) {
            this.AMEXKernel = false;
        }
        if (!isEnabled() || this.AMEXKernel || canChildScrollUp() || this.getHighSpeedVideoSizesFor || this._BOUNDARY) {
            return false;
        }
        if (actionMasked == 0) {
            this.getOutputStallDuration = motionEvent.getPointerId(0);
            this.coroutineBoundary = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.getOutputStallDuration);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.coroutineBoundary) {
                    float y = motionEvent.getY(findPointerIndex);
                    float f = this.ArtificialStackFrames;
                    this.coroutineBoundary = false;
                    getHighResolutionOutputSizeshNQ4ISI((y - f) * 0.5f);
                }
                this.getOutputStallDuration = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.getOutputStallDuration);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                Camera2StreamConfigurationMap(y2);
                if (this.coroutineBoundary) {
                    float f2 = (y2 - this.ArtificialStackFrames) * 0.5f;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    getHighSpeedVideoSizes(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.getOutputStallDuration = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    getHighResolutionOutputSizeshNQ4ISI(motionEvent);
                }
            }
        }
        return true;
    }

    private void Camera2StreamConfigurationMap(float f) {
        float f2 = this.accessartificialFrame;
        float f3 = f - f2;
        float f4 = this.requestPINEntry;
        if (f3 <= f4 || this.coroutineBoundary) {
            return;
        }
        this.ArtificialStackFrames = f2 + f4;
        this.coroutineBoundary = true;
        this.getInputFormats.setAlpha(76);
    }

    private void Camera2StreamConfigurationMap(int i, android.view.animation.Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.isOutputSupportedForhNQ4ISI.reset();
        this.isOutputSupportedForhNQ4ISI.setDuration(200L);
        this.isOutputSupportedForhNQ4ISI.setInterpolator(this.CoroutineDebuggingKt);
        if (animationListener != null) {
            this.getHighSpeedVideoFpsRangesFor.setAnimationListener(animationListener);
        }
        this.getHighSpeedVideoFpsRangesFor.clearAnimation();
        this.getHighSpeedVideoFpsRangesFor.startAnimation(this.isOutputSupportedForhNQ4ISI);
    }

    final void getHighSpeedVideoFpsRangesFor(float f) {
        int top = (this.mFrom + ((int) ((this.mOriginalOffsetTop - r0) * f))) - this.getHighSpeedVideoFpsRangesFor.getTop();
        this.getHighSpeedVideoFpsRangesFor.bringToFront();
        androidx.core.view.ViewCompat.offsetTopAndBottom(this.getHighSpeedVideoFpsRangesFor, top);
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getTop();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.getOutputStallDuration) {
            this.getOutputStallDuration = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
