package sg.bigo.ads.h;

import sg.bigo.ads.e1.InterfaceC5087a;

/* renamed from: sg.bigo.ads.h.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5201r extends sg.bigo.ads.K0.E {
    public final /* synthetic */ InterfaceC5087a i;
    public final /* synthetic */ AbstractC5204s j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5201r(AbstractC5204s abstractC5204s, long j, InterfaceC5087a interfaceC5087a) {
        super(j, 1000L);
        this.j = abstractC5204s;
        this.i = interfaceC5087a;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        ((sg.bigo.ads.U0.k) this.i).O0 = true;
        AbstractC5204s abstractC5204s = this.j;
        abstractC5204s.a(abstractC5204s.U, new RunnableC5198q(this));
    }
}
