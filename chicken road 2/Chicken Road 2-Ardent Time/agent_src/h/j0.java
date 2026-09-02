package h;

/* loaded from: classes.dex */
public final class j0 implements g.p {

    /* renamed from: a, reason: collision with root package name */
    public g.j f3184a;

    /* renamed from: b, reason: collision with root package name */
    public g.k f3185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f3186c;

    public j0(androidx.appcompat.widget.Toolbar toolbar) {
        this.f3186c = toolbar;
    }

    @Override // g.p
    public final boolean b(g.t tVar) {
        return false;
    }

    @Override // g.p
    public final boolean e() {
        return false;
    }

    @Override // g.p
    public final boolean f(g.k kVar) {
        androidx.appcompat.widget.Toolbar toolbar = this.f3186c;
        toolbar.c();
        android.view.ViewParent parent = toolbar.f2140h.getParent();
        if (parent != toolbar) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(toolbar.f2140h);
            }
            toolbar.addView(toolbar.f2140h);
        }
        android.view.View view = kVar.f3005z;
        if (view == null) {
            view = null;
        }
        toolbar.f2141i = view;
        this.f3185b = kVar;
        android.view.ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(toolbar.f2141i);
            }
            h.k0 g2 = androidx.appcompat.widget.Toolbar.g();
            g2.f3193a = (toolbar.f2146n & 112) | 8388611;
            g2.f3194b = 2;
            toolbar.f2141i.setLayoutParams(g2);
            toolbar.addView(toolbar.f2141i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = toolbar.getChildAt(childCount);
            if (((h.k0) childAt.getLayoutParams()).f3194b != 2 && childAt != toolbar.f2133a) {
                toolbar.removeViewAt(childCount);
                toolbar.f2127E.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f2980B = true;
        kVar.f2994n.o(false);
        android.view.KeyEvent.Callback callback = toolbar.f2141i;
        if (callback instanceof f.InterfaceC0110a) {
            androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) ((f.InterfaceC0110a) callback);
            if (!searchView.f2066d0) {
                searchView.f2066d0 = true;
                androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f2071p;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.e0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // g.p
    public final boolean g(g.k kVar) {
        androidx.appcompat.widget.Toolbar toolbar = this.f3186c;
        android.view.KeyEvent.Callback callback = toolbar.f2141i;
        if (callback instanceof f.InterfaceC0110a) {
            androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) ((f.InterfaceC0110a) callback);
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f2071p;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f2065c0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.e0);
            searchView.f2066d0 = false;
        }
        toolbar.removeView(toolbar.f2141i);
        toolbar.removeView(toolbar.f2140h);
        toolbar.f2141i = null;
        java.util.ArrayList arrayList = toolbar.f2127E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((android.view.View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3185b = null;
        toolbar.requestLayout();
        kVar.f2980B = false;
        kVar.f2994n.o(false);
        return true;
    }

    @Override // g.p
    public final void h() {
        if (this.f3185b != null) {
            g.j jVar = this.f3184a;
            if (jVar != null) {
                int size = jVar.f2965f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f3184a.getItem(i2) == this.f3185b) {
                        return;
                    }
                }
            }
            g(this.f3185b);
        }
    }

    @Override // g.p
    public final void k(android.content.Context context, g.j jVar) {
        g.k kVar;
        g.j jVar2 = this.f3184a;
        if (jVar2 != null && (kVar = this.f3185b) != null) {
            jVar2.d(kVar);
        }
        this.f3184a = jVar;
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
    }
}
