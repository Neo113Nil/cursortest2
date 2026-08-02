package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatSpinner extends android.widget.Spinner implements androidx.core.view.TintableBackgroundView {
    private static final int[] getHighSpeedVideoSizes = {android.R.attr.spinnerMode};
    final android.graphics.Rect Camera2StreamConfigurationMap;
    private androidx.appcompat.widget.ForwardingListener getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighSpeedVideoSizesFor;
    private final boolean getInputFormats;
    private androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup getInputSizeshNQ4ISI;
    private android.widget.SpinnerAdapter getOutputFormats;

    interface SpinnerPopup {
        java.lang.CharSequence Camera2StreamConfigurationMap();

        void dismiss();

        android.graphics.drawable.Drawable getBackground();

        void getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence);

        void getHighSpeedVideoFpsRangesFor(int i, int i2);

        void getHighSpeedVideoSizes(int i);

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(android.widget.ListAdapter listAdapter);

        void setBackgroundDrawable(android.graphics.drawable.Drawable drawable);

        void setHorizontalOffset(int i);

        void setVerticalOffset(int i);
    }

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatSpinner> {
        private int Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private int getHighSpeedVideoFpsRanges;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.Camera2StreamConfigurationMap = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatSpinner appCompatSpinner, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.getHighSpeedVideoFpsRanges, appCompatSpinner.getBackgroundTintList());
            propertyReader.readObject(this.Camera2StreamConfigurationMap, appCompatSpinner.getBackgroundTintMode());
        }
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        setAdapter(spinnerAdapter);
    }

    public AppCompatSpinner(android.content.Context context) {
        this(context, (android.util.AttributeSet) null);
    }

    public AppCompatSpinner(android.content.Context context, int i) {
        this(context, null, androidx.appcompat.R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r10 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r10.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r10 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, android.content.res.Resources.Theme theme) {
        super(context, attributeSet, i);
        android.content.res.TypedArray typedArray;
        this.Camera2StreamConfigurationMap = new android.graphics.Rect();
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.Spinner, i, 0);
        this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        if (theme != null) {
            this.getHighSpeedVideoSizesFor = new androidx.appcompat.view.ContextThemeWrapper(context, theme);
        } else {
            int resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Spinner_popupTheme, 0);
            if (resourceId != 0) {
                this.getHighSpeedVideoSizesFor = new androidx.appcompat.view.ContextThemeWrapper(context, resourceId);
            } else {
                this.getHighSpeedVideoSizesFor = context;
            }
        }
        android.content.res.TypedArray typedArray2 = null;
        if (i2 == -1) {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, getHighSpeedVideoSizes, i, 0);
                try {
                    i2 = typedArray.hasValue(0) ? typedArray.getInt(0, 0) : i2;
                } catch (java.lang.Exception unused) {
                } catch (java.lang.Throwable th) {
                    th = th;
                    typedArray2 = typedArray;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (java.lang.Exception unused2) {
                typedArray = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        if (i2 == 0) {
            androidx.appcompat.widget.AppCompatSpinner.DialogPopup dialogPopup = new androidx.appcompat.widget.AppCompatSpinner.DialogPopup();
            this.getInputSizeshNQ4ISI = dialogPopup;
            dialogPopup.getHighResolutionOutputSizeshNQ4ISI(obtainStyledAttributes.getString(androidx.appcompat.R.styleable.Spinner_android_prompt));
        } else if (i2 == 1) {
            final androidx.appcompat.widget.AppCompatSpinner.DropdownPopup dropdownPopup = new androidx.appcompat.widget.AppCompatSpinner.DropdownPopup(this.getHighSpeedVideoSizesFor, attributeSet, i);
            androidx.appcompat.widget.TintTypedArray obtainStyledAttributes2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.getHighSpeedVideoSizesFor, attributeSet, androidx.appcompat.R.styleable.Spinner, i, 0);
            this.getHighSpeedVideoFpsRanges = obtainStyledAttributes2.getLayoutDimension(androidx.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
            dropdownPopup.setBackgroundDrawable(obtainStyledAttributes2.getDrawable(androidx.appcompat.R.styleable.Spinner_android_popupBackground));
            dropdownPopup.getHighResolutionOutputSizeshNQ4ISI(obtainStyledAttributes.getString(androidx.appcompat.R.styleable.Spinner_android_prompt));
            obtainStyledAttributes2.recycle();
            this.getInputSizeshNQ4ISI = dropdownPopup;
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.appcompat.widget.ForwardingListener(this) { // from class: androidx.appcompat.widget.AppCompatSpinner.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                    return dropdownPopup;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    if (androidx.appcompat.widget.AppCompatSpinner.this.getHighSpeedVideoSizes().isShowing()) {
                        return true;
                    }
                    androidx.appcompat.widget.AppCompatSpinner.this.getHighSpeedVideoFpsRangesFor();
                    return true;
                }
            };
        }
        java.lang.CharSequence[] textArray = obtainStyledAttributes.getTextArray(androidx.appcompat.R.styleable.Spinner_android_entries);
        if (textArray != null) {
            android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
        }
        obtainStyledAttributes.recycle();
        this.getInputFormats = true;
        android.widget.SpinnerAdapter spinnerAdapter = this.getOutputFormats;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.getOutputFormats = null;
        }
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup != null) {
            spinnerPopup.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup != null) {
            return spinnerPopup.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup != null) {
            spinnerPopup.setVerticalOffset(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup != null) {
            return spinnerPopup.getVerticalOffset();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup != null) {
            spinnerPopup.getHighSpeedVideoSizes(i);
            this.getInputSizeshNQ4ISI.setHorizontalOffset(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup != null) {
            return spinnerPopup.getHorizontalOffset();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.getInputSizeshNQ4ISI != null) {
            this.getHighSpeedVideoFpsRanges = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.getInputSizeshNQ4ISI != null) {
            return this.getHighSpeedVideoFpsRanges;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.getInputFormats) {
            this.getOutputFormats = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.getInputSizeshNQ4ISI != null) {
            android.content.Context context = this.getHighSpeedVideoSizesFor;
            if (context == null) {
                context = getContext();
            }
            this.getInputSizeshNQ4ISI.setAdapter(new androidx.appcompat.widget.AppCompatSpinner.DropDownAdapter(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup == null || !spinnerPopup.isShowing()) {
            return;
        }
        this.getInputSizeshNQ4ISI.dismiss();
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.ForwardingListener forwardingListener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.getInputSizeshNQ4ISI == null || android.view.View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), getHighSpeedVideoSizes(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup != null) {
            if (spinnerPopup.isShowing()) {
                return true;
            }
            getHighSpeedVideoFpsRangesFor();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        if (spinnerPopup != null) {
            spinnerPopup.getHighResolutionOutputSizeshNQ4ISI(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        return spinnerPopup != null ? spinnerPopup.Camera2StreamConfigurationMap() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(drawable);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.Camera2StreamConfigurationMap();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoSizes(mode);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges();
        }
    }

    int getHighSpeedVideoSizes(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = java.lang.Math.max(0, getSelectedItemPosition());
        int min = java.lang.Math.min(spinnerAdapter.getCount(), max + 15);
        android.view.View view = null;
        int i2 = 0;
        for (int max2 = java.lang.Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = java.lang.Math.max(i, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i;
        }
        drawable.getPadding(this.Camera2StreamConfigurationMap);
        return i + this.Camera2StreamConfigurationMap.left + this.Camera2StreamConfigurationMap.right;
    }

    final androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup getHighSpeedVideoSizes() {
        return this.getInputSizeshNQ4ISI;
    }

    void getHighSpeedVideoFpsRangesFor() {
        this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.AppCompatSpinner.SavedState savedState = new androidx.appcompat.widget.AppCompatSpinner.SavedState(super.onSaveInstanceState());
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.getInputSizeshNQ4ISI;
        savedState.Camera2StreamConfigurationMap = spinnerPopup != null && spinnerPopup.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.ViewTreeObserver viewTreeObserver;
        androidx.appcompat.widget.AppCompatSpinner.SavedState savedState = (androidx.appcompat.widget.AppCompatSpinner.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.Camera2StreamConfigurationMap || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!androidx.appcompat.widget.AppCompatSpinner.this.getHighSpeedVideoSizes().isShowing()) {
                    androidx.appcompat.widget.AppCompatSpinner.this.getHighSpeedVideoFpsRangesFor();
                }
                android.view.ViewTreeObserver viewTreeObserver2 = androidx.appcompat.widget.AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.AppCompatSpinner.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.appcompat.widget.AppCompatSpinner.SavedState>() { // from class: androidx.appcompat.widget.AppCompatSpinner.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.AppCompatSpinner.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.AppCompatSpinner.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.AppCompatSpinner.SavedState[] newArray(int i) {
                return new androidx.appcompat.widget.AppCompatSpinner.SavedState[i];
            }
        };
        boolean Camera2StreamConfigurationMap;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.Camera2StreamConfigurationMap = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.Camera2StreamConfigurationMap ? (byte) 1 : (byte) 0);
        }
    }

    static class DropDownAdapter implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
        private android.widget.ListAdapter getHighSpeedVideoFpsRangesFor;
        private android.widget.SpinnerAdapter getHighSpeedVideoSizes;

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        public DropDownAdapter(android.widget.SpinnerAdapter spinnerAdapter, android.content.res.Resources.Theme theme) {
            this.getHighSpeedVideoSizes = spinnerAdapter;
            if (spinnerAdapter instanceof android.widget.ListAdapter) {
                this.getHighSpeedVideoFpsRangesFor = (android.widget.ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    androidx.appcompat.widget.AppCompatSpinner.Api23Impl.Camera2StreamConfigurationMap((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof androidx.appcompat.widget.ThemedSpinnerAdapter) {
                    androidx.appcompat.widget.ThemedSpinnerAdapter themedSpinnerAdapter = (androidx.appcompat.widget.ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            android.widget.SpinnerAdapter spinnerAdapter = this.getHighSpeedVideoSizes;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i) {
            android.widget.SpinnerAdapter spinnerAdapter = this.getHighSpeedVideoSizes;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            android.widget.SpinnerAdapter spinnerAdapter = this.getHighSpeedVideoSizes;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            android.widget.SpinnerAdapter spinnerAdapter = this.getHighSpeedVideoSizes;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            android.widget.SpinnerAdapter spinnerAdapter = this.getHighSpeedVideoSizes;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            android.widget.SpinnerAdapter spinnerAdapter = this.getHighSpeedVideoSizes;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            android.widget.SpinnerAdapter spinnerAdapter = this.getHighSpeedVideoSizes;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            android.widget.ListAdapter listAdapter = this.getHighSpeedVideoFpsRangesFor;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            android.widget.ListAdapter listAdapter = this.getHighSpeedVideoFpsRangesFor;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    class DialogPopup implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup, android.content.DialogInterface.OnClickListener {
        private java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
        androidx.appcompat.app.AlertDialog getHighSpeedVideoFpsRangesFor;
        private android.widget.ListAdapter getHighSpeedVideoSizes;

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public android.graphics.drawable.Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void getHighSpeedVideoSizes(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getVerticalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOffset(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setVerticalOffset(int i) {
        }

        DialogPopup() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void dismiss() {
            androidx.appcompat.app.AlertDialog alertDialog = this.getHighSpeedVideoFpsRangesFor;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public boolean isShowing() {
            androidx.appcompat.app.AlertDialog alertDialog = this.getHighSpeedVideoFpsRangesFor;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter listAdapter) {
            this.getHighSpeedVideoSizes = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
            this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            if (this.getHighSpeedVideoSizes == null) {
                return;
            }
            androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(androidx.appcompat.widget.AppCompatSpinner.this.getPopupContext());
            java.lang.CharSequence charSequence = this.getHighResolutionOutputSizeshNQ4ISI;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            androidx.appcompat.app.AlertDialog create = builder.setSingleChoiceItems(this.getHighSpeedVideoSizes, androidx.appcompat.widget.AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.getHighSpeedVideoFpsRangesFor = create;
            android.widget.ListView listView = create.getListView();
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.getHighSpeedVideoFpsRangesFor.show();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            androidx.appcompat.widget.AppCompatSpinner.this.setSelection(i);
            if (androidx.appcompat.widget.AppCompatSpinner.this.getOnItemClickListener() != null) {
                androidx.appcompat.widget.AppCompatSpinner.this.performItemClick(null, i, this.getHighSpeedVideoSizes.getItemId(i));
            }
            dismiss();
        }
    }

    class DropdownPopup extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup {
        android.widget.ListAdapter getHighResolutionOutputSizeshNQ4ISI;
        private final android.graphics.Rect getInputFormats;
        private java.lang.CharSequence getInputSizeshNQ4ISI;
        private int getOutputFormats;

        public DropdownPopup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.getInputFormats = new android.graphics.Rect();
            setAnchorView(androidx.appcompat.widget.AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j) {
                    androidx.appcompat.widget.AppCompatSpinner.this.setSelection(i2);
                    if (androidx.appcompat.widget.AppCompatSpinner.this.getOnItemClickListener() != null) {
                        androidx.appcompat.widget.AppCompatSpinner.this.performItemClick(view, i2, androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this.getHighResolutionOutputSizeshNQ4ISI.getItemId(i2));
                    }
                    androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this.dismiss();
                }
            });
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.getHighResolutionOutputSizeshNQ4ISI = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence Camera2StreamConfigurationMap() {
            return this.getInputSizeshNQ4ISI;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
            this.getInputSizeshNQ4ISI = charSequence;
        }

        void getHighSpeedVideoFpsRangesFor() {
            int i;
            int highSpeedVideoFpsRanges;
            android.graphics.drawable.Drawable background = getBackground();
            if (background != null) {
                background.getPadding(androidx.appcompat.widget.AppCompatSpinner.this.Camera2StreamConfigurationMap);
                i = androidx.appcompat.widget.ViewUtils.isLayoutRtl(androidx.appcompat.widget.AppCompatSpinner.this) ? androidx.appcompat.widget.AppCompatSpinner.this.Camera2StreamConfigurationMap.right : -androidx.appcompat.widget.AppCompatSpinner.this.Camera2StreamConfigurationMap.left;
            } else {
                android.graphics.Rect rect = androidx.appcompat.widget.AppCompatSpinner.this.Camera2StreamConfigurationMap;
                androidx.appcompat.widget.AppCompatSpinner.this.Camera2StreamConfigurationMap.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = androidx.appcompat.widget.AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = androidx.appcompat.widget.AppCompatSpinner.this.getPaddingRight();
            int width = androidx.appcompat.widget.AppCompatSpinner.this.getWidth();
            if (androidx.appcompat.widget.AppCompatSpinner.this.getHighSpeedVideoFpsRanges == -2) {
                int highSpeedVideoSizes = androidx.appcompat.widget.AppCompatSpinner.this.getHighSpeedVideoSizes((android.widget.SpinnerAdapter) this.getHighResolutionOutputSizeshNQ4ISI, getBackground());
                int i2 = (androidx.appcompat.widget.AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - androidx.appcompat.widget.AppCompatSpinner.this.Camera2StreamConfigurationMap.left) - androidx.appcompat.widget.AppCompatSpinner.this.Camera2StreamConfigurationMap.right;
                if (highSpeedVideoSizes > i2) {
                    highSpeedVideoSizes = i2;
                }
                setContentWidth(java.lang.Math.max(highSpeedVideoSizes, (width - paddingLeft) - paddingRight));
            } else if (androidx.appcompat.widget.AppCompatSpinner.this.getHighSpeedVideoFpsRanges == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(androidx.appcompat.widget.AppCompatSpinner.this.getHighSpeedVideoFpsRanges);
            }
            if (androidx.appcompat.widget.ViewUtils.isLayoutRtl(androidx.appcompat.widget.AppCompatSpinner.this)) {
                highSpeedVideoFpsRanges = i + (((width - paddingRight) - getWidth()) - getHighSpeedVideoFpsRanges());
            } else {
                highSpeedVideoFpsRanges = i + paddingLeft + getHighSpeedVideoFpsRanges();
            }
            setHorizontalOffset(highSpeedVideoFpsRanges);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            android.view.ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            getHighSpeedVideoFpsRangesFor();
            setInputMethodMode(2);
            super.show();
            android.widget.ListView listView = getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            setSelection(androidx.appcompat.widget.AppCompatSpinner.this.getSelectedItemPosition());
            if (isShowing || (viewTreeObserver = androidx.appcompat.widget.AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            final android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    androidx.appcompat.widget.AppCompatSpinner.DropdownPopup dropdownPopup = androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this;
                    if (!dropdownPopup.getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.widget.AppCompatSpinner.this)) {
                        androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this.dismiss();
                    } else {
                        androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this.getHighSpeedVideoFpsRangesFor();
                        androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.super.show();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    android.view.ViewTreeObserver viewTreeObserver2 = androidx.appcompat.widget.AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }

        boolean getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.getInputFormats);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void getHighSpeedVideoSizes(int i) {
            this.getOutputFormats = i;
        }

        public int getHighSpeedVideoFpsRanges() {
            return this.getOutputFormats;
        }
    }

    static final class Api23Impl {
        private Api23Impl() {
        }

        static void Camera2StreamConfigurationMap(android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, android.content.res.Resources.Theme theme) {
            if (androidx.core.util.ObjectsCompat.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
