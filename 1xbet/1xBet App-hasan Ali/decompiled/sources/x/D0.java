package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1988b;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class D0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20618k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.f f20619l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f20620m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0.s f20621n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(i4.f fVar, T t5, t0.s sVar, a4.c cVar) {
        super(2, cVar);
        this.f20619l = fVar;
        this.f20620m = t5;
        this.f20621n = sVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new D0(this.f20619l, this.f20620m, this.f20621n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20618k;
        if (i == 0) {
            G4.l.N(obj);
            C1988b c1988b = new C1988b(this.f20621n.f19502c);
            this.f20618k = 1;
            if (this.f20619l.b(this.f20620m, c1988b, this) == enumC0510a) {
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
