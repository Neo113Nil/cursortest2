package Qj0;

import ru.ozon.android.hardwareinfo.BuildInfoManager;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.tracker.sendEvent.CurrentPageInternalProvider;

/* loaded from: classes7.dex */
public final class k0 implements Jb.e<ru.ozon.tracker.performance.d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<u0> f23675a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<fi0.s> f23676b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<DeviceInfoManager> f23677c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<BuildInfoManager> f23678d;

    /* renamed from: e, reason: collision with root package name */
    private final Jb.f f23679e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<CurrentPageInternalProvider> f23680f;

    public k0(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5) {
        this.f23675a = aVar;
        this.f23676b = aVar2;
        this.f23677c = aVar3;
        this.f23678d = aVar4;
        this.f23679e = fVar;
        this.f23680f = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        return new ru.ozon.tracker.performance.d(this.f23675a.get(), this.f23676b.get(), this.f23677c.get(), this.f23678d.get(), (fi0.x) this.f23679e.get(), this.f23680f.get());
    }
}
