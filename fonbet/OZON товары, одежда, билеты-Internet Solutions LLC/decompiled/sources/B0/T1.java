package B0;

/* loaded from: classes8.dex */
public final /* synthetic */ class T1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U1 f1532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1534c;

    public /* synthetic */ T1(U1 u12, int i11, int i12) {
        this.f1532a = u12;
        this.f1533b = i11;
        this.f1534c = i12;
    }

    public final c2 a(d2 d2Var) {
        K1.K g10 = this.f1532a.g();
        if (g10 == null) {
            return new c2(0, 0, Z1.f1652b);
        }
        Z1.o b11 = Z1.p.b(g10.y(this.f1533b, this.f1534c).getBounds());
        return new c2(b11.i(), b11.d(), new Y1(b11));
    }
}
