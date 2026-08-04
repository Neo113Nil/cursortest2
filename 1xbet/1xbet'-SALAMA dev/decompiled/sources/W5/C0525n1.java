package W5;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0447n;
import U5.EnumC0446m;

/* JADX INFO: renamed from: W5.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0525n1 implements U5.M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0457y f7295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0534q1 f7296b;

    public C0525n1(C0534q1 c0534q1, AbstractC0457y abstractC0457y) {
        this.f7296b = c0534q1;
        this.f7295a = abstractC0457y;
    }

    @Override // U5.M
    public final void a(C0447n c0447n) {
        U5.L c0531p1;
        C0534q1 c0534q1 = this.f7296b;
        c0534q1.getClass();
        EnumC0446m enumC0446m = c0447n.f6558a;
        if (enumC0446m == EnumC0446m.f6554e) {
            return;
        }
        EnumC0446m enumC0446m2 = EnumC0446m.f6552c;
        EnumC0446m enumC0446m3 = EnumC0446m.f6553d;
        AbstractC0438e abstractC0438e = c0534q1.f7315f;
        if (enumC0446m == enumC0446m2 || enumC0446m == enumC0446m3) {
            abstractC0438e.q();
        }
        if (c0534q1.f7317h == enumC0446m2) {
            if (enumC0446m == EnumC0446m.f6550a) {
                return;
            }
            if (enumC0446m == enumC0446m3) {
                c0534q1.e();
                return;
            }
        }
        int iOrdinal = enumC0446m.ordinal();
        if (iOrdinal != 0) {
            AbstractC0457y abstractC0457y = this.f7295a;
            if (iOrdinal == 1) {
                c0531p1 = new C0531p1(U5.J.b(abstractC0457y, null));
            } else if (iOrdinal == 2) {
                c0531p1 = new C0531p1(U5.J.a(c0447n.f6559b));
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:" + enumC0446m);
                }
                c0531p1 = new C0516k1(c0534q1, abstractC0457y);
            }
        } else {
            c0531p1 = new C0531p1(U5.J.f6425e);
        }
        c0534q1.f7317h = enumC0446m;
        abstractC0438e.r(enumC0446m, c0531p1);
    }
}
