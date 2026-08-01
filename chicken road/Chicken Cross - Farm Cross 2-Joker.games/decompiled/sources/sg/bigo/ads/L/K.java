package sg.bigo.ads.L;

import sg.bigo.ads.M.C4989f;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class K extends sg.bigo.ads.K0.E {
    public final /* synthetic */ N i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n, long j) {
        super(j, 1000L);
        this.i = n;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        N n = this.i;
        if (n.u) {
            return;
        }
        C4989f c4989f = n.R;
        if (c4989f == null || c4989f.e != 2) {
            AbstractC5446j.b(new J(this));
        }
    }
}
