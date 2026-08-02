package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class MenuPopupWindow extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.MenuItemHoverListener {
    private static java.lang.reflect.Method getHighSpeedVideoSizes;
    private androidx.appcompat.widget.MenuItemHoverListener getHighResolutionOutputSizeshNQ4ISI;

    static {
        try {
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                getHighSpeedVideoSizes = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
            }
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    androidx.appcompat.widget.DropDownListView getHighSpeedVideoSizes(android.content.Context context, boolean z) {
        androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView menuDropDownListView = new androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public void setEnterTransition(java.lang.Object obj) {
        androidx.appcompat.widget.MenuPopupWindow.Api23Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, (android.transition.Transition) obj);
    }

    public void setExitTransition(java.lang.Object obj) {
        androidx.appcompat.widget.MenuPopupWindow.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor, (android.transition.Transition) obj);
    }

    public void setHoverListener(androidx.appcompat.widget.MenuItemHoverListener menuItemHoverListener) {
        this.getHighResolutionOutputSizeshNQ4ISI = menuItemHoverListener;
    }

    public void setTouchModal(boolean z) {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = getHighSpeedVideoSizes;
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
        androidx.appcompat.widget.MenuPopupWindow.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor, z);
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.MenuItemHoverListener menuItemHoverListener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverEnter(menuBuilder, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.MenuItemHoverListener menuItemHoverListener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverExit(menuBuilder, menuItem);
        }
    }

    public static class MenuDropDownListView extends androidx.appcompat.widget.DropDownListView {
        final int Camera2StreamConfigurationMap;
        private androidx.appcompat.widget.MenuItemHoverListener getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        private android.view.MenuItem getOutputMinFrameDuration;

        @Override // androidx.appcompat.widget.DropDownListView, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int lookForSelectablePosition(int i, boolean z) {
            return super.lookForSelectablePosition(i, z);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
            return super.measureHeightOfChildrenCompat(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ boolean onForwardedEvent(android.view.MotionEvent motionEvent, int i) {
            return super.onForwardedEvent(motionEvent, i);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
            super.setSelector(drawable);
        }

        public MenuDropDownListView(android.content.Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.Camera2StreamConfigurationMap = 21;
                this.getHighSpeedVideoFpsRanges = 22;
            } else {
                this.Camera2StreamConfigurationMap = 22;
                this.getHighSpeedVideoFpsRanges = 21;
            }
        }

        public void setHoverListener(androidx.appcompat.widget.MenuItemHoverListener menuItemHoverListener) {
            this.getHighResolutionOutputSizeshNQ4ISI = menuItemHoverListener;
        }

        public void clearSelection() {
            setSelection(-1);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
            androidx.appcompat.view.menu.MenuAdapter menuAdapter;
            androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.Camera2StreamConfigurationMap) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i == this.getHighSpeedVideoFpsRanges) {
                setSelection(-1);
                android.widget.ListAdapter adapter = getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) adapter;
                }
                menuAdapter.getAdapterMenu().close(false);
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
            androidx.appcompat.view.menu.MenuAdapter menuAdapter;
            int i;
            int pointToPosition;
            int i2;
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                android.widget.ListAdapter adapter = getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) adapter;
                    i = 0;
                }
                androidx.appcompat.view.menu.MenuItemImpl item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= menuAdapter.getCount()) ? null : menuAdapter.getItem(i2);
                android.view.MenuItem menuItem = this.getOutputMinFrameDuration;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.MenuBuilder adapterMenu = menuAdapter.getAdapterMenu();
                    if (menuItem != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI.onItemHoverExit(adapterMenu, menuItem);
                    }
                    this.getOutputMinFrameDuration = item;
                    if (item != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI.onItemHoverEnter(adapterMenu, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.widget.PopupWindow popupWindow, android.transition.Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.widget.PopupWindow popupWindow, android.transition.Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.widget.PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }
}
