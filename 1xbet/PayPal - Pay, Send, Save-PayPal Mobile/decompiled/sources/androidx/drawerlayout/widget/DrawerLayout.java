package androidx.drawerlayout.widget;

/* loaded from: classes.dex */
public class DrawerLayout extends android.view.ViewGroup implements androidx.customview.widget.Openable {
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static boolean getHighSpeedVideoSizesFor;
    private android.graphics.drawable.Drawable AMEXKernel;
    private android.graphics.drawable.Drawable AMEXKernela;
    private int ArtificialStackFrames;
    boolean Camera2StreamConfigurationMap;
    private java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> CoroutineDebuggingKt;
    private final androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback _BOUNDARY;
    private int _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<android.view.View> f2735a;
    private int accessartificialFrame;
    private int b;
    private android.graphics.drawable.Drawable c;
    private int coroutineBoundary;
    private androidx.drawerlayout.widget.DrawerLayout.DrawerListener coroutineCreation;
    private float d;
    private android.graphics.drawable.Drawable exchange;
    private final androidx.customview.widget.ViewDragHelper getARTIFICIAL_FRAME_PACKAGE_NAME;
    private android.graphics.Matrix getInputFormats;
    private final androidx.drawerlayout.widget.DrawerLayout.ChildAccessibilityDelegate getInputSizeshNQ4ISI;
    private final androidx.core.view.accessibility.AccessibilityViewCommand getOutputFormats;
    private android.graphics.Rect getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;
    private java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    private int init;
    private float isOutputSupportedFor;
    private final androidx.customview.widget.ViewDragHelper isOutputSupportedForhNQ4ISI;
    private android.graphics.Paint kernelVersion;
    private android.graphics.drawable.Drawable release;
    private java.lang.CharSequence requestGoOnline;
    private java.lang.CharSequence requestPINEntry;
    private android.graphics.drawable.Drawable resetTransaction;
    private android.graphics.drawable.Drawable startTransaction;
    private final androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback toString;
    private float unwrapAs;
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {android.R.attr.colorPrimaryDark};
    static final int[] getHighSpeedVideoFpsRangesFor = {android.R.attr.layout_gravity};
    static final boolean getHighSpeedVideoSizes = true;
    private static final boolean getHighSpeedVideoFpsRanges = true;

    /* loaded from: classes7.dex */
    public interface DrawerListener {
        void onDrawerClosed(android.view.View view);

        void onDrawerOpened(android.view.View view);

        void onDrawerSlide(android.view.View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* loaded from: classes7.dex */
    public static abstract class SimpleDrawerListener implements androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(android.view.View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(android.view.View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(android.view.View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i) {
        }
    }

    static {
        getHighSpeedVideoSizesFor = android.os.Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(android.content.Context context) {
        this(context, null);
    }

    public DrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.drawerlayout.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getInputSizeshNQ4ISI = new androidx.drawerlayout.widget.DrawerLayout.ChildAccessibilityDelegate();
        this.init = -1728053248;
        this.kernelVersion = new android.graphics.Paint();
        this.getOutputSizeshNQ4ISI = true;
        this.ArtificialStackFrames = 3;
        this.coroutineBoundary = 3;
        this.b = 3;
        this.accessartificialFrame = 3;
        this.resetTransaction = null;
        this.c = null;
        this.AMEXKernel = null;
        this.exchange = null;
        this.getOutputFormats = new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: androidx.drawerlayout.widget.DrawerLayout.1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                if (!androidx.drawerlayout.widget.DrawerLayout.this.isDrawerOpen(view) || androidx.drawerlayout.widget.DrawerLayout.this.getDrawerLockMode(view) == 2) {
                    return false;
                }
                androidx.drawerlayout.widget.DrawerLayout.this.closeDrawer(view);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this._CREATION = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback = new androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback(3);
        this.toString = viewDragCallback;
        androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback2 = new androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback(5);
        this._BOUNDARY = viewDragCallback2;
        androidx.customview.widget.ViewDragHelper create = androidx.customview.widget.ViewDragHelper.create(this, 1.0f, viewDragCallback);
        this.isOutputSupportedForhNQ4ISI = create;
        create.setEdgeTrackingEnabled(1);
        create.setMinVelocity(f2);
        viewDragCallback.Camera2StreamConfigurationMap = create;
        androidx.customview.widget.ViewDragHelper create2 = androidx.customview.widget.ViewDragHelper.create(this, 1.0f, viewDragCallback2);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = create2;
        create2.setEdgeTrackingEnabled(2);
        create2.setMinVelocity(f2);
        viewDragCallback2.Camera2StreamConfigurationMap = create2;
        setFocusableInTouchMode(true);
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.drawerlayout.widget.DrawerLayout.AccessibilityDelegate());
        setMotionEventSplittingEnabled(false);
        if (androidx.core.view.ViewCompat.getFitsSystemWindows(this)) {
            setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: androidx.drawerlayout.widget.DrawerLayout.2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                    ((androidx.drawerlayout.widget.DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            setSystemUiVisibility(1280);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(getHighResolutionOutputSizeshNQ4ISI);
            try {
                this.release = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.R.styleable.DrawerLayout, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(androidx.drawerlayout.R.styleable.DrawerLayout_elevation)) {
                this.getOutputStallDuration = obtainStyledAttributes2.getDimension(androidx.drawerlayout.R.styleable.DrawerLayout_elevation, 0.0f);
            } else {
                this.getOutputStallDuration = getResources().getDimension(androidx.drawerlayout.R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f2735a = new java.util.ArrayList<>();
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerElevation(float f) {
        this.getOutputStallDuration = f;
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (Camera2StreamConfigurationMap(childAt)) {
                androidx.core.view.ViewCompat.setElevation(childAt, this.getOutputStallDuration);
            }
        }
    }

    public float getDrawerElevation() {
        if (getHighSpeedVideoFpsRanges) {
            return this.getOutputStallDuration;
        }
        return 0.0f;
    }

    public void setChildInsets(java.lang.Object obj, boolean z) {
        this.getValidOutputFormatsForInputhNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerShadow(android.graphics.drawable.Drawable drawable, int i) {
        if (getHighSpeedVideoFpsRanges) {
            return;
        }
        if ((i & androidx.core.view.GravityCompat.START) == 8388611) {
            this.resetTransaction = drawable;
        } else if ((i & androidx.core.view.GravityCompat.END) == 8388613) {
            this.c = drawable;
        } else if ((i & 3) == 3) {
            this.AMEXKernel = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.exchange = drawable;
        }
        getHighSpeedVideoFpsRanges();
        invalidate();
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(androidx.core.content.ContextCompat.getDrawable(getContext(), i), i2);
    }

    public void setScrimColor(int i) {
        this.init = i;
        invalidate();
    }

    @java.lang.Deprecated
    public void setDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener) {
        androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener2 = this.coroutineCreation;
        if (drawerListener2 != null) {
            removeDrawerListener(drawerListener2);
        }
        if (drawerListener != null) {
            addDrawerListener(drawerListener);
        }
        this.coroutineCreation = drawerListener;
    }

    public void addDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.CoroutineDebuggingKt == null) {
            this.CoroutineDebuggingKt = new java.util.ArrayList();
        }
        this.CoroutineDebuggingKt.add(drawerListener);
    }

    public void removeDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener) {
        java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list;
        if (drawerListener == null || (list = this.CoroutineDebuggingKt) == null) {
            return;
        }
        list.remove(drawerListener);
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        android.view.View highResolutionOutputSizeshNQ4ISI;
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i2, androidx.core.view.ViewCompat.getLayoutDirection(this));
        if (i2 == 3) {
            this.ArtificialStackFrames = i;
        } else if (i2 == 5) {
            this.coroutineBoundary = i;
        } else if (i2 == 8388611) {
            this.b = i;
        } else if (i2 == 8388613) {
            this.accessartificialFrame = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.isOutputSupportedForhNQ4ISI : this.getARTIFICIAL_FRAME_PACKAGE_NAME).cancel();
        }
        if (i != 1) {
            if (i != 2 || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(absoluteGravity)) == null) {
                return;
            }
            openDrawer(highResolutionOutputSizeshNQ4ISI);
            return;
        }
        android.view.View highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(absoluteGravity);
        if (highResolutionOutputSizeshNQ4ISI2 != null) {
            closeDrawer(highResolutionOutputSizeshNQ4ISI2);
        }
    }

    public void setDrawerLockMode(int i, android.view.View view) {
        if (!Camera2StreamConfigurationMap(view)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer with appropriate layout_gravity");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        setDrawerLockMode(i, ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity);
    }

    public int getDrawerLockMode(int i) {
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        if (i == 3) {
            int i2 = this.ArtificialStackFrames;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.b : this.accessartificialFrame;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.coroutineBoundary;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.accessartificialFrame : this.b;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.b;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.ArtificialStackFrames : this.coroutineBoundary;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.accessartificialFrame;
        if (i8 != 3) {
            return i8;
        }
        int i9 = layoutDirection == 0 ? this.coroutineBoundary : this.ArtificialStackFrames;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    public int getDrawerLockMode(android.view.View view) {
        if (!Camera2StreamConfigurationMap(view)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return getDrawerLockMode(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity);
    }

    public void setDrawerTitle(int i, java.lang.CharSequence charSequence) {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            this.requestPINEntry = charSequence;
        } else if (absoluteGravity == 5) {
            this.requestGoOnline = charSequence;
        }
    }

    public java.lang.CharSequence getDrawerTitle(int i) {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            return this.requestPINEntry;
        }
        if (absoluteGravity == 5) {
            return this.requestGoOnline;
        }
        return null;
    }

    final void getHighSpeedVideoSizes(int i, android.view.View view) {
        int i2;
        int viewDragState = this.isOutputSupportedForhNQ4ISI.getViewDragState();
        int viewDragState2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getViewDragState();
        if (viewDragState == 1 || viewDragState2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (viewDragState != 2 && viewDragState2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.getHighSpeedVideoSizes == 0.0f) {
                getHighResolutionOutputSizeshNQ4ISI(view);
            } else if (layoutParams.getHighSpeedVideoSizes == 1.0f) {
                getOutputFormats(view);
            }
        }
        if (i2 != this.getOutputSizes) {
            this.getOutputSizes = i2;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list = this.CoroutineDebuggingKt;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.CoroutineDebuggingKt.get(size).onDrawerStateChanged(i2);
                }
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
        android.view.View rootView;
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if ((layoutParams.getHighResolutionOutputSizeshNQ4ISI & 1) == 1) {
            layoutParams.getHighResolutionOutputSizeshNQ4ISI = 0;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list = this.CoroutineDebuggingKt;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.CoroutineDebuggingKt.get(size).onDrawerClosed(view);
                }
            }
            getHighResolutionOutputSizeshNQ4ISI(view, false);
            getHighSpeedVideoFpsRangesFor(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    private void getOutputFormats(android.view.View view) {
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if ((layoutParams.getHighResolutionOutputSizeshNQ4ISI & 1) == 0) {
            layoutParams.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list = this.CoroutineDebuggingKt;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.CoroutineDebuggingKt.get(size).onDrawerOpened(view);
                }
            }
            getHighResolutionOutputSizeshNQ4ISI(view, true);
            getHighSpeedVideoFpsRangesFor(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if ((!z && !Camera2StreamConfigurationMap(childAt)) || (z && childAt == view)) {
                androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 1);
            } else {
                androidx.core.view.ViewCompat.setImportantForAccessibility(childAt, 4);
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(android.view.View view) {
        androidx.core.view.ViewCompat.removeAccessibilityAction(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS.getId());
        if (!isDrawerOpen(view) || getDrawerLockMode(view) == 2) {
            return;
        }
        androidx.core.view.ViewCompat.replaceAccessibilityAction(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, this.getOutputFormats);
    }

    final void getHighSpeedVideoFpsRanges(android.view.View view, float f) {
        java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> list = this.CoroutineDebuggingKt;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.CoroutineDebuggingKt.get(size).onDrawerSlide(view, f);
            }
        }
    }

    static float getHighSpeedVideoSizes(android.view.View view) {
        return ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).getHighSpeedVideoSizes;
    }

    private android.view.View getHighSpeedVideoSizes() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if ((((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams()).getHighResolutionOutputSizeshNQ4ISI & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    final android.view.View getHighResolutionOutputSizeshNQ4ISI(int i) {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this));
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if ((androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(this)) & 7) == (absoluteGravity & 7)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getOutputSizeshNQ4ISI = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getOutputSizeshNQ4ISI = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        java.lang.String str;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new java.lang.IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.getValidOutputFormatsForInputhNQ4ISI != null && androidx.core.view.ViewCompat.getFitsSystemWindows(this);
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(layoutParams.gravity, layoutDirection);
                    if (androidx.core.view.ViewCompat.getFitsSystemWindows(childAt)) {
                        android.view.WindowInsets windowInsets = (android.view.WindowInsets) this.getValidOutputFormatsForInputhNQ4ISI;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        android.view.WindowInsets windowInsets2 = (android.view.WindowInsets) this.getValidOutputFormatsForInputhNQ4ISI;
                        if (absoluteGravity == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams()).gravity == 0) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (Camera2StreamConfigurationMap(childAt)) {
                    if (getHighSpeedVideoFpsRanges) {
                        float elevation = androidx.core.view.ViewCompat.getElevation(childAt);
                        float f = this.getOutputStallDuration;
                        if (elevation != f) {
                            androidx.core.view.ViewCompat.setElevation(childAt, f);
                        }
                    }
                    int absoluteGravity2 = androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(this));
                    int i4 = absoluteGravity2 & 7;
                    boolean z4 = i4 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Child drawer has absolute gravity ");
                        if ((absoluteGravity2 & 3) == 3) {
                            str = "LEFT";
                        } else if ((absoluteGravity2 & 5) == 5) {
                            str = "RIGHT";
                        } else {
                            str = java.lang.Integer.toHexString(i4);
                        }
                        sb.append(str);
                        sb.append(" but this DrawerLayout already has a drawer view along that edge");
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(getChildMeasureSpec(i, this._CREATION + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i3);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new java.lang.IllegalStateException(sb2.toString());
                }
            }
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        if (getHighSpeedVideoFpsRanges) {
            return;
        }
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        if (layoutDirection == 0) {
            android.graphics.drawable.Drawable drawable3 = this.resetTransaction;
            if (drawable3 != null) {
                if (drawable3 != null && androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(drawable3)) {
                    androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable3, layoutDirection);
                }
                drawable = this.resetTransaction;
            }
            drawable = this.AMEXKernel;
        } else {
            android.graphics.drawable.Drawable drawable4 = this.c;
            if (drawable4 != null) {
                if (drawable4 != null && androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(drawable4)) {
                    androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable4, layoutDirection);
                }
                drawable = this.c;
            }
            drawable = this.AMEXKernel;
        }
        this.startTransaction = drawable;
        int layoutDirection2 = androidx.core.view.ViewCompat.getLayoutDirection(this);
        if (layoutDirection2 == 0) {
            android.graphics.drawable.Drawable drawable5 = this.c;
            if (drawable5 != null) {
                if (drawable5 != null && androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(drawable5)) {
                    androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable5, layoutDirection2);
                }
                drawable2 = this.c;
            }
            drawable2 = this.exchange;
        } else {
            android.graphics.drawable.Drawable drawable6 = this.resetTransaction;
            if (drawable6 != null) {
                if (drawable6 != null && androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(drawable6)) {
                    androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable6, layoutDirection2);
                }
                drawable2 = this.resetTransaction;
            }
            drawable2 = this.exchange;
        }
        this.AMEXKernela = drawable2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.getOutputMinFrameDurationlomOqCM = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams();
                if (((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams()).gravity == 0) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (getHighSpeedVideoSizes(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.getHighSpeedVideoSizes * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (layoutParams.getHighSpeedVideoSizes * f3));
                    }
                    boolean z3 = f != layoutParams.getHighSpeedVideoSizes ? z2 : false;
                    int i8 = layoutParams.gravity & 112;
                    if (i8 == 16) {
                        int i9 = i4 - i2;
                        int i10 = (i9 - measuredHeight) / 2;
                        if (i10 < layoutParams.topMargin) {
                            i10 = layoutParams.topMargin;
                        } else if (i10 + measuredHeight > i9 - layoutParams.bottomMargin) {
                            i10 = (i9 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i10, measuredWidth + i5, measuredHeight + i10);
                    } else if (i8 != 80) {
                        childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, layoutParams.topMargin + measuredHeight);
                    } else {
                        int i11 = i4 - i2;
                        childAt.layout(i5, (i11 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i11 - layoutParams.bottomMargin);
                    }
                    if (z3) {
                        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams2 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams();
                        if (f != layoutParams2.getHighSpeedVideoSizes) {
                            layoutParams2.getHighSpeedVideoSizes = f;
                            getHighSpeedVideoFpsRanges(childAt, f);
                        }
                    }
                    int i12 = layoutParams.getHighSpeedVideoSizes > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i12) {
                        childAt.setVisibility(i12);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (getHighSpeedVideoSizesFor && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.Insets systemGestureInsets = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets).getSystemGestureInsets();
            androidx.customview.widget.ViewDragHelper viewDragHelper = this.isOutputSupportedForhNQ4ISI;
            viewDragHelper.setEdgeSize(java.lang.Math.max(viewDragHelper.getDefaultEdgeSize(), systemGestureInsets.left));
            androidx.customview.widget.ViewDragHelper viewDragHelper2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            viewDragHelper2.setEdgeSize(java.lang.Math.max(viewDragHelper2.getDefaultEdgeSize(), systemGestureInsets.right));
        }
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getOutputSizeshNQ4ISI = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.getOutputMinFrameDurationlomOqCM) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = java.lang.Math.max(f, ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) getChildAt(i).getLayoutParams()).getHighSpeedVideoSizes);
        }
        this.d = f;
        boolean continueSettling = this.isOutputSupportedForhNQ4ISI.continueSettling(true);
        boolean continueSettling2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME.continueSettling(true);
        if (continueSettling || continueSettling2) {
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable drawable) {
        this.release = drawable;
        invalidate();
    }

    public android.graphics.drawable.Drawable getStatusBarBackgroundDrawable() {
        return this.release;
    }

    public void setStatusBarBackground(int i) {
        this.release = i != 0 ? androidx.core.content.ContextCompat.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.release = new android.graphics.drawable.ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        getHighSpeedVideoFpsRanges();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.getOutputStallDurationlomOqCM || this.release == null) {
            return;
        }
        java.lang.Object obj = this.getValidOutputFormatsForInputhNQ4ISI;
        int systemWindowInsetTop = obj != null ? ((android.view.WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.release.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.release.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        android.graphics.drawable.Drawable background;
        int height = getHeight();
        int i = 0;
        boolean z = ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity == 0;
        int width = getWidth();
        int save = canvas.save();
        if (z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && Camera2StreamConfigurationMap(childAt) && childAt.getHeight() >= height) {
                    if (getHighSpeedVideoSizes(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.d;
        if (f > 0.0f && z) {
            this.kernelVersion.setColor((this.init & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.kernelVersion);
            return drawChild;
        }
        if (this.startTransaction != null && getHighSpeedVideoSizes(view, 3)) {
            int intrinsicWidth = this.startTransaction.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(right2 / this.isOutputSupportedForhNQ4ISI.getEdgeSize(), 1.0f));
            this.startTransaction.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.startTransaction.setAlpha((int) (max * 255.0f));
            this.startTransaction.draw(canvas);
            return drawChild;
        }
        if (this.AMEXKernela != null && getHighSpeedVideoSizes(view, 5)) {
            int intrinsicWidth2 = this.AMEXKernela.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = java.lang.Math.max(0.0f, java.lang.Math.min((getWidth() - left2) / this.getARTIFICIAL_FRAME_PACKAGE_NAME.getEdgeSize(), 1.0f));
            this.AMEXKernela.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.AMEXKernela.setAlpha((int) (max2 * 255.0f));
            this.AMEXKernela.draw(canvas);
        }
        return drawChild;
    }

    static boolean Camera2StreamConfigurationMap(android.view.View view) {
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View findTopChildUnder;
        int actionMasked = motionEvent.getActionMasked();
        boolean shouldInterceptTouchEvent = this.isOutputSupportedForhNQ4ISI.shouldInterceptTouchEvent(motionEvent);
        boolean shouldInterceptTouchEvent2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME.shouldInterceptTouchEvent(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.unwrapAs = x;
            this.isOutputSupportedFor = y;
            z = this.d > 0.0f && (findTopChildUnder = this.isOutputSupportedForhNQ4ISI.findTopChildUnder((int) x, (int) y)) != null && ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) findTopChildUnder.getLayoutParams()).gravity == 0;
            this.Camera2StreamConfigurationMap = false;
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.isOutputSupportedForhNQ4ISI.checkTouchSlop(3)) {
                        androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback = this.toString;
                        androidx.drawerlayout.widget.DrawerLayout.this.removeCallbacks(viewDragCallback.getHighResolutionOutputSizeshNQ4ISI);
                        androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback2 = this._BOUNDARY;
                        androidx.drawerlayout.widget.DrawerLayout.this.removeCallbacks(viewDragCallback2.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
                z = false;
            }
            getHighSpeedVideoFpsRanges(true);
            this.Camera2StreamConfigurationMap = false;
            z = false;
        }
        if (!(shouldInterceptTouchEvent | shouldInterceptTouchEvent2) && !z) {
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    if (!this.Camera2StreamConfigurationMap) {
                        return false;
                    }
                } else {
                    if (((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) getChildAt(i).getLayoutParams()).Camera2StreamConfigurationMap) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.d <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return false;
            }
            android.view.View childAt = getChildAt(childCount);
            if (this.getOutputMinFrameDuration == null) {
                this.getOutputMinFrameDuration = new android.graphics.Rect();
            }
            childAt.getHitRect(this.getOutputMinFrameDuration);
            if (this.getOutputMinFrameDuration.contains((int) x, (int) y) && ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams()).gravity != 0) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    android.graphics.Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.getInputFormats == null) {
                            this.getInputFormats = new android.graphics.Matrix();
                        }
                        matrix.invert(this.getInputFormats);
                        obtain.transform(this.getInputFormats);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (getDrawerLockMode(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.isOutputSupportedForhNQ4ISI.processTouchEvent(motionEvent);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.processTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = false;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.unwrapAs = x;
            this.isOutputSupportedFor = y;
            this.Camera2StreamConfigurationMap = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            android.view.View findTopChildUnder = this.isOutputSupportedForhNQ4ISI.findTopChildUnder((int) x2, (int) y2);
            if (findTopChildUnder != null && ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) findTopChildUnder.getLayoutParams()).gravity == 0) {
                float f = x2 - this.unwrapAs;
                float f2 = y2 - this.isOutputSupportedFor;
                int touchSlop = this.isOutputSupportedForhNQ4ISI.getTouchSlop();
                if ((f * f) + (f2 * f2) < touchSlop * touchSlop) {
                    android.view.View highSpeedVideoSizes = getHighSpeedVideoSizes();
                    if (highSpeedVideoSizes != null) {
                    }
                }
            }
            z = true;
            getHighSpeedVideoFpsRanges(z);
        } else if (action == 3) {
            getHighSpeedVideoFpsRanges(true);
            this.Camera2StreamConfigurationMap = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            getHighSpeedVideoFpsRanges(true);
        }
    }

    public void closeDrawers() {
        getHighSpeedVideoFpsRanges(false);
    }

    private void getHighSpeedVideoFpsRanges(boolean z) {
        boolean smoothSlideViewTo;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) childAt.getLayoutParams();
            if (Camera2StreamConfigurationMap(childAt) && (!z || layoutParams.Camera2StreamConfigurationMap)) {
                int width = childAt.getWidth();
                if (getHighSpeedVideoSizes(childAt, 3)) {
                    smoothSlideViewTo = this.isOutputSupportedForhNQ4ISI.smoothSlideViewTo(childAt, -width, childAt.getTop());
                } else {
                    smoothSlideViewTo = this.getARTIFICIAL_FRAME_PACKAGE_NAME.smoothSlideViewTo(childAt, getWidth(), childAt.getTop());
                }
                z2 |= smoothSlideViewTo;
                layoutParams.Camera2StreamConfigurationMap = false;
            }
        }
        androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback = this.toString;
        androidx.drawerlayout.widget.DrawerLayout.this.removeCallbacks(viewDragCallback.getHighResolutionOutputSizeshNQ4ISI);
        androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback2 = this._BOUNDARY;
        androidx.drawerlayout.widget.DrawerLayout.this.removeCallbacks(viewDragCallback2.getHighResolutionOutputSizeshNQ4ISI);
        if (z2) {
            invalidate();
        }
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openDrawer(androidx.core.view.GravityCompat.START);
    }

    public void openDrawer(android.view.View view) {
        openDrawer(view, true);
    }

    public void openDrawer(android.view.View view, boolean z) {
        if (!Camera2StreamConfigurationMap(view)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a sliding drawer");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if (this.getOutputSizeshNQ4ISI) {
            layoutParams.getHighSpeedVideoSizes = 1.0f;
            layoutParams.getHighResolutionOutputSizeshNQ4ISI = 1;
            getHighResolutionOutputSizeshNQ4ISI(view, true);
            getHighSpeedVideoFpsRangesFor(view);
        } else if (z) {
            layoutParams.getHighResolutionOutputSizeshNQ4ISI |= 2;
            if (getHighSpeedVideoSizes(view, 3)) {
                this.isOutputSupportedForhNQ4ISI.smoothSlideViewTo(view, 0, view.getTop());
            } else {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            getHighSpeedVideoFpsRangesFor(view, 1.0f);
            getHighSpeedVideoSizes(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void openDrawer(int i, boolean z) {
        java.lang.String str;
        android.view.View highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No drawer view found with gravity ");
            if ((i & 3) == 3) {
                str = "LEFT";
            } else if ((i & 5) == 5) {
                str = "RIGHT";
            } else {
                str = java.lang.Integer.toHexString(i);
            }
            sb.append(str);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        openDrawer(highResolutionOutputSizeshNQ4ISI, z);
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closeDrawer(androidx.core.view.GravityCompat.START);
    }

    public void closeDrawer(android.view.View view) {
        closeDrawer(view, true);
    }

    public void closeDrawer(android.view.View view, boolean z) {
        if (!Camera2StreamConfigurationMap(view)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a sliding drawer");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if (this.getOutputSizeshNQ4ISI) {
            layoutParams.getHighSpeedVideoSizes = 0.0f;
            layoutParams.getHighResolutionOutputSizeshNQ4ISI = 0;
        } else if (z) {
            layoutParams.getHighResolutionOutputSizeshNQ4ISI |= 4;
            if (getHighSpeedVideoSizes(view, 3)) {
                this.isOutputSupportedForhNQ4ISI.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
            } else {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.smoothSlideViewTo(view, getWidth(), view.getTop());
            }
        } else {
            getHighSpeedVideoFpsRangesFor(view, 0.0f);
            getHighSpeedVideoSizes(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void closeDrawer(int i, boolean z) {
        java.lang.String str;
        android.view.View highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No drawer view found with gravity ");
            if ((i & 3) == 3) {
                str = "LEFT";
            } else if ((i & 5) == 5) {
                str = "RIGHT";
            } else {
                str = java.lang.Integer.toHexString(i);
            }
            sb.append(str);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        closeDrawer(highResolutionOutputSizeshNQ4ISI, z);
    }

    public boolean isDrawerOpen(android.view.View view) {
        if (Camera2StreamConfigurationMap(view)) {
            return (((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).getHighResolutionOutputSizeshNQ4ISI & 1) == 1;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return isDrawerOpen(androidx.core.view.GravityCompat.START);
    }

    public boolean isDrawerOpen(int i) {
        android.view.View highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return isDrawerOpen(highResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public boolean isDrawerVisible(android.view.View view) {
        if (Camera2StreamConfigurationMap(view)) {
            return ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).getHighSpeedVideoSizes > 0.0f;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public boolean isDrawerVisible(int i) {
        android.view.View highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return isDrawerVisible(highResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams) {
            return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.drawerlayout.widget.DrawerLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (Camera2StreamConfigurationMap(childAt)) {
                if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.f2735a.add(childAt);
            }
        }
        if (!z) {
            int size = this.f2735a.size();
            for (int i4 = 0; i4 < size; i4++) {
                android.view.View view = this.f2735a.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f2735a.clear();
    }

    final android.view.View Camera2StreamConfigurationMap() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (Camera2StreamConfigurationMap(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            android.view.View Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap != null && getDrawerLockMode(Camera2StreamConfigurationMap) == 0) {
                closeDrawers();
            }
            return Camera2StreamConfigurationMap != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.View highResolutionOutputSizeshNQ4ISI;
        if (!(parcelable instanceof androidx.drawerlayout.widget.DrawerLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.drawerlayout.widget.DrawerLayout.SavedState savedState = (androidx.drawerlayout.widget.DrawerLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.getHighSpeedVideoFpsRanges != 0 && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(savedState.getHighSpeedVideoFpsRanges)) != null) {
            openDrawer(highResolutionOutputSizeshNQ4ISI);
        }
        if (savedState.getHighSpeedVideoFpsRangesFor != 3) {
            setDrawerLockMode(savedState.getHighSpeedVideoFpsRangesFor, 3);
        }
        if (savedState.Camera2StreamConfigurationMap != 3) {
            setDrawerLockMode(savedState.Camera2StreamConfigurationMap, 5);
        }
        if (savedState.getHighResolutionOutputSizeshNQ4ISI != 3) {
            setDrawerLockMode(savedState.getHighResolutionOutputSizeshNQ4ISI, androidx.core.view.GravityCompat.START);
        }
        if (savedState.getHighSpeedVideoSizes != 3) {
            setDrawerLockMode(savedState.getHighSpeedVideoSizes, androidx.core.view.GravityCompat.END);
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.drawerlayout.widget.DrawerLayout.SavedState savedState = new androidx.drawerlayout.widget.DrawerLayout.SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) getChildAt(i).getLayoutParams();
            boolean z = layoutParams.getHighResolutionOutputSizeshNQ4ISI == 1;
            boolean z2 = layoutParams.getHighResolutionOutputSizeshNQ4ISI == 2;
            if (z || z2) {
                savedState.getHighSpeedVideoFpsRanges = layoutParams.gravity;
                break;
            }
        }
        savedState.getHighSpeedVideoFpsRangesFor = this.ArtificialStackFrames;
        savedState.Camera2StreamConfigurationMap = this.coroutineBoundary;
        savedState.getHighResolutionOutputSizeshNQ4ISI = this.b;
        savedState.getHighSpeedVideoSizes = this.accessartificialFrame;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (getHighSpeedVideoSizes() != null || Camera2StreamConfigurationMap(view)) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(view, 4);
        } else {
            androidx.core.view.ViewCompat.setImportantForAccessibility(view, 1);
        }
        if (getHighSpeedVideoSizes) {
            return;
        }
        androidx.core.view.ViewCompat.setAccessibilityDelegate(view, this.getInputSizeshNQ4ISI);
    }

    static boolean getHighSpeedVideoFpsRanges(android.view.View view) {
        return (androidx.core.view.ViewCompat.getImportantForAccessibility(view) == 4 || androidx.core.view.ViewCompat.getImportantForAccessibility(view) == 2) ? false : true;
    }

    /* loaded from: classes7.dex */
    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.drawerlayout.widget.DrawerLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.drawerlayout.widget.DrawerLayout.SavedState>() { // from class: androidx.drawerlayout.widget.DrawerLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ androidx.drawerlayout.widget.DrawerLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
                return new androidx.drawerlayout.widget.DrawerLayout.SavedState[i];
            }
        };
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoFpsRanges = parcel.readInt();
            this.getHighSpeedVideoFpsRangesFor = parcel.readInt();
            this.Camera2StreamConfigurationMap = parcel.readInt();
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
            this.getHighSpeedVideoSizes = parcel.readInt();
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
            this.getHighSpeedVideoFpsRanges = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighSpeedVideoFpsRanges);
            parcel.writeInt(this.getHighSpeedVideoFpsRangesFor);
            parcel.writeInt(this.Camera2StreamConfigurationMap);
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
            parcel.writeInt(this.getHighSpeedVideoSizes);
        }
    }

    /* loaded from: classes7.dex */
    class ViewDragCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        androidx.customview.widget.ViewDragHelper Camera2StreamConfigurationMap;
        final java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI = new java.lang.Runnable() { // from class: androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback.1
            @Override // java.lang.Runnable
            public void run() {
                android.view.View highResolutionOutputSizeshNQ4ISI;
                int width;
                androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback viewDragCallback = androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback.this;
                int edgeSize = viewDragCallback.Camera2StreamConfigurationMap.getEdgeSize();
                boolean z = viewDragCallback.getHighSpeedVideoFpsRangesFor == 3;
                if (z) {
                    highResolutionOutputSizeshNQ4ISI = androidx.drawerlayout.widget.DrawerLayout.this.getHighResolutionOutputSizeshNQ4ISI(3);
                    width = (highResolutionOutputSizeshNQ4ISI != null ? -highResolutionOutputSizeshNQ4ISI.getWidth() : 0) + edgeSize;
                } else {
                    highResolutionOutputSizeshNQ4ISI = androidx.drawerlayout.widget.DrawerLayout.this.getHighResolutionOutputSizeshNQ4ISI(5);
                    width = androidx.drawerlayout.widget.DrawerLayout.this.getWidth() - edgeSize;
                }
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    if (((!z || highResolutionOutputSizeshNQ4ISI.getLeft() >= width) && (z || highResolutionOutputSizeshNQ4ISI.getLeft() <= width)) || androidx.drawerlayout.widget.DrawerLayout.this.getDrawerLockMode(highResolutionOutputSizeshNQ4ISI) != 0) {
                        return;
                    }
                    androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) highResolutionOutputSizeshNQ4ISI.getLayoutParams();
                    viewDragCallback.Camera2StreamConfigurationMap.smoothSlideViewTo(highResolutionOutputSizeshNQ4ISI, width, highResolutionOutputSizeshNQ4ISI.getTop());
                    layoutParams.Camera2StreamConfigurationMap = true;
                    androidx.drawerlayout.widget.DrawerLayout.this.invalidate();
                    viewDragCallback.getHighSpeedVideoFpsRangesFor();
                    androidx.drawerlayout.widget.DrawerLayout drawerLayout = androidx.drawerlayout.widget.DrawerLayout.this;
                    if (drawerLayout.Camera2StreamConfigurationMap) {
                        return;
                    }
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        drawerLayout.getChildAt(i).dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    drawerLayout.Camera2StreamConfigurationMap = true;
                }
            }
        };
        final int getHighSpeedVideoFpsRangesFor;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean onEdgeLock(int i) {
            return false;
        }

        ViewDragCallback(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View view, int i) {
            return androidx.drawerlayout.widget.DrawerLayout.Camera2StreamConfigurationMap(view) && androidx.drawerlayout.widget.DrawerLayout.this.getHighSpeedVideoSizes(view, this.getHighSpeedVideoFpsRangesFor) && androidx.drawerlayout.widget.DrawerLayout.this.getDrawerLockMode(view) == 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            androidx.drawerlayout.widget.DrawerLayout.this.getHighSpeedVideoSizes(i, this.Camera2StreamConfigurationMap.getCapturedView());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
            float width = (androidx.drawerlayout.widget.DrawerLayout.this.getHighSpeedVideoSizes(view, 3) ? i + r3 : androidx.drawerlayout.widget.DrawerLayout.this.getWidth() - i) / view.getWidth();
            androidx.drawerlayout.widget.DrawerLayout drawerLayout = androidx.drawerlayout.widget.DrawerLayout.this;
            androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
            if (width != layoutParams.getHighSpeedVideoSizes) {
                layoutParams.getHighSpeedVideoSizes = width;
                drawerLayout.getHighSpeedVideoFpsRanges(view, width);
            }
            view.setVisibility(width == 0.0f ? 4 : 0);
            androidx.drawerlayout.widget.DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View view, int i) {
            ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).Camera2StreamConfigurationMap = false;
            getHighSpeedVideoFpsRangesFor();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            android.view.View highResolutionOutputSizeshNQ4ISI = androidx.drawerlayout.widget.DrawerLayout.this.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor == 3 ? 5 : 3);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                androidx.drawerlayout.widget.DrawerLayout.this.closeDrawer(highResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View view, float f, float f2) {
            int i;
            float highSpeedVideoSizes = androidx.drawerlayout.widget.DrawerLayout.getHighSpeedVideoSizes(view);
            int width = view.getWidth();
            if (androidx.drawerlayout.widget.DrawerLayout.this.getHighSpeedVideoSizes(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && highSpeedVideoSizes > 0.5f)) ? 0 : -width;
            } else {
                int width2 = androidx.drawerlayout.widget.DrawerLayout.this.getWidth();
                i = (f < 0.0f || (f == 0.0f && highSpeedVideoSizes > 0.5f)) ? width2 - width : width2;
            }
            this.Camera2StreamConfigurationMap.settleCapturedViewAt(i, view.getTop());
            androidx.drawerlayout.widget.DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i, int i2) {
            androidx.drawerlayout.widget.DrawerLayout.this.postDelayed(this.getHighResolutionOutputSizeshNQ4ISI, 160L);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            android.view.View highResolutionOutputSizeshNQ4ISI;
            if ((i & 1) == 1) {
                highResolutionOutputSizeshNQ4ISI = androidx.drawerlayout.widget.DrawerLayout.this.getHighResolutionOutputSizeshNQ4ISI(3);
            } else {
                highResolutionOutputSizeshNQ4ISI = androidx.drawerlayout.widget.DrawerLayout.this.getHighResolutionOutputSizeshNQ4ISI(5);
            }
            if (highResolutionOutputSizeshNQ4ISI == null || androidx.drawerlayout.widget.DrawerLayout.this.getDrawerLockMode(highResolutionOutputSizeshNQ4ISI) != 0) {
                return;
            }
            this.Camera2StreamConfigurationMap.captureChildView(highResolutionOutputSizeshNQ4ISI, i2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View view) {
            if (androidx.drawerlayout.widget.DrawerLayout.Camera2StreamConfigurationMap(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
            if (androidx.drawerlayout.widget.DrawerLayout.this.getHighSpeedVideoSizes(view, 3)) {
                return java.lang.Math.max(-view.getWidth(), java.lang.Math.min(i, 0));
            }
            int width = androidx.drawerlayout.widget.DrawerLayout.this.getWidth();
            return java.lang.Math.max(width - view.getWidth(), java.lang.Math.min(i, width));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View view, int i, int i2) {
            return view.getTop();
        }
    }

    /* loaded from: classes7.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        boolean Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoSizes;
        public int gravity;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.widget.DrawerLayout.getHighSpeedVideoFpsRangesFor);
            this.gravity = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
        }

        public LayoutParams(int i, int i2, int i3) {
            this(i, i2);
            this.gravity = i3;
        }

        public LayoutParams(androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = 0;
        }
    }

    /* loaded from: classes7.dex */
    class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect();

        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (androidx.drawerlayout.widget.DrawerLayout.getHighSpeedVideoSizes) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
                super.onInitializeAccessibilityNodeInfo(view, obtain);
                accessibilityNodeInfoCompat.setSource(view);
                java.lang.Object parentForAccessibility = androidx.core.view.ViewCompat.getParentForAccessibility(view);
                if (parentForAccessibility instanceof android.view.View) {
                    accessibilityNodeInfoCompat.setParent((android.view.View) parentForAccessibility);
                }
                android.graphics.Rect rect = this.getHighResolutionOutputSizeshNQ4ISI;
                obtain.getBoundsInScreen(rect);
                accessibilityNodeInfoCompat.setBoundsInScreen(rect);
                accessibilityNodeInfoCompat.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfoCompat.setPackageName(obtain.getPackageName());
                accessibilityNodeInfoCompat.setClassName(obtain.getClassName());
                accessibilityNodeInfoCompat.setContentDescription(obtain.getContentDescription());
                accessibilityNodeInfoCompat.setEnabled(obtain.isEnabled());
                accessibilityNodeInfoCompat.setFocused(obtain.isFocused());
                accessibilityNodeInfoCompat.setAccessibilityFocused(obtain.isAccessibilityFocused());
                accessibilityNodeInfoCompat.setSelected(obtain.isSelected());
                accessibilityNodeInfoCompat.addAction(obtain.getActions());
                obtain.recycle();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = viewGroup.getChildAt(i);
                    if (androidx.drawerlayout.widget.DrawerLayout.getHighSpeedVideoFpsRanges(childAt)) {
                        accessibilityNodeInfoCompat.addChild(childAt);
                    }
                }
            }
            accessibilityNodeInfoCompat.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfoCompat.setFocusable(false);
            accessibilityNodeInfoCompat.setFocused(false);
            accessibilityNodeInfoCompat.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS);
            accessibilityNodeInfoCompat.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                java.util.List<java.lang.CharSequence> text = accessibilityEvent.getText();
                android.view.View Camera2StreamConfigurationMap = androidx.drawerlayout.widget.DrawerLayout.this.Camera2StreamConfigurationMap();
                if (Camera2StreamConfigurationMap == null) {
                    return true;
                }
                java.lang.CharSequence drawerTitle = androidx.drawerlayout.widget.DrawerLayout.this.getDrawerTitle(androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) Camera2StreamConfigurationMap.getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(androidx.drawerlayout.widget.DrawerLayout.this)));
                if (drawerTitle == null) {
                    return true;
                }
                text.add(drawerTitle);
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            if (androidx.drawerlayout.widget.DrawerLayout.getHighSpeedVideoSizes || androidx.drawerlayout.widget.DrawerLayout.getHighSpeedVideoFpsRanges(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes7.dex */
    static final class ChildAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        ChildAccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (androidx.drawerlayout.widget.DrawerLayout.getHighSpeedVideoFpsRanges(view)) {
                return;
            }
            accessibilityNodeInfoCompat.setParent(null);
        }
    }

    final boolean getHighSpeedVideoSizes(android.view.View view, int i) {
        return (androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).gravity, androidx.core.view.ViewCompat.getLayoutDirection(this)) & i) == i;
    }

    private void getHighSpeedVideoFpsRangesFor(android.view.View view, float f) {
        float f2 = ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).getHighSpeedVideoSizes;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!getHighSpeedVideoSizes(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
        if (f != layoutParams.getHighSpeedVideoSizes) {
            layoutParams.getHighSpeedVideoSizes = f;
            getHighSpeedVideoFpsRanges(view, f);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4 && Camera2StreamConfigurationMap() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
