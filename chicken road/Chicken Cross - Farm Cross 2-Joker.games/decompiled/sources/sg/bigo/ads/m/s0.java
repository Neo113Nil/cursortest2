package sg.bigo.ads.m;

import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.w.InterfaceC5495a;

/* loaded from: classes3.dex */
public final class s0 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ AbstractC5144a1 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ y0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(y0 y0Var, long j, AbstractC5144a1 abstractC5144a1, int i) {
        super(j, 1000L);
        this.k = y0Var;
        this.i = abstractC5144a1;
        this.j = i;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        Object obj = this.i;
        if (obj instanceof sg.bigo.ads.w.b) {
            ((sg.bigo.ads.w.b) obj).b(this.j);
        } else if ((obj instanceof InterfaceC5495a) && this.k.u) {
            ((InterfaceC5495a) obj).a(this.j, 2);
        }
    }
}
