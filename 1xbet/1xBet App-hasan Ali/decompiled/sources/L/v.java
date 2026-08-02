package L;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class v extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2979k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2980l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f2981m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, a4.c cVar) {
        super(2, cVar);
        this.f2981m = wVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        v vVar = new v(this.f2981m, cVar);
        vVar.f2980l = obj;
        return vVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2979k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return W3.o.f6046a;
        }
        G4.l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f2980l;
        w wVar = this.f2981m;
        s4.B b3 = wVar.f2990y.f21123a;
        I.E e3 = new I.E(2, wVar, interfaceC2280u);
        this.f2979k = 1;
        b3.getClass();
        s4.B.k(b3, e3, this);
        return enumC0510a;
    }
}
