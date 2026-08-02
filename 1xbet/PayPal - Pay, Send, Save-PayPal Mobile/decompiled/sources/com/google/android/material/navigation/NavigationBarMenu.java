package com.google.android.material.navigation;

/* loaded from: classes8.dex */
public final class NavigationBarMenu extends androidx.appcompat.view.menu.MenuBuilder {
    private final int maxItemCount;
    private final java.lang.Class<?> viewClass;

    public NavigationBarMenu(android.content.Context context, java.lang.Class<?> cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    public final int getMaxItemCount() {
        return this.maxItemCount;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.viewClass.getSimpleName());
        sb.append(" does not support submenus");
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final android.view.MenuItem addInternal(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        if (size() + 1 > this.maxItemCount) {
            java.lang.String simpleName = this.viewClass.getSimpleName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Maximum number of items supported by ");
            sb.append(simpleName);
            sb.append(" is ");
            sb.append(this.maxItemCount);
            sb.append(". Limit can be checked with ");
            sb.append(simpleName);
            sb.append("#getMaxItemCount()");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        stopDispatchingItemsChanged();
        android.view.MenuItem addInternal = super.addInternal(i, i2, i3, charSequence);
        if (addInternal instanceof androidx.appcompat.view.menu.MenuItemImpl) {
            ((androidx.appcompat.view.menu.MenuItemImpl) addInternal).setExclusiveCheckable(true);
        }
        startDispatchingItemsChanged();
        return addInternal;
    }
}
