package H;

import K0.C0203h;
import K0.K;
import K0.L;
import K0.O;
import K0.r;
import Q2.C0375o;
import X3.v;
import i0.p;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import z0.AbstractC2749f;

/* loaded from: classes.dex */
public final class f extends m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2049l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f2050m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i) {
        super(1);
        this.f2049l = i;
        this.f2050m = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    @Override // i4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        W0.c cVar;
        L l5;
        switch (this.f2049l) {
            case 0:
                List list = (List) obj;
                g gVar = this.f2050m;
                d y02 = gVar.y0();
                O e3 = O.e(gVar.f2061z, p.f17293g, 0L, null, 0L, 0, 0L, 16777214);
                W0.m mVar = y02.f2041o;
                L l6 = null;
                if (mVar != null && (cVar = y02.i) != null) {
                    C0203h c0203h = new C0203h(y02.f2029a, null, 6);
                    if (y02.f2036j != null && y02.f2040n != null) {
                        long a5 = W0.a.a(y02.f2042p, 0, 0, 0, 0, 10);
                        v vVar = v.f6090k;
                        int i = y02.f;
                        boolean z3 = y02.f2033e;
                        int i5 = y02.f2032d;
                        O0.d dVar = y02.f2031c;
                        l5 = new L(new K(c0203h, e3, vVar, i, z3, i5, cVar, mVar, dVar, a5), new r(new C0375o(c0203h, e3, vVar, cVar, dVar), a5, y02.f, y02.f2032d == 2), y02.f2038l);
                        if (l5 != null) {
                            list.add(l5);
                            l6 = l5;
                        }
                        break;
                    }
                }
                l5 = null;
                if (l5 != null) {
                }
                break;
            case 1:
                String str = ((C0203h) obj).f2829l;
                g gVar2 = this.f2050m;
                e eVar = gVar2.f2059I;
                if (eVar == null) {
                    e eVar2 = new e(gVar2.f2060y, str);
                    d dVar2 = new d(str, gVar2.f2061z, gVar2.f2051A, gVar2.f2052B, gVar2.f2053C, gVar2.f2054D, gVar2.f2055E);
                    dVar2.d(gVar2.y0().i);
                    eVar2.f2048d = dVar2;
                    gVar2.f2059I = eVar2;
                } else if (!l.a(str, eVar.f2046b)) {
                    eVar.f2046b = str;
                    d dVar3 = eVar.f2048d;
                    if (dVar3 != null) {
                        O o5 = gVar2.f2061z;
                        O0.d dVar4 = gVar2.f2051A;
                        int i6 = gVar2.f2052B;
                        boolean z5 = gVar2.f2053C;
                        int i7 = gVar2.f2054D;
                        int i8 = gVar2.f2055E;
                        dVar3.f2029a = str;
                        dVar3.f2030b = o5;
                        dVar3.f2031c = dVar4;
                        dVar3.f2032d = i6;
                        dVar3.f2033e = z5;
                        dVar3.f = i7;
                        dVar3.f2034g = i8;
                        dVar3.c();
                    }
                }
                AbstractC2749f.o(gVar2);
                AbstractC2749f.n(gVar2);
                AbstractC2749f.m(gVar2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g gVar3 = this.f2050m;
                e eVar3 = gVar3.f2059I;
                if (eVar3 != null) {
                    eVar3.f2047c = booleanValue;
                    AbstractC2749f.o(gVar3);
                    AbstractC2749f.n(gVar3);
                    AbstractC2749f.m(gVar3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
