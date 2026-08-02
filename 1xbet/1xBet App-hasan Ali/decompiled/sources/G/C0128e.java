package G;

import A0.C0046m0;
import E.k0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;

/* renamed from: G.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128e extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1723k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1724l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k0 f1725m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0129f f1726n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f1727o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0128e(k0 k0Var, C0129f c0129f, x xVar, a4.c cVar) {
        super(2, cVar);
        this.f1725m = k0Var;
        this.f1726n = c0129f;
        this.f1727o = xVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0128e c0128e = new C0128e(this.f1725m, this.f1726n, this.f1727o, cVar);
        c0128e.f1724l = obj;
        return c0128e;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((C0128e) create((C0046m0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1723k;
        if (i == 0) {
            G4.l.N(obj);
            C0127d c0127d = new C0127d((C0046m0) this.f1724l, this.f1725m, this.f1726n, this.f1727o, null);
            this.f1723k = 1;
            if (AbstractC2282w.e(c0127d, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        throw new D2.e();
    }
}
