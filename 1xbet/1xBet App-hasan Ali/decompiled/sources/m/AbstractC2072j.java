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

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2072j implements InterfaceC2078p, InterfaceC2076n, AdapterView.OnItemClickListener {

    /* renamed from: k, reason: collision with root package name */
    public Rect f17950k;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    public static boolean u(MenuC2070h menuC2070h) {
        int size = menuC2070h.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC2070h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // m.InterfaceC2076n
    public final boolean e(MenuItemC2071i menuItemC2071i) {
        return false;
    }

    @Override // m.InterfaceC2076n
    public final boolean k(MenuItemC2071i menuItemC2071i) {
        return false;
    }

    public abstract void l(MenuC2070h menuC2070h);

    public abstract void n(View view);

    public abstract void o(boolean z3);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j5) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C2068f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C2068f) listAdapter).f17899a.p((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC2067e) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z3);

    public abstract void t(int i);

    @Override // m.InterfaceC2076n
    public final void f(Context context, MenuC2070h menuC2070h) {
    }
}
