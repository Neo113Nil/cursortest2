package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.BaseMenuPresenter implements androidx.core.view.ActionProvider.SubUiVisibilityListener {
    androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup getHighSpeedVideoFpsRanges;
    android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
    androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu getHighSpeedVideoSizes;
    final androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    boolean getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private final android.util.SparseBooleanArray getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private boolean toString;
    private boolean unwrapAs;

    public ActionMenuPresenter(android.content.Context context) {
        super(context, androidx.appcompat.R.layout.abc_action_menu_layout, androidx.appcompat.R.layout.abc_action_menu_item_layout);
        this.getOutputSizeshNQ4ISI = new android.util.SparseBooleanArray();
        this.getHighSpeedVideoSizesFor = new androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        super.initForMenu(context, menuBuilder);
        android.content.res.Resources resources = context.getResources();
        androidx.appcompat.view.ActionBarPolicy actionBarPolicy = androidx.appcompat.view.ActionBarPolicy.get(context);
        if (!this.getInputFormats) {
            this.getInputSizeshNQ4ISI = actionBarPolicy.showsOverflowMenuButton();
        }
        if (!this.toString) {
            this.isOutputSupportedForhNQ4ISI = actionBarPolicy.getEmbeddedMenuWidthLimit();
        }
        if (!this.getOutputMinFrameDurationlomOqCM) {
            this.getOutputStallDurationlomOqCM = actionBarPolicy.getMaxActionButtons();
        }
        int i = this.isOutputSupportedForhNQ4ISI;
        if (this.getInputSizeshNQ4ISI) {
            if (this.Camera2StreamConfigurationMap == null) {
                androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton overflowMenuButton = new androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton(this.mSystemContext);
                this.Camera2StreamConfigurationMap = overflowMenuButton;
                if (this.getOutputFormats) {
                    overflowMenuButton.setImageDrawable(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getOutputFormats = false;
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.Camera2StreamConfigurationMap.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.Camera2StreamConfigurationMap.getMeasuredWidth();
        } else {
            this.Camera2StreamConfigurationMap = null;
        }
        this.getOutputSizes = i;
        this.isOutputSupportedFor = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public final void Camera2StreamConfigurationMap() {
        if (!this.getOutputMinFrameDurationlomOqCM) {
            this.getOutputStallDurationlomOqCM = androidx.appcompat.view.ActionBarPolicy.get(this.mContext).getMaxActionButtons();
        }
        if (this.mMenu != null) {
            this.mMenu.onItemsChanged(true);
        }
    }

    public final void Camera2StreamConfigurationMap(boolean z) {
        this.getOutputStallDuration = z;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        androidx.appcompat.view.menu.MenuView menuView = this.mMenuView;
        androidx.appcompat.view.menu.MenuView menuView2 = super.getMenuView(viewGroup);
        if (menuView != menuView2) {
            ((androidx.appcompat.widget.ActionMenuView) menuView2).setPresenter(this);
        }
        return menuView2;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public android.view.View getItemView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            actionView = super.getItemView(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public void bindItemView(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, androidx.appcompat.view.menu.MenuView.ItemView itemView) {
        itemView.initialize(menuItemImpl, 0);
        androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = (androidx.appcompat.view.menu.ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((androidx.appcompat.widget.ActionMenuView) this.mMenuView);
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            this.getValidOutputFormatsForInputhNQ4ISI = new androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.getValidOutputFormatsForInputhNQ4ISI);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean shouldIncludeItem(int i, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        int size;
        super.updateMenuView(z);
        ((android.view.View) this.mMenuView).requestLayout();
        if (this.mMenu != null) {
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> actionItems = this.mMenu.getActionItems();
            int size2 = actionItems.size();
            for (int i = 0; i < size2; i++) {
                androidx.core.view.ActionProvider supportActionProvider = actionItems.get(i).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = this.mMenu != null ? this.mMenu.getNonActionItems() : null;
        if (this.getInputSizeshNQ4ISI && nonActionItems != null && ((size = nonActionItems.size()) != 1 ? size > 0 : (!nonActionItems.get(0).isActionViewExpanded()))) {
            if (this.Camera2StreamConfigurationMap == null) {
                this.Camera2StreamConfigurationMap = new androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton(this.mSystemContext);
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.Camera2StreamConfigurationMap.getParent();
            if (viewGroup != this.mMenuView) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.Camera2StreamConfigurationMap);
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) this.mMenuView;
                actionMenuView.addView(this.Camera2StreamConfigurationMap, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton overflowMenuButton = this.Camera2StreamConfigurationMap;
            if (overflowMenuButton != null && overflowMenuButton.getParent() == this.mMenuView) {
                ((android.view.ViewGroup) this.mMenuView).removeView(this.Camera2StreamConfigurationMap);
            }
        }
        ((androidx.appcompat.widget.ActionMenuView) this.mMenuView).setOverflowReserved(this.getInputSizeshNQ4ISI);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean filterLeftoverView(android.view.ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.Camera2StreamConfigurationMap) {
            return false;
        }
        return super.filterLeftoverView(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        android.view.View view;
        boolean z = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.getParentMenu() != this.mMenu) {
            subMenuBuilder2 = (androidx.appcompat.view.menu.SubMenuBuilder) subMenuBuilder2.getParentMenu();
        }
        android.view.MenuItem item = subMenuBuilder2.getItem();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.mMenuView;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                view = viewGroup.getChildAt(i);
                if ((view instanceof androidx.appcompat.view.menu.MenuView.ItemView) && ((androidx.appcompat.view.menu.MenuView.ItemView) view).getItemData() == item) {
                    break;
                }
            }
        }
        view = 0;
        if (view == 0) {
            return false;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            android.view.MenuItem item2 = subMenuBuilder.getItem(i2);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = new androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu(this.mContext, subMenuBuilder, view);
        this.getHighSpeedVideoSizes = actionButtonSubmenu;
        actionButtonSubmenu.setForceShowIcon(z);
        this.getHighSpeedVideoSizes.show();
        super.onSubMenuSelected(subMenuBuilder);
        return true;
    }

    public final boolean getHighSpeedVideoFpsRangesFor() {
        if (!this.getInputSizeshNQ4ISI) {
            return false;
        }
        androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup = this.getHighSpeedVideoFpsRanges;
        if ((overflowPopup != null && overflowPopup.isShowing()) || this.mMenu == null || this.mMenuView == null || this.getOutputMinFrameDuration != null || this.mMenu.getNonActionItems().isEmpty()) {
            return false;
        }
        this.getOutputMinFrameDuration = new androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable(new androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup(this.mContext, this.mMenu, this.Camera2StreamConfigurationMap));
        ((android.view.View) this.mMenuView).post(this.getOutputMinFrameDuration);
        return true;
    }

    public final boolean getHighSpeedVideoFpsRanges() {
        if (this.getOutputMinFrameDuration != null && this.mMenuView != null) {
            ((android.view.View) this.mMenuView).removeCallbacks(this.getOutputMinFrameDuration);
            this.getOutputMinFrameDuration = null;
            return true;
        }
        androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup = this.getHighSpeedVideoFpsRanges;
        if (overflowPopup == null) {
            return false;
        }
        overflowPopup.dismiss();
        return true;
    }

    public final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoFpsRanges() | getHighSpeedVideoSizes();
    }

    public final boolean getHighSpeedVideoSizes() {
        androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = this.getHighSpeedVideoSizes;
        if (actionButtonSubmenu == null) {
            return false;
        }
        actionButtonSubmenu.dismiss();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter = this;
        android.view.View view = null;
        ?? r3 = 0;
        if (actionMenuPresenter.mMenu != null) {
            arrayList = actionMenuPresenter.mMenu.getVisibleItems();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.getOutputStallDurationlomOqCM;
        int i6 = actionMenuPresenter.getOutputSizes;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) actionMenuPresenter.mMenuView;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = arrayList.get(i9);
            if (menuItemImpl.requiresActionButton()) {
                i7++;
            } else if (menuItemImpl.requestsActionButton()) {
                i8++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.getOutputStallDuration && menuItemImpl.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.getInputSizeshNQ4ISI && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        android.util.SparseBooleanArray sparseBooleanArray = actionMenuPresenter.getOutputSizeshNQ4ISI;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.unwrapAs) {
            int i11 = actionMenuPresenter.isOutputSupportedFor;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl2 = arrayList.get(i12);
            if (menuItemImpl2.requiresActionButton()) {
                android.view.View itemView = actionMenuPresenter.getItemView(menuItemImpl2, view, viewGroup);
                if (actionMenuPresenter.unwrapAs) {
                    i3 -= androidx.appcompat.widget.ActionMenuView.getHighSpeedVideoFpsRanges(itemView, i2, i3, makeMeasureSpec, r3);
                } else {
                    itemView.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                menuItemImpl2.setIsActionButton(true);
                z = r3;
                i4 = i;
            } else if (menuItemImpl2.requestsActionButton()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!actionMenuPresenter.unwrapAs || i3 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    android.view.View itemView2 = actionMenuPresenter.getItemView(menuItemImpl2, null, viewGroup);
                    if (actionMenuPresenter.unwrapAs) {
                        int highSpeedVideoFpsRanges = androidx.appcompat.widget.ActionMenuView.getHighSpeedVideoFpsRanges(itemView2, i2, i3, makeMeasureSpec, 0);
                        i3 -= highSpeedVideoFpsRanges;
                        if (highSpeedVideoFpsRanges == 0) {
                            z5 = false;
                        }
                    } else {
                        itemView2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z5 & (!actionMenuPresenter.unwrapAs ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl3 = arrayList.get(i14);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.isActionButton()) {
                                i10++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                menuItemImpl2.setIsActionButton(z4);
                z = false;
            } else {
                z = r3;
                i4 = i;
                menuItemImpl2.setIsActionButton(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        getHighResolutionOutputSizeshNQ4ISI();
        super.onCloseMenu(menuBuilder, z);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.ActionMenuPresenter.SavedState savedState = new androidx.appcompat.widget.ActionMenuPresenter.SavedState();
        savedState.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem findItem;
        if (parcelable instanceof androidx.appcompat.widget.ActionMenuPresenter.SavedState) {
            androidx.appcompat.widget.ActionMenuPresenter.SavedState savedState = (androidx.appcompat.widget.ActionMenuPresenter.SavedState) parcelable;
            if (savedState.getHighSpeedVideoFpsRangesFor <= 0 || (findItem = this.mMenu.findItem(savedState.getHighSpeedVideoFpsRangesFor)) == null) {
                return;
            }
            onSubMenuSelected((androidx.appcompat.view.menu.SubMenuBuilder) findItem.getSubMenu());
        }
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
        } else if (this.mMenu != null) {
            this.mMenu.close(false);
        }
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.appcompat.widget.ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    /* loaded from: classes5.dex */
    static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.ActionMenuPresenter.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.appcompat.widget.ActionMenuPresenter.SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.ActionMenuPresenter.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter.SavedState[] newArray(int i) {
                return new androidx.appcompat.widget.ActionMenuPresenter.SavedState[i];
            }
        };
        public int getHighSpeedVideoFpsRangesFor;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(android.os.Parcel parcel) {
            this.getHighSpeedVideoFpsRangesFor = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    class OverflowMenuButton extends androidx.appcompat.widget.AppCompatImageView implements androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
            return false;
        }

        public OverflowMenuButton(android.content.Context context) {
            super(context, null, androidx.appcompat.R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new androidx.appcompat.widget.ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                    if (androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoFpsRanges == null) {
                        return null;
                    }
                    return androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoFpsRanges.getPopup();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoFpsRangesFor();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    if (androidx.appcompat.widget.ActionMenuPresenter.this.getOutputMinFrameDuration != null) {
                        return false;
                    }
                    androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoFpsRanges();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoFpsRangesFor();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            android.graphics.drawable.Drawable drawable = getDrawable();
            android.graphics.drawable.Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = java.lang.Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    class OverflowPopup extends androidx.appcompat.view.menu.MenuPopupHelper {
        public OverflowPopup(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view) {
            super(context, menuBuilder, view, true, androidx.appcompat.R.attr.actionOverflowMenuStyle);
            setGravity(androidx.core.view.GravityCompat.END);
            setPresenterCallback(androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoSizesFor);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public void onDismiss() {
            if (androidx.appcompat.widget.ActionMenuPresenter.this.mMenu != null) {
                androidx.appcompat.widget.ActionMenuPresenter.this.mMenu.close();
            }
            androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoFpsRanges = null;
            super.onDismiss();
        }
    }

    class ActionButtonSubmenu extends androidx.appcompat.view.menu.MenuPopupHelper {
        public ActionButtonSubmenu(android.content.Context context, androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder, android.view.View view) {
            super(context, subMenuBuilder, view, false, androidx.appcompat.R.attr.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.MenuItemImpl) subMenuBuilder.getItem()).isActionButton()) {
                setAnchorView(androidx.appcompat.widget.ActionMenuPresenter.this.Camera2StreamConfigurationMap == null ? (android.view.View) androidx.appcompat.widget.ActionMenuPresenter.this.mMenuView : androidx.appcompat.widget.ActionMenuPresenter.this.Camera2StreamConfigurationMap);
            }
            setPresenterCallback(androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoSizesFor);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public void onDismiss() {
            androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoSizes = null;
            androidx.appcompat.widget.ActionMenuPresenter.this.getHighResolutionOutputSizeshNQ4ISI = 0;
            super.onDismiss();
        }
    }

    class PopupPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        PopupPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            if (menuBuilder == androidx.appcompat.widget.ActionMenuPresenter.this.mMenu) {
                return false;
            }
            androidx.appcompat.widget.ActionMenuPresenter.this.getHighResolutionOutputSizeshNQ4ISI = ((androidx.appcompat.view.menu.SubMenuBuilder) menuBuilder).getItem().getItemId();
            androidx.appcompat.view.menu.MenuPresenter.Callback callback = androidx.appcompat.widget.ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                return callback.onOpenSubMenu(menuBuilder);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof androidx.appcompat.view.menu.SubMenuBuilder) {
                menuBuilder.getRootMenu().close(false);
            }
            androidx.appcompat.view.menu.MenuPresenter.Callback callback = androidx.appcompat.widget.ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, z);
            }
        }
    }

    class OpenOverflowRunnable implements java.lang.Runnable {
        private androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup getHighResolutionOutputSizeshNQ4ISI;

        public OpenOverflowRunnable(androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup overflowPopup) {
            this.getHighResolutionOutputSizeshNQ4ISI = overflowPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (androidx.appcompat.widget.ActionMenuPresenter.this.mMenu != null) {
                androidx.appcompat.widget.ActionMenuPresenter.this.mMenu.changeMenuMode();
            }
            android.view.View view = (android.view.View) androidx.appcompat.widget.ActionMenuPresenter.this.mMenuView;
            if (view != null && view.getWindowToken() != null && this.getHighResolutionOutputSizeshNQ4ISI.tryShow()) {
                androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI;
            }
            androidx.appcompat.widget.ActionMenuPresenter.this.getOutputMinFrameDuration = null;
        }
    }

    class ActionMenuPopupCallback extends androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback {
        ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
            if (androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoSizes != null) {
                return androidx.appcompat.widget.ActionMenuPresenter.this.getHighSpeedVideoSizes.getPopup();
            }
            return null;
        }
    }
}
