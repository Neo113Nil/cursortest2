package h;

/* renamed from: h.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142K extends h.AbstractC0167z {

    /* renamed from: n, reason: collision with root package name */
    public final int f3088n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3089o;

    /* renamed from: p, reason: collision with root package name */
    public h.InterfaceC0141J f3090p;

    /* renamed from: q, reason: collision with root package name */
    public g.k f3091q;

    public C0142K(android.content.Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3088n = 21;
            this.f3089o = 22;
        } else {
            this.f3088n = 22;
            this.f3089o = 21;
        }
    }

    @Override // h.AbstractC0167z, android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        g.h hVar;
        int i2;
        int pointToPosition;
        int i3;
        if (this.f3090p != null) {
            android.widget.ListAdapter adapter = getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                hVar = (g.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (g.h) adapter;
                i2 = 0;
            }
            g.k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= hVar.getCount()) ? null : hVar.getItem(i3);
            g.k kVar = this.f3091q;
            if (kVar != item) {
                g.j jVar = hVar.f2953a;
                if (kVar != null) {
                    this.f3090p.b(jVar, kVar);
                }
                this.f3091q = item;
                if (item != null) {
                    this.f3090p.d(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, android.view.KeyEvent keyEvent) {
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f3088n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f3089o) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ((g.h) getAdapter()).f2953a.c(false);
        return true;
    }

    public void setHoverListener(h.InterfaceC0141J interfaceC0141J) {
        this.f3090p = interfaceC0141J;
    }

    @Override // h.AbstractC0167z, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
        super.setSelector(drawable);
    }
}
