package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC1069j f9573a;

    /* renamed from: b, reason: collision with root package name */
    public int f9574b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9575c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9576d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f9577e;
    public final int f;

    public C1067h(MenuC1069j menuC1069j, LayoutInflater layoutInflater, boolean z3, int i3) {
        this.f9576d = z3;
        this.f9577e = layoutInflater;
        this.f9573a = menuC1069j;
        this.f = i3;
        a();
    }

    public final void a() {
        MenuC1069j menuC1069j = this.f9573a;
        MenuItemC1070k menuItemC1070k = menuC1069j.f9597t;
        if (menuItemC1070k != null) {
            menuC1069j.i();
            ArrayList arrayList = menuC1069j.f9587j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((MenuItemC1070k) arrayList.get(i3)) == menuItemC1070k) {
                    this.f9574b = i3;
                    return;
                }
            }
        }
        this.f9574b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC1070k getItem(int i3) {
        ArrayList k3;
        MenuC1069j menuC1069j = this.f9573a;
        if (this.f9576d) {
            menuC1069j.i();
            k3 = menuC1069j.f9587j;
        } else {
            k3 = menuC1069j.k();
        }
        int i4 = this.f9574b;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (MenuItemC1070k) k3.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k3;
        MenuC1069j menuC1069j = this.f9573a;
        if (this.f9576d) {
            menuC1069j.i();
            k3 = menuC1069j.f9587j;
        } else {
            k3 = menuC1069j.k();
        }
        return this.f9574b < 0 ? k3.size() : k3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f9577e.inflate(this.f, viewGroup, false);
        }
        int i4 = getItem(i3).f9602b;
        int i5 = i3 - 1;
        int i6 = i5 >= 0 ? getItem(i5).f9602b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f9573a.l() && i4 != i6) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        InterfaceC1076q interfaceC1076q = (InterfaceC1076q) view;
        if (this.f9575c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1076q.a(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
