package G;

import A0.C0046m0;
import E.k0;
import android.view.View;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: G.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127d extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1717k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1718l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0046m0 f1719m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k0 f1720n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0129f f1721o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x f1722p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0127d(C0046m0 c0046m0, k0 k0Var, C0129f c0129f, x xVar, a4.c cVar) {
        super(2, cVar);
        this.f1719m = c0046m0;
        this.f1720n = k0Var;
        this.f1721o = c0129f;
        this.f1722p = xVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0127d c0127d = new C0127d(this.f1719m, this.f1720n, this.f1721o, this.f1722p, cVar);
        c0127d.f1718l = obj;
        return c0127d;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((C0127d) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1717k;
        C0129f c0129f = this.f1721o;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                throw new D2.e();
            }
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f1718l;
            z zVar = A.f1687a;
            C0046m0 c0046m0 = this.f1719m;
            View view = c0046m0.f533k;
            zVar.getClass();
            v vVar = new v(view);
            B b3 = new B(c0046m0.f533k, new C0126c(this.f1722p), vVar);
            if (F.e.f1518a) {
                AbstractC2282w.p(interfaceC2280u, null, new C0125b(c0129f, vVar, null), 3);
            }
            k0 k0Var = this.f1720n;
            if (k0Var != null) {
                k0Var.c(b3);
            }
            c0129f.f1730c = b3;
            this.f1717k = 1;
            c0046m0.a(b3, this);
            return enumC0510a;
        } catch (Throwable th) {
            c0129f.f1730c = null;
            throw th;
        }
    }
}
