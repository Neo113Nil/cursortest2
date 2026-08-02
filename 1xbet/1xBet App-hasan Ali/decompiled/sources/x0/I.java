package x0;

import A0.C0064w;
import r.AbstractC2335m;
import w0.AbstractC2540a;
import z0.A0;
import z0.AbstractC2734J;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.z0;

/* loaded from: classes.dex */
public final class I implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final r.w f20936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f20937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20938c;

    public I(K k5, Object obj) {
        this.f20937b = k5;
        this.f20938c = obj;
        int[] iArr = AbstractC2335m.f19017a;
        this.f20936a = new r.w();
    }

    @Override // x0.g0
    public final void a() {
        K k5 = this.f20937b;
        k5.b();
        C2731G c2731g = (C2731G) k5.f20950t.k(this.f20938c);
        if (c2731g != null) {
            if (k5.f20955y <= 0) {
                AbstractC2540a.b("No pre-composed items to dispose");
            }
            C2731G c2731g2 = k5.f20941k;
            int j5 = ((R.b) c2731g2.o()).f5100k.j(c2731g);
            if (j5 < ((R.b) c2731g2.o()).f5100k.f5108m - k5.f20955y) {
                AbstractC2540a.b("Item is not in pre-composed item range");
            }
            k5.f20954x++;
            k5.f20955y--;
            C2614C c2614c = (C2614C) k5.f20946p.g(c2731g);
            if (c2614c != null) {
                c2614c.getClass();
            }
            int i = (((R.b) c2731g2.o()).f5100k.f5108m - k5.f20955y) - k5.f20954x;
            c2731g2.f21639z = true;
            c2731g2.M(j5, i, 1);
            c2731g2.f21639z = false;
            k5.a(i);
        }
    }

    @Override // x0.g0
    public final int b() {
        C2731G c2731g = (C2731G) this.f20937b.f20950t.g(this.f20938c);
        if (c2731g != null) {
            return ((R.b) c2731g.n()).f5100k.f5108m;
        }
        return 0;
    }

    @Override // x0.g0
    public final void c(int i, long j5) {
        K k5 = this.f20937b;
        C2731G c2731g = (C2731G) k5.f20950t.g(this.f20938c);
        if (c2731g == null || !c2731g.I()) {
            return;
        }
        int i5 = ((R.b) c2731g.n()).f5100k.f5108m;
        if (i < 0 || i >= i5) {
            AbstractC2540a.d("Index (" + i + ") is out of bound of [0, " + i5 + ')');
        }
        if (c2731g.J()) {
            AbstractC2540a.a("Pre-measure called on node that is not placed");
        }
        C2731G c2731g2 = k5.f20941k;
        c2731g2.f21639z = true;
        ((A0.F) AbstractC2734J.a(c2731g)).y((C2731G) ((R.b) c2731g.n()).get(i), j5);
        c2731g2.f21639z = false;
        this.f20936a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [A0.w] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // x0.g0
    public final void d(C0064w c0064w) {
        z0.c0 c0Var;
        b0.o oVar;
        z0 z0Var;
        C2731G c2731g = (C2731G) this.f20937b.f20950t.g(this.f20938c);
        if (c2731g == null || (c0Var = c2731g.f21612O) == null || (oVar = c0Var.f) == null) {
            return;
        }
        if (!oVar.f7162k.f7175x) {
            AbstractC2540a.b("visitSubtreeIf called on an unattached node");
        }
        R.e eVar = new R.e(new b0.o[16]);
        b0.o oVar2 = oVar.f7162k;
        b0.o oVar3 = oVar2.f7167p;
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
            b0.o oVar4 = (b0.o) eVar.l(i - 1);
            if ((oVar4.f7165n & 262144) != 0) {
                for (b0.o oVar5 = oVar4; oVar5 != null; oVar5 = oVar5.f7167p) {
                    if ((oVar5.f7164m & 262144) != 0) {
                        AbstractC2756m abstractC2756m = oVar5;
                        ?? r7 = 0;
                        while (abstractC2756m != 0) {
                            if (abstractC2756m instanceof A0) {
                                A0 a02 = (A0) abstractC2756m;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(a02.o());
                                z0 z0Var2 = z0.f21877l;
                                if (equals) {
                                    c0064w.c(a02);
                                    z0Var = z0Var2;
                                } else {
                                    z0Var = z0.f21876k;
                                }
                                if (z0Var == z0.f21878m) {
                                    return;
                                }
                                if (z0Var == z0Var2) {
                                    break;
                                }
                            } else if ((abstractC2756m.f7164m & 262144) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                b0.o oVar6 = abstractC2756m.f21839z;
                                int i5 = 0;
                                abstractC2756m = abstractC2756m;
                                r7 = r7;
                                while (oVar6 != null) {
                                    if ((oVar6.f7164m & 262144) != 0) {
                                        i5++;
                                        r7 = r7;
                                        if (i5 == 1) {
                                            abstractC2756m = oVar6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new R.e(new b0.o[16]);
                                            }
                                            if (abstractC2756m != 0) {
                                                r7.c(abstractC2756m);
                                                abstractC2756m = 0;
                                            }
                                            r7.c(oVar6);
                                        }
                                    }
                                    oVar6 = oVar6.f7167p;
                                    abstractC2756m = abstractC2756m;
                                    r7 = r7;
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC2756m = AbstractC2749f.f(r7);
                        }
                    }
                }
            }
            AbstractC2749f.b(eVar, oVar4);
        }
    }
}
