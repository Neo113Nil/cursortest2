package N1;

import G4.l;
import P1.g;
import W3.o;
import a4.c;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import i4.e;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class a extends AbstractC0548i implements e {

    /* renamed from: k, reason: collision with root package name */
    public int f3745k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f3746l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P1.a f3747m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, P1.a aVar, c cVar) {
        super(2, cVar);
        this.f3746l = bVar;
        this.f3747m = aVar;
    }

    @Override // c4.AbstractC0540a
    public final c create(Object obj, c cVar) {
        return new a(this.f3746l, this.f3747m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC2280u) obj, (c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f3745k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
            return obj;
        }
        l.N(obj);
        g gVar = this.f3746l.f3748a;
        this.f3745k = 1;
        Object b3 = gVar.b(this.f3747m, this);
        return b3 == enumC0510a ? enumC0510a : b3;
    }
}
