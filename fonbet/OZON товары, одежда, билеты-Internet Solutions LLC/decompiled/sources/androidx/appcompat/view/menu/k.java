package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import m.InterfaceC7975b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public abstract class k implements InterfaceC7975b, m, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private Rect f37478a;

    protected static int o(ListAdapter listAdapter, Context context, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i12 = 0;
        int i13 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = listAdapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i14, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i11) {
                return i11;
            }
            if (measuredWidth > i12) {
                i12 = measuredWidth;
            }
        }
        return i12;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d(i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void g(@NonNull Context context, g gVar) {
    }

    @Override // androidx.appcompat.view.menu.m
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean j(i iVar) {
        return false;
    }

    public abstract void m(g gVar);

    public final Rect n() {
        return this.f37478a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter).f37404a.z((MenuItem) listAdapter.getItem(i11), this, !(this instanceof c) ? 0 : 4);
    }

    public abstract void p(View view);

    public final void q(Rect rect) {
        this.f37478a = rect;
    }

    public abstract void r(boolean z11);

    public abstract void s(int i11);

    public abstract void t(int i11);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z11);

    public abstract void w(int i11);
}
