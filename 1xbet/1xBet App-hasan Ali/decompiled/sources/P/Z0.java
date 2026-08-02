package P;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f4436k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s4.y f4437l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0318t0 f4438m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(s4.y yVar, C0318t0 c0318t0, a4.c cVar) {
        super(2, cVar);
        this.f4437l = yVar;
        this.f4438m = c0318t0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new Z0(this.f4437l, this.f4438m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Z0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f4436k;
        if (i == 0) {
            G4.l.N(obj);
            Y0 y02 = new Y0(this.f4438m, 1);
            this.f4436k = 1;
            if (this.f4437l.a(y02, this) == enumC0510a) {
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
