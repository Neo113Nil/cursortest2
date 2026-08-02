package x0;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f21004a;

    /* renamed from: b, reason: collision with root package name */
    public K f21005b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f21006c = new h0(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final h0 f21007d = new h0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final h0 f21008e = new h0(this, 1);

    public i0(k0 k0Var) {
        this.f21004a = k0Var;
    }

    public final K a() {
        K k5 = this.f21005b;
        if (k5 != null) {
            return k5;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
