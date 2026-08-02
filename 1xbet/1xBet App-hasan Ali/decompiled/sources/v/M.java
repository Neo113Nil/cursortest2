package v;

import a.AbstractC0444a;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class M extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20168k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f20169l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n5, a4.c cVar) {
        super(2, cVar);
        this.f20169l = n5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new M(this.f20169l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20168k;
        if (i == 0) {
            G4.l.N(obj);
            this.f20168k = 1;
            if (AbstractC0444a.a0(this.f20169l, null, this) == enumC0510a) {
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
