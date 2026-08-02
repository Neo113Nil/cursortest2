package m;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class s implements InterfaceC1414B, x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f15189a;

    public static int l(ListAdapter listAdapter, Context context, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i8 = 0;
        int i9 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    public static boolean t(k kVar) {
        int size = kVar.f15143f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = kVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // m.x
    public final boolean g(m mVar) {
        return false;
    }

    @Override // m.x
    public final boolean j(m mVar) {
        return false;
    }

    public abstract void k(k kVar);

    public abstract void m(View view);

    public abstract void n(boolean z4);

    public abstract void o(int i7);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1424h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1424h) listAdapter).f15115a.q((MenuItem) listAdapter.getItem(i7), this, !(this instanceof ViewOnKeyListenerC1421e) ? 0 : 4);
    }

    public abstract void p(int i7);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z4);

    public abstract void s(int i7);

    @Override // m.x
    public final void c(Context context, k kVar) {
    }
}
