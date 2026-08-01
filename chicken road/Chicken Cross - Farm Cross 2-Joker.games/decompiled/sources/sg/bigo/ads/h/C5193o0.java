package sg.bigo.ads.h;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.l.InterfaceC5288d;

/* renamed from: sg.bigo.ads.h.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5193o0 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ AdCountDownButton k;
    public final /* synthetic */ C5202r0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5193o0(C5202r0 c5202r0, long j, long j2, long j3, AdCountDownButton adCountDownButton) {
        super(j, 1000L);
        this.l = c5202r0;
        this.i = j2;
        this.j = j3;
        this.k = adCountDownButton;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
        if (this.i - j >= this.j) {
            this.k.a(true);
        }
        this.k.a(j);
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        InterfaceC5288d interfaceC5288d = this.l.p;
        if (interfaceC5288d != null) {
            interfaceC5288d.a(false, true);
        }
        this.k.c();
    }
}
