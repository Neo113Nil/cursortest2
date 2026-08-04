package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: androidx.appcompat.widget.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0655z0 extends C0628l0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f8762D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f8763E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC0647v0 f8764F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p086m.m f8765G;

    public C0655z0(Context context, boolean z4) {
        super(context, z4);
        if (1 == AbstractC0653y0.a(context.getResources().getConfiguration())) {
            this.f8762D = 21;
            this.f8763E = 22;
        } else {
            this.f8762D = 22;
            this.f8763E = 21;
        }
    }

    @Override // androidx.appcompat.widget.C0628l0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        p086m.h hVar;
        int headersCount;
        int iPointToPosition;
        int i7;
        if (this.f8764F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                hVar = (p086m.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (p086m.h) adapter;
                headersCount = 0;
            }
            p086m.m item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = iPointToPosition - headersCount) < 0 || i7 >= hVar.getCount()) ? null : hVar.getItem(i7);
            p086m.m mVar = this.f8765G;
            if (mVar != item) {
                p086m.k kVar = hVar.f15121a;
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
        (adapter instanceof HeaderViewListAdapter ? (p086m.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (p086m.h) adapter).f15121a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0647v0 interfaceC0647v0) {
        this.f8764F = interfaceC0647v0;
    }

    @Override // androidx.appcompat.widget.C0628l0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
