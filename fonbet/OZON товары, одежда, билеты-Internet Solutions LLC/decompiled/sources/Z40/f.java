package Z40;

import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class f implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f35486a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<U40.a> f35487b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f35488c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f35489d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f35490e;

    public f(Pc.a<C10656a> aVar, Pc.a<U40.a> aVar2, Pc.a<InterfaceC6618a> aVar3, Pc.a<ru.ozon.fintech.settings.domain.a> aVar4, Pc.a<InterfaceC6083a> aVar5) {
        this.f35486a = aVar;
        this.f35487b = aVar2;
        this.f35488c = aVar3;
        this.f35489d = aVar4;
        this.f35490e = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        return new e(this.f35486a.get(), this.f35487b.get(), this.f35488c.get(), this.f35489d.get(), this.f35490e.get());
    }
}
