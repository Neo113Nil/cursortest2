package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import m.C1424h;

/* renamed from: androidx.appcompat.widget.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676z0 extends C0649l0 {

    /* renamed from: D, reason: collision with root package name */
    public final int f8762D;

    /* renamed from: E, reason: collision with root package name */
    public final int f8763E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC0668v0 f8764F;

    /* renamed from: G, reason: collision with root package name */
    public m.m f8765G;

    public C0676z0(Context context, boolean z4) {
        super(context, z4);
        if (1 == AbstractC0674y0.a(context.getResources().getConfiguration())) {
            this.f8762D = 21;
            this.f8763E = 22;
        } else {
            this.f8762D = 22;
            this.f8763E = 21;
        }
    }

    @Override // androidx.appcompat.widget.C0649l0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1424h c1424h;
        int i7;
        int pointToPosition;
        int i8;
        if (this.f8764F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i7 = headerViewListAdapter.getHeadersCount();
                c1424h = (C1424h) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1424h = (C1424h) adapter;
                i7 = 0;
            }
            m.m item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i7) < 0 || i8 >= c1424h.getCount()) ? null : c1424h.getItem(i8);
            m.m mVar = this.f8765G;
            if (mVar != item) {
                m.k kVar = c1424h.f15115a;
                if (mVar != null) {
                    this.f8764F.o(kVar, mVar);
                }
                this.f8765G = item;
                if (item != null) {
                    this.f8764F.d(kVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f8762D) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i7 != this.f8763E) {
            return super.onKeyDown(i7, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1424h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1424h) adapter).f15115a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0668v0 interfaceC0668v0) {
        this.f8764F = interfaceC0668v0;
    }

    @Override // androidx.appcompat.widget.C0649l0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
