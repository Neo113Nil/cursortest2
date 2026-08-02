package Q40;

import Jb.e;
import P40.c;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class b implements e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f22965a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C10656a> f22966b;

    /* renamed from: c, reason: collision with root package name */
    private final c f22967c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f22968d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f22969e;

    public b(Pc.a aVar, Pc.a aVar2, c cVar, Pc.a aVar3, Pc.a aVar4) {
        this.f22965a = aVar;
        this.f22966b = aVar2;
        this.f22967c = cVar;
        this.f22968d = aVar3;
        this.f22969e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new a(this.f22965a.get(), this.f22966b.get(), (P40.a) this.f22967c.get(), this.f22968d.get(), this.f22969e.get());
    }
}
