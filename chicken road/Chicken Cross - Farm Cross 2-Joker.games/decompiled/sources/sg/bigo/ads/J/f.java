package sg.bigo.ads.J;

import sg.bigo.ads.C.l;
import sg.bigo.ads.K0.E;
import sg.bigo.ads.U.j;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.w.InterfaceC5495a;

/* loaded from: classes3.dex */
public final class f extends E {
    public final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, long j) {
        super(j, 1000L);
        this.i = hVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        InterfaceC5495a interfaceC5495a;
        int i;
        int d0 = this.i.d0();
        h hVar = this.i;
        if (hVar.l0 || hVar.w || (interfaceC5495a = hVar.x0) == null || interfaceC5495a.d() || d0 != 0) {
            return;
        }
        h hVar2 = this.i;
        hVar2.w = true;
        hVar2.x0.i();
        l D = ((C5185l1) this.i.e).D();
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
        D.a((j) null, i, 22);
    }
}
