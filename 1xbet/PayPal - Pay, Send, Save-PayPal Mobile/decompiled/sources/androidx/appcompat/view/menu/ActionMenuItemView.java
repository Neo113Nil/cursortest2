package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.AppCompatTextView implements androidx.appcompat.view.menu.MenuView.ItemView, android.view.View.OnClickListener, androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
    private boolean Camera2StreamConfigurationMap;
    androidx.appcompat.view.menu.MenuBuilder.ItemInvoker getHighResolutionOutputSizeshNQ4ISI;
    androidx.appcompat.view.menu.MenuItemImpl getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private androidx.appcompat.widget.ForwardingListener getInputFormats;
    private int getInputSizeshNQ4ISI;
    private android.graphics.drawable.Drawable getOutputFormats;
    private int getOutputMinFrameDuration;
    private java.lang.CharSequence getOutputStallDuration;

    public static abstract class PopupCallback {
        public abstract androidx.appcompat.view.menu.ShowableListMenu getPopup();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(android.content.Context context) {
        this(context, null);
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.Resources resources = context.getResources();
        this.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ActionMenuItemView, i, 0);
        this.getOutputMinFrameDuration = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.getHighSpeedVideoSizesFor = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.getInputSizeshNQ4ISI = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes();
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.Button.class.getName();
    }

    private boolean getHighSpeedVideoFpsRanges() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.getInputSizeshNQ4ISI = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, int i) {
        java.lang.CharSequence title;
        this.getHighSpeedVideoFpsRanges = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        if (prefersCondensedTitle()) {
            title = menuItemImpl.getTitleCondensed();
        } else {
            title = menuItemImpl.getTitle();
        }
        setTitle(title);
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.getInputFormats == null) {
            this.getInputFormats = new androidx.appcompat.view.menu.ActionMenuItemView.ActionMenuItemForwardingListener();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.ForwardingListener forwardingListener;
        if (this.getHighSpeedVideoFpsRanges.hasSubMenu() && (forwardingListener = this.getInputFormats) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.appcompat.view.menu.MenuBuilder.ItemInvoker itemInvoker = this.getHighResolutionOutputSizeshNQ4ISI;
        if (itemInvoker != null) {
            itemInvoker.invokeItem(this.getHighSpeedVideoFpsRanges);
        }
    }

    public void setItemInvoker(androidx.appcompat.view.menu.MenuBuilder.ItemInvoker itemInvoker) {
        this.getHighResolutionOutputSizeshNQ4ISI = itemInvoker;
    }

    public void setPopupCallback(androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback popupCallback) {
        this.getHighSpeedVideoSizes = popupCallback;
    }

    public void setExpandedFormat(boolean z) {
        if (this.getHighSpeedVideoFpsRangesFor != z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.getHighSpeedVideoFpsRanges;
            if (menuItemImpl != null) {
                menuItemImpl.actionFormatChanged();
            }
        }
    }

    private void getHighSpeedVideoSizes() {
        boolean z = (!android.text.TextUtils.isEmpty(this.getOutputStallDuration)) & (this.getOutputFormats == null || (this.getHighSpeedVideoFpsRanges.showsTextAsAction() && (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoFpsRangesFor)));
        setText(z ? this.getOutputStallDuration : null);
        java.lang.CharSequence contentDescription = this.getHighSpeedVideoFpsRanges.getContentDescription();
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z ? null : this.getHighSpeedVideoFpsRanges.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        java.lang.CharSequence tooltipText = this.getHighSpeedVideoFpsRanges.getTooltipText();
        if (android.text.TextUtils.isEmpty(tooltipText)) {
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this, z ? null : this.getHighSpeedVideoFpsRanges.getTitle());
        } else {
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.getOutputFormats = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.getHighSpeedVideoSizesFor;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        getHighSpeedVideoSizes();
    }

    public boolean hasText() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence charSequence) {
        this.getOutputStallDuration = charSequence;
        getHighSpeedVideoSizes();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return hasText() && this.getHighSpeedVideoFpsRanges.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return hasText();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean hasText = hasText();
        if (hasText && (i4 = this.getInputSizeshNQ4ISI) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = java.lang.Math.min(size, this.getOutputMinFrameDuration);
        } else {
            i3 = this.getOutputMinFrameDuration;
        }
        if (mode != 1073741824 && this.getOutputMinFrameDuration > 0 && measuredWidth < i3) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (hasText || this.getOutputFormats == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.getOutputFormats.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    class ActionMenuItemForwardingListener extends androidx.appcompat.widget.ForwardingListener {
        public ActionMenuItemForwardingListener() {
            super(androidx.appcompat.view.menu.ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
            if (androidx.appcompat.view.menu.ActionMenuItemView.this.getHighSpeedVideoSizes != null) {
                return androidx.appcompat.view.menu.ActionMenuItemView.this.getHighSpeedVideoSizes.getPopup();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStarted() {
            androidx.appcompat.view.menu.ShowableListMenu popup;
            return androidx.appcompat.view.menu.ActionMenuItemView.this.getHighResolutionOutputSizeshNQ4ISI != null && androidx.appcompat.view.menu.ActionMenuItemView.this.getHighResolutionOutputSizeshNQ4ISI.invokeItem(androidx.appcompat.view.menu.ActionMenuItemView.this.getHighSpeedVideoFpsRanges) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
