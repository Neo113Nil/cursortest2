package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1988b;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class J0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20654k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.f f20655l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f20656m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0.s f20657n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(i4.f fVar, T t5, t0.s sVar, a4.c cVar) {
        super(2, cVar);
        this.f20655l = fVar;
        this.f20656m = t5;
        this.f20657n = sVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new J0(this.f20655l, this.f20656m, this.f20657n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20654k;
        if (i == 0) {
            G4.l.N(obj);
            C1988b c1988b = new C1988b(this.f20657n.f19502c);
            this.f20654k = 1;
            if (this.f20655l.b(this.f20656m, c1988b, this) == enumC0510a) {
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
