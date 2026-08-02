package Z0;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class g extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f6276k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f6277l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f6278m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, long j5, a4.c cVar) {
        super(2, cVar);
        this.f6277l = jVar;
        this.f6278m = j5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new g(this.f6277l, this.f6278m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f6276k;
        if (i == 0) {
            G4.l.N(obj);
            j jVar = this.f6277l;
            this.f6276k = 1;
            if (jVar.f6294k.b(this.f6278m, this) == enumC0510a) {
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
