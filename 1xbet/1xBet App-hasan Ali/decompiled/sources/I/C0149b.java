package I;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0314r0;
import P.Z;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import z.AbstractC2685I;
import z.AbstractC2701c;
import z.C2686J;
import z.C2700b;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: I.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149b extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2461l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2462m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b0.p f2463n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0159l f2464o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149b(long j5, boolean z3, b0.p pVar, InterfaceC0159l interfaceC0159l) {
        super(2);
        this.f2461l = j5;
        this.f2462m = z3;
        this.f2463n = pVar;
        this.f2464o = interfaceC0159l;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            long j5 = this.f2461l;
            Z z3 = C0302l.f4480a;
            InterfaceC0159l interfaceC0159l = this.f2464o;
            boolean z5 = this.f2462m;
            if (j5 != 9205357640488583168L) {
                c0315s.X(-837727128);
                C2700b c2700b = z5 ? AbstractC2701c.f21530b : AbstractC2701c.f21529a;
                b0.p e3 = androidx.compose.foundation.layout.c.e(this.f2463n, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), 0.0f, 0.0f, 12);
                C2686J a5 = AbstractC2685I.a(c2700b, b0.c.f7146t, c0315s, 0);
                int p5 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l5 = c0315s.l();
                b0.p c5 = b0.a.c(c0315s, e3);
                InterfaceC2753j.f21834j.getClass();
                C2768z c2768z = C2752i.f21830b;
                c0315s.b0();
                if (c0315s.f4530S) {
                    c0315s.k(c2768z);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, C2752i.f21833e, a5);
                AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                C2751h c2751h = C2752i.f;
                if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                    AbstractC2107A.y(p5, c0315s, p5, c2751h);
                }
                AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
                b0.m mVar = b0.m.f7161k;
                boolean h3 = c0315s.h(interfaceC0159l);
                Object M5 = c0315s.M();
                if (h3 || M5 == z3) {
                    M5 = new C0148a(interfaceC0159l, 0);
                    c0315s.i0(M5);
                }
                AbstractC2036a.c(mVar, (InterfaceC2015a) M5, z5, c0315s, 6);
                c0315s.q(true);
                c0315s.q(false);
            } else {
                c0315s.X(-836867312);
                boolean h4 = c0315s.h(interfaceC0159l);
                Object M6 = c0315s.M();
                if (h4 || M6 == z3) {
                    M6 = new C0148a(interfaceC0159l, 1);
                    c0315s.i0(M6);
                }
                AbstractC2036a.c(this.f2463n, (InterfaceC2015a) M6, z5, c0315s, 0);
                c0315s.q(false);
            }
        }
        return W3.o.f6046a;
    }
}
