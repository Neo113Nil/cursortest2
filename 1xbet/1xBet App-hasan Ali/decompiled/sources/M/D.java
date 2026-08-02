package M;

import P.AbstractC0329z;
import P.C0315s;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f3139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0.p f3140m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f3141n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f3142o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X.d f3143p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3144q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(InterfaceC2015a interfaceC2015a, b0.p pVar, boolean z3, C c5, X.d dVar, int i, int i5) {
        super(2);
        this.f3139l = interfaceC2015a;
        this.f3140m = pVar;
        this.f3141n = z3;
        this.f3142o = c5;
        this.f3143p = dVar;
        this.f3144q = i5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int B5 = AbstractC0329z.B(196609);
        X.d dVar = this.f3143p;
        C c5 = this.f3142o;
        int i = this.f3144q;
        g0.c(this.f3139l, this.f3140m, this.f3141n, c5, dVar, (C0315s) obj, B5, i);
        return W3.o.f6046a;
    }
}
