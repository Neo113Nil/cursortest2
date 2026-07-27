package sg.bigo.ads.L;

/* loaded from: classes3.dex */
public final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f12369a;

    public C(D d) {
        this.f12369a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.M.F f = this.f12369a.i.Q;
        if (f != null) {
            f.a();
        }
    }
}
