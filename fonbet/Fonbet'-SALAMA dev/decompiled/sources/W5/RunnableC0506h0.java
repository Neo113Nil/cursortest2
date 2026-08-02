package W5;

/* renamed from: W5.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0506h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7226a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0553x0 f7227b;

    public RunnableC0506h0(C0553x0 c0553x0, long j) {
        this.f7227b = c0553x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7226a) {
            case 0:
                this.f7227b.getClass();
                break;
            default:
                ((X5.m) this.f7227b.f7390a.f613b).c(U5.l0.f6544n.g("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public RunnableC0506h0(C0553x0 c0553x0, U5.m0 m0Var) {
        this.f7227b = c0553x0;
    }
}
