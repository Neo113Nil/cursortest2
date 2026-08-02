package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    g f37404a;

    /* renamed from: b, reason: collision with root package name */
    private int f37405b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37406c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37407d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f37408e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37409f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z11, int i11) {
        this.f37407d = z11;
        this.f37408e = layoutInflater;
        this.f37404a = gVar;
        this.f37409f = i11;
        b();
    }

    final void b() {
        g gVar = this.f37404a;
        i o11 = gVar.o();
        if (o11 != null) {
            ArrayList<i> p11 = gVar.p();
            int size = p11.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (p11.get(i11) == o11) {
                    this.f37405b = i11;
                    return;
                }
            }
        }
        this.f37405b = -1;
    }

    public final g c() {
        return this.f37404a;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final i getItem(int i11) {
        g gVar = this.f37404a;
        ArrayList<i> p11 = this.f37407d ? gVar.p() : gVar.r();
        int i12 = this.f37405b;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return p11.get(i11);
    }

    public final void e(boolean z11) {
        this.f37406c = z11;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        g gVar = this.f37404a;
        return this.f37405b < 0 ? (this.f37407d ? gVar.p() : gVar.r()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        boolean z11 = false;
        if (view == null) {
            view = this.f37408e.inflate(this.f37409f, viewGroup, false);
        }
        int groupId = getItem(i11).getGroupId();
        int i12 = i11 - 1;
        int groupId2 = i12 >= 0 ? getItem(i12).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f37404a.t() && groupId != groupId2) {
            z11 = true;
        }
        listMenuItemView.b(z11);
        n.a aVar = (n.a) view;
        if (this.f37406c) {
            listMenuItemView.a();
        }
        aVar.e(getItem(i11));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
