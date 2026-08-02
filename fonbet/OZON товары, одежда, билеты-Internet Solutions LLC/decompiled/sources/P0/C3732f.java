package P0;

import S0.InterfaceC3967k;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8006o;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.s;

/* renamed from: P0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3732f {

    /* renamed from: a, reason: collision with root package name */
    private final float f21021a;

    /* renamed from: b, reason: collision with root package name */
    private final float f21022b;

    /* renamed from: c, reason: collision with root package name */
    private final float f21023c;

    /* renamed from: d, reason: collision with root package name */
    private final float f21024d;

    /* renamed from: e, reason: collision with root package name */
    private final float f21025e;

    public C3732f(float f7, float f11, float f12, float f13, float f14) {
        this.f21021a = f7;
        this.f21022b = f11;
        this.f21023c = f12;
        this.f21024d = f13;
        this.f21025e = f14;
    }

    @NotNull
    public final C8006o d(boolean z11, @NotNull t0.q qVar, InterfaceC3967k interfaceC3967k, int i11) {
        C7980b c7980b;
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
            C12 = new C3726d(qVar, uVar, null);
            interfaceC3967k.x(C12);
        }
        S0.Q.e(interfaceC3967k, qVar, (Function2) C12);
        t0.n nVar = (t0.n) C7714v.Z(uVar);
        float f7 = !z11 ? this.f21025e : nVar instanceof s.b ? this.f21022b : nVar instanceof t0.j ? this.f21024d : nVar instanceof C9717f ? this.f21023c : this.f21021a;
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
            Object c3729e = new C3729e(c7980b, f7, z11, this, nVar, null);
            interfaceC3967k.x(c3729e);
            C14 = c3729e;
        } else {
            c7980b = c7980b2;
        }
        S0.Q.e(interfaceC3967k, a11, (Function2) C14);
        return c7980b.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3732f)) {
            return false;
        }
        C3732f c3732f = (C3732f) obj;
        return Z1.h.b(this.f21021a, c3732f.f21021a) && Z1.h.b(this.f21022b, c3732f.f21022b) && Z1.h.b(this.f21023c, c3732f.f21023c) && Z1.h.b(this.f21024d, c3732f.f21024d) && Z1.h.b(this.f21025e, c3732f.f21025e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f21025e) + Pk0.b.a(this.f21024d, Pk0.b.a(this.f21023c, Pk0.b.a(this.f21022b, Float.hashCode(this.f21021a) * 31, 31), 31), 31);
    }
}
