package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f2432p;

    /* renamed from: q, reason: collision with root package name */
    public final C.j f2433q;

    public GridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f2432p = -1;
        new android.util.SparseIntArray();
        new android.util.SparseIntArray();
        C.j jVar = new C.j(15);
        this.f2433q = jVar;
        new android.graphics.Rect();
        int i4 = P.v.w(context, attributeSet, i2, i3).f1289c;
        if (i4 == this.f2432p) {
            return;
        }
        if (i4 < 1) {
            throw new java.lang.IllegalArgumentException(B1.a.f(i4, "Span count should be at least 1. Provided "));
        }
        this.f2432p = i4;
        ((android.util.SparseIntArray) jVar.f88b).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z2) {
        if (z2) {
            throw new java.lang.UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(P.B b2, P.E e2, int i2) {
        boolean z2 = e2.f1195c;
        C.j jVar = this.f2433q;
        if (!z2) {
            int i3 = this.f2432p;
            jVar.getClass();
            return C.j.m(i2, i3);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = b2.f1191f;
        if (i2 < 0 || i2 >= recyclerView.f2467b0.a()) {
            throw new java.lang.IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f2467b0.a() + recyclerView.h());
        }
        int y2 = !recyclerView.f2467b0.f1195c ? i2 : recyclerView.f2468c.y(i2, 0);
        if (y2 != -1) {
            int i4 = this.f2432p;
            jVar.getClass();
            return C.j.m(y2, i4);
        }
        android.util.Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // P.v
    public final boolean d(P.w wVar) {
        return wVar instanceof P.C0038k;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, P.v
    public final P.w l() {
        return this.f2434h == 0 ? new P.C0038k(-2, -1) : new P.C0038k(-1, -2);
    }

    @Override // P.v
    public final P.w m(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new P.C0038k(context, attributeSet);
    }

    @Override // P.v
    public final P.w n(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new P.C0038k((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new P.C0038k(layoutParams);
    }

    @Override // P.v
    public final int q(P.B b2, P.E e2) {
        if (this.f2434h == 1) {
            return this.f2432p;
        }
        if (e2.a() < 1) {
            return 0;
        }
        return R(b2, e2, e2.a() - 1) + 1;
    }

    @Override // P.v
    public final int x(P.B b2, P.E e2) {
        if (this.f2434h == 0) {
            return this.f2432p;
        }
        if (e2.a() < 1) {
            return 0;
        }
        return R(b2, e2, e2.a() - 1) + 1;
    }
}
