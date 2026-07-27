package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class V1 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ C5149b2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(C5149b2 c5149b2, long j) {
        super(j, 1000L);
        this.i = c5149b2;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        C5149b2 c5149b2 = this.i;
        if (c5149b2.c0 || c5149b2.w) {
            return;
        }
        c5149b2.w = true;
        ((C5185l1) c5149b2.e).D().a((sg.bigo.ads.U.j) null, 8, 22);
    }
}
