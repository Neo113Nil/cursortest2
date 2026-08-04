package p155w1;

/* JADX INFO: renamed from: w1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1016n extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17807b;

    public /* synthetic */ C1016n(boolean z4, int i7) {
        this.f17806a = i7;
        this.f17807b = z4;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17806a) {
            case 0:
                Q q7 = H2.a().f17417p;
                q7.getClass();
                q7.h(new M2(this.f17807b ? 2 : 1));
                break;
            case 1:
                Q q8 = H2.a().f17417p;
                q8.getClass();
                q8.h(new M2(this.f17807b ? 2 : 1));
                break;
            case 2:
                H2.a().f17408f.f17866B = this.f17807b;
                break;
            case 3:
                C1042v c1042v = H2.a().f17410h;
                c1042v.f17891C = this.f17807b;
                c1042v.j();
                break;
            case 4:
                H2.a().f17410h.f17892D = this.f17807b;
                break;
            default:
                T t7 = H2.a().f17403a;
                boolean z4 = this.f17807b;
                t7.f17538A = z4;
                if (!z4) {
                    AbstractC0997i0.o(5, "Location analytics report is disabled, please enable it to improve your Flurry analytics metrics.");
                }
                t7.d(new C1008l(t7, 2));
                break;
        }
    }
}
