package E;

import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: E.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092c0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1128k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0.v f1129l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092c0(t0.v vVar, InterfaceC0104i0 interfaceC0104i0, a4.c cVar) {
        super(2, cVar);
        this.f1129l = vVar;
        this.f1130m = interfaceC0104i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0092c0 c0092c0 = new C0092c0(this.f1129l, this.f1130m, cVar);
        c0092c0.f1128k = obj;
        return c0092c0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0092c0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f1128k;
        t0.v vVar = this.f1129l;
        InterfaceC0104i0 interfaceC0104i0 = this.f1130m;
        AbstractC2282w.p(interfaceC2280u, null, new C0088a0(vVar, interfaceC0104i0, null), 1);
        return AbstractC2282w.p(interfaceC2280u, null, new C0090b0(vVar, interfaceC0104i0, null), 1);
    }
}
