package M1;

import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import i4.e;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class a extends AbstractC0548i implements e {

    /* renamed from: k, reason: collision with root package name */
    public int f3594k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f3595l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, a4.c cVar) {
        super(2, cVar);
        this.f3595l = dVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new a(this.f3595l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f3594k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
            return obj;
        }
        l.N(obj);
        O1.c cVar = this.f3595l.f3603a;
        this.f3594k = 1;
        Object b3 = cVar.b(this);
        return b3 == enumC0510a ? enumC0510a : b3;
    }
}
