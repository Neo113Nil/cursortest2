package E;

import P.AbstractC0329z;
import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u2.C2496k;

/* renamed from: E.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109n extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1235k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f1236l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f1237m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P0.x f1238n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.O f1239o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P0.k f1240p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0109n(Z z3, InterfaceC0289e0 interfaceC0289e0, P0.x xVar, I.O o5, P0.k kVar, a4.c cVar) {
        super(2, cVar);
        this.f1236l = z3;
        this.f1237m = interfaceC0289e0;
        this.f1238n = xVar;
        this.f1239o = o5;
        this.f1240p = kVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0109n(this.f1236l, this.f1237m, this.f1238n, this.f1239o, this.f1240p, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0109n) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1235k;
        Z z3 = this.f1236l;
        try {
            if (i == 0) {
                G4.l.N(obj);
                C2496k z5 = AbstractC0329z.z(new A.m(2, this.f1237m));
                C0108m c0108m = new C0108m(z3, this.f1238n, this.f1239o, this.f1240p, 0);
                this.f1235k = 1;
                if (z5.a(c0108m, this) == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
            }
            W.g(z3);
            return W3.o.f6046a;
        } catch (Throwable th) {
            W.g(z3);
            throw th;
        }
    }
}
