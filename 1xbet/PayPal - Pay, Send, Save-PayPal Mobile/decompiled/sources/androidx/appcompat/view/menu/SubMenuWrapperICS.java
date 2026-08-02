package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
class SubMenuWrapperICS extends androidx.appcompat.view.menu.MenuWrapperICS implements android.view.SubMenu {
    private final androidx.core.internal.view.SupportSubMenu getHighSpeedVideoFpsRangesFor;

    SubMenuWrapperICS(android.content.Context context, androidx.core.internal.view.SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.getHighSpeedVideoFpsRangesFor = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int i) {
        this.getHighSpeedVideoFpsRangesFor.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int i) {
        this.getHighSpeedVideoFpsRangesFor.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRangesFor.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.getHighSpeedVideoFpsRangesFor.clearHeader();
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int i) {
        this.getHighSpeedVideoFpsRangesFor.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRangesFor.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor.getItem());
    }
}
