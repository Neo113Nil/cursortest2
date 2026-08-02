package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.ShowableListMenu {
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    public static final int WRAP_CONTENT = -2;
    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.reflect.Method getHighSpeedVideoSizes;
    private final android.graphics.Rect AMEXKernel;
    private android.widget.AdapterView.OnItemClickListener ArtificialStackFrames;
    androidx.appcompat.widget.DropDownListView Camera2StreamConfigurationMap;
    private final androidx.appcompat.widget.ListPopupWindow.ListSelectorHider CoroutineDebuggingKt;
    private android.view.View _BOUNDARY;
    private boolean _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private android.database.DataSetObserver f2667a;
    private boolean accessartificialFrame;
    private boolean b;
    private android.widget.AdapterView.OnItemSelectedListener coroutineBoundary;
    private boolean coroutineCreation;
    private java.lang.Runnable d;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    final android.os.Handler getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    android.widget.PopupWindow getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private android.content.Context getInputSizeshNQ4ISI;
    private android.widget.ListAdapter getOutputFormats;
    final androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private android.view.View getOutputSizes;
    private android.graphics.drawable.Drawable getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private final androidx.appcompat.widget.ListPopupWindow.PopupScrollListener init;
    private boolean isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private final androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor kernelVersion;
    private android.graphics.Rect toString;
    private int unwrapAs;

    private static boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
        return i == 66 || i == 23;
    }

    static {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                getHighResolutionOutputSizeshNQ4ISI = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            try {
                getHighSpeedVideoSizes = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
        }
    }

    public ListPopupWindow(android.content.Context context) {
        this(context, null, androidx.appcompat.R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.getOutputMinFrameDurationlomOqCM = -2;
        this.getValidOutputFormatsForInputhNQ4ISI = -2;
        this.unwrapAs = 1002;
        this.getOutputStallDuration = 0;
        this.getInputFormats = false;
        this.accessartificialFrame = false;
        this.getHighSpeedVideoFpsRangesFor = Integer.MAX_VALUE;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = 0;
        this.getOutputMinFrameDuration = new androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable();
        this.kernelVersion = new androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor();
        this.init = new androidx.appcompat.widget.ListPopupWindow.PopupScrollListener();
        this.CoroutineDebuggingKt = new androidx.appcompat.widget.ListPopupWindow.ListSelectorHider();
        this.AMEXKernel = new android.graphics.Rect();
        this.getInputSizeshNQ4ISI = context;
        this.getHighSpeedVideoFpsRanges = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ListPopupWindow, i, i2);
        this.getOutputStallDurationlomOqCM = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.isOutputSupportedForhNQ4ISI = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.isOutputSupportedFor = true;
        }
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.AppCompatPopupWindow appCompatPopupWindow = new androidx.appcompat.widget.AppCompatPopupWindow(context, attributeSet, i, i2);
        this.getHighSpeedVideoSizesFor = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    public void setAdapter(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.f2667a;
        if (dataSetObserver == null) {
            this.f2667a = new androidx.appcompat.widget.ListPopupWindow.PopupDataSetObserver();
        } else {
            android.widget.ListAdapter listAdapter2 = this.getOutputFormats;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.getOutputFormats = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2667a);
        }
        androidx.appcompat.widget.DropDownListView dropDownListView = this.Camera2StreamConfigurationMap;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.getOutputFormats);
        }
    }

    public void setPromptPosition(int i) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = i;
    }

    public int getPromptPosition() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public void setModal(boolean z) {
        this.coroutineCreation = z;
        this.getHighSpeedVideoSizesFor.setFocusable(z);
    }

    public boolean isModal() {
        return this.coroutineCreation;
    }

    public void setForceIgnoreOutsideTouch(boolean z) {
        this.accessartificialFrame = z;
    }

    public void setDropDownAlwaysVisible(boolean z) {
        this.getInputFormats = z;
    }

    public boolean isDropDownAlwaysVisible() {
        return this.getInputFormats;
    }

    public void setSoftInputMode(int i) {
        this.getHighSpeedVideoSizesFor.setSoftInputMode(i);
    }

    public int getSoftInputMode() {
        return this.getHighSpeedVideoSizesFor.getSoftInputMode();
    }

    public void setListSelector(android.graphics.drawable.Drawable drawable) {
        this.getOutputSizeshNQ4ISI = drawable;
    }

    public android.graphics.drawable.Drawable getBackground() {
        return this.getHighSpeedVideoSizesFor.getBackground();
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoSizesFor.setBackgroundDrawable(drawable);
    }

    public void setAnimationStyle(int i) {
        this.getHighSpeedVideoSizesFor.setAnimationStyle(i);
    }

    public int getAnimationStyle() {
        return this.getHighSpeedVideoSizesFor.getAnimationStyle();
    }

    public android.view.View getAnchorView() {
        return this.getOutputSizes;
    }

    public void setAnchorView(android.view.View view) {
        this.getOutputSizes = view;
    }

    public int getHorizontalOffset() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setHorizontalOffset(int i) {
        this.getOutputStallDurationlomOqCM = i;
    }

    public int getVerticalOffset() {
        if (this.isOutputSupportedFor) {
            return this.isOutputSupportedForhNQ4ISI;
        }
        return 0;
    }

    public void setVerticalOffset(int i) {
        this.isOutputSupportedForhNQ4ISI = i;
        this.isOutputSupportedFor = true;
    }

    public void setEpicenterBounds(android.graphics.Rect rect) {
        this.toString = rect != null ? new android.graphics.Rect(rect) : null;
    }

    public android.graphics.Rect getEpicenterBounds() {
        if (this.toString != null) {
            return new android.graphics.Rect(this.toString);
        }
        return null;
    }

    public void setDropDownGravity(int i) {
        this.getOutputStallDuration = i;
    }

    public int getWidth() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public void setWidth(int i) {
        this.getValidOutputFormatsForInputhNQ4ISI = i;
    }

    public void setContentWidth(int i) {
        android.graphics.drawable.Drawable background = this.getHighSpeedVideoSizesFor.getBackground();
        if (background != null) {
            background.getPadding(this.AMEXKernel);
            this.getValidOutputFormatsForInputhNQ4ISI = this.AMEXKernel.left + this.AMEXKernel.right + i;
        } else {
            setWidth(i);
        }
    }

    public int getHeight() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setHeight(int i) {
        if (i < 0 && -2 != i && -1 != i) {
            throw new java.lang.IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.getOutputMinFrameDurationlomOqCM = i;
    }

    public void setWindowLayoutType(int i) {
        this.unwrapAs = i;
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.ArtificialStackFrames = onItemClickListener;
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.coroutineBoundary = onItemSelectedListener;
    }

    public void setPromptView(android.view.View view) {
        boolean isShowing = isShowing();
        if (isShowing) {
            getHighSpeedVideoFpsRangesFor();
        }
        this._BOUNDARY = view;
        if (isShowing) {
            show();
        }
    }

    public void postShow() {
        this.getHighSpeedVideoFpsRanges.post(this.d);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        boolean isInputMethodNotNeeded = isInputMethodNotNeeded();
        androidx.core.widget.PopupWindowCompat.setWindowLayoutType(this.getHighSpeedVideoSizesFor, this.unwrapAs);
        boolean z = false;
        if (this.getHighSpeedVideoSizesFor.isShowing()) {
            if (getAnchorView().isAttachedToWindow()) {
                int i = this.getValidOutputFormatsForInputhNQ4ISI;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = getAnchorView().getWidth();
                }
                int i2 = this.getOutputMinFrameDurationlomOqCM;
                if (i2 == -1) {
                    if (!isInputMethodNotNeeded) {
                        highSpeedVideoFpsRanges = -1;
                    }
                    if (isInputMethodNotNeeded) {
                        this.getHighSpeedVideoSizesFor.setWidth(this.getValidOutputFormatsForInputhNQ4ISI == -1 ? -1 : 0);
                        this.getHighSpeedVideoSizesFor.setHeight(0);
                    } else {
                        this.getHighSpeedVideoSizesFor.setWidth(this.getValidOutputFormatsForInputhNQ4ISI == -1 ? -1 : 0);
                        this.getHighSpeedVideoSizesFor.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    highSpeedVideoFpsRanges = i2;
                }
                android.widget.PopupWindow popupWindow = this.getHighSpeedVideoSizesFor;
                if (!this.accessartificialFrame && !this.getInputFormats) {
                    z = true;
                }
                popupWindow.setOutsideTouchable(z);
                this.getHighSpeedVideoSizesFor.update(getAnchorView(), this.getOutputStallDurationlomOqCM, this.isOutputSupportedForhNQ4ISI, i < 0 ? -1 : i, highSpeedVideoFpsRanges < 0 ? -1 : highSpeedVideoFpsRanges);
                return;
            }
            return;
        }
        int i3 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = getAnchorView().getWidth();
        }
        int i4 = this.getOutputMinFrameDurationlomOqCM;
        if (i4 == -1) {
            highSpeedVideoFpsRanges = -1;
        } else if (i4 != -2) {
            highSpeedVideoFpsRanges = i4;
        }
        this.getHighSpeedVideoSizesFor.setWidth(i3);
        this.getHighSpeedVideoSizesFor.setHeight(highSpeedVideoFpsRanges);
        getHighSpeedVideoFpsRanges(true);
        android.widget.PopupWindow popupWindow2 = this.getHighSpeedVideoSizesFor;
        if (!this.accessartificialFrame && !this.getInputFormats) {
            z = true;
        }
        popupWindow2.setOutsideTouchable(z);
        this.getHighSpeedVideoSizesFor.setTouchInterceptor(this.kernelVersion);
        if (this._CREATION) {
            androidx.core.widget.PopupWindowCompat.setOverlapAnchor(this.getHighSpeedVideoSizesFor, this.b);
        }
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = getHighSpeedVideoSizes;
            if (method != null) {
                try {
                    method.invoke(this.getHighSpeedVideoSizesFor, this.toString);
                } catch (java.lang.Exception unused) {
                }
            }
        } else {
            androidx.appcompat.widget.ListPopupWindow.Api29Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor, this.toString);
        }
        androidx.core.widget.PopupWindowCompat.showAsDropDown(this.getHighSpeedVideoSizesFor, getAnchorView(), this.getOutputStallDurationlomOqCM, this.isOutputSupportedForhNQ4ISI, this.getOutputStallDuration);
        this.Camera2StreamConfigurationMap.setSelection(-1);
        if (!this.coroutineCreation || this.Camera2StreamConfigurationMap.isInTouchMode()) {
            clearListSelection();
        }
        if (this.coroutineCreation) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.post(this.CoroutineDebuggingKt);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.getHighSpeedVideoSizesFor.dismiss();
        getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoSizesFor.setContentView(null);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges.removeCallbacks(this.getOutputMinFrameDuration);
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.getHighSpeedVideoSizesFor.setOnDismissListener(onDismissListener);
    }

    private void getHighSpeedVideoFpsRangesFor() {
        android.view.View view = this._BOUNDARY;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this._BOUNDARY);
            }
        }
    }

    public void setInputMethodMode(int i) {
        this.getHighSpeedVideoSizesFor.setInputMethodMode(i);
    }

    public int getInputMethodMode() {
        return this.getHighSpeedVideoSizesFor.getInputMethodMode();
    }

    public void setSelection(int i) {
        androidx.appcompat.widget.DropDownListView dropDownListView = this.Camera2StreamConfigurationMap;
        if (!isShowing() || dropDownListView == null) {
            return;
        }
        dropDownListView.getHighSpeedVideoFpsRangesFor = false;
        dropDownListView.setSelection(i);
        if (dropDownListView.getChoiceMode() != 0) {
            dropDownListView.setItemChecked(i, true);
        }
    }

    public void clearListSelection() {
        androidx.appcompat.widget.DropDownListView dropDownListView = this.Camera2StreamConfigurationMap;
        if (dropDownListView != null) {
            dropDownListView.getHighSpeedVideoFpsRangesFor = true;
            dropDownListView.requestLayout();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.getHighSpeedVideoSizesFor.isShowing();
    }

    public boolean isInputMethodNotNeeded() {
        return this.getHighSpeedVideoSizesFor.getInputMethodMode() == 2;
    }

    public boolean performItemClick(int i) {
        if (!isShowing()) {
            return false;
        }
        if (this.ArtificialStackFrames == null) {
            return true;
        }
        androidx.appcompat.widget.DropDownListView dropDownListView = this.Camera2StreamConfigurationMap;
        this.ArtificialStackFrames.onItemClick(dropDownListView, dropDownListView.getChildAt(i - dropDownListView.getFirstVisiblePosition()), i, dropDownListView.getAdapter().getItemId(i));
        return true;
    }

    public java.lang.Object getSelectedItem() {
        if (isShowing()) {
            return this.Camera2StreamConfigurationMap.getSelectedItem();
        }
        return null;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.Camera2StreamConfigurationMap.getSelectedItemPosition();
        }
        return -1;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.Camera2StreamConfigurationMap.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public android.view.View getSelectedView() {
        if (isShowing()) {
            return this.Camera2StreamConfigurationMap.getSelectedView();
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public android.widget.ListView getListView() {
        return this.Camera2StreamConfigurationMap;
    }

    androidx.appcompat.widget.DropDownListView getHighSpeedVideoSizes(android.content.Context context, boolean z) {
        return new androidx.appcompat.widget.DropDownListView(context, z);
    }

    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        int i2;
        int i3;
        if (isShowing() && i != 62 && (this.Camera2StreamConfigurationMap.getSelectedItemPosition() >= 0 || !getHighResolutionOutputSizeshNQ4ISI(i))) {
            int selectedItemPosition = this.Camera2StreamConfigurationMap.getSelectedItemPosition();
            boolean isAboveAnchor = this.getHighSpeedVideoSizesFor.isAboveAnchor();
            android.widget.ListAdapter listAdapter = this.getOutputFormats;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                i2 = areAllItemsEnabled ? 0 : this.Camera2StreamConfigurationMap.lookForSelectablePosition(0, true);
                if (areAllItemsEnabled) {
                    i3 = listAdapter.getCount() - 1;
                } else {
                    i3 = this.Camera2StreamConfigurationMap.lookForSelectablePosition(listAdapter.getCount() - 1, false);
                }
            } else {
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
            }
            if ((!isAboveAnchor && i == 19 && selectedItemPosition <= i2) || (isAboveAnchor && i == 20 && selectedItemPosition >= i3)) {
                clearListSelection();
                this.getHighSpeedVideoSizesFor.setInputMethodMode(1);
                show();
                return true;
            }
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = false;
            if (this.Camera2StreamConfigurationMap.onKeyDown(i, keyEvent)) {
                this.getHighSpeedVideoSizesFor.setInputMethodMode(2);
                this.Camera2StreamConfigurationMap.requestFocusFromTouch();
                show();
                if (i == 19 || i == 20 || i == 23 || i == 66) {
                    return true;
                }
            } else if (isAboveAnchor || i != 20) {
                if (isAboveAnchor && i == 19 && selectedItemPosition == i2) {
                    return true;
                }
            } else if (selectedItemPosition == i3) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (!isShowing() || this.Camera2StreamConfigurationMap.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.Camera2StreamConfigurationMap.onKeyUp(i, keyEvent);
        if (onKeyUp && getHighResolutionOutputSizeshNQ4ISI(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
        if (i != 4 || !isShowing()) {
            return false;
        }
        android.view.View view = this.getOutputSizes;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            android.view.KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        android.view.KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public android.view.View.OnTouchListener createDragToOpenListener(android.view.View view) {
        return new androidx.appcompat.widget.ForwardingListener(view) { // from class: androidx.appcompat.widget.ListPopupWindow.1
            @Override // androidx.appcompat.widget.ForwardingListener
            public /* bridge */ /* synthetic */ androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                return androidx.appcompat.widget.ListPopupWindow.this;
            }
        };
    }

    private int getHighSpeedVideoFpsRanges() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        if (this.Camera2StreamConfigurationMap == null) {
            android.content.Context context = this.getInputSizeshNQ4ISI;
            this.d = new java.lang.Runnable() { // from class: androidx.appcompat.widget.ListPopupWindow.2
                @Override // java.lang.Runnable
                public void run() {
                    android.view.View anchorView = androidx.appcompat.widget.ListPopupWindow.this.getAnchorView();
                    if (anchorView == null || anchorView.getWindowToken() == null) {
                        return;
                    }
                    androidx.appcompat.widget.ListPopupWindow.this.show();
                }
            };
            androidx.appcompat.widget.DropDownListView highSpeedVideoSizes = getHighSpeedVideoSizes(context, !this.coroutineCreation);
            this.Camera2StreamConfigurationMap = highSpeedVideoSizes;
            android.graphics.drawable.Drawable drawable = this.getOutputSizeshNQ4ISI;
            if (drawable != null) {
                highSpeedVideoSizes.setSelector(drawable);
            }
            this.Camera2StreamConfigurationMap.setAdapter(this.getOutputFormats);
            this.Camera2StreamConfigurationMap.setOnItemClickListener(this.ArtificialStackFrames);
            this.Camera2StreamConfigurationMap.setFocusable(true);
            this.Camera2StreamConfigurationMap.setFocusableInTouchMode(true);
            this.Camera2StreamConfigurationMap.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i4, long j) {
                    androidx.appcompat.widget.DropDownListView dropDownListView;
                    if (i4 == -1 || (dropDownListView = androidx.appcompat.widget.ListPopupWindow.this.Camera2StreamConfigurationMap) == null) {
                        return;
                    }
                    dropDownListView.getHighSpeedVideoFpsRangesFor = false;
                }
            });
            this.Camera2StreamConfigurationMap.setOnScrollListener(this.init);
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.coroutineBoundary;
            if (onItemSelectedListener != null) {
                this.Camera2StreamConfigurationMap.setOnItemSelectedListener(onItemSelectedListener);
            }
            android.view.View view = this.Camera2StreamConfigurationMap;
            android.view.View view2 = this._BOUNDARY;
            if (view2 != null) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
                linearLayout.setOrientation(1);
                android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i4 == 1) {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.getValidOutputFormatsForInputhNQ4ISI;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
            }
            this.getHighSpeedVideoSizesFor.setContentView(view);
        } else {
            android.view.View view3 = this._BOUNDARY;
            if (view3 != null) {
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        android.graphics.drawable.Drawable background = this.getHighSpeedVideoSizesFor.getBackground();
        if (background != null) {
            background.getPadding(this.AMEXKernel);
            i2 = this.AMEXKernel.top + this.AMEXKernel.bottom;
            if (!this.isOutputSupportedFor) {
                this.isOutputSupportedForhNQ4ISI = -this.AMEXKernel.top;
            }
        } else {
            this.AMEXKernel.setEmpty();
            i2 = 0;
        }
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getAnchorView(), this.isOutputSupportedForhNQ4ISI, this.getHighSpeedVideoSizesFor.getInputMethodMode() == 2);
        if (this.getInputFormats || this.getOutputMinFrameDurationlomOqCM == -1) {
            return Camera2StreamConfigurationMap + i2;
        }
        int i6 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i6 == -2) {
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.getInputSizeshNQ4ISI.getResources().getDisplayMetrics().widthPixels - (this.AMEXKernel.left + this.AMEXKernel.right), Integer.MIN_VALUE);
        } else if (i6 == -1) {
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.getInputSizeshNQ4ISI.getResources().getDisplayMetrics().widthPixels - (this.AMEXKernel.left + this.AMEXKernel.right), 1073741824);
        } else {
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        int measureHeightOfChildrenCompat = this.Camera2StreamConfigurationMap.measureHeightOfChildrenCompat(makeMeasureSpec, 0, -1, Camera2StreamConfigurationMap - i, -1);
        if (measureHeightOfChildrenCompat > 0) {
            i += i2 + this.Camera2StreamConfigurationMap.getPaddingTop() + this.Camera2StreamConfigurationMap.getPaddingBottom();
        }
        return measureHeightOfChildrenCompat + i;
    }

    public void setOverlapAnchor(boolean z) {
        this._CREATION = true;
        this.b = z;
    }

    class PopupDataSetObserver extends android.database.DataSetObserver {
        PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (androidx.appcompat.widget.ListPopupWindow.this.isShowing()) {
                androidx.appcompat.widget.ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            androidx.appcompat.widget.ListPopupWindow.this.dismiss();
        }
    }

    class ListSelectorHider implements java.lang.Runnable {
        ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.ListPopupWindow.this.clearListSelection();
        }
    }

    class ResizePopupRunnable implements java.lang.Runnable {
        ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (androidx.appcompat.widget.ListPopupWindow.this.Camera2StreamConfigurationMap == null || !androidx.appcompat.widget.ListPopupWindow.this.Camera2StreamConfigurationMap.isAttachedToWindow() || androidx.appcompat.widget.ListPopupWindow.this.Camera2StreamConfigurationMap.getCount() <= androidx.appcompat.widget.ListPopupWindow.this.Camera2StreamConfigurationMap.getChildCount() || androidx.appcompat.widget.ListPopupWindow.this.Camera2StreamConfigurationMap.getChildCount() > androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoSizesFor.setInputMethodMode(2);
            androidx.appcompat.widget.ListPopupWindow.this.show();
        }
    }

    class PopupTouchInterceptor implements android.view.View.OnTouchListener {
        PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoSizesFor != null && androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoSizesFor.isShowing() && x >= 0 && x < androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoSizesFor.getWidth() && y >= 0 && y < androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoSizesFor.getHeight()) {
                androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoFpsRanges.postDelayed(androidx.appcompat.widget.ListPopupWindow.this.getOutputMinFrameDuration, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoFpsRanges.removeCallbacks(androidx.appcompat.widget.ListPopupWindow.this.getOutputMinFrameDuration);
            return false;
        }
    }

    class PopupScrollListener implements android.widget.AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
        }

        PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
            if (i != 1 || androidx.appcompat.widget.ListPopupWindow.this.isInputMethodNotNeeded() || androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoSizesFor.getContentView() == null) {
                return;
            }
            androidx.appcompat.widget.ListPopupWindow.this.getHighSpeedVideoFpsRanges.removeCallbacks(androidx.appcompat.widget.ListPopupWindow.this.getOutputMinFrameDuration);
            androidx.appcompat.widget.ListPopupWindow.this.getOutputMinFrameDuration.run();
        }
    }

    private void getHighSpeedVideoFpsRanges(boolean z) {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = getHighResolutionOutputSizeshNQ4ISI;
            if (method != null) {
                try {
                    method.invoke(this.getHighSpeedVideoSizesFor, java.lang.Boolean.valueOf(z));
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            }
            return;
        }
        androidx.appcompat.widget.ListPopupWindow.Api29Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, z);
    }

    private int Camera2StreamConfigurationMap(android.view.View view, int i, boolean z) {
        return androidx.appcompat.widget.ListPopupWindow.Api24Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, view, i, z);
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoSizes(android.widget.PopupWindow popupWindow, android.graphics.Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void Camera2StreamConfigurationMap(android.widget.PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static int Camera2StreamConfigurationMap(android.widget.PopupWindow popupWindow, android.view.View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }
}
