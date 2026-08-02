package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
final class CascadingMenuPopup extends androidx.appcompat.view.menu.MenuPopup implements androidx.appcompat.view.menu.MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    private static final int getOutputMinFrameDuration = androidx.appcompat.R.layout.abc_cascading_menu_item_layout;
    android.view.View Camera2StreamConfigurationMap;
    private final int CoroutineDebuggingKt;
    private int _CREATION;
    private androidx.appcompat.view.menu.MenuPresenter.Callback accessartificialFrame;
    private int b;
    private final int coroutineCreation;
    private boolean getARTIFICIAL_FRAME_PACKAGE_NAME;
    boolean getHighSpeedVideoFpsRanges;
    final android.os.Handler getHighSpeedVideoSizes;
    android.view.ViewTreeObserver getHighSpeedVideoSizesFor;
    private android.view.View getOutputFormats;
    private boolean getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private final android.content.Context getOutputStallDurationlomOqCM;
    private final boolean getValidOutputFormatsForInputhNQ4ISI;
    private final int isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private android.widget.PopupWindow.OnDismissListener toString;
    private final java.util.List<androidx.appcompat.view.menu.MenuBuilder> ArtificialStackFrames = new java.util.ArrayList();
    final java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    final android.view.ViewTreeObserver.OnGlobalLayoutListener getHighResolutionOutputSizeshNQ4ISI = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!androidx.appcompat.view.menu.CascadingMenuPopup.this.isShowing() || androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRangesFor.size() <= 0 || androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRangesFor.get(0).getHighSpeedVideoFpsRanges.isModal()) {
                return;
            }
            android.view.View view = androidx.appcompat.view.menu.CascadingMenuPopup.this.Camera2StreamConfigurationMap;
            if (view == null || !view.isShown()) {
                androidx.appcompat.view.menu.CascadingMenuPopup.this.dismiss();
                return;
            }
            java.util.Iterator<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> it = androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                it.next().getHighSpeedVideoFpsRanges.show();
            }
        }
    };
    private final android.view.View.OnAttachStateChangeListener getInputFormats = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            if (androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoSizesFor != null) {
                if (!androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoSizesFor.isAlive()) {
                    androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoSizesFor = view.getViewTreeObserver();
                }
                androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoSizesFor.removeGlobalOnLayoutListener(androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighResolutionOutputSizeshNQ4ISI);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final androidx.appcompat.widget.MenuItemHoverListener unwrapAs = new androidx.appcompat.widget.MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
            androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoSizes.removeCallbacksAndMessages(menuBuilder);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(final androidx.appcompat.view.menu.MenuBuilder menuBuilder, final android.view.MenuItem menuItem) {
            androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoSizes.removeCallbacksAndMessages(null);
            int size = androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRangesFor.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRangesFor.get(i).getHighSpeedVideoFpsRangesFor) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            final androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo = i2 < androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRangesFor.size() ? androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRangesFor.get(i2) : null;
            androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoSizes.postAtTime(new java.lang.Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (cascadingMenuInfo != null) {
                        androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRanges = true;
                        cascadingMenuInfo.getHighSpeedVideoFpsRangesFor.close(false);
                        androidx.appcompat.view.menu.CascadingMenuPopup.this.getHighSpeedVideoFpsRanges = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        menuBuilder.performItemAction(menuItem, 4);
                    }
                }
            }, menuBuilder, android.os.SystemClock.uptimeMillis() + 200);
        }
    };
    private int coroutineBoundary = 0;
    private int getOutputStallDuration = 0;
    private boolean getOutputMinFrameDurationlomOqCM = false;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    protected final boolean getHighSpeedVideoFpsRanges() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final android.os.Parcelable onSaveInstanceState() {
        return null;
    }

    public CascadingMenuPopup(android.content.Context context, android.view.View view, int i, int i2, boolean z) {
        this.getOutputStallDurationlomOqCM = context;
        this.getOutputFormats = view;
        this.CoroutineDebuggingKt = i;
        this.coroutineCreation = i2;
        this.getValidOutputFormatsForInputhNQ4ISI = z;
        this.isOutputSupportedForhNQ4ISI = view.getLayoutDirection() != 1 ? 1 : 0;
        android.content.res.Resources resources = context.getResources();
        this.isOutputSupportedFor = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_config_prefDialogWidth));
        this.getHighSpeedVideoSizes = new android.os.Handler();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void Camera2StreamConfigurationMap(boolean z) {
        this.getOutputMinFrameDurationlomOqCM = z;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        if (isShowing()) {
            return;
        }
        java.util.Iterator<androidx.appcompat.view.menu.MenuBuilder> it = this.ArtificialStackFrames.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges(it.next());
        }
        this.ArtificialStackFrames.clear();
        android.view.View view = this.getOutputFormats;
        this.Camera2StreamConfigurationMap = view;
        if (view != null) {
            boolean z = this.getHighSpeedVideoSizesFor == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.getHighSpeedVideoSizesFor = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            this.Camera2StreamConfigurationMap.addOnAttachStateChangeListener(this.getInputFormats);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        if (size <= 0) {
            return;
        }
        androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[] cascadingMenuInfoArr = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[]) this.getHighSpeedVideoFpsRangesFor.toArray(new androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[size];
            if (cascadingMenuInfo.getHighSpeedVideoFpsRanges.isShowing()) {
                cascadingMenuInfo.getHighSpeedVideoFpsRanges.dismiss();
            }
        }
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
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.getOutputStallDurationlomOqCM);
        if (isShowing()) {
            getHighSpeedVideoFpsRanges(menuBuilder);
        } else {
            this.ArtificialStackFrames.add(menuBuilder);
        }
    }

    private void getHighSpeedVideoFpsRanges(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo;
        android.view.View view;
        int i;
        int i2;
        android.view.MenuItem menuItem;
        androidx.appcompat.view.menu.MenuAdapter menuAdapter;
        int i3;
        int firstVisiblePosition;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.getOutputStallDurationlomOqCM);
        androidx.appcompat.view.menu.MenuAdapter menuAdapter2 = new androidx.appcompat.view.menu.MenuAdapter(menuBuilder, from, this.getValidOutputFormatsForInputhNQ4ISI, getOutputMinFrameDuration);
        if (!isShowing() && this.getOutputMinFrameDurationlomOqCM) {
            menuAdapter2.setForceShowIcon(true);
        } else if (isShowing()) {
            menuAdapter2.setForceShowIcon(androidx.appcompat.view.menu.MenuPopup.Camera2StreamConfigurationMap(menuBuilder));
        }
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(menuAdapter2, this.getOutputStallDurationlomOqCM, this.isOutputSupportedFor);
        androidx.appcompat.widget.MenuPopupWindow menuPopupWindow = new androidx.appcompat.widget.MenuPopupWindow(this.getOutputStallDurationlomOqCM, null, this.CoroutineDebuggingKt, this.coroutineCreation);
        menuPopupWindow.setHoverListener(this.unwrapAs);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.getOutputFormats);
        menuPopupWindow.setDropDownGravity(this.getOutputStallDuration);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        menuPopupWindow.setAdapter(menuAdapter2);
        menuPopupWindow.setContentWidth(highSpeedVideoFpsRanges);
        menuPopupWindow.setDropDownGravity(this.getOutputStallDuration);
        if (this.getHighSpeedVideoFpsRangesFor.size() > 0) {
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> list = this.getHighSpeedVideoFpsRangesFor;
            cascadingMenuInfo = list.get(list.size() - 1);
            androidx.appcompat.view.menu.MenuBuilder menuBuilder2 = cascadingMenuInfo.getHighSpeedVideoFpsRangesFor;
            int size = menuBuilder2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuBuilder2.getItem(i4);
                if (menuItem.hasSubMenu() && menuBuilder == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem != null) {
                android.widget.ListView listView = cascadingMenuInfo.getHighSpeedVideoFpsRanges.getListView();
                android.widget.ListAdapter adapter = listView.getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) adapter;
                    i3 = 0;
                }
                int count = menuAdapter.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == menuAdapter.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - listView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listView.getChildCount()) {
                    view = listView.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            cascadingMenuInfo = null;
            view = null;
        }
        if (view != null) {
            menuPopupWindow.setTouchModal(false);
            menuPopupWindow.setEnterTransition(null);
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> list2 = this.getHighSpeedVideoFpsRangesFor;
            android.widget.ListView listView2 = list2.get(list2.size() - 1).getHighSpeedVideoFpsRanges.getListView();
            int[] iArr = new int[2];
            listView2.getLocationOnScreen(iArr);
            android.graphics.Rect rect = new android.graphics.Rect();
            this.Camera2StreamConfigurationMap.getWindowVisibleDisplayFrame(rect);
            if (this.isOutputSupportedForhNQ4ISI != 1 ? iArr[0] - highSpeedVideoFpsRanges >= 0 : iArr[0] + listView2.getWidth() + highSpeedVideoFpsRanges > rect.right) {
                i2 = 0;
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
            boolean z = i2 == i;
            this.isOutputSupportedForhNQ4ISI = i2;
            menuPopupWindow.setAnchorView(view);
            if ((this.getOutputStallDuration & 5) != 5) {
                highSpeedVideoFpsRanges = z ? view.getWidth() : 0 - highSpeedVideoFpsRanges;
            } else if (!z) {
                highSpeedVideoFpsRanges = 0 - view.getWidth();
            }
            menuPopupWindow.setHorizontalOffset(highSpeedVideoFpsRanges);
            menuPopupWindow.setOverlapAnchor(true);
            menuPopupWindow.setVerticalOffset(0);
        } else {
            if (this.getOutputSizeshNQ4ISI) {
                menuPopupWindow.setHorizontalOffset(this._CREATION);
            }
            if (this.getOutputSizes) {
                menuPopupWindow.setVerticalOffset(this.b);
            }
            menuPopupWindow.setEpicenterBounds(this.getInputSizeshNQ4ISI);
        }
        this.getHighSpeedVideoFpsRangesFor.add(new androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo(menuPopupWindow, menuBuilder, this.isOutputSupportedForhNQ4ISI));
        menuPopupWindow.show();
        android.widget.ListView listView3 = menuPopupWindow.getListView();
        listView3.setOnKeyListener(this);
        if (cascadingMenuInfo == null && this.getARTIFICIAL_FRAME_PACKAGE_NAME && menuBuilder.getHeaderTitle() != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) from.inflate(androidx.appcompat.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) listView3, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.getHeaderTitle());
            listView3.addHeaderView(frameLayout, null, false);
            menuPopupWindow.show();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return this.getHighSpeedVideoFpsRangesFor.size() > 0 && this.getHighSpeedVideoFpsRangesFor.get(0).getHighSpeedVideoFpsRanges.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo;
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = this.getHighSpeedVideoFpsRangesFor.get(i);
            if (!cascadingMenuInfo.getHighSpeedVideoFpsRanges.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.getHighSpeedVideoFpsRangesFor.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z) {
        java.util.Iterator<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            android.widget.ListAdapter adapter = it.next().getHighSpeedVideoFpsRanges.getListView().getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.MenuAdapter) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.accessartificialFrame = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        for (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo cascadingMenuInfo : this.getHighSpeedVideoFpsRangesFor) {
            if (subMenuBuilder == cascadingMenuInfo.getHighSpeedVideoFpsRangesFor) {
                cascadingMenuInfo.getHighSpeedVideoFpsRanges.getListView().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        getHighResolutionOutputSizeshNQ4ISI(subMenuBuilder);
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.accessartificialFrame;
        if (callback != null) {
            callback.onOpenSubMenu(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (this.coroutineBoundary != i) {
            this.coroutineBoundary = i;
            this.getOutputStallDuration = androidx.core.view.GravityCompat.getAbsoluteGravity(i, this.getOutputFormats.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
        if (this.getOutputFormats != view) {
            this.getOutputFormats = view;
            this.getOutputStallDuration = androidx.core.view.GravityCompat.getAbsoluteGravity(this.coroutineBoundary, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.toString = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final android.widget.ListView getListView() {
        if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            return null;
        }
        return this.getHighSpeedVideoFpsRangesFor.get(r0.size() - 1).getHighSpeedVideoFpsRanges.getListView();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighSpeedVideoSizes(int i) {
        this.getOutputSizeshNQ4ISI = true;
        this._CREATION = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighSpeedVideoFpsRanges(int i) {
        this.getOutputSizes = true;
        this.b = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = z;
    }

    static class CascadingMenuInfo {
        public final int Camera2StreamConfigurationMap;
        public final androidx.appcompat.widget.MenuPopupWindow getHighSpeedVideoFpsRanges;
        public final androidx.appcompat.view.menu.MenuBuilder getHighSpeedVideoFpsRangesFor;

        public CascadingMenuInfo(androidx.appcompat.widget.MenuPopupWindow menuPopupWindow, androidx.appcompat.view.menu.MenuBuilder menuBuilder, int i) {
            this.getHighSpeedVideoFpsRanges = menuPopupWindow;
            this.getHighSpeedVideoFpsRangesFor = menuBuilder;
            this.Camera2StreamConfigurationMap = i;
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        int i;
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuBuilder == this.getHighSpeedVideoFpsRangesFor.get(i2).getHighSpeedVideoFpsRangesFor) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.getHighSpeedVideoFpsRangesFor.size()) {
                this.getHighSpeedVideoFpsRangesFor.get(i3).getHighSpeedVideoFpsRangesFor.close(false);
            }
            androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo remove = this.getHighSpeedVideoFpsRangesFor.remove(i2);
            remove.getHighSpeedVideoFpsRangesFor.removeMenuPresenter(this);
            if (this.getHighSpeedVideoFpsRanges) {
                remove.getHighSpeedVideoFpsRanges.setExitTransition(null);
                remove.getHighSpeedVideoFpsRanges.setAnimationStyle(0);
            }
            remove.getHighSpeedVideoFpsRanges.dismiss();
            int size2 = this.getHighSpeedVideoFpsRangesFor.size();
            if (size2 > 0) {
                i = this.getHighSpeedVideoFpsRangesFor.get(size2 - 1).Camera2StreamConfigurationMap;
            } else {
                i = this.getOutputFormats.getLayoutDirection() == 1 ? 0 : 1;
            }
            this.isOutputSupportedForhNQ4ISI = i;
            if (size2 != 0) {
                if (z) {
                    this.getHighSpeedVideoFpsRangesFor.get(0).getHighSpeedVideoFpsRangesFor.close(false);
                    return;
                }
                return;
            }
            dismiss();
            androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.accessartificialFrame;
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, true);
            }
            android.view.ViewTreeObserver viewTreeObserver = this.getHighSpeedVideoSizesFor;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.getHighSpeedVideoSizesFor.removeGlobalOnLayoutListener(this.getHighResolutionOutputSizeshNQ4ISI);
                }
                this.getHighSpeedVideoSizesFor = null;
            }
            this.Camera2StreamConfigurationMap.removeOnAttachStateChangeListener(this.getInputFormats);
            this.toString.onDismiss();
        }
    }
}
