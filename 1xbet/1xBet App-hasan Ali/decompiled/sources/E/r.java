package E;

import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import n.AbstractC2107A;
import x0.InterfaceC2637x;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.O f1264l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f1265m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1266n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f1267o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P0.w f1268p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0.q f1269q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W0.c f1270r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1271s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(I.O o5, Z z3, boolean z5, i4.c cVar, P0.w wVar, P0.q qVar, W0.c cVar2, int i) {
        super(2);
        this.f1264l = o5;
        this.f1265m = z3;
        this.f1266n = z5;
        this.f1267o = (kotlin.jvm.internal.m) cVar;
        this.f1268p = wVar;
        this.f1269q = qVar;
        this.f1270r = cVar2;
        this.f1271s = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r4 != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            P0.w wVar = this.f1268p;
            P0.q qVar = this.f1269q;
            Z z3 = this.f1265m;
            C0112q c0112q = new C0112q(z3, this.f1267o, wVar, qVar, this.f1270r, this.f1271s);
            b0.m mVar = b0.m.f7161k;
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, mVar);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, c0112q);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            boolean z5 = true;
            c0315s.q(true);
            O a5 = z3.a();
            O o5 = O.f1064k;
            boolean z6 = this.f1266n;
            if (a5 != o5 && z3.c() != null) {
                InterfaceC2637x c6 = z3.c();
                kotlin.jvm.internal.l.c(c6);
                if (c6.F()) {
                }
            }
            z5 = false;
            I.O o6 = this.f1264l;
            W.f(o6, z5, c0315s, 0);
            if (z3.a() == O.f1066m && z6) {
                c0315s.X(-2032274);
                W.e(o6, c0315s, 0);
                c0315s.q(false);
            } else {
                c0315s.X(-1955394);
                c0315s.q(false);
            }
        }
        return W3.o.f6046a;
    }
}
