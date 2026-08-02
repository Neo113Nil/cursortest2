package t4;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class f extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19601k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19602l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f19603m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, a4.c cVar) {
        super(2, cVar);
        this.f19603m = gVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        f fVar = new f(this.f19603m, cVar);
        fVar.f19602l = obj;
        return fVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((r4.o) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19601k;
        if (i == 0) {
            G4.l.N(obj);
            r4.o oVar = (r4.o) this.f19602l;
            this.f19601k = 1;
            if (this.f19603m.d(oVar, this) == enumC0510a) {
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
