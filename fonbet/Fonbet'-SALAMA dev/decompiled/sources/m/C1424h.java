package m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final k f15115a;

    /* renamed from: b, reason: collision with root package name */
    public int f15116b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15117c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15118d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f15119e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15120f;

    public C1424h(k kVar, LayoutInflater layoutInflater, boolean z4, int i7) {
        this.f15118d = z4;
        this.f15119e = layoutInflater;
        this.f15115a = kVar;
        this.f15120f = i7;
        a();
    }

    public final void a() {
        k kVar = this.f15115a;
        m mVar = kVar.f15135N;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f15122A;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.f15116b = i7;
                    return;
                }
            }
        }
        this.f15116b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i7) {
        ArrayList l7;
        k kVar = this.f15115a;
        if (this.f15118d) {
            kVar.i();
            l7 = kVar.f15122A;
        } else {
            l7 = kVar.l();
        }
        int i8 = this.f15116b;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (m) l7.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l7;
        k kVar = this.f15115a;
        if (this.f15118d) {
            kVar.i();
            l7 = kVar.f15122A;
        } else {
            l7 = kVar.l();
        }
        return this.f15116b < 0 ? l7.size() : l7.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f15119e.inflate(this.f15120f, viewGroup, false);
        }
        int i8 = getItem(i7).f15171b;
        int i9 = i7 - 1;
        int i10 = i9 >= 0 ? getItem(i9).f15171b : i8;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f15115a.m() && i8 != i10) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        y yVar = (y) view;
        if (this.f15117c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
