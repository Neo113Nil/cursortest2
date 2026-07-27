package N2;

import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: N2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117h extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117h(List list, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2089b = list;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        C0117h c0117h = new C0117h(this.f2089b, interfaceC1218d);
        c0117h.f2088a = obj;
        return c0117h;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        C0117h c0117h = (C0117h) create((P.b) obj, (InterfaceC1218d) obj2);
        f4.v vVar = f4.v.f5689a;
        c0117h.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        P.b bVar = (P.b) this.f2088a;
        List<String> list = this.f2089b;
        if (list != null) {
            for (String name : list) {
                kotlin.jvm.internal.i.e(name, "name");
                P.d dVar = new P.d(name);
                bVar.b();
                bVar.f2268a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f2268a.clear();
        }
        return f4.v.f5689a;
    }
}
