package y0;

import A0.F;
import b0.o;
import java.util.HashSet;
import r.C2316B;
import w0.AbstractC2540a;
import x0.J;
import z.C2723y;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.C2746c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final F f21129a;

    /* renamed from: b, reason: collision with root package name */
    public final R.e f21130b = new R.e(new C2746c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final R.e f21131c = new R.e(new g[16]);

    /* renamed from: d, reason: collision with root package name */
    public final R.e f21132d = new R.e(new C2731G[16]);

    /* renamed from: e, reason: collision with root package name */
    public final R.e f21133e = new R.e(new g[16]);
    public boolean f;

    public c(F f) {
        this.f21129a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(o oVar, g gVar, HashSet hashSet) {
        if (!oVar.f7162k.f7175x) {
            AbstractC2540a.b("visitSubtreeIf called on an unattached node");
        }
        R.e eVar = new R.e(new o[16]);
        o oVar2 = oVar.f7162k;
        o oVar3 = oVar2.f7167p;
        if (oVar3 == null) {
            AbstractC2749f.b(eVar, oVar2);
        } else {
            eVar.c(oVar3);
        }
        while (true) {
            int i = eVar.f5108m;
            if (i == 0) {
                return;
            }
            o oVar4 = (o) eVar.l(i - 1);
            if ((oVar4.f7165n & 32) != 0) {
                for (o oVar5 = oVar4; oVar5 != null; oVar5 = oVar5.f7167p) {
                    if ((oVar5.f7164m & 32) != 0) {
                        AbstractC2756m abstractC2756m = oVar5;
                        ?? r5 = 0;
                        while (abstractC2756m != 0) {
                            if (abstractC2756m instanceof d) {
                                d dVar = (d) abstractC2756m;
                                if (dVar instanceof C2746c) {
                                    C2746c c2746c = (C2746c) dVar;
                                    if ((c2746c.f21764y instanceof C2723y) && c2746c.f21763A.contains(gVar)) {
                                        hashSet.add(dVar);
                                    }
                                }
                                if (dVar.k().b(gVar)) {
                                    break;
                                }
                            } else if ((abstractC2756m.f7164m & 32) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                o oVar6 = abstractC2756m.f21839z;
                                int i5 = 0;
                                abstractC2756m = abstractC2756m;
                                r5 = r5;
                                while (oVar6 != null) {
                                    if ((oVar6.f7164m & 32) != 0) {
                                        i5++;
                                        r5 = r5;
                                        if (i5 == 1) {
                                            abstractC2756m = oVar6;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new R.e(new o[16]);
                                            }
                                            if (abstractC2756m != 0) {
                                                r5.c(abstractC2756m);
                                                abstractC2756m = 0;
                                            }
                                            r5.c(oVar6);
                                        }
                                    }
                                    oVar6 = oVar6.f7167p;
                                    abstractC2756m = abstractC2756m;
                                    r5 = r5;
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC2756m = AbstractC2749f.f(r5);
                        }
                    }
                }
            }
            AbstractC2749f.b(eVar, oVar4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        J j5 = new J(2, this);
        C2316B c2316b = this.f21129a.f200F0;
        if (c2316b.f(j5) >= 0) {
            return;
        }
        c2316b.a(j5);
    }
}
