package sg.bigo.ads.w;

import sg.bigo.ads.K0.E;
import sg.bigo.ads.h.C5185l1;

/* loaded from: classes3.dex */
public final class m extends E {
    public final /* synthetic */ o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, long j) {
        super(j, 1000L);
        this.i = oVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        InterfaceC5495a interfaceC5495a;
        int i;
        int d0 = this.i.d0();
        o oVar = this.i;
        if (oVar.l0 || oVar.w || (interfaceC5495a = oVar.s0) == null || interfaceC5495a.d() || d0 != 0) {
            return;
        }
        o oVar2 = this.i;
        oVar2.w = true;
        oVar2.s0.i();
        sg.bigo.ads.C.l D = ((C5185l1) this.i.e).D();
        switch (this.i.d0()) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i = 9;
                break;
            case 2:
            case 9:
                i = 10;
                break;
            case 3:
            default:
                i = 8;
                break;
            case 10:
                i = 11;
                break;
        }
        D.a((sg.bigo.ads.U.j) null, i, 22);
    }
}
