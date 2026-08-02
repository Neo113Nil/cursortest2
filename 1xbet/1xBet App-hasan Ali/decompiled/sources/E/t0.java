package E;

import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import y.C2654j;
import y.C2655k;
import y.InterfaceC2653i;

/* loaded from: classes.dex */
public final class t0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0289e0 f1321k;

    /* renamed from: l, reason: collision with root package name */
    public int f1322l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f1323m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1324n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2654j f1325o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(InterfaceC0289e0 interfaceC0289e0, boolean z3, C2654j c2654j, a4.c cVar) {
        super(2, cVar);
        this.f1323m = interfaceC0289e0;
        this.f1324n = z3;
        this.f1325o = c2654j;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new t0(this.f1323m, this.f1324n, this.f1325o, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0289e0 interfaceC0289e0;
        InterfaceC0289e0 interfaceC0289e02;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1322l;
        if (i == 0) {
            G4.l.N(obj);
            interfaceC0289e0 = this.f1323m;
            y.l lVar = (y.l) interfaceC0289e0.getValue();
            if (lVar != null) {
                InterfaceC2653i mVar = this.f1324n ? new y.m(lVar) : new C2655k(lVar);
                C2654j c2654j = this.f1325o;
                if (c2654j != null) {
                    this.f1321k = interfaceC0289e0;
                    this.f1322l = 1;
                    if (c2654j.a(mVar, this) == enumC0510a) {
                        return enumC0510a;
                    }
                    interfaceC0289e02 = interfaceC0289e0;
                }
                interfaceC0289e0.setValue(null);
            }
            return W3.o.f6046a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC0289e02 = this.f1321k;
        G4.l.N(obj);
        interfaceC0289e0 = interfaceC0289e02;
        interfaceC0289e0.setValue(null);
        return W3.o.f6046a;
    }
}
