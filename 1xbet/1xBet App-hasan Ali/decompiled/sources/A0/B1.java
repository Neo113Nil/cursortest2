package A0;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class B1 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f154k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s4.K f155l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0017c1 f156m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(s4.K k5, C0017c1 c0017c1, a4.c cVar) {
        super(2, cVar);
        this.f155l = k5;
        this.f156m = c0017c1;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new B1(this.f155l, this.f156m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((B1) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f154k;
        if (i == 0) {
            G4.l.N(obj);
            A1 a12 = new A1(0, this.f156m);
            this.f154k = 1;
            if (this.f155l.a(a12, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        throw new D2.e();
    }
}
