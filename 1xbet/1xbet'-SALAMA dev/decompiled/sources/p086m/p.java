package p086m;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class p implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f15189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f15190b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15190b = rVar;
        this.f15189a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15189a.onMenuItemActionCollapse(this.f15190b.l(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15189a.onMenuItemActionExpand(this.f15190b.l(menuItem));
    }
}
