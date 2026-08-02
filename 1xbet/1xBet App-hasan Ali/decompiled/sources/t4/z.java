package t4;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class z extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19640k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19641l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2369f f19642m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InterfaceC2369f interfaceC2369f, a4.c cVar) {
        super(2, cVar);
        this.f19642m = interfaceC2369f;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        z zVar = new z(this.f19642m, cVar);
        zVar.f19641l = obj;
        return zVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create(obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19640k;
        if (i == 0) {
            G4.l.N(obj);
            Object obj2 = this.f19641l;
            this.f19640k = 1;
            if (this.f19642m.d(obj2, this) == enumC0510a) {
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
