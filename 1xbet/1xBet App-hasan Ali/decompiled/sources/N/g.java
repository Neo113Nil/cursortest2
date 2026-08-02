package N;

import E.AbstractC0097f;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import b0.p;
import n.AbstractC2107A;
import x0.O;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3680l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f3681m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3682n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, long j5, Object obj) {
        super(2);
        this.f3680l = i;
        this.f3681m = j5;
        this.f3682n = obj;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3680l) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    n.c(this.f3681m, (i4.e) this.f3682n, c0315s, 0);
                }
                break;
            case 1:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    n.c(this.f3681m, (i4.e) this.f3682n, c0315s2, 0);
                }
                break;
            default:
                C0315s c0315s3 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s3.B()) {
                    c0315s3.S();
                } else {
                    long j5 = this.f3681m;
                    if (j5 != 9205357640488583168L) {
                        c0315s3.X(1828881000);
                        p e3 = androidx.compose.foundation.layout.c.e((p) this.f3682n, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), 0.0f, 0.0f, 12);
                        O e5 = AbstractC2710l.e(b0.c.f7138l, false);
                        int p5 = AbstractC0329z.p(c0315s3);
                        InterfaceC0314r0 l5 = c0315s3.l();
                        p c5 = b0.a.c(c0315s3, e3);
                        InterfaceC2753j.f21834j.getClass();
                        C2768z c2768z = C2752i.f21830b;
                        c0315s3.b0();
                        if (c0315s3.f4530S) {
                            c0315s3.k(c2768z);
                        } else {
                            c0315s3.l0();
                        }
                        AbstractC0329z.y(c0315s3, C2752i.f21833e, e5);
                        AbstractC0329z.y(c0315s3, C2752i.f21832d, l5);
                        C2751h c2751h = C2752i.f;
                        if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p5))) {
                            AbstractC2107A.y(p5, c0315s3, p5, c2751h);
                        }
                        AbstractC0329z.y(c0315s3, C2752i.f21831c, c5);
                        AbstractC0097f.b(null, c0315s3, 0, 1);
                        c0315s3.q(true);
                        c0315s3.q(false);
                    } else {
                        c0315s3.X(1829217412);
                        AbstractC0097f.b((p) this.f3682n, c0315s3, 0, 0);
                        c0315s3.q(false);
                    }
                }
                break;
        }
        return W3.o.f6046a;
    }
}
