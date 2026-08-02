package t4;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import s4.C;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class e extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19597k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2369f f19599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f19600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC2369f interfaceC2369f, g gVar, a4.c cVar) {
        super(2, cVar);
        this.f19599m = interfaceC2369f;
        this.f19600n = gVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        e eVar = new e(this.f19599m, this.f19600n, cVar);
        eVar.f19598l = obj;
        return eVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19597k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        r4.p g5 = this.f19600n.g((InterfaceC2280u) this.f19598l);
        this.f19597k = 1;
        Object f = C.f(this.f19599m, g5, true, this);
        if (f != enumC0510a) {
            f = oVar;
        }
        return f == enumC0510a ? enumC0510a : oVar;
    }
}
