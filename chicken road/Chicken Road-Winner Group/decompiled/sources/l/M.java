package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C1067h;
import k.MenuC1069j;
import k.MenuItemC1070k;

/* loaded from: classes.dex */
public final class M extends A {

    /* renamed from: n, reason: collision with root package name */
    public final int f9733n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9734o;

    /* renamed from: p, reason: collision with root package name */
    public L f9735p;

    /* renamed from: q, reason: collision with root package name */
    public MenuItemC1070k f9736q;

    public M(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f9733n = 21;
            this.f9734o = 22;
        } else {
            this.f9733n = 22;
            this.f9734o = 21;
        }
    }

    @Override // l.A, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1067h c1067h;
        int i3;
        int pointToPosition;
        int i4;
        if (this.f9735p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                c1067h = (C1067h) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1067h = (C1067h) adapter;
                i3 = 0;
            }
            MenuItemC1070k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i3) < 0 || i4 >= c1067h.getCount()) ? null : c1067h.getItem(i4);
            MenuItemC1070k menuItemC1070k = this.f9736q;
            if (menuItemC1070k != item) {
                MenuC1069j menuC1069j = c1067h.f9573a;
                if (menuItemC1070k != null) {
                    this.f9735p.c(menuC1069j, menuItemC1070k);
                }
                this.f9736q = item;
                if (item != null) {
                    this.f9735p.a(menuC1069j, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f9733n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.f9734o) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ((C1067h) getAdapter()).f9573a.c(false);
        return true;
    }

    public void setHoverListener(L l3) {
        this.f9735p = l3;
    }

    @Override // l.A, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
