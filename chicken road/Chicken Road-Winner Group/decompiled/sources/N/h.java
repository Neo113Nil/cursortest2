package N;

import d2.C0279i;
import e2.r;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import o2.p;

/* loaded from: classes.dex */
public final class h extends i2.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f986e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i2.g f987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f987g = (i2.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        h hVar = new h(this.f987g, interfaceC0319c);
        hVar.f = obj;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f986e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f;
            X0.a.L(obj);
            return bVar;
        }
        X0.a.L(obj);
        b bVar2 = new b(r.q0(((b) this.f).a()), false);
        this.f = bVar2;
        this.f986e = 1;
        return this.f987g.invoke(bVar2, this) == enumC0326a ? enumC0326a : bVar2;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) b((InterfaceC0319c) obj2, (b) obj)).g(C0279i.f4852a);
    }
}
