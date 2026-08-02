package S0;

import A0.J0;
import P.C0305m0;

/* loaded from: classes.dex */
public final class h extends v1.h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0305m0 f5276k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J0 f5277l;

    public h(C0305m0 c0305m0, J0 j02) {
        this.f5276k = c0305m0;
        this.f5277l = j02;
    }

    @Override // v1.h
    public final void a() {
        this.f5277l.f304k = k.f5280a;
    }

    @Override // v1.h
    public final void b() {
        this.f5276k.setValue(Boolean.TRUE);
        this.f5277l.f304k = new l(true);
    }
}
