package sg.bigo.ads.n;

/* renamed from: sg.bigo.ads.n.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5388l0 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ C5401s0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5388l0(C5401s0 c5401s0, long j) {
        super(j, 1000L);
        this.i = c5401s0;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        this.i.u.post(new RunnableC5386k0(this));
    }
}
