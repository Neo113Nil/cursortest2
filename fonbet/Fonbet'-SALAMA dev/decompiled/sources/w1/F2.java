package w1;

/* loaded from: classes.dex */
public final class F2 extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I2 f17379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G2 f17380c;

    public /* synthetic */ F2(G2 g22, I2 i22, int i7) {
        this.f17378a = i7;
        this.f17380c = g22;
        this.f17379b = i22;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17378a) {
            case 0:
                this.f17380c.f17385z.add(this.f17379b);
                break;
            default:
                this.f17380c.f17385z.remove(this.f17379b);
                break;
        }
    }
}
