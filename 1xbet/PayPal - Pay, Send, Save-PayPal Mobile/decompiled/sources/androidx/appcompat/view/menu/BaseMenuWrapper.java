package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
abstract class BaseMenuWrapper {
    private androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> Camera2StreamConfigurationMap;
    private androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> getHighSpeedVideoFpsRanges;
    final android.content.Context getHighSpeedVideoSizes;

    BaseMenuWrapper(android.content.Context context) {
        this.getHighSpeedVideoSizes = context;
    }

    final android.view.MenuItem getHighSpeedVideoSizes(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof androidx.core.internal.view.SupportMenuItem)) {
            return menuItem;
        }
        androidx.core.internal.view.SupportMenuItem supportMenuItem = (androidx.core.internal.view.SupportMenuItem) menuItem;
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new androidx.collection.SimpleArrayMap<>();
        }
        android.view.MenuItem menuItem2 = this.getHighSpeedVideoFpsRanges.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        androidx.appcompat.view.menu.MenuItemWrapperICS menuItemWrapperICS = new androidx.appcompat.view.menu.MenuItemWrapperICS(this.getHighSpeedVideoSizes, supportMenuItem);
        this.getHighSpeedVideoFpsRanges.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    final android.view.SubMenu getHighSpeedVideoFpsRangesFor(android.view.SubMenu subMenu) {
        if (!(subMenu instanceof androidx.core.internal.view.SupportSubMenu)) {
            return subMenu;
        }
        androidx.core.internal.view.SupportSubMenu supportSubMenu = (androidx.core.internal.view.SupportSubMenu) subMenu;
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new androidx.collection.SimpleArrayMap<>();
        }
        android.view.SubMenu subMenu2 = this.Camera2StreamConfigurationMap.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        androidx.appcompat.view.menu.SubMenuWrapperICS subMenuWrapperICS = new androidx.appcompat.view.menu.SubMenuWrapperICS(this.getHighSpeedVideoSizes, supportSubMenu);
        this.Camera2StreamConfigurationMap.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }

    final void getHighSpeedVideoFpsRangesFor() {
        androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> simpleArrayMap = this.getHighSpeedVideoFpsRanges;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> simpleArrayMap2 = this.Camera2StreamConfigurationMap;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (this.getHighSpeedVideoFpsRanges != null) {
            int i2 = 0;
            while (i2 < this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap()) {
                if (this.getHighSpeedVideoFpsRanges.keyAt(i2).getGroupId() == i) {
                    this.getHighSpeedVideoFpsRanges.removeAt(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    final void getHighSpeedVideoFpsRangesFor(int i) {
        if (this.getHighSpeedVideoFpsRanges != null) {
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap(); i2++) {
                if (this.getHighSpeedVideoFpsRanges.keyAt(i2).getItemId() == i) {
                    this.getHighSpeedVideoFpsRanges.removeAt(i2);
                    return;
                }
            }
        }
    }
}
