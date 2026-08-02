package H1;

import G1.C0140k;
import P.C0297i0;
import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.List;
import p4.InterfaceC2280u;
import u.C2452c0;

/* loaded from: classes.dex */
public final class t extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2243k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f2244l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f2245m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0297i0 f2246n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C2452c0 c2452c0, InterfaceC0289e0 interfaceC0289e0, C0297i0 c0297i0, a4.c cVar) {
        super(2, cVar);
        this.f2244l = c2452c0;
        this.f2245m = interfaceC0289e0;
        this.f2246n = c0297i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new t(this.f2244l, this.f2245m, this.f2246n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2243k;
        if (i == 0) {
            G4.l.N(obj);
            C0140k c0140k = (C0140k) ((List) this.f2245m.getValue()).get(((List) r4.getValue()).size() - 2);
            float h3 = this.f2246n.h();
            this.f2243k = 1;
            if (this.f2244l.t(h3, c0140k, this) == enumC0510a) {
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
