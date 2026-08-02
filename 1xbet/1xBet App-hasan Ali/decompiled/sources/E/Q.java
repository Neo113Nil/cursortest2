package E;

import h0.C1989c;
import x0.InterfaceC2639z;
import z.C2684H;
import z.C2686J;

/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1071l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1072m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1073n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1074o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1075p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(x0.Q q5, InterfaceC2639z interfaceC2639z, x0.Z z3, int i, int i5) {
        super(1);
        this.f1071l = i5;
        this.f1072m = q5;
        this.f1075p = interfaceC2639z;
        this.f1073n = z3;
        this.f1074o = i;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1071l) {
            case 0:
                x0.Y y5 = (x0.Y) obj;
                S s2 = (S) this.f1075p;
                int i = s2.f1077l;
                F0 f02 = (F0) s2.f1079n.invoke();
                K0.L l5 = f02 != null ? f02.f1029a : null;
                x0.Q q5 = (x0.Q) this.f1072m;
                boolean z3 = q5.getLayoutDirection() == W0.m.f6017l;
                x0.Z z5 = (x0.Z) this.f1073n;
                C1989c h3 = W.h(q5, i, s2.f1078m, l5, z3, z5.f20973k);
                x.P p5 = x.P.f20696l;
                int i5 = z5.f20973k;
                B0 b02 = s2.f1076k;
                b02.a(p5, h3, this.f1074o, i5);
                x0.Y.j(y5, z5, Math.round(-b02.f994a.h()), 0);
                break;
            case 1:
                x0.Y y6 = (x0.Y) obj;
                I0 i02 = (I0) this.f1075p;
                int i6 = i02.f1047l;
                F0 f03 = (F0) i02.f1049n.invoke();
                K0.L l6 = f03 != null ? f03.f1029a : null;
                x0.Z z6 = (x0.Z) this.f1073n;
                C1989c h4 = W.h((x0.Q) this.f1072m, i6, i02.f1048m, l6, false, z6.f20973k);
                x.P p6 = x.P.f20695k;
                int i7 = z6.f20974l;
                B0 b03 = i02.f1046k;
                b03.a(p6, h4, this.f1074o, i7);
                x0.Y.j(y6, z6, 0, Math.round(-b03.f994a.h()));
                break;
            default:
                x0.Y y7 = (x0.Y) obj;
                x0.Z[] zArr = (x0.Z[]) this.f1072m;
                int length = zArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    x0.Z z7 = zArr[i8];
                    kotlin.jvm.internal.l.c(z7);
                    boolean z8 = z7.k() instanceof C2684H;
                    C2686J c2686j = (C2686J) this.f1075p;
                    c2686j.getClass();
                    x0.Y.g(y7, z7, ((int[]) this.f1073n)[i9], c2686j.f21483b.a(0, this.f1074o - z7.f20974l));
                    i8++;
                    i9++;
                }
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(x0.Z[] zArr, C2686J c2686j, int i, int[] iArr) {
        super(1);
        this.f1071l = 2;
        this.f1072m = zArr;
        this.f1075p = c2686j;
        this.f1074o = i;
        this.f1073n = iArr;
    }
}
