package G;

import A0.AbstractC0035i1;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class w extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1751k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f1752l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0128e f1753m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, C0128e c0128e, a4.c cVar) {
        super(2, cVar);
        this.f1752l = xVar;
        this.f1753m = c0128e;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new w(this.f1752l, this.f1753m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((w) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1751k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            throw new D2.e();
        }
        G4.l.N(obj);
        this.f1751k = 1;
        AbstractC0035i1.a(this.f1752l, this.f1753m, this);
        return enumC0510a;
    }
}
