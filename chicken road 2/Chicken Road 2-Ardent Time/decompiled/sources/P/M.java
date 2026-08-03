package P;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f1221a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f1222b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f1223c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f1224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f1225e;

    public M(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f1225e = staggeredGridLayoutManager;
        this.f1224d = i2;
    }

    public final int a(int i2) {
        int i3 = this.f1223c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f1221a.size() == 0) {
            return i2;
        }
        android.view.View view = (android.view.View) this.f1221a.get(r3.size() - 1);
        P.J j2 = (P.J) view.getLayoutParams();
        this.f1223c = this.f1225e.f2499j.b(view);
        j2.getClass();
        return this.f1223c;
    }
}
