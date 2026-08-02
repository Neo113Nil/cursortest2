package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class DropDownListView extends android.widget.ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private androidx.core.view.ViewPropertyAnimatorCompat getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private androidx.core.widget.ListViewAutoScrollHelper getOutputMinFrameDuration;
    private final android.graphics.Rect getOutputMinFrameDurationlomOqCM;
    private androidx.appcompat.widget.DropDownListView.GateKeeperDrawable getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;

    DropDownListView(android.content.Context context, boolean z) {
        super(context, null, androidx.appcompat.R.attr.dropDownListViewStyle);
        this.getOutputMinFrameDurationlomOqCM = new android.graphics.Rect();
        this.getInputSizeshNQ4ISI = 0;
        this.getOutputStallDurationlomOqCM = 0;
        this.getHighSpeedVideoSizesFor = 0;
        this.getOutputFormats = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        setCacheColorHint(0);
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.getHighResolutionOutputSizeshNQ4ISI || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.getHighResolutionOutputSizeshNQ4ISI || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.getHighResolutionOutputSizeshNQ4ISI || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.DropDownListView.GateKeeperDrawable gateKeeperDrawable = drawable != null ? new androidx.appcompat.widget.DropDownListView.GateKeeperDrawable(drawable) : null;
        this.getOutputStallDuration = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.getInputSizeshNQ4ISI = rect.left;
        this.getOutputStallDurationlomOqCM = rect.top;
        this.getHighSpeedVideoSizesFor = rect.right;
        this.getOutputFormats = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.getHighSpeedVideoSizes != null) {
            return;
        }
        super.drawableStateChanged();
        androidx.appcompat.widget.DropDownListView.GateKeeperDrawable gateKeeperDrawable = this.getOutputStallDuration;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.getHighSpeedVideoFpsRanges = true;
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.getInputFormats = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable resolveHoverRunnable = this.getHighSpeedVideoSizes;
        if (resolveHoverRunnable != null) {
            androidx.appcompat.widget.DropDownListView.this.getHighSpeedVideoSizes = null;
            androidx.appcompat.widget.DropDownListView.this.removeCallbacks(resolveHoverRunnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int lookForSelectablePosition(int i, boolean z) {
        int min;
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    min = java.lang.Math.max(0, i);
                    while (min < count && !adapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = java.lang.Math.min(i, count - 1);
                    while (min >= 0 && !adapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            }
            if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        android.view.View view = null;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    static class GateKeeperDrawable extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
        boolean getHighSpeedVideoFpsRanges;

        GateKeeperDrawable(android.graphics.drawable.Drawable drawable) {
            super(drawable);
            this.getHighSpeedVideoFpsRanges = true;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.getHighSpeedVideoFpsRanges) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            if (this.getHighSpeedVideoFpsRanges) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.getHighSpeedVideoFpsRanges) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.getHighSpeedVideoFpsRanges) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.getHighSpeedVideoFpsRanges) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.getHighSpeedVideoSizes == null) {
            androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable resolveHoverRunnable = new androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable();
            this.getHighSpeedVideoSizes = resolveHoverRunnable;
            androidx.appcompat.widget.DropDownListView.this.post(resolveHoverRunnable);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                android.view.View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (android.os.Build.VERSION.SDK_INT >= 30 && androidx.appcompat.widget.DropDownListView.Api30Impl.getHighSpeedVideoSizes()) {
                        androidx.appcompat.widget.DropDownListView.Api30Impl.getHighSpeedVideoSizes(this, pointToPosition, childAt);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return onHoverEvent;
        }
        setSelection(-1);
        return onHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.getHighSpeedVideoSizes = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r2 != 3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onForwardedEvent(android.view.MotionEvent motionEvent, int i) {
        boolean z;
        boolean highSpeedVideoFpsRanges;
        android.view.View childAt;
        boolean z2;
        android.view.View childAt2;
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else if (actionMasked == 2) {
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition == -1) {
                z2 = true;
                if (z || z2) {
                    this.Camera2StreamConfigurationMap = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.getInputFormats - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                    viewPropertyAnimatorCompat = this.getHighSpeedVideoFpsRanges;
                    if (viewPropertyAnimatorCompat != null) {
                        viewPropertyAnimatorCompat.cancel();
                        this.getHighSpeedVideoFpsRanges = null;
                    }
                }
                if (z) {
                    if (this.getOutputMinFrameDuration == null) {
                        this.getOutputMinFrameDuration = new androidx.core.widget.ListViewAutoScrollHelper(this);
                    }
                    this.getOutputMinFrameDuration.setEnabled(true);
                    this.getOutputMinFrameDuration.onTouch(this, motionEvent);
                    return z;
                }
                androidx.core.widget.ListViewAutoScrollHelper listViewAutoScrollHelper = this.getOutputMinFrameDuration;
                if (listViewAutoScrollHelper != null) {
                    listViewAutoScrollHelper.setEnabled(false);
                }
                return z;
            }
            android.view.View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
            float f = x;
            float f2 = y;
            this.Camera2StreamConfigurationMap = true;
            androidx.appcompat.widget.DropDownListView.Api21Impl.getHighSpeedVideoSizes(this, f, f2);
            if (!isPressed()) {
                setPressed(true);
            }
            layoutChildren();
            int i2 = this.getInputFormats;
            if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                childAt.setPressed(false);
            }
            this.getInputFormats = pointToPosition;
            androidx.appcompat.widget.DropDownListView.Api21Impl.getHighSpeedVideoSizes(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
            if (!childAt3.isPressed()) {
                childAt3.setPressed(true);
            }
            android.graphics.drawable.Drawable selector = getSelector();
            boolean z3 = (selector == null || pointToPosition == -1) ? false : true;
            if (z3) {
                selector.setVisible(false, false);
            }
            android.graphics.Rect rect = this.getOutputMinFrameDurationlomOqCM;
            rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
            rect.left -= this.getInputSizeshNQ4ISI;
            rect.top -= this.getOutputStallDurationlomOqCM;
            rect.right += this.getHighSpeedVideoSizesFor;
            rect.bottom += this.getOutputFormats;
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                highSpeedVideoFpsRanges = androidx.appcompat.widget.DropDownListView.Api33Impl.getHighSpeedVideoFpsRangesFor(this);
            } else {
                highSpeedVideoFpsRanges = androidx.appcompat.widget.DropDownListView.PreApi33Impl.getHighSpeedVideoFpsRanges(this);
            }
            if (childAt3.isEnabled() != highSpeedVideoFpsRanges) {
                boolean z4 = !highSpeedVideoFpsRanges;
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    androidx.appcompat.widget.DropDownListView.Api33Impl.Camera2StreamConfigurationMap(this, z4);
                } else {
                    androidx.appcompat.widget.DropDownListView.PreApi33Impl.getHighSpeedVideoFpsRangesFor(this, z4);
                }
                if (pointToPosition != -1) {
                    refreshDrawableState();
                }
            }
            if (z3) {
                android.graphics.Rect rect2 = this.getOutputMinFrameDurationlomOqCM;
                float exactCenterX = rect2.exactCenterX();
                float exactCenterY = rect2.exactCenterY();
                selector.setVisible(getVisibility() == 0, false);
                androidx.core.graphics.drawable.DrawableCompat.setHotspot(selector, exactCenterX, exactCenterY);
            }
            android.graphics.drawable.Drawable selector2 = getSelector();
            if (selector2 != null && pointToPosition != -1) {
                androidx.core.graphics.drawable.DrawableCompat.setHotspot(selector2, f, f2);
            }
            androidx.appcompat.widget.DropDownListView.GateKeeperDrawable gateKeeperDrawable = this.getOutputStallDuration;
            if (gateKeeperDrawable != null) {
                gateKeeperDrawable.getHighSpeedVideoFpsRanges = false;
            }
            refreshDrawableState();
            if (actionMasked == 1) {
                performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
            }
            z = true;
            z2 = false;
            if (z) {
            }
            this.Camera2StreamConfigurationMap = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.getInputFormats - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            viewPropertyAnimatorCompat = this.getHighSpeedVideoFpsRanges;
            if (viewPropertyAnimatorCompat != null) {
            }
            if (z) {
            }
        }
        z2 = false;
        z = false;
        if (z) {
        }
        this.Camera2StreamConfigurationMap = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.getInputFormats - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        viewPropertyAnimatorCompat = this.getHighSpeedVideoFpsRanges;
        if (viewPropertyAnimatorCompat != null) {
        }
        if (z) {
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.Camera2StreamConfigurationMap && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    class ResolveHoverRunnable implements java.lang.Runnable {
        ResolveHoverRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.DropDownListView.this.getHighSpeedVideoSizes = null;
            androidx.appcompat.widget.DropDownListView.this.drawableStateChanged();
        }
    }

    static class Api30Impl {
        private static java.lang.reflect.Method Camera2StreamConfigurationMap;
        private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
        private static boolean getHighSpeedVideoFpsRangesFor;
        private static java.lang.reflect.Method getHighSpeedVideoSizes;

        static {
            try {
                java.lang.reflect.Method declaredMethod = android.widget.AbsListView.class.getDeclaredMethod("positionSelector", java.lang.Integer.TYPE, android.view.View.class, java.lang.Boolean.TYPE, java.lang.Float.TYPE, java.lang.Float.TYPE);
                Camera2StreamConfigurationMap = declaredMethod;
                declaredMethod.setAccessible(true);
                java.lang.reflect.Method declaredMethod2 = android.widget.AdapterView.class.getDeclaredMethod("setSelectedPositionInt", java.lang.Integer.TYPE);
                getHighResolutionOutputSizeshNQ4ISI = declaredMethod2;
                declaredMethod2.setAccessible(true);
                java.lang.reflect.Method declaredMethod3 = android.widget.AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", java.lang.Integer.TYPE);
                getHighSpeedVideoSizes = declaredMethod3;
                declaredMethod3.setAccessible(true);
                getHighSpeedVideoFpsRangesFor = true;
            } catch (java.lang.NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        private Api30Impl() {
        }

        static boolean getHighSpeedVideoSizes() {
            return getHighSpeedVideoFpsRangesFor;
        }

        static void getHighSpeedVideoSizes(androidx.appcompat.widget.DropDownListView dropDownListView, int i, android.view.View view) {
            try {
                Camera2StreamConfigurationMap.invoke(dropDownListView, java.lang.Integer.valueOf(i), view, java.lang.Boolean.FALSE, -1, -1);
                getHighResolutionOutputSizeshNQ4ISI.invoke(dropDownListView, java.lang.Integer.valueOf(i));
                getHighSpeedVideoSizes.invoke(dropDownListView, java.lang.Integer.valueOf(i));
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void getHighSpeedVideoSizes(android.view.View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    static class PreApi33Impl {
        private static final java.lang.reflect.Field getHighResolutionOutputSizeshNQ4ISI;

        static {
            java.lang.reflect.Field field = null;
            try {
                field = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                e.printStackTrace();
            }
            getHighResolutionOutputSizeshNQ4ISI = field;
        }

        private PreApi33Impl() {
        }

        static boolean getHighSpeedVideoFpsRanges(android.widget.AbsListView absListView) {
            java.lang.reflect.Field field = getHighResolutionOutputSizeshNQ4ISI;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        static void getHighSpeedVideoFpsRangesFor(android.widget.AbsListView absListView, boolean z) {
            java.lang.reflect.Field field = getHighResolutionOutputSizeshNQ4ISI;
            if (field != null) {
                try {
                    field.set(absListView, java.lang.Boolean.valueOf(z));
                } catch (java.lang.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.widget.AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void Camera2StreamConfigurationMap(android.widget.AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        if (!this.getOutputMinFrameDurationlomOqCM.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.getOutputMinFrameDurationlomOqCM);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
