package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1988b;

/* renamed from: x.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2587j0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20787k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ long f20788l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20789m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2587j0(C2589k0 c2589k0, a4.c cVar) {
        super(2, cVar);
        this.f20789m = c2589k0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2587j0 c2587j0 = new C2587j0(this.f20789m, cVar);
        c2587j0.f20788l = ((C1988b) obj).f17191a;
        return c2587j0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        long j5 = ((C1988b) obj).f17191a;
        C2587j0 c2587j0 = new C2587j0(this.f20789m, (a4.c) obj2);
        c2587j0.f20788l = j5;
        return c2587j0.invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20787k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return obj;
        }
        G4.l.N(obj);
        long j5 = this.f20788l;
        C2604s0 c2604s0 = this.f20789m.f20810N;
        this.f20787k = 1;
        Object a5 = androidx.compose.foundation.gestures.a.a(c2604s0, j5, this);
        return a5 == enumC0510a ? enumC0510a : a5;
    }
}
