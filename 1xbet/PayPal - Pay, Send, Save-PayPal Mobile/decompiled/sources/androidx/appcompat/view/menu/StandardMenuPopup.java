package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
final class StandardMenuPopup extends androidx.appcompat.view.menu.MenuPopup implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, androidx.appcompat.view.menu.MenuPresenter, android.view.View.OnKeyListener {
    private static final int getHighResolutionOutputSizeshNQ4ISI = androidx.appcompat.R.layout.abc_popup_menu_item_layout;
    private boolean ArtificialStackFrames;
    android.view.ViewTreeObserver Camera2StreamConfigurationMap;
    private boolean accessartificialFrame;
    android.view.View getHighSpeedVideoFpsRangesFor;
    final androidx.appcompat.widget.MenuPopupWindow getHighSpeedVideoSizes;
    private int getInputFormats;
    private android.view.View getOutputFormats;
    private final androidx.appcompat.view.menu.MenuAdapter getOutputMinFrameDuration;
    private final androidx.appcompat.view.menu.MenuBuilder getOutputMinFrameDurationlomOqCM;
    private android.widget.PopupWindow.OnDismissListener getOutputSizes;
    private final android.content.Context getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private androidx.appcompat.view.menu.MenuPresenter.Callback getValidOutputFormatsForInputhNQ4ISI;
    private final int isOutputSupportedFor;
    private final boolean isOutputSupportedForhNQ4ISI;
    private final int toString;
    private final int unwrapAs;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener getHighSpeedVideoFpsRanges = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!androidx.appcompat.view.menu.StandardMenuPopup.this.isShowing() || androidx.appcompat.view.menu.StandardMenuPopup.this.getHighSpeedVideoSizes.isModal()) {
                return;
            }
            android.view.View view = androidx.appcompat.view.menu.StandardMenuPopup.this.getHighSpeedVideoFpsRangesFor;
            if (view == null || !view.isShown()) {
                androidx.appcompat.view.menu.StandardMenuPopup.this.dismiss();
            } else {
                androidx.appcompat.view.menu.StandardMenuPopup.this.getHighSpeedVideoSizes.show();
            }
        }
    };
    private final android.view.View.OnAttachStateChangeListener getHighSpeedVideoSizesFor = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            if (androidx.appcompat.view.menu.StandardMenuPopup.this.Camera2StreamConfigurationMap != null) {
                if (!androidx.appcompat.view.menu.StandardMenuPopup.this.Camera2StreamConfigurationMap.isAlive()) {
                    androidx.appcompat.view.menu.StandardMenuPopup.this.Camera2StreamConfigurationMap = view.getViewTreeObserver();
                }
                androidx.appcompat.view.menu.StandardMenuPopup.this.Camera2StreamConfigurationMap.removeGlobalOnLayoutListener(androidx.appcompat.view.menu.StandardMenuPopup.this.getHighSpeedVideoFpsRanges);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int getOutputStallDurationlomOqCM = 0;

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final android.os.Parcelable onSaveInstanceState() {
        return null;
    }

    public StandardMenuPopup(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view, int i, int i2, boolean z) {
        this.getOutputSizeshNQ4ISI = context;
        this.getOutputMinFrameDurationlomOqCM = menuBuilder;
        this.isOutputSupportedForhNQ4ISI = z;
        this.getOutputMinFrameDuration = new androidx.appcompat.view.menu.MenuAdapter(menuBuilder, android.view.LayoutInflater.from(context), z, getHighResolutionOutputSizeshNQ4ISI);
        this.toString = i;
        this.unwrapAs = i2;
        android.content.res.Resources resources = context.getResources();
        this.isOutputSupportedFor = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_config_prefDialogWidth));
        this.getOutputFormats = view;
        this.getHighSpeedVideoSizes = new androidx.appcompat.widget.MenuPopupWindow(context, null, i, i2);
        menuBuilder.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void Camera2StreamConfigurationMap(boolean z) {
        this.getOutputMinFrameDuration.setForceShowIcon(z);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        this.getOutputStallDurationlomOqCM = i;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if (isShowing()) {
            this.getHighSpeedVideoSizes.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return !this.ArtificialStackFrames && this.getHighSpeedVideoSizes.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.ArtificialStackFrames = true;
        this.getOutputMinFrameDurationlomOqCM.close();
        android.view.ViewTreeObserver viewTreeObserver = this.Camera2StreamConfigurationMap;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.getViewTreeObserver();
            }
            this.Camera2StreamConfigurationMap.removeGlobalOnLayoutListener(this.getHighSpeedVideoFpsRanges);
            this.Camera2StreamConfigurationMap = null;
        }
        this.getHighSpeedVideoFpsRangesFor.removeOnAttachStateChangeListener(this.getHighSpeedVideoSizesFor);
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.getOutputSizes;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z) {
        this.getOutputStallDuration = false;
        androidx.appcompat.view.menu.MenuAdapter menuAdapter = this.getOutputMinFrameDuration;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.getValidOutputFormatsForInputhNQ4ISI = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            androidx.appcompat.view.menu.MenuPopupHelper menuPopupHelper = new androidx.appcompat.view.menu.MenuPopupHelper(this.getOutputSizeshNQ4ISI, subMenuBuilder, this.getHighSpeedVideoFpsRangesFor, this.isOutputSupportedForhNQ4ISI, this.toString, this.unwrapAs);
            menuPopupHelper.setPresenterCallback(this.getValidOutputFormatsForInputhNQ4ISI);
            menuPopupHelper.setForceShowIcon(androidx.appcompat.view.menu.MenuPopup.Camera2StreamConfigurationMap(subMenuBuilder));
            menuPopupHelper.setOnDismissListener(this.getOutputSizes);
            this.getOutputSizes = null;
            this.getOutputMinFrameDurationlomOqCM.close(false);
            int horizontalOffset = this.getHighSpeedVideoSizes.getHorizontalOffset();
            int verticalOffset = this.getHighSpeedVideoSizes.getVerticalOffset();
            if ((android.view.Gravity.getAbsoluteGravity(this.getOutputStallDurationlomOqCM, this.getOutputFormats.getLayoutDirection()) & 7) == 5) {
                horizontalOffset += this.getOutputFormats.getWidth();
            }
            if (menuPopupHelper.tryShow(horizontalOffset, verticalOffset)) {
                androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.getValidOutputFormatsForInputhNQ4ISI;
                if (callback == null) {
                    return true;
                }
                callback.onOpenSubMenu(subMenuBuilder);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder == this.getOutputMinFrameDurationlomOqCM) {
            dismiss();
            androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.getValidOutputFormatsForInputhNQ4ISI;
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
        this.getOutputFormats = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.getOutputSizes = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final android.widget.ListView getListView() {
        return this.getHighSpeedVideoSizes.getListView();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighSpeedVideoSizes(int i) {
        this.getHighSpeedVideoSizes.setHorizontalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighSpeedVideoFpsRanges(int i) {
        this.getHighSpeedVideoSizes.setVerticalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.accessartificialFrame = z;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        android.view.View view;
        if (isShowing()) {
            return;
        }
        if (this.ArtificialStackFrames || (view = this.getOutputFormats) == null) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.getHighSpeedVideoFpsRangesFor = view;
        this.getHighSpeedVideoSizes.setOnDismissListener(this);
        this.getHighSpeedVideoSizes.setOnItemClickListener(this);
        this.getHighSpeedVideoSizes.setModal(true);
        android.view.View view2 = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.Camera2StreamConfigurationMap == null;
        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.Camera2StreamConfigurationMap = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.getHighSpeedVideoFpsRanges);
        }
        view2.addOnAttachStateChangeListener(this.getHighSpeedVideoSizesFor);
        this.getHighSpeedVideoSizes.setAnchorView(view2);
        this.getHighSpeedVideoSizes.setDropDownGravity(this.getOutputStallDurationlomOqCM);
        if (!this.getOutputStallDuration) {
            this.getInputFormats = getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.isOutputSupportedFor);
            this.getOutputStallDuration = true;
        }
        this.getHighSpeedVideoSizes.setContentWidth(this.getInputFormats);
        this.getHighSpeedVideoSizes.setInputMethodMode(2);
        this.getHighSpeedVideoSizes.setEpicenterBounds(this.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes.show();
        android.widget.ListView listView = this.getHighSpeedVideoSizes.getListView();
        listView.setOnKeyListener(this);
        if (this.accessartificialFrame && this.getOutputMinFrameDurationlomOqCM.getHeaderTitle() != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(this.getOutputSizeshNQ4ISI).inflate(androidx.appcompat.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) listView, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.getOutputMinFrameDurationlomOqCM.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.getHighSpeedVideoSizes.setAdapter(this.getOutputMinFrameDuration);
        this.getHighSpeedVideoSizes.show();
    }
}
