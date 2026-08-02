package O0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import Sc.InterfaceC3999a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.InterfaceC8367H;
import n0.InterfaceC8368I;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes8.dex */
public abstract class h implements InterfaceC8367H {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19756a;

    /* renamed from: b, reason: collision with root package name */
    private final float f19757b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0 f19758c;

    private h() {
        throw null;
    }

    public h(boolean z11, float f7, InterfaceC3978p0 interfaceC3978p0) {
        this.f19756a = z11;
        this.f19757b = f7;
        this.f19758c = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n0.InterfaceC8367H
    @InterfaceC3999a
    @NotNull
    public final InterfaceC8368I a(@NotNull t0.q qVar, InterfaceC3967k interfaceC3967k) {
        long b11;
        interfaceC3967k.o(988743187);
        t tVar = (t) interfaceC3967k.m(u.c());
        InterfaceC3978p0 interfaceC3978p0 = this.f19758c;
        if (((C7807Z) interfaceC3978p0.getValue()).w() != 16) {
            interfaceC3967k.o(-303571590);
            interfaceC3967k.k();
            b11 = ((C7807Z) interfaceC3978p0.getValue()).w();
        } else {
            interfaceC3967k.o(-303521246);
            b11 = tVar.b(interfaceC3967k);
            interfaceC3967k.k();
        }
        b c11 = c(qVar, this.f19756a, this.f19757b, n1.l(C7807Z.m(b11), interfaceC3967k), n1.l(tVar.a(interfaceC3967k), interfaceC3967k), interfaceC3967k, 0);
        boolean n11 = interfaceC3967k.n(qVar) | interfaceC3967k.F(c11);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new g(qVar, c11, null);
            interfaceC3967k.x(C11);
        }
        Q.g(c11, qVar, (Function2) C11, interfaceC3967k);
        interfaceC3967k.k();
        return c11;
    }

    @NotNull
    public abstract b c(@NotNull t0.q qVar, boolean z11, float f7, @NotNull InterfaceC3978p0 interfaceC3978p0, @NotNull InterfaceC3978p0 interfaceC3978p02, InterfaceC3967k interfaceC3967k, int i11);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f19756a == hVar.f19756a && Z1.h.b(this.f19757b, hVar.f19757b) && Intrinsics.d(this.f19758c, hVar.f19758c);
    }

    public final int hashCode() {
        return this.f19758c.hashCode() + Pk0.b.a(this.f19757b, Boolean.hashCode(this.f19756a) * 31, 31);
    }
}
