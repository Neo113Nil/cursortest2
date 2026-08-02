package I;

import A0.I0;
import A0.q1;
import P.AbstractC0329z;
import P.C0315s;

/* renamed from: I.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150c extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q1 f2465l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2466m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2467n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0.p f2468o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0159l f2469p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150c(q1 q1Var, long j5, boolean z3, b0.p pVar, InterfaceC0159l interfaceC0159l) {
        super(2);
        this.f2465l = q1Var;
        this.f2466m = j5;
        this.f2467n = z3;
        this.f2468o = pVar;
        this.f2469p = interfaceC0159l;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            AbstractC0329z.a(I0.f297s.a(this.f2465l), X.e.d(-1426434671, new C0149b(this.f2466m, this.f2467n, this.f2468o, this.f2469p), c0315s), c0315s, 56);
        }
        return W3.o.f6046a;
    }
}
