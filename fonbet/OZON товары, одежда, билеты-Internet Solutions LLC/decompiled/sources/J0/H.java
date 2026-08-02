package J0;

import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function2;
import m0.C8006o;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class H implements D0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f12812a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12813b;

    /* renamed from: c, reason: collision with root package name */
    private final float f12814c;

    /* renamed from: d, reason: collision with root package name */
    private final float f12815d;

    public H(float f7, float f11, float f12, float f13) {
        this.f12812a = f7;
        this.f12813b = f11;
        this.f12814c = f12;
        this.f12815d = f13;
    }

    @Override // J0.D0
    @NotNull
    public final C8006o a(@NotNull t0.q qVar, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-478475335);
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = (i12 > 4 && interfaceC3967k.n(qVar)) || (i11 & 6) == 4;
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new G0(this.f12812a, this.f12813b, this.f12814c, this.f12815d);
            interfaceC3967k.x(C11);
        }
        G0 g02 = (G0) C11;
        boolean F11 = interfaceC3967k.F(g02) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(this)) || (i11 & 48) == 32);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new E(g02, this, null);
            interfaceC3967k.x(C12);
        }
        S0.Q.e(interfaceC3967k, this, (Function2) C12);
        boolean F12 = interfaceC3967k.F(g02) | ((i12 > 4 && interfaceC3967k.n(qVar)) || (i11 & 6) == 4);
        Object C13 = interfaceC3967k.C();
        if (F12 || C13 == InterfaceC3967k.a.a()) {
            C13 = new G(qVar, g02, null);
            interfaceC3967k.x(C13);
        }
        S0.Q.e(interfaceC3967k, qVar, (Function2) C13);
        C8006o c11 = g02.c();
        interfaceC3967k.k();
        return c11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h11 = (H) obj;
        if (Z1.h.b(this.f12812a, h11.f12812a) && Z1.h.b(this.f12813b, h11.f12813b) && Z1.h.b(this.f12814c, h11.f12814c)) {
            return Z1.h.b(this.f12815d, h11.f12815d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12815d) + Pk0.b.a(this.f12814c, Pk0.b.a(this.f12813b, Float.hashCode(this.f12812a) * 31, 31), 31);
    }
}
