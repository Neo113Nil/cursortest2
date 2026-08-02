package m;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class q implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f15185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f15186b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15186b = rVar;
        this.f15185a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f15185a.onMenuItemClick(this.f15186b.l(menuItem));
    }
}
