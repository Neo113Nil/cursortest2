package B50;

import b40.InterfaceC5539a;
import d40.InterfaceC6083a;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import x40.C10656a;
import z50.InterfaceC10990d;

/* loaded from: classes3.dex */
public final class m implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2940a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f2941b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f2942c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f2943d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a f2944e;

    public /* synthetic */ m(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, int i11) {
        this.f2940a = i11;
        this.f2941b = aVar;
        this.f2942c = aVar2;
        this.f2943d = aVar3;
        this.f2944e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f2940a) {
            case 0:
                return new ru.ozon.fintech.features.cbottomstories.presentation.a((InterfaceC6083a) this.f2941b.get(), (C10656a) this.f2942c.get(), (ru.ozon.fintech.settings.domain.a) this.f2943d.get(), (InterfaceC10990d) this.f2944e.get());
            default:
                return new R50.b((InterfaceC5539a) ((Jb.f) this.f2941b).get(), (N30.b) ((Jb.f) this.f2942c).get(), (Z30.a) ((Jb.f) this.f2943d).get(), (ExternalNetworkSettings) ((Jb.f) this.f2944e).get());
        }
    }
}
