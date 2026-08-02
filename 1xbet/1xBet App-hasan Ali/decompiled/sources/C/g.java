package C;

import A.n;
import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import z0.AbstractC2749f;
import z0.e0;

/* loaded from: classes.dex */
public final class g extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f789k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f790l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f791m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, n nVar, a4.c cVar) {
        super(2, cVar);
        this.f790l = iVar;
        this.f791m = nVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new g(this.f790l, this.f791m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f789k;
        if (i == 0) {
            l.N(obj);
            i iVar = this.f790l;
            if (iVar.f7175x) {
                if (iVar.f7162k.f7175x) {
                    aVar = (a) AbstractC2749f.j(iVar, i.f797A);
                    if (aVar == null) {
                        aVar = new j(iVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    e0 u5 = AbstractC2749f.u(iVar);
                    this.f789k = 1;
                    if (aVar.A(u5, this.f791m, this) == enumC0510a) {
                        return enumC0510a;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
        }
        return o.f6046a;
    }
}
