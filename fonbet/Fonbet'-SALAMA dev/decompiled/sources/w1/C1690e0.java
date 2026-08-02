package w1;

/* renamed from: w1.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1690e0 extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1702h0 f17691b;

    public /* synthetic */ C1690e0(C1702h0 c1702h0, int i7) {
        this.f17690a = i7;
        this.f17691b = c1702h0;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17690a) {
            case 0:
                this.f17691b.f17726E = AbstractC1707i1.i("initial_run_time", Long.MIN_VALUE);
                break;
            default:
                this.f17691b.f17726E = Long.MIN_VALUE;
                break;
        }
    }
}
