package t4;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class h extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19607k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19608l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f19609m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, a4.c cVar) {
        super(2, cVar);
        this.f19609m = iVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        h hVar = new h(this.f19609m, cVar);
        hVar.f19608l = obj;
        return hVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC2369f) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19607k;
        if (i == 0) {
            G4.l.N(obj);
            InterfaceC2369f interfaceC2369f = (InterfaceC2369f) this.f19608l;
            this.f19607k = 1;
            if (this.f19609m.h(interfaceC2369f, this) == enumC0510a) {
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
