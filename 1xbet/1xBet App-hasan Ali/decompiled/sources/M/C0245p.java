package M;

/* renamed from: M.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245p extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3433l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3434m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3435n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3436o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3437p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.Z f3438q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3439r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245p(x0.Z z3, int i, int i5, x0.Z z5, int i6, x0.Z z6, int i7) {
        super(1);
        this.f3433l = z3;
        this.f3434m = i;
        this.f3435n = i5;
        this.f3436o = z5;
        this.f3437p = i6;
        this.f3438q = z6;
        this.f3439r = i7;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        x0.Y y5 = (x0.Y) obj;
        int i = this.f3435n;
        x0.Z z3 = this.f3433l;
        if (z3 != null) {
            x0.Y.j(y5, z3, 0, Math.round((1 + 0.0f) * ((i - this.f3434m) / 2.0f)));
        }
        x0.Z z5 = this.f3436o;
        int i5 = this.f3437p;
        x0.Y.j(y5, z5, i5, 0);
        x0.Z z6 = this.f3438q;
        if (z6 != null) {
            x0.Y.j(y5, z6, i5 + z5.f20973k, Math.round((1 + 0.0f) * ((i - this.f3439r) / 2.0f)));
        }
        return W3.o.f6046a;
    }
}
