package w;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import t0.F;
import t0.v;
import v.r;

/* loaded from: classes.dex */
public final class d extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20456k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20457l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f20458m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, a4.c cVar) {
        super(2, cVar);
        this.f20458m = mVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        d dVar = new d(this.f20458m, cVar);
        dVar.f20457l = obj;
        return dVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20456k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        v vVar = (v) this.f20457l;
        F f = new F(4, this.f20458m);
        this.f20456k = 1;
        Object b3 = r.b(vVar, new e(f, null), this);
        if (b3 != enumC0510a) {
            b3 = oVar;
        }
        return b3 == enumC0510a ? enumC0510a : oVar;
    }
}
