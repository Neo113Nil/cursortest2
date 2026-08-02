package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bo0 extends C0151dv {

    /* JADX INFO: renamed from: v */
    public final int f933v;

    /* JADX INFO: renamed from: w */
    public final int f934w;

    /* JADX INFO: renamed from: x */
    public qn0 f935x;

    /* JADX INFO: renamed from: y */
    public rn0 f936y;

    public bo0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f933v = 21;
            this.f934w = 22;
        } else {
            this.f933v = 22;
            this.f934w = 21;
        }
    }

    @Override // p000.C0151dv, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ln0 ln0Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f935x != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ln0Var = (ln0) headerViewListAdapter.getWrappedAdapter();
            } else {
                ln0Var = (ln0) adapter;
                headersCount = 0;
            }
            rn0 rn0VarM3236b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= ln0Var.getCount()) ? null : ln0Var.getItem(i);
            rn0 rn0Var = this.f936y;
            if (rn0Var != rn0VarM3236b) {
                on0 on0Var = ln0Var.f4851a;
                if (rn0Var != null) {
                    this.f935x.mo980h(on0Var, rn0Var);
                }
                this.f936y = rn0VarM3236b;
                if (rn0VarM3236b != null) {
                    this.f935x.mo981j(on0Var, rn0VarM3236b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f933v) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f934w) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ln0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ln0) adapter).f4851a.m3707c(false);
        return true;
    }

    public void setHoverListener(qn0 qn0Var) {
        this.f935x = qn0Var;
    }

    @Override // p000.C0151dv, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
