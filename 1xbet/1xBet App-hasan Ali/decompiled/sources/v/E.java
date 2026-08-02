package v;

import E.C0108m;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class E extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20142k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f20143l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f, a4.c cVar) {
        super(2, cVar);
        this.f20143l = f;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new E(this.f20143l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20142k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return W3.o.f6046a;
        }
        G4.l.N(obj);
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
        kotlin.jvm.internal.u uVar3 = new kotlin.jvm.internal.u();
        F f = this.f20143l;
        s4.B b3 = f.f20146y.f21123a;
        C0108m c0108m = new C0108m(uVar, uVar2, uVar3, f, 2);
        this.f20142k = 1;
        b3.getClass();
        s4.B.k(b3, c0108m, this);
        return enumC0510a;
    }
}
