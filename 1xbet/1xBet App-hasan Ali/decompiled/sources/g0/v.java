package g0;

import A0.F;
import h0.C1989c;
import java.io.Serializable;
import x0.InterfaceC2618d;
import x0.Q;
import x0.Y;
import x0.Z;
import z.C2684H;
import z.C2717s;
import z0.AbstractC2749f;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17065l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f17066m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f17067n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17068o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Serializable f17069p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f17070q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(s sVar, s sVar2, Object obj, int i, A.s sVar3, int i5) {
        super(1);
        this.f17065l = i5;
        this.f17066m = sVar;
        this.f17067n = sVar2;
        this.f17070q = obj;
        this.f17068o = i;
        this.f17069p = sVar3;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f17065l) {
            case 0:
                InterfaceC2618d interfaceC2618d = (InterfaceC2618d) obj;
                s sVar = (s) this.f17067n;
                if (((s) this.f17066m) != ((C1965j) ((F) AbstractC2749f.w(sVar)).getFocusOwner()).f17035h) {
                    return Boolean.TRUE;
                }
                boolean B5 = AbstractC1961f.B(sVar, (s) this.f17070q, this.f17068o, (A.s) this.f17069p);
                Boolean valueOf = Boolean.valueOf(B5);
                if (B5 || !interfaceC2618d.a()) {
                    return valueOf;
                }
                return null;
            case 1:
                InterfaceC2618d interfaceC2618d2 = (InterfaceC2618d) obj;
                s sVar2 = (s) this.f17067n;
                if (((s) this.f17066m) != ((C1965j) ((F) AbstractC2749f.w(sVar2)).getFocusOwner()).f17035h) {
                    return Boolean.TRUE;
                }
                boolean A3 = AbstractC1961f.A(this.f17068o, (A.s) this.f17069p, sVar2, (C1989c) this.f17070q);
                Boolean valueOf2 = Boolean.valueOf(A3);
                if (A3 || !interfaceC2618d2.a()) {
                    return valueOf2;
                }
                return null;
            default:
                Y y5 = (Y) obj;
                Z[] zArr = (Z[]) this.f17066m;
                int length = zArr.length;
                int i = 0;
                int i5 = 0;
                while (i < length) {
                    Z z3 = zArr[i];
                    kotlin.jvm.internal.l.c(z3);
                    boolean z5 = z3.k() instanceof C2684H;
                    W0.m layoutDirection = ((Q) this.f17070q).getLayoutDirection();
                    C2717s c2717s = (C2717s) this.f17067n;
                    c2717s.getClass();
                    Y.g(y5, z3, c2717s.f21568b.a(0, this.f17068o - z3.f20973k, layoutDirection), ((int[]) this.f17069p)[i5]);
                    i++;
                    i5++;
                }
                return W3.o.f6046a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(Z[] zArr, C2717s c2717s, int i, Q q5, int[] iArr) {
        super(1);
        this.f17065l = 2;
        this.f17066m = zArr;
        this.f17067n = c2717s;
        this.f17068o = i;
        this.f17070q = q5;
        this.f17069p = iArr;
    }
}
