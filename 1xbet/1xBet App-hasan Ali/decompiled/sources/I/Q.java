package I;

import E.C0092c0;
import E.InterfaceC0104i0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public final class Q extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2444k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2445l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f2446m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(InterfaceC0104i0 interfaceC0104i0, a4.c cVar) {
        super(2, cVar);
        this.f2446m = interfaceC0104i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        Q q5 = new Q(this.f2446m, cVar);
        q5.f2445l = obj;
        return q5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((t0.v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2444k;
        W3.o oVar = W3.o.f6046a;
        if (i == 0) {
            G4.l.N(obj);
            t0.v vVar = (t0.v) this.f2445l;
            this.f2444k = 1;
            Object e3 = AbstractC2282w.e(new C0092c0(vVar, this.f2446m, null), this);
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
