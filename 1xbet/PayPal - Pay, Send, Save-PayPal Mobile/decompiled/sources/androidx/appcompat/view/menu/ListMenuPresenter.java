package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public class ListMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter, android.widget.AdapterView.OnItemClickListener {
    public static final java.lang.String VIEWS_TAG = "android:menu:list";
    android.content.Context Camera2StreamConfigurationMap;
    android.view.LayoutInflater getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    androidx.appcompat.view.menu.MenuBuilder getInputSizeshNQ4ISI;
    androidx.appcompat.view.menu.ExpandedMenuView getOutputFormats;
    private androidx.appcompat.view.menu.MenuPresenter.Callback getOutputMinFrameDuration;

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public ListMenuPresenter(android.content.Context context, int i) {
        this(i, 0);
        this.Camera2StreamConfigurationMap = context;
        this.getHighResolutionOutputSizeshNQ4ISI = android.view.LayoutInflater.from(context);
    }

    public ListMenuPresenter(int i, int i2) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizesFor = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        if (this.getHighSpeedVideoSizesFor != 0) {
            android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, this.getHighSpeedVideoSizesFor);
            this.Camera2StreamConfigurationMap = contextThemeWrapper;
            this.getHighResolutionOutputSizeshNQ4ISI = android.view.LayoutInflater.from(contextThemeWrapper);
        } else if (this.Camera2StreamConfigurationMap != null) {
            this.Camera2StreamConfigurationMap = context;
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = android.view.LayoutInflater.from(context);
            }
        }
        this.getInputSizeshNQ4ISI = menuBuilder;
        androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter menuAdapter = this.getHighSpeedVideoFpsRangesFor;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
        if (this.getOutputFormats == null) {
            this.getOutputFormats = (androidx.appcompat.view.menu.ExpandedMenuView) this.getHighResolutionOutputSizeshNQ4ISI.inflate(androidx.appcompat.R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter();
            }
            this.getOutputFormats.setAdapter((android.widget.ListAdapter) this.getHighSpeedVideoFpsRangesFor);
            this.getOutputFormats.setOnItemClickListener(this);
        }
        return this.getOutputFormats;
    }

    public android.widget.ListAdapter getAdapter() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter();
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter menuAdapter = this.getHighSpeedVideoFpsRangesFor;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.getOutputMinFrameDuration = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.MenuDialogHelper menuDialogHelper = new androidx.appcompat.view.menu.MenuDialogHelper(subMenuBuilder);
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = menuDialogHelper.Camera2StreamConfigurationMap;
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(menuBuilder.getContext());
        androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter = new androidx.appcompat.view.menu.ListMenuPresenter(builder.getContext(), androidx.appcompat.R.layout.abc_list_menu_item_layout);
        menuDialogHelper.getHighSpeedVideoSizes = listMenuPresenter;
        listMenuPresenter.setCallback(menuDialogHelper);
        menuDialogHelper.Camera2StreamConfigurationMap.addMenuPresenter(menuDialogHelper.getHighSpeedVideoSizes);
        builder.setAdapter(menuDialogHelper.getHighSpeedVideoSizes.getAdapter(), menuDialogHelper);
        android.view.View headerView = menuBuilder.getHeaderView();
        if (headerView != null) {
            builder.setCustomTitle(headerView);
        } else {
            builder.setIcon(menuBuilder.getHeaderIcon()).setTitle(menuBuilder.getHeaderTitle());
        }
        builder.setOnKeyListener(menuDialogHelper);
        androidx.appcompat.app.AlertDialog create = builder.create();
        menuDialogHelper.getHighSpeedVideoFpsRanges = create;
        create.setOnDismissListener(menuDialogHelper);
        android.view.WindowManager.LayoutParams attributes = menuDialogHelper.getHighSpeedVideoFpsRanges.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        menuDialogHelper.getHighSpeedVideoFpsRanges.show();
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.getOutputMinFrameDuration;
        if (callback == null) {
            return true;
        }
        callback.onOpenSubMenu(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.getOutputMinFrameDuration;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    public void setItemIndexOffset(int i) {
        this.getHighSpeedVideoSizes = i;
        if (this.getOutputFormats != null) {
            updateMenuView(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        this.getInputSizeshNQ4ISI.performItemAction(this.getHighSpeedVideoFpsRangesFor.getItem(i), this, 0);
    }

    public void saveHierarchyState(android.os.Bundle bundle) {
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        androidx.appcompat.view.menu.ExpandedMenuView expandedMenuView = this.getOutputFormats;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(VIEWS_TAG, sparseArray);
    }

    public void restoreHierarchyState(android.os.Bundle bundle) {
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(VIEWS_TAG);
        if (sparseParcelableArray != null) {
            this.getOutputFormats.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void setId(int i) {
        this.getInputFormats = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.getInputFormats;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
        if (this.getOutputFormats == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        restoreHierarchyState((android.os.Bundle) parcelable);
    }

    class MenuAdapter extends android.widget.BaseAdapter {
        private int getHighSpeedVideoSizes = -1;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public MenuAdapter() {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = androidx.appcompat.view.menu.ListMenuPresenter.this.getInputSizeshNQ4ISI.getNonActionItems().size() - androidx.appcompat.view.menu.ListMenuPresenter.this.getHighSpeedVideoSizes;
            return this.getHighSpeedVideoSizes < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final androidx.appcompat.view.menu.MenuItemImpl getItem(int i) {
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = androidx.appcompat.view.menu.ListMenuPresenter.this.getInputSizeshNQ4ISI.getNonActionItems();
            int i2 = i + androidx.appcompat.view.menu.ListMenuPresenter.this.getHighSpeedVideoSizes;
            int i3 = this.getHighSpeedVideoSizes;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            if (view == null) {
                view = androidx.appcompat.view.menu.ListMenuPresenter.this.getHighResolutionOutputSizeshNQ4ISI.inflate(androidx.appcompat.view.menu.ListMenuPresenter.this.getHighSpeedVideoFpsRanges, viewGroup, false);
            }
            ((androidx.appcompat.view.menu.MenuView.ItemView) view).initialize(getItem(i), 0);
            return view;
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            androidx.appcompat.view.menu.MenuItemImpl expandedItem = androidx.appcompat.view.menu.ListMenuPresenter.this.getInputSizeshNQ4ISI.getExpandedItem();
            if (expandedItem != null) {
                java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = androidx.appcompat.view.menu.ListMenuPresenter.this.getInputSizeshNQ4ISI.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.getHighSpeedVideoSizes = i;
                        return;
                    }
                }
            }
            this.getHighSpeedVideoSizes = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            getHighResolutionOutputSizeshNQ4ISI();
            super.notifyDataSetChanged();
        }
    }
}
