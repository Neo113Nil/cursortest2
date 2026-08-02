package u;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class X extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19723k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19724l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f19725m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f19726n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19727o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t0 f19728p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f19729q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Object obj, Object obj2, C2452c0 c2452c0, t0 t0Var, float f, a4.c cVar) {
        super(2, cVar);
        this.f19725m = obj;
        this.f19726n = obj2;
        this.f19727o = c2452c0;
        this.f19728p = t0Var;
        this.f19729q = f;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        X x5 = new X(this.f19725m, this.f19726n, this.f19727o, this.f19728p, this.f19729q, cVar);
        x5.f19724l = obj;
        return x5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19723k;
        W3.o oVar = W3.o.f6046a;
        C2452c0 c2452c0 = this.f19727o;
        if (i == 0) {
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f19724l;
            Object obj2 = this.f19725m;
            Object obj3 = this.f19726n;
            if (kotlin.jvm.internal.l.a(obj2, obj3)) {
                c2452c0.f19780n = null;
                if (kotlin.jvm.internal.l.a(c2452c0.f19771c.getValue(), obj2)) {
                    return oVar;
                }
            } else {
                C2452c0.m(c2452c0);
            }
            boolean a5 = kotlin.jvm.internal.l.a(obj2, obj3);
            float f = this.f19729q;
            if (!a5) {
                t0 t0Var = this.f19728p;
                t0Var.q(obj2);
                t0Var.o(0L);
                c2452c0.f19770b.setValue(obj2);
                t0Var.j(f);
            }
            c2452c0.v(f);
            if (c2452c0.f19779m.h()) {
                AbstractC2282w.p(interfaceC2280u, null, new W(c2452c0, null), 3);
            } else {
                c2452c0.f19778l = Long.MIN_VALUE;
            }
            this.f19723k = 1;
            if (C2452c0.q(c2452c0, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        c2452c0.u();
        return oVar;
    }
}
