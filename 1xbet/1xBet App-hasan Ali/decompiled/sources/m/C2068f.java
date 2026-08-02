package m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2068f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC2070h f17899a;

    /* renamed from: b, reason: collision with root package name */
    public int f17900b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17901c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17902d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f17903e;
    public final int f;

    public C2068f(MenuC2070h menuC2070h, LayoutInflater layoutInflater, boolean z3, int i) {
        this.f17902d = z3;
        this.f17903e = layoutInflater;
        this.f17899a = menuC2070h;
        this.f = i;
        a();
    }

    public final void a() {
        MenuC2070h menuC2070h = this.f17899a;
        MenuItemC2071i menuItemC2071i = menuC2070h.f17922t;
        if (menuItemC2071i != null) {
            menuC2070h.i();
            ArrayList arrayList = menuC2070h.f17912j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemC2071i) arrayList.get(i)) == menuItemC2071i) {
                    this.f17900b = i;
                    return;
                }
            }
        }
        this.f17900b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC2071i getItem(int i) {
        ArrayList k5;
        MenuC2070h menuC2070h = this.f17899a;
        if (this.f17902d) {
            menuC2070h.i();
            k5 = menuC2070h.f17912j;
        } else {
            k5 = menuC2070h.k();
        }
        int i5 = this.f17900b;
        if (i5 >= 0 && i >= i5) {
            i++;
        }
        return (MenuItemC2071i) k5.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k5;
        MenuC2070h menuC2070h = this.f17899a;
        if (this.f17902d) {
            menuC2070h.i();
            k5 = menuC2070h.f17912j;
        } else {
            k5 = menuC2070h.k();
        }
        return this.f17900b < 0 ? k5.size() : k5.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f17903e.inflate(this.f, viewGroup, false);
        }
        int i5 = getItem(i).f17927b;
        int i6 = i - 1;
        int i7 = i6 >= 0 ? getItem(i6).f17927b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f17899a.l() && i5 != i7) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        InterfaceC2077o interfaceC2077o = (InterfaceC2077o) view;
        if (this.f17901c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC2077o.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
