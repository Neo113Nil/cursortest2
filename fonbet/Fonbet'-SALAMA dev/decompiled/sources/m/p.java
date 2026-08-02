package m;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class p implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f15183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f15184b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15184b = rVar;
        this.f15183a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15183a.onMenuItemActionCollapse(this.f15184b.l(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15183a.onMenuItemActionExpand(this.f15184b.l(menuItem));
    }
}
