package androidx.lifecycle;

import D4.C0021v;
import D4.InterfaceC0022w;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246p extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0247q f4584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246p(C0247q c0247q, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f4584b = c0247q;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        C0246p c0246p = new C0246p(this.f4584b, interfaceC1218d);
        c0246p.f4583a = obj;
        return c0246p;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        C0246p c0246p = (C0246p) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2);
        f4.v vVar = f4.v.f5689a;
        c0246p.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        InterfaceC0022w interfaceC0022w = (InterfaceC0022w) this.f4583a;
        C0247q c0247q = this.f4584b;
        AbstractC0245o abstractC0245o = c0247q.f4585a;
        if (((C0252w) abstractC0245o).f4592d.compareTo(EnumC0244n.f4577b) >= 0) {
            abstractC0245o.a(c0247q);
        } else {
            D4.X x5 = (D4.X) interfaceC0022w.g().o(C0021v.f545b);
            if (x5 != null) {
                x5.b(null);
            }
        }
        return f4.v.f5689a;
    }
}
