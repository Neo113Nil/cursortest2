package sg.bigo.ads.i;

import sg.bigo.ads.K0.E;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.h.Y0;

/* renamed from: sg.bigo.ads.i.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5244p extends E {
    public final /* synthetic */ C5245q i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5244p(C5245q c5245q, long j) {
        super(j, 1000L);
        this.i = c5245q;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        C5245q c5245q = this.i;
        if (c5245q.e || c5245q.f) {
            return;
        }
        c5245q.e = true;
        H2 h2 = (H2) c5245q.f12991a.f12823a.get();
        int d0 = h2 == null ? -1 : h2.d0();
        c5245q.f12991a.getClass();
        if (d0 != 0) {
            return;
        }
        H2 h22 = (H2) c5245q.f12991a.f12823a.get();
        C5241m N0 = h22 == null ? null : h22.N0();
        if (N0 == null || !N0.c()) {
            return;
        }
        H2 h23 = (H2) c5245q.f12991a.f12823a.get();
        Y0 y0 = h23 != null ? h23.J : null;
        if (y0 != null) {
            y0.m = false;
        }
        H2 h24 = (H2) c5245q.f12991a.f12823a.get();
        if (h24 != null) {
            h24.o(16);
        }
    }
}
