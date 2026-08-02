package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public class MenuAdapter extends android.widget.BaseAdapter {
    private int Camera2StreamConfigurationMap = -1;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    androidx.appcompat.view.menu.MenuBuilder getHighSpeedVideoFpsRangesFor;
    private final android.view.LayoutInflater getHighSpeedVideoSizes;
    private final boolean getInputFormats;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public MenuAdapter(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.LayoutInflater layoutInflater, boolean z, int i) {
        this.getInputFormats = z;
        this.getHighSpeedVideoSizes = layoutInflater;
        this.getHighSpeedVideoFpsRangesFor = menuBuilder;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        getHighSpeedVideoFpsRangesFor();
    }

    public boolean getForceShowIcon() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setForceShowIcon(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = this.getInputFormats ? this.getHighSpeedVideoFpsRangesFor.getNonActionItems() : this.getHighSpeedVideoFpsRangesFor.getVisibleItems();
        if (this.Camera2StreamConfigurationMap < 0) {
            return nonActionItems.size();
        }
        return nonActionItems.size() - 1;
    }

    public androidx.appcompat.view.menu.MenuBuilder getAdapterMenu() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // android.widget.Adapter
    public androidx.appcompat.view.menu.MenuItemImpl getItem(int i) {
        java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = this.getInputFormats ? this.getHighSpeedVideoFpsRangesFor.getNonActionItems() : this.getHighSpeedVideoFpsRangesFor.getVisibleItems();
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.getHighSpeedVideoSizes.inflate(this.getHighResolutionOutputSizeshNQ4ISI, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.getHighSpeedVideoFpsRangesFor.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        androidx.appcompat.view.menu.MenuView.ItemView itemView = (androidx.appcompat.view.menu.MenuView.ItemView) view;
        if (this.getHighSpeedVideoFpsRanges) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i), 0);
        return view;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        androidx.appcompat.view.menu.MenuItemImpl expandedItem = this.getHighSpeedVideoFpsRangesFor.getExpandedItem();
        if (expandedItem != null) {
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> nonActionItems = this.getHighSpeedVideoFpsRangesFor.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.Camera2StreamConfigurationMap = i;
                    return;
                }
            }
        }
        this.Camera2StreamConfigurationMap = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        getHighSpeedVideoFpsRangesFor();
        super.notifyDataSetChanged();
    }
}
