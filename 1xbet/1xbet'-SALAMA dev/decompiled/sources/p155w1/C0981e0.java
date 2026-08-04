package p155w1;

/* JADX INFO: renamed from: w1.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0981e0 extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0993h0 f17697b;

    public /* synthetic */ C0981e0(C0993h0 c0993h0, int i7) {
        this.f17696a = i7;
        this.f17697b = c0993h0;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17696a) {
            case 0:
                this.f17697b.f17732E = AbstractC0998i1.i("initial_run_time", Long.MIN_VALUE);
                break;
            default:
                this.f17697b.f17732E = Long.MIN_VALUE;
                break;
        }
    }
}
