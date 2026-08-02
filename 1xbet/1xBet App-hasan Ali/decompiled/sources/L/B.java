package L;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.C2451c;
import u.z0;

/* loaded from: classes.dex */
public final class B extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2897k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A.v f2898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f2899m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z0 f2900n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(A.v vVar, float f, z0 z0Var, a4.c cVar) {
        super(2, cVar);
        this.f2898l = vVar;
        this.f2899m = f;
        this.f2900n = z0Var;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new B(this.f2898l, this.f2899m, this.f2900n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2897k;
        if (i == 0) {
            G4.l.N(obj);
            C2451c c2451c = (C2451c) this.f2898l.f134c;
            Float f = new Float(this.f2899m);
            this.f2897k = 1;
            if (C2451c.c(c2451c, f, this.f2900n, null, this, 12) == enumC0510a) {
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
