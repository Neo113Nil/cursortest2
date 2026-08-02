package u;

import P.C0305m0;
import b4.EnumC0510a;
import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class Z extends AbstractC0548i implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public int f19736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19737l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f19738m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0 f19739n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a4.c cVar, Object obj, C2452c0 c2452c0, t0 t0Var) {
        super(1, cVar);
        this.f19737l = c2452c0;
        this.f19738m = obj;
        this.f19739n = t0Var;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        return ((Z) create((a4.c) obj)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(a4.c cVar) {
        return new Z(cVar, this.f19738m, this.f19737l, this.f19739n);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19736k;
        t0 t0Var = this.f19739n;
        if (i == 0) {
            G4.l.N(obj);
            C2452c0 c2452c0 = this.f19737l;
            c2452c0.s();
            c2452c0.f19778l = Long.MIN_VALUE;
            c2452c0.v(0.0f);
            Object value = c2452c0.f19771c.getValue();
            Object obj2 = this.f19738m;
            boolean equals = obj2.equals(value);
            C0305m0 c0305m0 = c2452c0.f19770b;
            float f = equals ? -4.0f : obj2.equals(c0305m0.getValue()) ? -5.0f : -3.0f;
            t0Var.q(obj2);
            t0Var.o(0L);
            c0305m0.setValue(obj2);
            c2452c0.v(0.0f);
            c2452c0.h(obj2);
            t0Var.j(f);
            if (f == -3.0f) {
                this.f19736k = 1;
                if (C2452c0.q(c2452c0, this) == enumC0510a) {
                    return enumC0510a;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        t0Var.i();
        return W3.o.f6046a;
    }
}
