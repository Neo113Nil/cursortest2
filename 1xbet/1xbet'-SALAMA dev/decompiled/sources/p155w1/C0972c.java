package p155w1;

/* JADX INFO: renamed from: w1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0972c extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17659b;

    public /* synthetic */ C0972c(long j, int i7) {
        this.f17658a = i7;
        this.f17659b = j;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17658a) {
            case 0:
                H2.a().f17412k.f17731D = this.f17659b;
                H2.a().f17412k.getClass();
                break;
            default:
                H2.a().f17412k.f17731D = this.f17659b;
                break;
        }
    }
}
