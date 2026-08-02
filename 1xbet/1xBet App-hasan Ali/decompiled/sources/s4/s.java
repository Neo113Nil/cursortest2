package s4;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class s extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19305k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19306l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2368e f19307m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f19308n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Float f19309o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC2368e interfaceC2368e, M m5, Float f, a4.c cVar) {
        super(2, cVar);
        this.f19307m = interfaceC2368e;
        this.f19308n = m5;
        this.f19309o = f;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        s sVar = new s(this.f19307m, this.f19308n, this.f19309o, cVar);
        sVar.f19306l = obj;
        return sVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19305k;
        if (i == 0) {
            G4.l.N(obj);
            int ordinal = ((E) this.f19306l).ordinal();
            M m5 = this.f19308n;
            if (ordinal == 0) {
                this.f19305k = 1;
                if (this.f19307m.a(m5, this) == enumC0510a) {
                    return enumC0510a;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new D2.e();
                }
                H3.g gVar = C.f19222a;
                Float f = this.f19309o;
                if (f == gVar) {
                    m5.getClass();
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                m5.j(null, f);
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
