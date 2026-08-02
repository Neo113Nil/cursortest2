package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final on0 f4851a;

    /* JADX INFO: renamed from: b */
    public int f4852b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f4853c;

    /* JADX INFO: renamed from: d */
    public final boolean f4854d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f4855e;

    /* JADX INFO: renamed from: f */
    public final int f4856f;

    public ln0(on0 on0Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.f4854d = z;
        this.f4855e = layoutInflater;
        this.f4851a = on0Var;
        this.f4856f = i;
        m3235a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3235a() {
        on0 on0Var = this.f4851a;
        rn0 rn0Var = on0Var.f5796E;
        if (rn0Var != null) {
            on0Var.m3710i();
            ArrayList arrayList = on0Var.f5808s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((rn0) arrayList.get(i)) == rn0Var) {
                    this.f4852b = i;
                    return;
                }
            }
        }
        this.f4852b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rn0 getItem(int i) {
        ArrayList arrayListM3711l;
        boolean z = this.f4854d;
        on0 on0Var = this.f4851a;
        if (z) {
            on0Var.m3710i();
            arrayListM3711l = on0Var.f5808s;
        } else {
            arrayListM3711l = on0Var.m3711l();
        }
        int i2 = this.f4852b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (rn0) arrayListM3711l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM3711l;
        boolean z = this.f4854d;
        on0 on0Var = this.f4851a;
        if (z) {
            on0Var.m3710i();
            arrayListM3711l = on0Var.f5808s;
        } else {
            arrayListM3711l = on0Var.m3711l();
        }
        return this.f4852b < 0 ? arrayListM3711l.size() : arrayListM3711l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f4855e.inflate(this.f4856f, viewGroup, false);
        }
        int i2 = getItem(i).f6904k;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f6904k : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4851a.mo2021m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        fo0 fo0Var = (fo0) view;
        if (this.f4853c) {
            listMenuItemView.setForceShowIcon(true);
        }
        fo0Var.mo329a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m3235a();
        super.notifyDataSetChanged();
    }
}
