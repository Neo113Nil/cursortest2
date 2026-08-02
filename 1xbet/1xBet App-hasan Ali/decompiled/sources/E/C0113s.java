package E;

import A0.C0040k0;
import A0.o1;
import P.C0302l;
import P.C0315s;
import a.AbstractC0444a;
import i4.InterfaceC2015a;

/* renamed from: E.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113s extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ P0.q f1281A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ W0.c f1282B;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f1283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K0.O f1284m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1285n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1286o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B0 f1287p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0.w f1288q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o1 f1289r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0.p f1290s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0.p f1291t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b0.p f1292u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b0.p f1293v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C.c f1294w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ I.O f1295x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f1296y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f1297z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0113s(Z z3, K0.O o5, int i, int i5, B0 b02, P0.w wVar, o1 o1Var, b0.p pVar, b0.p pVar2, b0.p pVar3, b0.p pVar4, C.c cVar, I.O o6, boolean z5, i4.c cVar2, P0.q qVar, W0.c cVar3) {
        super(2);
        this.f1283l = z3;
        this.f1284m = o5;
        this.f1285n = i;
        this.f1286o = i5;
        this.f1287p = b02;
        this.f1288q = wVar;
        this.f1289r = o1Var;
        this.f1290s = pVar;
        this.f1291t = pVar2;
        this.f1292u = pVar3;
        this.f1293v = pVar4;
        this.f1294w = cVar;
        this.f1295x = o6;
        this.f1296y = z5;
        this.f1297z = (kotlin.jvm.internal.m) cVar2;
        this.f1281A = qVar;
        this.f1282B = cVar3;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        b0.p i02;
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            Z z3 = this.f1283l;
            b0.p d5 = androidx.compose.foundation.layout.c.d(mVar, ((W0.f) z3.f1093g.getValue()).f6006k, Float.NaN);
            int i = this.f1285n;
            int i5 = this.f1286o;
            K0.O o5 = this.f1284m;
            b0.p a5 = b0.a.a(d5, new P(i, i5, o5));
            boolean h3 = c0315s.h(z3);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new C0040k0(4, z3);
                c0315s.i0(M5);
            }
            InterfaceC2015a interfaceC2015a = (InterfaceC2015a) M5;
            B0 b02 = this.f1287p;
            x.P p5 = (x.P) b02.f998e.getValue();
            P0.w wVar = this.f1288q;
            int i6 = K0.N.f2802c;
            long j5 = wVar.f4680b;
            int i7 = (int) (j5 >> 32);
            long j6 = b02.f997d;
            if (i7 == ((int) (j6 >> 32)) && (i7 = (int) (j5 & 4294967295L)) == ((int) (4294967295L & j6))) {
                i7 = K0.N.e(j5);
            }
            b02.f997d = j5;
            P0.D l5 = W.l(this.f1289r, wVar.f4679a);
            int ordinal = p5.ordinal();
            if (ordinal == 0) {
                i02 = new I0(b02, i7, l5, interfaceC2015a);
            } else {
                if (ordinal != 1) {
                    throw new D2.e();
                }
                i02 = new S(b02, i7, l5, interfaceC2015a);
            }
            N4.b.d(androidx.compose.foundation.relocation.a.a(b0.a.a(AbstractC0444a.o(a5).c(i02).c(this.f1290s).c(this.f1291t), new E0(1, o5)).c(this.f1292u).c(this.f1293v), this.f1294w), X.e.d(-363167407, new r(this.f1295x, z3, this.f1296y, this.f1297z, wVar, this.f1281A, this.f1282B, this.f1286o), c0315s), c0315s, 48);
        }
        return W3.o.f6046a;
    }
}
