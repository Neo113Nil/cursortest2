package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class J extends AbstractC1252y {

    /* renamed from: n, reason: collision with root package name */
    public final int f10792n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10793o;

    /* renamed from: p, reason: collision with root package name */
    public I f10794p;

    /* renamed from: q, reason: collision with root package name */
    public k.j f10795q;

    public J(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f10792n = 21;
            this.f10793o = 22;
        } else {
            this.f10792n = 22;
            this.f10793o = 21;
        }
    }

    @Override // l.AbstractC1252y, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.g gVar;
        int i2;
        int pointToPosition;
        int i3;
        if (this.f10794p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                gVar = (k.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (k.g) adapter;
                i2 = 0;
            }
            k.j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= gVar.getCount()) ? null : gVar.getItem(i3);
            k.j jVar = this.f10795q;
            if (jVar != item) {
                k.i iVar = gVar.f10579a;
                if (jVar != null) {
                    this.f10794p.l(iVar, jVar);
                }
                this.f10795q = item;
                if (item != null) {
                    this.f10794p.a(iVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f10792n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f10793o) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ((k.g) getAdapter()).f10579a.c(false);
        return true;
    }

    public void setHoverListener(I i2) {
        this.f10794p = i2;
    }

    @Override // l.AbstractC1252y, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
