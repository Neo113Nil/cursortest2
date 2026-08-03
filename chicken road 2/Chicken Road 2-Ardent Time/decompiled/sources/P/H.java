package P;

/* loaded from: classes.dex */
public final class H extends y.C1014b {

    /* renamed from: d, reason: collision with root package name */
    public final P.I f1205d;

    public H(P.I i2) {
        this.f1205d = i2;
    }

    @Override // y.C1014b
    public final void b(android.view.View view, z.C1041h c1041h) {
        this.f8454a.onInitializeAccessibilityNodeInfo(view, c1041h.f8517a);
        P.I i2 = this.f1205d;
        if (i2.f1206d.l()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = i2.f1206d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            androidx.recyclerview.widget.RecyclerView.j(view);
        }
    }

    @Override // y.C1014b
    public final boolean c(android.view.View view, int i2, android.os.Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        P.I i3 = this.f1205d;
        if (!i3.f1206d.l()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = i3.f1206d;
            if (recyclerView.getLayoutManager() != null) {
                P.B b2 = recyclerView.getLayoutManager().f1303b.f2464a;
            }
        }
        return false;
    }
}
