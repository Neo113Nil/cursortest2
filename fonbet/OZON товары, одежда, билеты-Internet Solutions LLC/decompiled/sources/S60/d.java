package S60;

import Jb.e;
import android.content.Context;
import c30.i;
import c30.j;
import r90.InterfaceC9218a;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;
import ru.ozon.fintech.features.metrix.network.FintechMetrixNetwork;
import s90.C9632a;
import s90.C9633b;

/* loaded from: classes3.dex */
public final class d implements e<c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f25984a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f25985b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<FintechMetrixNetwork> f25986c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<Q90.c> f25987d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<PowerManagerRepository> f25988e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<DeviceInfoManager> f25989f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<R30.a> f25990g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<i> f25991h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<j> f25992i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<InterfaceC9218a> f25993j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<C9633b> f25994k;

    /* renamed from: l, reason: collision with root package name */
    private final Pc.a<C9632a> f25995l;

    public d(Pc.a<Context> aVar, Pc.a<ru.ozon.fintech.settings.domain.a> aVar2, Pc.a<FintechMetrixNetwork> aVar3, Pc.a<Q90.c> aVar4, Pc.a<PowerManagerRepository> aVar5, Pc.a<DeviceInfoManager> aVar6, Pc.a<R30.a> aVar7, Pc.a<i> aVar8, Pc.a<j> aVar9, Pc.a<InterfaceC9218a> aVar10, Pc.a<C9633b> aVar11, Pc.a<C9632a> aVar12) {
        this.f25984a = aVar;
        this.f25985b = aVar2;
        this.f25986c = aVar3;
        this.f25987d = aVar4;
        this.f25988e = aVar5;
        this.f25989f = aVar6;
        this.f25990g = aVar7;
        this.f25991h = aVar8;
        this.f25992i = aVar9;
        this.f25993j = aVar10;
        this.f25994k = aVar11;
        this.f25995l = aVar12;
    }

    @Override // Pc.a
    public final Object get() {
        return new c(this.f25984a.get(), this.f25985b.get(), this.f25986c.get(), this.f25987d.get(), this.f25988e.get(), this.f25989f.get(), this.f25990g.get(), this.f25991h.get(), this.f25992i.get(), this.f25993j.get(), this.f25994k.get(), this.f25995l.get());
    }
}
