package p086m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15122b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f15125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15126f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z4, int i7) {
        this.f15124d = z4;
        this.f15125e = layoutInflater;
        this.f15121a = kVar;
        this.f15126f = i7;
        a();
    }

    public final void a() {
        k kVar = this.f15121a;
        m mVar = kVar.f15141N;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f15128A;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.f15122b = i7;
                    return;
                }
            }
        }
        this.f15122b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i7) {
        ArrayList arrayListL;
        k kVar = this.f15121a;
        if (this.f15124d) {
            kVar.i();
            arrayListL = kVar.f15128A;
        } else {
            arrayListL = kVar.l();
        }
        int i8 = this.f15122b;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (m) arrayListL.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        k kVar = this.f15121a;
        if (this.f15124d) {
            kVar.i();
            arrayListL = kVar.f15128A;
        } else {
            arrayListL = kVar.l();
        }
        return this.f15122b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f15125e.inflate(this.f15126f, viewGroup, false);
        }
        int i8 = getItem(i7).f15177b;
        int i9 = i7 - 1;
        int i10 = i9 >= 0 ? getItem(i9).f15177b : i8;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f15121a.m() && i8 != i10) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        y yVar = (y) view;
        if (this.f15123c) {
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
