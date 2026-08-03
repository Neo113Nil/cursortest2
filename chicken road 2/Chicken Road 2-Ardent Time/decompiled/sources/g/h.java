package g;

/* loaded from: classes.dex */
public final class h extends android.widget.BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final g.j f2953a;

    /* renamed from: b, reason: collision with root package name */
    public int f2954b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2955c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2956d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f2957e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2958f;

    public h(g.j jVar, android.view.LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f2956d = z2;
        this.f2957e = layoutInflater;
        this.f2953a = jVar;
        this.f2958f = i2;
        a();
    }

    public final void a() {
        g.j jVar = this.f2953a;
        g.k kVar = jVar.f2978s;
        if (kVar != null) {
            jVar.i();
            java.util.ArrayList arrayList = jVar.f2969j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((g.k) arrayList.get(i2)) == kVar) {
                    this.f2954b = i2;
                    return;
                }
            }
        }
        this.f2954b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g.k getItem(int i2) {
        java.util.ArrayList k2;
        g.j jVar = this.f2953a;
        if (this.f2956d) {
            jVar.i();
            k2 = jVar.f2969j;
        } else {
            k2 = jVar.k();
        }
        int i3 = this.f2954b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (g.k) k2.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList k2;
        g.j jVar = this.f2953a;
        if (this.f2956d) {
            jVar.i();
            k2 = jVar.f2969j;
        } else {
            k2 = jVar.k();
        }
        return this.f2954b < 0 ? k2.size() : k2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i2, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2957e.inflate(this.f2958f, viewGroup, false);
        }
        int i3 = getItem(i2).f2982b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f2982b : i3;
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) view;
        if (this.f2953a.l() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        g.q qVar = (g.q) view;
        if (this.f2955c) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
