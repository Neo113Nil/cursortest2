package E;

import K0.C0203h;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P0.q f999l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1000m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P0.w f1001n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.O f1002o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f1003p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P0.q qVar, boolean z3, P0.w wVar, I.O o5, Z z5) {
        super(3);
        this.f999l = qVar;
        this.f1000m = z3;
        this.f1001n = wVar;
        this.f1002o = o5;
        this.f1003p = z5;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        P0.q qVar = this.f999l;
        if (!booleanValue) {
            intValue = qVar.a(intValue);
        }
        if (!booleanValue) {
            intValue2 = qVar.a(intValue2);
        }
        boolean z3 = false;
        if (this.f1000m) {
            P0.w wVar = this.f1001n;
            int i = K0.N.f2802c;
            long j5 = wVar.f4680b;
            if (intValue != ((int) (j5 >> 32)) || intValue2 != ((int) (j5 & 4294967295L))) {
                int min = Math.min(intValue, intValue2);
                I.O o5 = this.f1002o;
                O o6 = O.f1064k;
                if (min >= 0) {
                    int max = Math.max(intValue, intValue2);
                    C0203h c0203h = wVar.f4679a;
                    if (max <= c0203h.f2829l.length()) {
                        if (booleanValue || intValue == intValue2) {
                            o5.p(false);
                            o5.n(o6);
                        } else {
                            o5.f(true);
                        }
                        this.f1003p.f1105t.c(new P0.w(c0203h, K0.F.b(intValue, intValue2), (K0.N) null));
                        z3 = true;
                    }
                }
                o5.p(false);
                o5.n(o6);
            }
        }
        return Boolean.valueOf(z3);
    }
}
