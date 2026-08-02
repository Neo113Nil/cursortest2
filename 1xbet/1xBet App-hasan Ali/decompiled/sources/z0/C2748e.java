package z0;

import r.C2321G;
import r.C2322H;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2748e extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final C2748e f21777m = new C2748e(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2748e f21778n = new C2748e(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2748e f21779o = new C2748e(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2748e f21780p = new C2748e(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C2748e f21781q = new C2748e(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C2748e f21782r = new C2748e(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final C2748e f21783s = new C2748e(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final C2748e f21784t = new C2748e(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final C2748e f21785u = new C2748e(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final C2748e f21786v = new C2748e(1, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final C2748e f21787w = new C2748e(1, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final C2748e f21788x = new C2748e(1, 11);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21789l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2748e(int i, int i5) {
        super(i);
        this.f21789l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f21789l) {
            case 0:
                ((C2746c) obj).A0();
                break;
            case 1:
                r0 r0Var = (r0) obj;
                if (r0Var.z()) {
                    AbstractC2739O abstractC2739O = r0Var.f21854l;
                    if (!abstractC2739O.f21683u) {
                        i4.c d5 = r0Var.f21853k.d();
                        C2321G c2321g = abstractC2739O.f21686x;
                        if (d5 != null) {
                            abstractC2739O.j0(r0Var, 9223372034707292159L, 0L);
                            abstractC2739O.f21679q = d5;
                        } else if (c2321g != null) {
                            Object[] objArr = c2321g.f18930c;
                            long[] jArr = c2321g.f18928a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j5 = jArr[i];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j5) < 128) {
                                                abstractC2739O.v0((C2322H) objArr[(i << 3) + i6]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i5 != 8) {
                                        }
                                    }
                                    if (i != length) {
                                        i++;
                                    }
                                }
                            }
                            c2321g.a();
                        }
                    }
                }
                break;
            case 2:
                m0 m0Var = ((e0) obj).f21811S;
                if (m0Var != null) {
                    m0Var.invalidate();
                }
                break;
            case 3:
                e0 e0Var = (e0) obj;
                if (e0Var.z() && e0Var.i1(true)) {
                    C2731G c2731g = e0Var.f21812y;
                    C2735K c2735k = c2731g.f21613P;
                    if (c2735k.f21659l > 0) {
                        if (c2735k.f21658k || c2735k.f21657j) {
                            c2731g.V(false);
                        }
                        c2735k.f21663p.k0();
                    }
                    c2731g.O();
                    A0.F f = (A0.F) AbstractC2734J.a(c2731g);
                    I0.a rectManager = f.getRectManager();
                    if (e0Var == c2731g.f21612O.f21769d) {
                        rectManager.g(c2731g, false);
                        rectManager.e(c2731g);
                    } else {
                        rectManager.f(c2731g);
                    }
                    if (c2731g.f21622Y > 0) {
                        v3.g gVar = f.f228b0.f21727e;
                        gVar.getClass();
                        if (c2731g.f21622Y > 0) {
                            ((R.e) gVar.f20439l).c(c2731g);
                            c2731g.f21621X = true;
                        }
                        f.I(null);
                    }
                }
                break;
            case 4:
                j0 j0Var = (j0) obj;
                if (j0Var.z()) {
                    j0Var.f21835k.E();
                }
                break;
            case 5:
                C2731G c2731g2 = (C2731G) obj;
                if (c2731g2.I()) {
                    c2731g2.V(false);
                }
                break;
            case 6:
                C2731G c2731g3 = (C2731G) obj;
                if (c2731g3.I()) {
                    c2731g3.V(false);
                }
                break;
            case 7:
                C2731G c2731g4 = (C2731G) obj;
                if (c2731g4.I()) {
                    c2731g4.T(false);
                }
                break;
            case 8:
                C2731G c2731g5 = (C2731G) obj;
                if (c2731g5.I()) {
                    c2731g5.T(false);
                }
                break;
            case 9:
                C2731G c2731g6 = (C2731G) obj;
                if (c2731g6.I()) {
                    C2731G.U(c2731g6, false, 7);
                }
                break;
            case 10:
                C2731G c2731g7 = (C2731G) obj;
                if (c2731g7.I()) {
                    C2731G.W(c2731g7, false, 7);
                }
                break;
            default:
                C2731G c2731g8 = (C2731G) obj;
                if (c2731g8.I()) {
                    c2731g8.G();
                }
                break;
        }
        return W3.o.f6046a;
    }
}
