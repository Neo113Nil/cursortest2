package E;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: E.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088a0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1115k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0.v f1116l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1117m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088a0(t0.v vVar, InterfaceC0104i0 interfaceC0104i0, a4.c cVar) {
        super(2, cVar);
        this.f1116l = vVar;
        this.f1117m = interfaceC0104i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0088a0(this.f1116l, this.f1117m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0088a0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1115k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        this.f1115k = 1;
        Object b3 = v.r.b(this.f1116l, new C0098f0(this.f1117m, null), this);
        if (b3 != enumC0510a) {
            b3 = oVar;
        }
        return b3 == enumC0510a ? enumC0510a : oVar;
    }
}
