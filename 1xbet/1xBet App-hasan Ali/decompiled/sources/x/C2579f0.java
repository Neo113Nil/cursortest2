package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: x.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2579f0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20760k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f20762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2579f0(C2589k0 c2589k0, long j5, a4.c cVar) {
        super(2, cVar);
        this.f20761l = c2589k0;
        this.f20762m = j5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2579f0(this.f20761l, this.f20762m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2579f0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20760k;
        if (i == 0) {
            G4.l.N(obj);
            C2604s0 c2604s0 = this.f20761l.f20810N;
            v.d0 d0Var = v.d0.f20223l;
            C2577e0 c2577e0 = new C2577e0(this.f20762m, null);
            this.f20760k = 1;
            if (c2604s0.e(d0Var, c2577e0, this) == enumC0510a) {
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
