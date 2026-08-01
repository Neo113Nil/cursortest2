package sg.bigo.ads.n;

import sg.bigo.ads.h.AbstractC5140Q;

/* renamed from: sg.bigo.ads.n.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5409w0 extends sg.bigo.ads.E0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5411x0 f13196a;

    public C5409w0(RunnableC5411x0 runnableC5411x0) {
        this.f13196a = runnableC5411x0;
    }

    @Override // sg.bigo.ads.E0.k
    public final void a(int i) {
        RunnableC5411x0 runnableC5411x0 = this.f13196a;
        if (runnableC5411x0.f13197a == null || !runnableC5411x0.c.o()) {
            return;
        }
        AbstractC5140Q.a(this.f13196a.f13197a);
    }
}
