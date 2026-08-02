package a50;

import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class e implements Jb.e<C4952d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f36353a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<U40.a> f36354b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f36355c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f36356d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f36357e;

    public e(Pc.a<C10656a> aVar, Pc.a<U40.a> aVar2, Pc.a<InterfaceC6618a> aVar3, Pc.a<ru.ozon.fintech.settings.domain.a> aVar4, Pc.a<InterfaceC6083a> aVar5) {
        this.f36353a = aVar;
        this.f36354b = aVar2;
        this.f36355c = aVar3;
        this.f36356d = aVar4;
        this.f36357e = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        return new C4952d(this.f36353a.get(), this.f36354b.get(), this.f36355c.get(), this.f36356d.get(), this.f36357e.get());
    }
}
