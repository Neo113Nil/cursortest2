package p155w1;

/* JADX INFO: renamed from: w1.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0985f0 extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0993h0 f17714d;

    public /* synthetic */ C0985f0(int i7, int i8, C0993h0 c0993h0, boolean z4) {
        this.f17711a = i8;
        this.f17714d = c0993h0;
        this.f17712b = i7;
        this.f17713c = z4;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17711a) {
            case 0:
                int i7 = this.f17712b;
                L.o(i7);
                C0993h0.j(i7, 1, this.f17714d, this.f17713c);
                break;
            default:
                int i8 = this.f17712b;
                L.o(i8);
                C0993h0.j(i8, 2, this.f17714d, this.f17713c);
                break;
        }
    }
}
