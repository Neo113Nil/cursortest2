package E;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class H extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1038k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0.v f1039l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1040m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(t0.v vVar, InterfaceC0104i0 interfaceC0104i0, a4.c cVar) {
        super(2, cVar);
        this.f1039l = vVar;
        this.f1040m = interfaceC0104i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new H(this.f1039l, this.f1040m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1038k;
        W3.o oVar = W3.o.f6046a;
        if (i == 0) {
            G4.l.N(obj);
            this.f1038k = 1;
            Object e3 = AbstractC2282w.e(new C0092c0(this.f1039l, this.f1040m, null), this);
            if (e3 != enumC0510a) {
                e3 = oVar;
            }
            if (e3 == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return oVar;
    }
}
