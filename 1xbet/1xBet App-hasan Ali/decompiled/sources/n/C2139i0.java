package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import m.C2068f;
import m.MenuC2070h;
import m.MenuItemC2071i;

/* renamed from: n.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2139i0 extends T {

    /* renamed from: w, reason: collision with root package name */
    public final int f18250w;

    /* renamed from: x, reason: collision with root package name */
    public final int f18251x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC2133f0 f18252y;

    /* renamed from: z, reason: collision with root package name */
    public MenuItemC2071i f18253z;

    public C2139i0(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f18250w = 21;
            this.f18251x = 22;
        } else {
            this.f18250w = 22;
            this.f18251x = 21;
        }
    }

    @Override // n.T, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C2068f c2068f;
        int i;
        int pointToPosition;
        int i5;
        if (this.f18252y != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c2068f = (C2068f) headerViewListAdapter.getWrappedAdapter();
            } else {
                c2068f = (C2068f) adapter;
                i = 0;
            }
            MenuItemC2071i item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i) < 0 || i5 >= c2068f.getCount()) ? null : c2068f.getItem(i5);
            MenuItemC2071i menuItemC2071i = this.f18253z;
            if (menuItemC2071i != item) {
                MenuC2070h menuC2070h = c2068f.f17899a;
                if (menuItemC2071i != null) {
                    this.f18252y.e(menuC2070h, menuItemC2071i);
                }
                this.f18253z = item;
                if (item != null) {
                    this.f18252y.a(menuC2070h, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f18250w) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f18251x) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C2068f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C2068f) adapter).f17899a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC2133f0 interfaceC2133f0) {
        this.f18252y = interfaceC2133f0;
    }

    @Override // n.T, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
