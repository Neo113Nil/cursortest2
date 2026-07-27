package sg.bigo.ads.w;

import sg.bigo.ads.K0.E;
import sg.bigo.ads.h.C5185l1;

/* loaded from: classes3.dex */
public final class j extends E {
    public final /* synthetic */ l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, long j) {
        super(j, 1000L);
        this.i = lVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        InterfaceC5495a interfaceC5495a;
        l lVar = this.i;
        if (lVar.c0 || lVar.w || (interfaceC5495a = lVar.e0) == null || interfaceC5495a.d()) {
            return;
        }
        l lVar2 = this.i;
        lVar2.w = true;
        lVar2.e0.i();
        ((C5185l1) this.i.e).D().a((sg.bigo.ads.U.j) null, 8, 22);
    }
}
