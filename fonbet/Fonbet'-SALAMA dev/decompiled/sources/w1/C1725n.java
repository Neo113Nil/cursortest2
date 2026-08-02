package w1;

/* renamed from: w1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725n extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17801b;

    public /* synthetic */ C1725n(boolean z4, int i7) {
        this.f17800a = i7;
        this.f17801b = z4;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17800a) {
            case 0:
                Q q7 = H2.a().f17411p;
                q7.getClass();
                q7.h(new M2(this.f17801b ? 2 : 1));
                break;
            case 1:
                Q q8 = H2.a().f17411p;
                q8.getClass();
                q8.h(new M2(this.f17801b ? 2 : 1));
                break;
            case 2:
                H2.a().f17402f.f17860B = this.f17801b;
                break;
            case 3:
                C1751v c1751v = H2.a().f17404h;
                c1751v.f17885C = this.f17801b;
                c1751v.j();
                break;
            case 4:
                H2.a().f17404h.f17886D = this.f17801b;
                break;
            default:
                T t7 = H2.a().f17397a;
                boolean z4 = this.f17801b;
                t7.f17532A = z4;
                if (!z4) {
                    AbstractC1706i0.o(5, "Location analytics report is disabled, please enable it to improve your Flurry analytics metrics.");
                }
                t7.d(new C1717l(t7, 2));
                break;
        }
    }
}
