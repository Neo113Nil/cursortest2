package J0;

import S0.InterfaceC3967k;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8006o;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.s;

/* loaded from: classes8.dex */
final class C implements InterfaceC3308k {

    /* renamed from: a, reason: collision with root package name */
    private final float f12686a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12687b;

    /* renamed from: c, reason: collision with root package name */
    private final float f12688c;

    /* renamed from: d, reason: collision with root package name */
    private final float f12689d;

    /* renamed from: e, reason: collision with root package name */
    private final float f12690e;

    public C(float f7, float f11, float f12, float f13, float f14) {
        this.f12686a = f7;
        this.f12687b = f11;
        this.f12688c = f12;
        this.f12689d = f13;
        this.f12690e = f14;
    }

    @NotNull
    public final C8006o d(boolean z11, @NotNull t0.q qVar, InterfaceC3967k interfaceC3967k, int i11) {
        C7980b c7980b;
        interfaceC3967k.o(-1588756907);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new c1.u();
            interfaceC3967k.x(C11);
        }
        c1.u uVar = (c1.u) C11;
        boolean z12 = true;
        boolean z13 = (((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(qVar)) || (i11 & 48) == 32;
        Object C12 = interfaceC3967k.C();
        if (z13 || C12 == InterfaceC3967k.a.a()) {
            C12 = new A(qVar, uVar, null);
            interfaceC3967k.x(C12);
        }
        S0.Q.e(interfaceC3967k, qVar, (Function2) C12);
        t0.n nVar = (t0.n) C7714v.Z(uVar);
        float f7 = !z11 ? this.f12688c : nVar instanceof s.b ? this.f12687b : nVar instanceof t0.j ? this.f12689d : nVar instanceof C9717f ? this.f12690e : this.f12686a;
        Object C13 = interfaceC3967k.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = new C7980b(Z1.h.a(f7), m0.W0.e(), null, 12);
            interfaceC3967k.x(C13);
        }
        C7980b c7980b2 = (C7980b) C13;
        Z1.h a11 = Z1.h.a(f7);
        boolean F11 = interfaceC3967k.F(c7980b2) | interfaceC3967k.q(f7) | ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.p(z11)) || (i11 & 6) == 4);
        if ((((i11 & 896) ^ 384) <= 256 || !interfaceC3967k.n(this)) && (i11 & 384) != 256) {
            z12 = false;
        }
        boolean F12 = F11 | z12 | interfaceC3967k.F(nVar);
        Object C14 = interfaceC3967k.C();
        if (F12 || C14 == InterfaceC3967k.a.a()) {
            c7980b = c7980b2;
            Object b11 = new B(c7980b, f7, z11, this, nVar, null);
            interfaceC3967k.x(b11);
            C14 = b11;
        } else {
            c7980b = c7980b2;
        }
        S0.Q.e(interfaceC3967k, a11, (Function2) C14);
        C8006o g10 = c7980b.g();
        interfaceC3967k.k();
        return g10;
    }
}
