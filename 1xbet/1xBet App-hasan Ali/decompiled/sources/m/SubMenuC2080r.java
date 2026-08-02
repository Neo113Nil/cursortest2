package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: m.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC2080r extends MenuC2070h implements SubMenu {

    /* renamed from: w, reason: collision with root package name */
    public final MenuC2070h f17980w;

    /* renamed from: x, reason: collision with root package name */
    public final MenuItemC2071i f17981x;

    public SubMenuC2080r(Context context, MenuC2070h menuC2070h, MenuItemC2071i menuItemC2071i) {
        super(context);
        this.f17980w = menuC2070h;
        this.f17981x = menuItemC2071i;
    }

    @Override // m.MenuC2070h
    public final boolean d(MenuItemC2071i menuItemC2071i) {
        return this.f17980w.d(menuItemC2071i);
    }

    @Override // m.MenuC2070h
    public final boolean e(MenuC2070h menuC2070h, MenuItem menuItem) {
        return super.e(menuC2070h, menuItem) || this.f17980w.e(menuC2070h, menuItem);
    }

    @Override // m.MenuC2070h
    public final boolean f(MenuItemC2071i menuItemC2071i) {
        return this.f17980w.f(menuItemC2071i);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f17981x;
    }

    @Override // m.MenuC2070h
    public final MenuC2070h j() {
        return this.f17980w.j();
    }

    @Override // m.MenuC2070h
    public final boolean l() {
        return this.f17980w.l();
    }

    @Override // m.MenuC2070h
    public final boolean m() {
        return this.f17980w.m();
    }

    @Override // m.MenuC2070h
    public final boolean n() {
        return this.f17980w.n();
    }

    @Override // m.MenuC2070h, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f17980w.setGroupDividerEnabled(z3);
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
        this.f17981x.setIcon(drawable);
        return this;
    }

    @Override // m.MenuC2070h, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f17980w.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        q(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        q(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f17981x.setIcon(i);
        return this;
    }
}
