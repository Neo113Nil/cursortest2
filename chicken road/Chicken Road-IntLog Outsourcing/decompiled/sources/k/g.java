package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final i f10579a;

    /* renamed from: b, reason: collision with root package name */
    public int f10580b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10581c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10582d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f10583e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10584f;

    public g(i iVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f10582d = z;
        this.f10583e = layoutInflater;
        this.f10579a = iVar;
        this.f10584f = i2;
        a();
    }

    public final void a() {
        i iVar = this.f10579a;
        j jVar = iVar.f10604s;
        if (jVar != null) {
            iVar.i();
            ArrayList arrayList = iVar.f10595j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((j) arrayList.get(i2)) == jVar) {
                    this.f10580b = i2;
                    return;
                }
            }
        }
        this.f10580b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j getItem(int i2) {
        ArrayList k3;
        i iVar = this.f10579a;
        if (this.f10582d) {
            iVar.i();
            k3 = iVar.f10595j;
        } else {
            k3 = iVar.k();
        }
        int i3 = this.f10580b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (j) k3.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k3;
        i iVar = this.f10579a;
        if (this.f10582d) {
            iVar.i();
            k3 = iVar.f10595j;
        } else {
            k3 = iVar.k();
        }
        return this.f10580b < 0 ? k3.size() : k3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f10583e.inflate(this.f10584f, viewGroup, false);
        }
        int i3 = getItem(i2).f10609b;
        int i6 = i2 - 1;
        int i7 = i6 >= 0 ? getItem(i6).f10609b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f10579a.l() && i3 != i7) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        p pVar = (p) view;
        if (this.f10581c) {
            listMenuItemView.setForceShowIcon(true);
        }
        pVar.a(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
