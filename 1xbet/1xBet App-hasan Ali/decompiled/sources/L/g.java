package L;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import y.C2654j;

/* loaded from: classes.dex */
public final class g extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2932k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2933l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2654j f2934m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0213a f2935n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C2654j c2654j, C0213a c0213a, a4.c cVar) {
        super(2, cVar);
        this.f2934m = c2654j;
        this.f2935n = c0213a;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        g gVar = new g(this.f2934m, this.f2935n, cVar);
        gVar.f2933l = obj;
        return gVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2932k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return W3.o.f6046a;
        }
        G4.l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f2933l;
        s4.B b3 = this.f2934m.f21123a;
        I.E e3 = new I.E(1, this.f2935n, interfaceC2280u);
        this.f2932k = 1;
        b3.getClass();
        s4.B.k(b3, e3, this);
        return enumC0510a;
    }
}
