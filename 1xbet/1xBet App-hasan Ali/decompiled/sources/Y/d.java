package Y;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0322v0;
import P.C0326x0;
import P.Z;
import P.e1;
import S3.C0416t;
import S3.L;
import W3.o;
import java.util.Map;
import r.C2321G;
import r.O;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: o, reason: collision with root package name */
    public static final v3.g f6106o = new v3.g(13, new L(3), new C0416t(7));

    /* renamed from: k, reason: collision with root package name */
    public final Map f6107k;

    /* renamed from: l, reason: collision with root package name */
    public final C2321G f6108l;

    /* renamed from: m, reason: collision with root package name */
    public f f6109m;

    /* renamed from: n, reason: collision with root package name */
    public final O0.e f6110n;

    public d(Map map) {
        this.f6107k = map;
        long[] jArr = O.f18957a;
        this.f6108l = new C2321G();
        this.f6110n = new O0.e(10, this);
    }

    @Override // Y.c
    public final void a(Object obj) {
        if (this.f6108l.k(obj) == null) {
            this.f6107k.remove(obj);
        }
    }

    @Override // Y.c
    public final void b(Object obj, X.d dVar, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(533563200);
        int i6 = 6;
        if ((i & 6) == 0) {
            i5 = (c0315s.h(obj) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.h(this) ? 256 : 128;
        }
        if (c0315s.P(i5 & 1, (i5 & 147) != 146)) {
            c0315s.a0(obj);
            Object M5 = c0315s.M();
            Z z3 = C0302l.f4480a;
            if (M5 == z3) {
                O0.e eVar = this.f6110n;
                if (!((Boolean) eVar.c(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f6107k.get(obj);
                e1 e1Var = h.f6114a;
                i iVar = new i(new g(map, eVar));
                c0315s.i0(iVar);
                M5 = iVar;
            }
            i iVar2 = (i) M5;
            AbstractC0329z.b(new C0322v0[]{h.f6114a.a(iVar2), V1.a.f5961a.a(iVar2)}, dVar, c0315s, (i5 & 112) | 8);
            o oVar = o.f6046a;
            boolean h3 = c0315s.h(this) | c0315s.h(obj) | c0315s.h(iVar2);
            Object M6 = c0315s.M();
            if (h3 || M6 == z3) {
                M6 = new B1.b(this, obj, iVar2, i6);
                c0315s.i0(M6);
            }
            AbstractC0329z.c(oVar, (i4.c) M6, c0315s);
            c0315s.t();
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new B1.c(this, obj, dVar, i, 4);
        }
    }
}
