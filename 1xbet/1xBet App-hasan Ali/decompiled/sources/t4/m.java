package t4;

import E.C0108m;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import s4.InterfaceC2368e;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class m extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19620k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19621l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f19622m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2369f f19623n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC2369f interfaceC2369f, a4.c cVar) {
        super(2, cVar);
        this.f19622m = nVar;
        this.f19623n = interfaceC2369f;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        m mVar = new m(this.f19622m, this.f19623n, cVar);
        mVar.f19621l = obj;
        return mVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19620k;
        if (i == 0) {
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f19621l;
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            n nVar = this.f19622m;
            InterfaceC2368e interfaceC2368e = nVar.f19610n;
            C0108m c0108m = new C0108m(wVar, interfaceC2280u, nVar, this.f19623n, 1);
            this.f19620k = 1;
            if (interfaceC2368e.a(c0108m, this) == enumC0510a) {
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
