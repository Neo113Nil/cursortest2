package P;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f1186a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f1187b;

    /* renamed from: c, reason: collision with root package name */
    public int f1188c;

    /* renamed from: d, reason: collision with root package name */
    public int f1189d;

    /* renamed from: e, reason: collision with root package name */
    public P.A f1190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f1191f;

    public B(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f1191f = recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f1186a = arrayList;
        this.f1187b = new java.util.ArrayList();
        java.util.Collections.unmodifiableList(arrayList);
        this.f1188c = 2;
        this.f1189d = 2;
    }

    public final void a(int i2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1191f;
        if (i2 < 0 || i2 >= recyclerView.f2467b0.a()) {
            throw new java.lang.IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f2467b0.a() + recyclerView.h());
        }
        P.E e2 = recyclerView.f2467b0;
        boolean z2 = e2.f1195c;
        java.util.ArrayList arrayList = this.f1186a;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new java.lang.ClassCastException();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) recyclerView.f2470d.f659d;
        if (arrayList2.size() > 0) {
            androidx.recyclerview.widget.RecyclerView.j((android.view.View) arrayList2.get(0));
            throw null;
        }
        java.util.ArrayList arrayList3 = this.f1187b;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new java.lang.ClassCastException();
        }
        int y2 = recyclerView.f2468c.y(i2, 0);
        if (y2 >= 0) {
            throw null;
        }
        throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + y2 + ").state:" + e2.a() + recyclerView.h());
    }

    public final void b() {
        P.v vVar = this.f1191f.f2478i;
        this.f1189d = this.f1188c;
        java.util.ArrayList arrayList = this.f1187b;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f1189d) {
            return;
        }
        B1.a.m(arrayList.get(size));
        int[] iArr = androidx.recyclerview.widget.RecyclerView.f2442l0;
        throw null;
    }
}
