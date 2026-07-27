package P;

import f4.v;
import g4.AbstractC0476u;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class h extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f2276a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m4.h f2278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2278c = (m4.h) interfaceC1445p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        h hVar = new h(this.f2278c, interfaceC1218d);
        hVar.f2277b = obj;
        return hVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b) obj, (InterfaceC1218d) obj2)).invokeSuspend(v.f5689a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2276a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f2277b;
            e5.g.y(obj);
            return bVar;
        }
        e5.g.y(obj);
        b bVar2 = new b(AbstractC0476u.e0(((b) this.f2277b).a()), false);
        this.f2277b = bVar2;
        this.f2276a = 1;
        return this.f2278c.invoke(bVar2, this) == enumC1260a ? enumC1260a : bVar2;
    }
}
