package androidx.compose.material;

import J0.S2;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.C;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.material.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5217o implements S2 {

    /* renamed from: a, reason: collision with root package name */
    private final long f40082a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40083b;

    /* renamed from: c, reason: collision with root package name */
    private final long f40084c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40085d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40086e;

    /* renamed from: f, reason: collision with root package name */
    private final long f40087f;

    /* renamed from: g, reason: collision with root package name */
    private final long f40088g;

    /* renamed from: h, reason: collision with root package name */
    private final long f40089h;

    public C5217o(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f40082a = j11;
        this.f40083b = j12;
        this.f40084c = j13;
        this.f40085d = j14;
        this.f40086e = j15;
        this.f40087f = j16;
        this.f40088g = j17;
        this.f40089h = j18;
    }

    @Override // J0.S2
    @NotNull
    public final InterfaceC3978p0 a(boolean z11, boolean z12, InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-66424183);
        InterfaceC3978p0 l11 = n1.l(C7807Z.m(z11 ? z12 ? this.f40082a : this.f40084c : z12 ? this.f40086e : this.f40088g), interfaceC3967k);
        interfaceC3967k.k();
        return l11;
    }

    @NotNull
    public final InterfaceC3978p0 b(boolean z11, boolean z12, InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-1176343362);
        InterfaceC3978p0 l11 = n1.l(C7807Z.m(z11 ? z12 ? this.f40083b : this.f40085d : z12 ? this.f40087f : this.f40089h), interfaceC3967k);
        interfaceC3967k.k();
        return l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5217o.class != obj.getClass()) {
            return false;
        }
        C5217o c5217o = (C5217o) obj;
        return C7807Z.p(this.f40082a, c5217o.f40082a) && C7807Z.p(this.f40083b, c5217o.f40083b) && C7807Z.p(this.f40084c, c5217o.f40084c) && C7807Z.p(this.f40085d, c5217o.f40085d) && C7807Z.p(this.f40086e, c5217o.f40086e) && C7807Z.p(this.f40087f, c5217o.f40087f) && C7807Z.p(this.f40088g, c5217o.f40088g) && C7807Z.p(this.f40089h, c5217o.f40089h);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f40089h) + Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Long.hashCode(this.f40082a) * 31, 31, this.f40083b), 31, this.f40084c), 31, this.f40085d), 31, this.f40086e), 31, this.f40087f), 31, this.f40088g);
    }
}
