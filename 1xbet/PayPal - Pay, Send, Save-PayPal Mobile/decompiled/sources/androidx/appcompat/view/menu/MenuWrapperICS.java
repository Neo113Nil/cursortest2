package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public class MenuWrapperICS extends androidx.appcompat.view.menu.BaseMenuWrapper implements android.view.Menu {
    private final androidx.core.internal.view.SupportMenu Camera2StreamConfigurationMap;

    public MenuWrapperICS(android.content.Context context, androidx.core.internal.view.SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.Camera2StreamConfigurationMap = supportMenu;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.add(charSequence));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i) {
        return getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.add(i));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i) {
        return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.addSubMenu(i));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        android.view.MenuItem[] menuItemArr2 = menuItemArr != null ? new android.view.MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.Camera2StreamConfigurationMap.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = getHighSpeedVideoSizes(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        getHighSpeedVideoFpsRangesFor(i);
        this.Camera2StreamConfigurationMap.removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        getHighResolutionOutputSizeshNQ4ISI(i);
        this.Camera2StreamConfigurationMap.removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        getHighSpeedVideoFpsRangesFor();
        this.Camera2StreamConfigurationMap.clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.Camera2StreamConfigurationMap.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.Camera2StreamConfigurationMap.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.Camera2StreamConfigurationMap.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.Camera2StreamConfigurationMap.hasVisibleItems();
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int i) {
        return getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int i) {
        return getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        this.Camera2StreamConfigurationMap.close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        return this.Camera2StreamConfigurationMap.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return this.Camera2StreamConfigurationMap.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.Camera2StreamConfigurationMap.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.Camera2StreamConfigurationMap.setQwertyMode(z);
    }
}
