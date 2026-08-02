package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: x.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2585i0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20778k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20779l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f20780m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f20781n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2585i0(C2589k0 c2589k0, float f, float f5, a4.c cVar) {
        super(2, cVar);
        this.f20779l = c2589k0;
        this.f20780m = f;
        this.f20781n = f5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2585i0(this.f20779l, this.f20780m, this.f20781n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2585i0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20778k;
        if (i == 0) {
            G4.l.N(obj);
            C2604s0 c2604s0 = this.f20779l.f20810N;
            long d5 = G4.d.d(this.f20780m, this.f20781n);
            this.f20778k = 1;
            if (androidx.compose.foundation.gestures.a.a(c2604s0, d5, this) == enumC0510a) {
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
