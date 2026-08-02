package I;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class y extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2545k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.c f2547m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i4.c cVar, a4.c cVar2) {
        super(2, cVar2);
        this.f2547m = cVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        y yVar = new y(this.f2547m, cVar);
        yVar.f2546l = obj;
        return yVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((t0.v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2545k;
        if (i == 0) {
            G4.l.N(obj);
            t0.v vVar = (t0.v) this.f2546l;
            C0170x c0170x = new C0170x(this.f2547m, null);
            this.f2545k = 1;
            if (((t0.H) vVar).y0(c0170x, this) == enumC0510a) {
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
