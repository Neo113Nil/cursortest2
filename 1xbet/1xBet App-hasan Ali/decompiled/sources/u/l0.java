package u;

import a.AbstractC0444a;
import h0.C1988b;
import h0.C1989c;
import h0.C1991e;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19872l;

    /* renamed from: m, reason: collision with root package name */
    public static final l0 f19858m = new l0(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final l0 f19859n = new l0(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final l0 f19860o = new l0(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final l0 f19861p = new l0(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final l0 f19862q = new l0(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final l0 f19863r = new l0(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final l0 f19864s = new l0(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final l0 f19865t = new l0(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final l0 f19866u = new l0(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final l0 f19867v = new l0(1, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final l0 f19868w = new l0(1, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final l0 f19869x = new l0(1, 11);

    /* renamed from: y, reason: collision with root package name */
    public static final l0 f19870y = new l0(1, 12);

    /* renamed from: z, reason: collision with root package name */
    public static final l0 f19871z = new l0(1, 13);

    /* renamed from: A, reason: collision with root package name */
    public static final l0 f19851A = new l0(1, 14);

    /* renamed from: B, reason: collision with root package name */
    public static final l0 f19852B = new l0(1, 15);

    /* renamed from: C, reason: collision with root package name */
    public static final l0 f19853C = new l0(1, 16);

    /* renamed from: D, reason: collision with root package name */
    public static final l0 f19854D = new l0(1, 17);

    /* renamed from: E, reason: collision with root package name */
    public static final l0 f19855E = new l0(1, 18);

    /* renamed from: F, reason: collision with root package name */
    public static final l0 f19856F = new l0(1, 19);

    /* renamed from: G, reason: collision with root package name */
    public static final l0 f19857G = new l0(1, 20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i, int i5) {
        super(i);
        this.f19872l = i5;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [W3.e, java.lang.Object] */
    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f19872l) {
            case 0:
                return W3.o.f6046a;
            case 1:
                ((InterfaceC2015a) obj).invoke();
                return W3.o.f6046a;
            case 2:
                C2452c0 c2452c0 = (C2452c0) obj;
                long j5 = c2452c0.f;
                ((Z.s) y0.f19969a.getValue()).d(c2452c0, f19860o, c2452c0.f19774g);
                long j6 = c2452c0.f;
                if (j5 != j6) {
                    C2446Q c2446q = c2452c0.f19780n;
                    if (c2446q != null) {
                        c2446q.f19703g = j6;
                        if (c2446q.f19699b == null) {
                            c2446q.f19704h = AbstractC2036a.V((1.0d - c2446q.f19702e.a(0)) * c2452c0.f);
                        }
                    } else if (j6 != 0) {
                        c2452c0.u();
                    }
                }
                return W3.o.f6046a;
            case 3:
                long j7 = ((W0.g) obj).f6007a;
                return new C2467n(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
            case 4:
                C2467n c2467n = (C2467n) obj;
                return new W0.g((Float.floatToRawIntBits(c2467n.f19881a) << 32) | (Float.floatToRawIntBits(c2467n.f19882b) & 4294967295L));
            case 5:
                return new C2466m(((W0.f) obj).f6006k);
            case 6:
                return new W0.f(((C2466m) obj).f19873a);
            case 7:
                return new C2466m(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((C2466m) obj).f19873a);
            case 9:
                long j8 = ((W0.j) obj).f6009a;
                return new C2467n((int) (j8 >> 32), (int) (j8 & 4294967295L));
            case 10:
                C2467n c2467n2 = (C2467n) obj;
                return new W0.j(G4.l.a(Math.round(c2467n2.f19881a), Math.round(c2467n2.f19882b)));
            case 11:
                long j9 = ((W0.l) obj).f6015a;
                return new C2467n((int) (j9 >> 32), (int) (j9 & 4294967295L));
            case 12:
                C2467n c2467n3 = (C2467n) obj;
                int round = Math.round(c2467n3.f19881a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(c2467n3.f19882b);
                return new W0.l(AbstractC0444a.b(round, round2 >= 0 ? round2 : 0));
            case 13:
                return new C2466m(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C2466m) obj).f19873a);
            case 15:
                long j10 = ((C1988b) obj).f17191a;
                return new C2467n(C1988b.d(j10), C1988b.e(j10));
            case 16:
                C2467n c2467n4 = (C2467n) obj;
                return new C1988b(G4.d.d(c2467n4.f19881a, c2467n4.f19882b));
            case 17:
                C1989c c1989c = (C1989c) obj;
                return new C2469p(c1989c.f17193a, c1989c.f17194b, c1989c.f17195c, c1989c.f17196d);
            case 18:
                C2469p c2469p = (C2469p) obj;
                return new C1989c(c2469p.f19893a, c2469p.f19894b, c2469p.f19895c, c2469p.f19896d);
            case 19:
                long j11 = ((C1991e) obj).f17204a;
                return new C2467n(C1991e.d(j11), C1991e.b(j11));
            default:
                C2467n c2467n5 = (C2467n) obj;
                return new C1991e(AbstractC0444a.d(c2467n5.f19881a, c2467n5.f19882b));
        }
    }
}
