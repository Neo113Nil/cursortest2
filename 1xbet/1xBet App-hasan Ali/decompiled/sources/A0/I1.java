package A0;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class I1 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f301k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1 f302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(K1 k12, a4.c cVar) {
        super(2, cVar);
        this.f302l = k12;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new I1(this.f302l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I1) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f301k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        F f = this.f302l.f315k;
        this.f301k = 1;
        Object a5 = f.f196D.a(this);
        if (a5 != enumC0510a) {
            a5 = oVar;
        }
        return a5 == enumC0510a ? enumC0510a : oVar;
    }
}
