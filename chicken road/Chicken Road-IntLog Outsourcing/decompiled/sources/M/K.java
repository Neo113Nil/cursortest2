package M;

import D4.AbstractC0024y;
import D4.C0013m;
import D4.InterfaceC0022w;
import h2.C0482c;
import java.util.concurrent.atomic.AtomicInteger;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class K extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1594a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f1596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m4.h f1597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(P p5, InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1596c = p5;
        this.f1597d = (m4.h) interfaceC1445p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        K k3 = new K(this.f1596c, this.f1597d, interfaceC1218d);
        k3.f1595b = obj;
        return k3;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1594a;
        if (i2 == 0) {
            e5.g.y(obj);
            InterfaceC0022w interfaceC0022w = (InterfaceC0022w) this.f1595b;
            C0013m a6 = AbstractC0024y.a();
            P p5 = this.f1596c;
            c0 c0Var = new c0(this.f1597d, a6, p5.f1620h.f(), interfaceC0022w.g());
            B0.i iVar = p5.f1624l;
            Object h3 = ((F4.b) iVar.f155d).h(c0Var);
            if (h3 instanceof F4.g) {
                Throwable c2 = F4.i.c(h3);
                if (c2 == null) {
                    throw new F4.l("Channel was closed normally");
                }
                throw c2;
            }
            if (h3 instanceof F4.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((C0482c) iVar.f156e).f5783b).getAndIncrement() == 0) {
                AbstractC0024y.n((InterfaceC0022w) iVar.f153b, null, 0, new f0(iVar, null), 3);
            }
            this.f1594a = 1;
            obj = a6.W(this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return obj;
    }
}
