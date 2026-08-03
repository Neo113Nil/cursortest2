package g;

/* loaded from: classes.dex */
public abstract class l implements g.r, g.p, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Rect f3006a;

    public static int m(android.widget.ListAdapter listAdapter, android.content.Context context, int i2) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        android.widget.FrameLayout frameLayout = null;
        android.view.View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    public static boolean u(g.j jVar) {
        int size = jVar.f2965f.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.view.MenuItem item = jVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // g.p
    public final boolean f(g.k kVar) {
        return false;
    }

    @Override // g.p
    public final boolean g(g.k kVar) {
        return false;
    }

    public abstract void l(g.j jVar);

    public abstract void n(android.view.View view);

    public abstract void o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i2, long j2) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof android.widget.HeaderViewListAdapter ? (g.h) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (g.h) listAdapter).f2953a.p((android.view.MenuItem) listAdapter.getItem(i2), this, !(this instanceof g.g) ? 0 : 4);
    }

    public abstract void p(int i2);

    public abstract void q(int i2);

    public abstract void r(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z2);

    public abstract void t(int i2);

    @Override // g.p
    public final void k(android.content.Context context, g.j jVar) {
    }
}
