package u;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class W extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19721k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19722l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C2452c0 c2452c0, a4.c cVar) {
        super(2, cVar);
        this.f19722l = c2452c0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new W(this.f19722l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19721k;
        if (i == 0) {
            G4.l.N(obj);
            this.f19721k = 1;
            if (C2452c0.o(this.f19722l, this) == enumC0510a) {
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
