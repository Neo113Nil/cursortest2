package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import y.C2654j;
import y.InterfaceC2653i;

/* loaded from: classes.dex */
public final class K extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20162k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2654j f20163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2653i f20164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p4.E f20165n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C2654j c2654j, InterfaceC2653i interfaceC2653i, p4.E e3, a4.c cVar) {
        super(2, cVar);
        this.f20163l = c2654j;
        this.f20164m = interfaceC2653i;
        this.f20165n = e3;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new K(this.f20163l, this.f20164m, this.f20165n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20162k;
        if (i == 0) {
            G4.l.N(obj);
            this.f20162k = 1;
            if (this.f20163l.a(this.f20164m, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        p4.E e3 = this.f20165n;
        if (e3 != null) {
            e3.a();
        }
        return W3.o.f6046a;
    }
}
