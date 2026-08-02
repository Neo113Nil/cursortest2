package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wn0 implements t71, eo0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: j */
    public Rect f8592j;

    /* JADX INFO: renamed from: m */
    public static int m5367m(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: d */
    public final boolean mo1482d(rn0 rn0Var) {
        return false;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: f */
    public final boolean mo1484f(rn0 rn0Var) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo3219l(on0 on0Var);

    /* JADX INFO: renamed from: n */
    public abstract void mo3220n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo3221o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (ln0) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (ln0) listAdapter).f4851a.m3713q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0431lf) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo3222p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo3223q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo3224r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo3225s(boolean z);

    /* JADX INFO: renamed from: t */
    public abstract void mo3226t(int i);

    @Override // p000.eo0
    /* JADX INFO: renamed from: h */
    public final void mo1486h(Context context, on0 on0Var) {
    }
}
