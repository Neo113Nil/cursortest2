package L;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.C2451c;
import u.z0;

/* loaded from: classes.dex */
public final class C extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2901k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A.v f2902l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z0 f2903m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(A.v vVar, z0 z0Var, a4.c cVar) {
        super(2, cVar);
        this.f2902l = vVar;
        this.f2903m = z0Var;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C(this.f2902l, this.f2903m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2901k;
        if (i == 0) {
            G4.l.N(obj);
            C2451c c2451c = (C2451c) this.f2902l.f134c;
            Float f = new Float(0.0f);
            this.f2901k = 1;
            if (C2451c.c(c2451c, f, this.f2903m, null, this, 12) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
