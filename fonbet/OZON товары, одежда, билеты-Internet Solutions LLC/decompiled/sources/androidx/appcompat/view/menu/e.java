package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    Context f37396a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f37397b;

    /* renamed from: c, reason: collision with root package name */
    g f37398c;

    /* renamed from: d, reason: collision with root package name */
    ExpandedMenuView f37399d;

    /* renamed from: e, reason: collision with root package name */
    private m.a f37400e;

    /* renamed from: f, reason: collision with root package name */
    a f37401f;

    /* JADX INFO: Access modifiers changed from: private */
    class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private int f37402a = -1;

        public a() {
            b();
        }

        final void b() {
            e eVar = e.this;
            i o11 = eVar.f37398c.o();
            if (o11 != null) {
                ArrayList<i> p11 = eVar.f37398c.p();
                int size = p11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (p11.get(i11) == o11) {
                        this.f37402a = i11;
                        return;
                    }
                }
            }
            this.f37402a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final i getItem(int i11) {
            ArrayList<i> p11 = e.this.f37398c.p();
            int i12 = this.f37402a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return p11.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int size = e.this.f37398c.p().size();
            return this.f37402a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public final View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.f37397b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((n.a) view).e(getItem(i11));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context) {
        this.f37396a = context;
        this.f37397b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f37401f == null) {
            this.f37401f = new a();
        }
        return this.f37401f;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(g gVar, boolean z11) {
        m.a aVar = this.f37400e;
        if (aVar != null) {
            aVar.b(gVar, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable c() {
        if (this.f37399d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f37399d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d(i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void e(boolean z11) {
        a aVar = this.f37401f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void g(Context context, g gVar) {
        if (this.f37396a != null) {
            this.f37396a = context;
            if (this.f37397b == null) {
                this.f37397b = LayoutInflater.from(context);
            }
        }
        this.f37398c = gVar;
        a aVar = this.f37401f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final int getId() {
        return 0;
    }

    public final n h(ViewGroup viewGroup) {
        if (this.f37399d == null) {
            this.f37399d = (ExpandedMenuView) this.f37397b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f37401f == null) {
                this.f37401f = new a();
            }
            this.f37399d.setAdapter((ListAdapter) this.f37401f);
            this.f37399d.setOnItemClickListener(this);
        }
        return this.f37399d;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void i(m.a aVar) {
        this.f37400e = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean j(i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void k(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f37399d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean l(q qVar) {
        if (!qVar.hasVisibleItems()) {
            return false;
        }
        new h(qVar).a();
        m.a aVar = this.f37400e;
        if (aVar == null) {
            return true;
        }
        aVar.c(qVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        this.f37398c.z(this.f37401f.getItem(i11), this, 0);
    }
}
