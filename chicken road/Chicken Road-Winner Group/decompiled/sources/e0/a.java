package e0;

import I1.n;
import K.C0057z;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.g;
import o2.p;
import w2.InterfaceC1241u;
import z2.d;

/* loaded from: classes.dex */
public final class a extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f4866e;
    public final /* synthetic */ d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f4867g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, n nVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = dVar;
        this.f4867g = nVar;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new a(this.f, this.f4867g, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f4866e;
        if (i3 == 0) {
            X0.a.L(obj);
            C0057z c0057z = new C0057z(1, this.f4867g);
            this.f4866e = 1;
            if (this.f.l(c0057z, this) == enumC0326a) {
                return enumC0326a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
        }
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
