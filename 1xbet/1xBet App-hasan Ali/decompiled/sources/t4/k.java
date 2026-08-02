package t4;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class k extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19611k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f19612l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2369f f19613m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f19614n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, InterfaceC2369f interfaceC2369f, Object obj, a4.c cVar) {
        super(2, cVar);
        this.f19612l = nVar;
        this.f19613m = interfaceC2369f;
        this.f19614n = obj;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new k(this.f19612l, this.f19613m, this.f19614n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [c4.i, i4.f] */
    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19611k;
        if (i == 0) {
            G4.l.N(obj);
            ?? r42 = this.f19612l.f19624o;
            this.f19611k = 1;
            if (r42.b(this.f19613m, this.f19614n, this) == enumC0510a) {
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
