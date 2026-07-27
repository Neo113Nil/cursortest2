package Z3;

import java.util.List;

/* loaded from: classes.dex */
public final class e implements R3.b, T3.b {

    /* renamed from: b, reason: collision with root package name */
    public static final e f3783b = new e(T3.d.f2800a);

    /* renamed from: a, reason: collision with root package name */
    public final List f3784a;

    public e(List list) {
        this.f3784a = list;
        T3.d.a(list);
        list.stream().mapToDouble(new T3.c()).toArray();
    }

    @Override // T3.b
    public final boolean a(V3.b bVar) {
        int ordinal = bVar.f3248e.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    public final String toString() {
        return "ExplicitBucketHistogramAggregation(" + this.f3784a.toString() + ")";
    }
}
