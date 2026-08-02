package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gb1 extends on0 implements SubMenu {

    /* JADX INFO: renamed from: I */
    public final on0 f2684I;

    /* JADX INFO: renamed from: J */
    public final rn0 f2685J;

    public gb1(Context context, on0 on0Var, rn0 rn0Var) {
        super(context);
        this.f2684I = on0Var;
        this.f2685J = rn0Var;
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: d */
    public final boolean mo2016d(rn0 rn0Var) {
        return this.f2684I.mo2016d(rn0Var);
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: e */
    public final boolean mo2017e(on0 on0Var, MenuItem menuItem) {
        return super.mo2017e(on0Var, menuItem) || this.f2684I.mo2017e(on0Var, menuItem);
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: f */
    public final boolean mo2018f(rn0 rn0Var) {
        return this.f2684I.mo2018f(rn0Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2685J;
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: j */
    public final String mo2019j() {
        rn0 rn0Var = this.f2685J;
        int i = rn0Var != null ? rn0Var.f6903j : 0;
        if (i == 0) {
            return null;
        }
        return j11.m2773h("android:menu:actionviewstates:", i);
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: k */
    public final on0 mo2020k() {
        return this.f2684I.mo2020k();
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: m */
    public final boolean mo2021m() {
        return this.f2684I.mo2021m();
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: n */
    public final boolean mo2022n() {
        return this.f2684I.mo2022n();
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: o */
    public final boolean mo2023o() {
        return this.f2684I.mo2023o();
    }

    @Override // p000.on0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f2684I.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m3717u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m3717u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m3717u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2685J.setIcon(drawable);
        return this;
    }

    @Override // p000.on0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f2684I.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f2685J.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m3717u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m3717u(i, null, 0, null, null);
        return this;
    }
}
