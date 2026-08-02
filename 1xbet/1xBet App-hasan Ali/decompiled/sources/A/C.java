package A;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.AbstractC2453d;
import u.C2456e0;
import u.C2465l;

/* loaded from: classes.dex */
public final class C extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f4k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f5l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e3, a4.c cVar) {
        super(2, cVar);
        this.f5l = e3;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C(this.f5l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f4k;
        if (i == 0) {
            G4.l.N(obj);
            C2465l c2465l = this.f5l.f28v;
            Float f = new Float(0.0f);
            C2456e0 l5 = AbstractC2453d.l(1, new Float(0.5f));
            this.f4k = 1;
            if (AbstractC2453d.e(c2465l, f, l5, this) == enumC0510a) {
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
