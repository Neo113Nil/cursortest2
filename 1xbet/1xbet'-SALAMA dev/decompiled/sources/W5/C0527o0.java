package W5;

import U5.AbstractC0442i;
import U5.C0437d;

/* JADX INFO: renamed from: W5.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0527o0 extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f7300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p072k1.g f7301b;

    public C0527o0(A a2, p072k1.g gVar) {
        this.f7300a = a2;
        this.f7301b = gVar;
    }

    @Override // W5.InterfaceC0549w
    public final InterfaceC0540t a(H2.r rVar, U5.b0 b0Var, C0437d c0437d, AbstractC0442i[] abstractC0442iArr) {
        return new C0524n0(this, this.f7300a.a(rVar, b0Var, c0437d, abstractC0442iArr));
    }

    @Override // W5.Y
    public final A g() {
        return this.f7300a;
    }
}
