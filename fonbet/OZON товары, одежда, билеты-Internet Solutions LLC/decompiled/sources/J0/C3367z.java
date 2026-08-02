package J0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import Sc.C;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3367z implements InterfaceC3300i {

    /* renamed from: a, reason: collision with root package name */
    private final long f13512a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13513b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13514c;

    /* renamed from: d, reason: collision with root package name */
    private final long f13515d;

    public C3367z(long j11, long j12, long j13, long j14) {
        this.f13512a = j11;
        this.f13513b = j12;
        this.f13514c = j13;
        this.f13515d = j14;
    }

    @Override // J0.InterfaceC3300i
    @NotNull
    public final InterfaceC3978p0 a(boolean z11, InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-655254499);
        InterfaceC3978p0 l11 = S0.n1.l(C7807Z.m(z11 ? this.f13512a : this.f13514c), interfaceC3967k);
        interfaceC3967k.k();
        return l11;
    }

    @Override // J0.InterfaceC3300i
    @NotNull
    public final InterfaceC3978p0 b(boolean z11, InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-2133647540);
        InterfaceC3978p0 l11 = S0.n1.l(C7807Z.m(z11 ? this.f13513b : this.f13515d), interfaceC3967k);
        interfaceC3967k.k();
        return l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3367z.class != obj.getClass()) {
            return false;
        }
        C3367z c3367z = (C3367z) obj;
        return C7807Z.p(this.f13512a, c3367z.f13512a) && C7807Z.p(this.f13513b, c3367z.f13513b) && C7807Z.p(this.f13514c, c3367z.f13514c) && C7807Z.p(this.f13515d, c3367z.f13515d);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f13515d) + Pk0.c.a(Pk0.c.a(Long.hashCode(this.f13512a) * 31, 31, this.f13513b), 31, this.f13514c);
    }
}
