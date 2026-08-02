package D4;

import B4.C2581j;

/* renamed from: D4.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2833h implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2840o f5902a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2581j f5903b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c1.u f5904c;

    public C2833h(C2581j c2581j, C2840o c2840o, c1.u uVar) {
        this.f5902a = c2840o;
        this.f5903b = c2581j;
        this.f5904c = uVar;
    }

    @Override // S0.M
    public final void dispose() {
        C2840o c2840o = this.f5902a;
        C2581j c2581j = this.f5903b;
        c2840o.n(c2581j);
        this.f5904c.remove(c2581j);
    }
}
