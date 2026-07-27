package sg.bigo.ads.C;

import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class z implements sg.bigo.ads.n1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f12243a;

    public z(A a2) {
        this.f12243a = a2;
    }

    @Override // sg.bigo.ads.n1.m
    public final void a() {
    }

    @Override // sg.bigo.ads.n1.m
    public final void a(C5115b c5115b) {
    }

    @Override // sg.bigo.ads.n1.m
    public final void b(int i) {
        B b = this.f12243a.b;
        if (b.d == null) {
            b.e.a(b.f12222a, 1006, 10075, "VPAID video config is empty.");
        } else {
            AbstractC5446j.b(new y(this));
        }
    }

    @Override // sg.bigo.ads.n1.m
    public final void a(int i) {
        B b = this.f12243a.b;
        b.e.a(b.f12222a, 1006, i, "Failed to download VPAID.");
    }
}
