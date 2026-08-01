package sg.bigo.ads.L;

/* loaded from: classes3.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f12401a;

    public x(y yVar) {
        this.f12401a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12401a.b.C() || this.f12401a.b.B()) {
            N n = this.f12401a.b;
            if (n.S == null) {
                sg.bigo.ads.P.j jVar = n.Z;
                n.S = new sg.bigo.ads.M.E(n, jVar.b, jVar.f12482a);
            }
        }
    }
}
