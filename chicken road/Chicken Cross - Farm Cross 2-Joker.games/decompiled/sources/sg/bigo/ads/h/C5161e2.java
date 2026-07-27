package sg.bigo.ads.h;

/* renamed from: sg.bigo.ads.h.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5161e2 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ H2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5161e2(H2 h2, long j) {
        super(j, 1000L);
        this.i = h2;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        int i;
        H2 h2 = this.i;
        if (h2.l0 || h2.w) {
            return;
        }
        h2.w = true;
        sg.bigo.ads.C.l D = ((C5185l1) h2.e).D();
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
