package u;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public final class U extends AbstractC0548i implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public int f19713k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0 f19714l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19715m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f19716n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(a4.c cVar, Object obj, C2452c0 c2452c0, t0 t0Var) {
        super(1, cVar);
        this.f19714l = t0Var;
        this.f19715m = c2452c0;
        this.f19716n = obj;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        return ((U) create((a4.c) obj)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(a4.c cVar) {
        return new U(cVar, this.f19716n, this.f19715m, this.f19714l);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19713k;
        t0 t0Var = this.f19714l;
        if (i == 0) {
            G4.l.N(obj);
            T t5 = new T(null, this.f19716n, this.f19715m, t0Var);
            this.f19713k = 1;
            if (AbstractC2282w.e(t5, this) == enumC0510a) {
                return enumC0510a;
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
