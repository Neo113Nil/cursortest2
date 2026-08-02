package z0;

import A0.I0;
import A0.q1;
import P.AbstractC0329z;
import P.e1;

/* renamed from: z0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2751h extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: m, reason: collision with root package name */
    public static final C2751h f21821m = new C2751h(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2751h f21822n = new C2751h(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2751h f21823o = new C2751h(2, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2751h f21824p = new C2751h(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21825l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2751h(int i, int i5) {
        super(i);
        this.f21825l = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [R.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21825l) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC2753j) obj).getClass();
                break;
            case 1:
                ((C2731G) ((InterfaceC2753j) obj)).d0((x0.O) obj2);
                break;
            case 2:
                ((C2731G) ((InterfaceC2753j) obj)).e0((b0.p) obj2);
                break;
            default:
                P.B b3 = (P.B) obj2;
                C2731G c2731g = (C2731G) ((InterfaceC2753j) obj);
                c2731g.K = b3;
                e1 e1Var = I0.f287h;
                X.i iVar = (X.i) b3;
                iVar.getClass();
                c2731g.a0((W0.c) AbstractC0329z.u(iVar, e1Var));
                W0.m mVar = (W0.m) AbstractC0329z.u(iVar, I0.f292n);
                W0.m mVar2 = c2731g.f21608I;
                c0 c0Var = c2731g.f21612O;
                if (mVar2 != mVar) {
                    c2731g.f21608I = mVar;
                    c2731g.E();
                    C2731G u5 = c2731g.u();
                    if (u5 != null) {
                        u5.C();
                    }
                    c2731g.D();
                    for (b0.o oVar = c0Var.f; oVar != null; oVar = oVar.f7167p) {
                        oVar.r0();
                    }
                }
                c2731g.f0((q1) AbstractC0329z.u(iVar, I0.f297s));
                b0.o oVar2 = c0Var.f;
                if ((oVar2.f7165n & 32768) != 0) {
                    while (oVar2 != null) {
                        if ((oVar2.f7164m & 32768) != 0) {
                            AbstractC2756m abstractC2756m = oVar2;
                            ?? r22 = 0;
                            while (abstractC2756m != 0) {
                                if (abstractC2756m instanceof InterfaceC2754k) {
                                    b0.o oVar3 = ((b0.o) ((InterfaceC2754k) abstractC2756m)).f7162k;
                                    if (oVar3.f7175x) {
                                        f0.c(oVar3);
                                    } else {
                                        oVar3.f7171t = true;
                                    }
                                } else if ((abstractC2756m.f7164m & 32768) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                    b0.o oVar4 = abstractC2756m.f21839z;
                                    int i = 0;
                                    abstractC2756m = abstractC2756m;
                                    r22 = r22;
                                    while (oVar4 != null) {
                                        if ((oVar4.f7164m & 32768) != 0) {
                                            i++;
                                            r22 = r22;
                                            if (i == 1) {
                                                abstractC2756m = oVar4;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new R.e(new b0.o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r22.c(abstractC2756m);
                                                    abstractC2756m = 0;
                                                }
                                                r22.c(oVar4);
                                            }
                                        }
                                        oVar4 = oVar4.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r22 = r22;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC2756m = AbstractC2749f.f(r22);
                            }
                        }
                        if ((oVar2.f7165n & 32768) != 0) {
                            oVar2 = oVar2.f7167p;
                        }
                    }
                }
                break;
        }
        return W3.o.f6046a;
    }
}
