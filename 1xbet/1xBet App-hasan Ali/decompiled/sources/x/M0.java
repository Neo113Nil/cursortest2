package x;

import E.C0110o;
import b4.EnumC0510a;
import c4.AbstractC0547h;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class M0 extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public int f20667l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20668m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2280u f20669n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0110o f20670o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f20671p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T f20672q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(InterfaceC2280u interfaceC2280u, C0110o c0110o, kotlin.jvm.internal.w wVar, T t5, a4.c cVar) {
        super(cVar);
        this.f20669n = interfaceC2280u;
        this.f20670o = c0110o;
        this.f20671p = wVar;
        this.f20672q = t5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        T t5 = this.f20672q;
        M0 m02 = new M0(this.f20669n, this.f20670o, this.f20671p, t5, cVar);
        m02.f20668m = obj;
        return m02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M0) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20667l;
        if (i == 0) {
            G4.l.N(obj);
            t0.E e3 = (t0.E) this.f20668m;
            this.f20667l = 1;
            obj = Q0.d(e3, t0.k.f19490l, this);
            if (obj == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        t0.s sVar = (t0.s) obj;
        W3.o oVar = W3.o.f6046a;
        T t5 = this.f20672q;
        InterfaceC2280u interfaceC2280u = this.f20669n;
        if (sVar != null) {
            sVar.a();
            AbstractC2282w.p(interfaceC2280u, null, new K0(t5, null), 3);
            throw null;
        }
        AbstractC2282w.p(interfaceC2280u, null, new L0(t5, null), 3);
        C0110o c0110o = this.f20670o;
        long j5 = ((t0.s) this.f20671p.f17624k).f19502c;
        c0110o.f1243m.o();
        return oVar;
    }
}
