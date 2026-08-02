package W5;

import U5.AbstractC0442i;
import U5.C0437d;
import U5.C0441h;
import d6.C0984r;

/* loaded from: classes2.dex */
public final class X implements InterfaceC0549w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7090a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7091b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7092c;

    public X(U5.l0 l0Var, EnumC0543u enumC0543u) {
        p3.f.d("error must not be OK", !l0Var.e());
        this.f7091b = l0Var;
        this.f7092c = enumC0543u;
    }

    @Override // W5.InterfaceC0549w
    public final InterfaceC0540t a(H2.r rVar, U5.b0 b0Var, C0437d c0437d, AbstractC0442i[] abstractC0442iArr) {
        Object obj = this.f7092c;
        Object obj2 = this.f7091b;
        switch (this.f7090a) {
            case 0:
                return new W((U5.l0) obj2, (EnumC0543u) obj, abstractC0442iArr);
            default:
                C0437d c0437d2 = C0437d.f6473i;
                p3.f.k(c0437d, "callOptions cannot be null");
                AbstractC0442i a2 = ((C0984r) obj2).a(new C0441h(c0437d, 0, false), b0Var);
                p3.f.q("lb tracer already assigned", abstractC0442iArr[abstractC0442iArr.length - 1] == AbstractC0494d0.f7176o);
                abstractC0442iArr[abstractC0442iArr.length - 1] = a2;
                return ((Y0) obj).a(rVar, b0Var, c0437d, abstractC0442iArr);
        }
    }

    @Override // U5.E
    public final U5.F f() {
        switch (this.f7090a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((Y0) this.f7092c).f();
        }
    }

    public X(C0984r c0984r, Y0 y02) {
        this.f7091b = c0984r;
        this.f7092c = y02;
    }
}
