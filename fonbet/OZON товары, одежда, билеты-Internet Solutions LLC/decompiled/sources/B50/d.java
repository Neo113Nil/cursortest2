package B50;

import d40.InterfaceC6083a;
import x40.C10656a;
import z50.InterfaceC10987a;

/* loaded from: classes3.dex */
public final class d implements Jb.e<c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f2824a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC10987a> f2825b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f2826c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f2827d;

    public d(Pc.a<C10656a> aVar, Pc.a<InterfaceC10987a> aVar2, Pc.a<ru.ozon.fintech.settings.domain.a> aVar3, Pc.a<InterfaceC6083a> aVar4) {
        this.f2824a = aVar;
        this.f2825b = aVar2;
        this.f2826c = aVar3;
        this.f2827d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new c(this.f2824a.get(), this.f2825b.get(), this.f2826c.get(), this.f2827d.get());
    }
}
