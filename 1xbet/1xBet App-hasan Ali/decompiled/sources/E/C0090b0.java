package E;

import A0.C0009a;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import x.AbstractC2557C;
import x.C2555A;
import x.C2611z;

/* renamed from: E.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090b0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1121k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0.v f1122l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1123m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090b0(t0.v vVar, InterfaceC0104i0 interfaceC0104i0, a4.c cVar) {
        super(2, cVar);
        this.f1122l = vVar;
        this.f1123m = interfaceC0104i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0090b0(this.f1122l, this.f1123m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0090b0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        int i = 4;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.f1121k;
        W3.o oVar = W3.o.f6046a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        this.f1121k = 1;
        InterfaceC0104i0 interfaceC0104i0 = this.f1123m;
        C0094d0 c0094d0 = new C0094d0(interfaceC0104i0, 0);
        C0096e0 c0096e0 = new C0096e0(interfaceC0104i0, 0);
        C0096e0 c0096e02 = new C0096e0(interfaceC0104i0, 1);
        C0009a c0009a = new C0009a(4, interfaceC0104i0);
        float f = AbstractC2557C.f20606a;
        Object b3 = v.r.b(this.f1122l, new C2555A(C2611z.f20903l, new kotlin.jvm.internal.v(), null, new E0(i, c0094d0), c0009a, c0096e02, new t0.F(5, c0096e0), null), this);
        if (b3 != enumC0510a) {
            b3 = oVar;
        }
        if (b3 != enumC0510a) {
            b3 = oVar;
        }
        if (b3 != enumC0510a) {
            b3 = oVar;
        }
        return b3 == enumC0510a ? enumC0510a : oVar;
    }
}
