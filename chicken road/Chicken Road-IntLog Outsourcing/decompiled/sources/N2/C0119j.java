package N2;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: N2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119j extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P.d f2094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119j(P.d dVar, String str, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2094b = dVar;
        this.f2095c = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        C0119j c0119j = new C0119j(this.f2094b, this.f2095c, interfaceC1218d);
        c0119j.f2093a = obj;
        return c0119j;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        C0119j c0119j = (C0119j) create((P.b) obj, (InterfaceC1218d) obj2);
        f4.v vVar = f4.v.f5689a;
        c0119j.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        ((P.b) this.f2093a).d(this.f2094b, this.f2095c);
        return f4.v.f5689a;
    }
}
