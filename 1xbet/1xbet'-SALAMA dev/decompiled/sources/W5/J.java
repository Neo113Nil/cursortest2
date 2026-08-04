package W5;

/* JADX INFO: loaded from: classes2.dex */
public final class J implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p033e3.h f6826b;

    public /* synthetic */ J(p033e3.h hVar, int i7) {
        this.f6825a = i7;
        this.f6826b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6825a) {
            case 0:
                this.f6826b.c0(true);
                break;
            case 1:
                this.f6826b.c0(false);
                break;
            default:
                Q0 q1 = (Q0) this.f6826b.f12673a;
                p113p3.f.q("Channel must have been shut down", q1.f6939J.get());
                q1.f6941L = true;
                q1.G(false);
                Q0.z(q1);
                Q0.A(q1);
                break;
        }
    }
}
