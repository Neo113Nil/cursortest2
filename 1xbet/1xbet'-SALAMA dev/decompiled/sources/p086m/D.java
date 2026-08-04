package p086m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class D extends k implements SubMenu {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final k f15065R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final m f15066S;

    public D(Context context, k kVar, m mVar) {
        super(context);
        this.f15065R = kVar;
        this.f15066S = mVar;
    }

    @Override // p086m.k
    public final boolean d(m mVar) {
        return this.f15065R.d(mVar);
    }

    @Override // p086m.k
    public final boolean e(k kVar, MenuItem menuItem) {
        return super.e(kVar, menuItem) || this.f15065R.e(kVar, menuItem);
    }

    @Override // p086m.k
    public final boolean f(m mVar) {
        return this.f15065R.f(mVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f15066S;
    }

    @Override // p086m.k
    public final String j() {
        m mVar = this.f15066S;
        int i7 = mVar != null ? mVar.f15176a : 0;
        if (i7 == 0) {
            return null;
        }
        return k.d(i7, "android:menu:actionviewstates:");
    }

    @Override // p086m.k
    public final k k() {
        return this.f15065R.k();
    }

    @Override // p086m.k
    public final boolean m() {
        return this.f15065R.m();
    }

    @Override // p086m.k
    public final boolean n() {
        return this.f15065R.n();
    }

    @Override // p086m.k
    public final boolean o() {
        return this.f15065R.o();
    }

    @Override // p086m.k, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f15065R.setGroupDividerEnabled(z4);
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
        this.f15066S.setIcon(drawable);
        return this;
    }

    @Override // p086m.k, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f15065R.setQwertyMode(z4);
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
        this.f15066S.setIcon(i7);
        return this;
    }
}
