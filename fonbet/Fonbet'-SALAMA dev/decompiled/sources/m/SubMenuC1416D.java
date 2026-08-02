package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC1416D extends k implements SubMenu {

    /* renamed from: R, reason: collision with root package name */
    public final k f15059R;

    /* renamed from: S, reason: collision with root package name */
    public final m f15060S;

    public SubMenuC1416D(Context context, k kVar, m mVar) {
        super(context);
        this.f15059R = kVar;
        this.f15060S = mVar;
    }

    @Override // m.k
    public final boolean d(m mVar) {
        return this.f15059R.d(mVar);
    }

    @Override // m.k
    public final boolean e(k kVar, MenuItem menuItem) {
        return super.e(kVar, menuItem) || this.f15059R.e(kVar, menuItem);
    }

    @Override // m.k
    public final boolean f(m mVar) {
        return this.f15059R.f(mVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f15060S;
    }

    @Override // m.k
    public final String j() {
        m mVar = this.f15060S;
        int i7 = mVar != null ? mVar.f15170a : 0;
        if (i7 == 0) {
            return null;
        }
        return e1.k.d(i7, "android:menu:actionviewstates:");
    }

    @Override // m.k
    public final k k() {
        return this.f15059R.k();
    }

    @Override // m.k
    public final boolean m() {
        return this.f15059R.m();
    }

    @Override // m.k
    public final boolean n() {
        return this.f15059R.n();
    }

    @Override // m.k
    public final boolean o() {
        return this.f15059R.o();
    }

    @Override // m.k, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f15059R.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f15060S.setIcon(drawable);
        return this;
    }

    @Override // m.k, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f15059R.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        u(0, null, i7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        u(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f15060S.setIcon(i7);
        return this;
    }
}
