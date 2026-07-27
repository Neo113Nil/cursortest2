package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC1079t extends MenuC1069j implements SubMenu {

    /* renamed from: w, reason: collision with root package name */
    public final MenuC1069j f9655w;

    /* renamed from: x, reason: collision with root package name */
    public final MenuItemC1070k f9656x;

    public SubMenuC1079t(Context context, MenuC1069j menuC1069j, MenuItemC1070k menuItemC1070k) {
        super(context);
        this.f9655w = menuC1069j;
        this.f9656x = menuItemC1070k;
    }

    @Override // k.MenuC1069j
    public final boolean d(MenuItemC1070k menuItemC1070k) {
        return this.f9655w.d(menuItemC1070k);
    }

    @Override // k.MenuC1069j
    public final boolean e(MenuC1069j menuC1069j, MenuItem menuItem) {
        super.e(menuC1069j, menuItem);
        return this.f9655w.e(menuC1069j, menuItem);
    }

    @Override // k.MenuC1069j
    public final boolean f(MenuItemC1070k menuItemC1070k) {
        return this.f9655w.f(menuItemC1070k);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f9656x;
    }

    @Override // k.MenuC1069j
    public final MenuC1069j j() {
        return this.f9655w.j();
    }

    @Override // k.MenuC1069j
    public final boolean l() {
        return this.f9655w.l();
    }

    @Override // k.MenuC1069j
    public final boolean m() {
        return this.f9655w.m();
    }

    @Override // k.MenuC1069j
    public final boolean n() {
        return this.f9655w.n();
    }

    @Override // k.MenuC1069j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f9655w.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f9656x.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC1069j, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f9655w.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        q(0, null, i3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        q(i3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f9656x.setIcon(i3);
        return this;
    }
}
