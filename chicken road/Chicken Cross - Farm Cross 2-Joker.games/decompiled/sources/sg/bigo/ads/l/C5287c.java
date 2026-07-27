package sg.bigo.ads.l;

import sg.bigo.ads.K0.E;
import sg.bigo.ads.h.H2;

/* renamed from: sg.bigo.ads.l.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5287c extends E {
    public final /* synthetic */ C5289e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5287c(C5289e c5289e, long j, long j2) {
        super(j, j2);
        this.i = c5289e;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
        C5289e c5289e = this.i;
        if (c5289e.i && c5289e.g != null && c5289e.a()) {
            H2 h2 = (H2) this.i.g;
            if (h2.g == null || h2.d0() == 14) {
                return;
            }
            h2.g.a(j);
        }
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        C5289e c5289e = this.i;
        c5289e.e = true;
        if (c5289e.i) {
            C5289e.a(c5289e);
        }
    }
}
