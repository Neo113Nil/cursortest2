package sg.bigo.ads.m;

/* renamed from: sg.bigo.ads.m.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5336o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f13094a;

    public RunnableC5336o(e0 e0Var) {
        this.f13094a = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13094a.q.post(new RunnableC5335n(this));
    }
}
