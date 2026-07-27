package sg.bigo.ads.J;

import sg.bigo.ads.K0.E;
import sg.bigo.ads.U.j;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.w.InterfaceC5495a;

/* loaded from: classes3.dex */
public final class c extends E {
    public final /* synthetic */ e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, long j) {
        super(j, 1000L);
        this.i = eVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        InterfaceC5495a interfaceC5495a;
        e eVar = this.i;
        if (eVar.c0 || eVar.w || (interfaceC5495a = eVar.h0) == null || interfaceC5495a.d()) {
            return;
        }
        e eVar2 = this.i;
        eVar2.w = true;
        eVar2.h0.i();
        ((C5185l1) this.i.e).D().a((j) null, 8, 22);
    }
}
