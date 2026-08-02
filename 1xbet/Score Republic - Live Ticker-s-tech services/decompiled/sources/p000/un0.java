package p000;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class un0 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f7862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vn0 f7863b;

    public un0(vn0 vn0Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7863b = vn0Var;
        this.f7862a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f7862a.onMenuItemActionCollapse(this.f7863b.m4688f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f7862a.onMenuItemActionExpand(this.f7863b.m4688f(menuItem));
    }
}
