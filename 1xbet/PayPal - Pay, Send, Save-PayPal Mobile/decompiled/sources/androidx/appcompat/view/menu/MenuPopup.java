package androidx.appcompat.view.menu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class MenuPopup implements androidx.appcompat.view.menu.ShowableListMenu, androidx.appcompat.view.menu.MenuPresenter, android.widget.AdapterView.OnItemClickListener {
    android.graphics.Rect getInputSizeshNQ4ISI;

    public abstract void Camera2StreamConfigurationMap(boolean z);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    public abstract void getHighResolutionOutputSizeshNQ4ISI(int i);

    public abstract void getHighResolutionOutputSizeshNQ4ISI(android.view.View view);

    public abstract void getHighResolutionOutputSizeshNQ4ISI(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.view.menu.MenuBuilder menuBuilder);

    public abstract void getHighResolutionOutputSizeshNQ4ISI(boolean z);

    public abstract void getHighSpeedVideoFpsRanges(int i);

    protected boolean getHighSpeedVideoFpsRanges() {
        return true;
    }

    public abstract void getHighSpeedVideoSizes(int i);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
    }

    MenuPopup() {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        throw new java.lang.UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        androidx.appcompat.view.menu.MenuAdapter menuAdapter;
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof android.widget.HeaderViewListAdapter) {
            menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            menuAdapter = (androidx.appcompat.view.menu.MenuAdapter) listAdapter;
        }
        menuAdapter.getHighSpeedVideoFpsRangesFor.performItemAction((android.view.MenuItem) listAdapter.getItem(i), this, getHighSpeedVideoFpsRanges() ? 0 : 4);
    }

    protected static int getHighSpeedVideoFpsRanges(android.widget.ListAdapter listAdapter, android.content.Context context, int i) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        android.widget.FrameLayout frameLayout = null;
        android.view.View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    protected static boolean Camera2StreamConfigurationMap(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
