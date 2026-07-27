package sg.bigo.ads.M;

/* renamed from: sg.bigo.ads.M.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5000q extends sg.bigo.ads.K0.E {
    public final /* synthetic */ C5002t i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5000q(C5002t c5002t, long j, int i) {
        super(j, 1000L);
        this.i = c5002t;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        if (this.i.e.compareAndSet(false, true)) {
            this.i.j.A();
        }
    }
}
