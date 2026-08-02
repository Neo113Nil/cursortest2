package w1;

/* renamed from: w1.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1694f0 extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1702h0 f17708d;

    public /* synthetic */ C1694f0(int i7, int i8, C1702h0 c1702h0, boolean z4) {
        this.f17705a = i8;
        this.f17708d = c1702h0;
        this.f17706b = i7;
        this.f17707c = z4;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17705a) {
            case 0:
                int i7 = this.f17706b;
                L.o(i7);
                C1702h0.j(i7, 1, this.f17708d, this.f17707c);
                break;
            default:
                int i8 = this.f17706b;
                L.o(i8);
                C1702h0.j(i8, 2, this.f17708d, this.f17707c);
                break;
        }
    }
}
