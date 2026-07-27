package a2;

import d2.C0279i;
import g2.InterfaceC0319c;
import java.util.List;

/* renamed from: a2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113i extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1844e;
    public final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113i(List list, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = list;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0113i c0113i = new C0113i(this.f, interfaceC0319c);
        c0113i.f1844e = obj;
        return c0113i;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        N.b bVar = (N.b) this.f1844e;
        List<String> list = this.f;
        if (list != null) {
            for (String name : list) {
                kotlin.jvm.internal.j.e(name, "name");
                N.d dVar = new N.d(name);
                bVar.b();
                bVar.f979a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f979a.clear();
        }
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        C0113i c0113i = (C0113i) b((InterfaceC0319c) obj2, (N.b) obj);
        C0279i c0279i = C0279i.f4852a;
        c0113i.g(c0279i);
        return c0279i;
    }
}
