package E;

import P0.C0335e;
import java.util.List;

/* renamed from: E.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099g extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final C0099g f1144m = new C0099g(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0099g f1145n = new C0099g(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0099g f1146o = new C0099g(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0099g f1147p = new C0099g(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0099g f1148q = new C0099g(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C0099g f1149r = new C0099g(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final C0099g f1150s = new C0099g(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final C0099g f1151t = new C0099g(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final C0099g f1152u = new C0099g(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final C0099g f1153v = new C0099g(1, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final C0099g f1154w = new C0099g(1, 10);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1155l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0099g(int i, int i5) {
        super(i);
        this.f1155l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        Integer num;
        W3.o oVar = W3.o.f6046a;
        switch (this.f1155l) {
            case 0:
                return oVar;
            case 1:
                return oVar;
            case 2:
                return oVar;
            case 3:
                return oVar;
            case 4:
                I.L l5 = (I.L) obj;
                long j5 = l5.f;
                int i = K0.N.f2802c;
                return new C0335e(((int) (j5 & 4294967295L)) - W.p(l5.f2417g.f2829l, (int) (4294967295L & j5)), 0);
            case 5:
                I.L l6 = (I.L) obj;
                String str = l6.f2417g.f2829l;
                long j6 = l6.f;
                int i5 = K0.N.f2802c;
                int m5 = W.m(str, (int) (j6 & 4294967295L));
                if (m5 != -1) {
                    return new C0335e(0, m5 - ((int) (4294967295L & l6.f)));
                }
                return null;
            case 6:
                I.L l7 = (I.L) obj;
                Integer d5 = l7.d();
                if (d5 == null) {
                    return null;
                }
                int intValue = d5.intValue();
                long j7 = l7.f;
                int i6 = K0.N.f2802c;
                return new C0335e(((int) (4294967295L & j7)) - intValue, 0);
            case 7:
                I.L l8 = (I.L) obj;
                Integer c5 = l8.c();
                if (c5 == null) {
                    return null;
                }
                int intValue2 = c5.intValue();
                long j8 = l8.f;
                int i7 = K0.N.f2802c;
                return new C0335e(0, intValue2 - ((int) (4294967295L & j8)));
            case 8:
                I.L l9 = (I.L) obj;
                K0.L l10 = l9.f2414c;
                if (l10 != null) {
                    int e3 = K0.N.e(l9.f);
                    P0.q qVar = l9.f2415d;
                    num = Integer.valueOf(qVar.a(l10.h(l10.e(qVar.b(e3)))));
                } else {
                    num = null;
                }
                if (num == null) {
                    return null;
                }
                int intValue3 = num.intValue();
                long j9 = l9.f;
                int i8 = K0.N.f2802c;
                return new C0335e(((int) (4294967295L & j9)) - intValue3, 0);
            case 9:
                I.L l11 = (I.L) obj;
                Integer b3 = l11.b();
                if (b3 == null) {
                    return null;
                }
                int intValue4 = b3.intValue();
                long j10 = l11.f;
                int i9 = K0.N.f2802c;
                return new C0335e(0, intValue4 - ((int) (4294967295L & j10)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Boolean", obj2);
                x.P p5 = ((Boolean) obj2).booleanValue() ? x.P.f20695k : x.P.f20696l;
                Object obj3 = list.get(0);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Float", obj3);
                return new B0(p5, ((Float) obj3).floatValue());
        }
    }
}
