package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class x2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f12942a;

    public x2(y2 y2Var) {
        this.f12942a = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y2 y2Var = this.f12942a;
        y2Var.j.a0 = true;
        y2Var.i.setVisibility(0);
        AbstractC5140Q.a(this.f12942a.i, 200L, new w2(this));
        this.f12942a.j.F0();
        this.f12942a.j.K0();
    }
}
