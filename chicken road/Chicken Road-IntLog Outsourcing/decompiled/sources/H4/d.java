package H4;

import D4.AbstractC0024y;
import D4.E;
import D4.InterfaceC0022w;
import k4.C1219e;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class d extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1165a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G4.e f1167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f1168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(G4.e eVar, f fVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1167c = eVar;
        this.f1168d = fVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        d dVar = new d(this.f1167c, this.f1168d, interfaceC1218d);
        dVar.f1166b = obj;
        return dVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1165a;
        f4.v vVar = f4.v.f5689a;
        if (i2 == 0) {
            e5.g.y(obj);
            InterfaceC0022w interfaceC0022w = (InterfaceC0022w) this.f1166b;
            f fVar = this.f1168d;
            int i3 = fVar.f1173b;
            if (i3 == -3) {
                i3 = -2;
            }
            InterfaceC1445p eVar = new e(fVar, null);
            F4.b a6 = F4.i.a(i3, fVar.f1174c, 4);
            InterfaceC1223i f3 = AbstractC0024y.f(interfaceC0022w.g(), fVar.f1172a, true);
            K4.d dVar = E.f459a;
            if (f3 != dVar && f3.o(C1219e.f10719a) == null) {
                f3 = f3.A(dVar);
            }
            F4.p pVar = new F4.p(f3, a6);
            pVar.Y(3, pVar, eVar);
            this.f1165a = 1;
            Object c2 = G4.x.c(this.f1167c, pVar, true, this);
            if (c2 != enumC1260a) {
                c2 = vVar;
            }
            if (c2 == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return vVar;
    }
}
