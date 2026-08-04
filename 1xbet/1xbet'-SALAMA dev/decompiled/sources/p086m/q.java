package p086m;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class q implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f15191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f15192b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15192b = rVar;
        this.f15191a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f15191a.onMenuItemClick(this.f15192b.l(menuItem));
    }
}
