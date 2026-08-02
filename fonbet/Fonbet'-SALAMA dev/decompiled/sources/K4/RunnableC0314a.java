package K4;

/* renamed from: K4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0314a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0315b f3990b;

    public /* synthetic */ RunnableC0314a(AbstractC0315b abstractC0315b, int i7) {
        this.f3989a = i7;
        this.f3990b = abstractC0315b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3989a) {
            case 0:
                AbstractC0315b abstractC0315b = this.f3990b;
                x xVar = abstractC0315b.f4003h;
                p3.f.O("State should still be backoff but was %s", xVar == x.f4077f, xVar);
                abstractC0315b.f4003h = x.f4072a;
                abstractC0315b.g();
                p3.f.O("Stream should have started", abstractC0315b.d(), new Object[0]);
                break;
            default:
                AbstractC0315b abstractC0315b2 = this.f3990b;
                if (abstractC0315b2.c()) {
                    abstractC0315b2.f4003h = x.f4075d;
                    break;
                }
                break;
        }
    }
}
