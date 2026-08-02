package M;

import A0.o1;
import P.C0315s;
import y.C2654j;

/* loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f3197l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f3198m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f3199n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o1 f3200o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2654j f3201p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X.d f3202q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X.d f3203r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X.d f3204s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q0 f3205t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i0.J f3206u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(String str, boolean z3, boolean z5, o1 o1Var, C2654j c2654j, X.d dVar, X.d dVar2, X.d dVar3, q0 q0Var, i0.J j5) {
        super(3);
        this.f3197l = str;
        this.f3198m = z3;
        this.f3199n = z5;
        this.f3200o = o1Var;
        this.f3201p = c2654j;
        this.f3202q = dVar;
        this.f3203r = dVar2;
        this.f3204s = dVar3;
        this.f3205t = q0Var;
        this.f3206u = j5;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        i4.e eVar = (i4.e) obj;
        C0315s c0315s = (C0315s) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0315s.h(eVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            int i = intValue;
            N n5 = N.f3188a;
            q0 q0Var = this.f3205t;
            i0.J j5 = this.f3206u;
            boolean z3 = this.f3198m;
            C2654j c2654j = this.f3201p;
            n5.b(this.f3197l, eVar, z3, this.f3199n, this.f3200o, c2654j, this.f3202q, this.f3203r, this.f3204s, q0Var, null, X.e.d(2108828640, new O(z3, c2654j, q0Var, j5), c0315s), c0315s, (i << 3) & 112);
        }
        return W3.o.f6046a;
    }
}
