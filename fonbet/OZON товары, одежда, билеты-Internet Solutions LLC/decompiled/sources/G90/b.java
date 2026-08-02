package G90;

import Jb.e;
import android.app.Application;
import c90.InterfaceC5773a;

/* loaded from: classes3.dex */
public final class b implements e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f9800a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f9801b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<S80.b> f9802c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC5773a> f9803d;

    public b(Pc.a<Application> aVar, Pc.a<ru.ozon.fintech.settings.domain.a> aVar2, Pc.a<S80.b> aVar3, Pc.a<InterfaceC5773a> aVar4) {
        this.f9800a = aVar;
        this.f9801b = aVar2;
        this.f9802c = aVar3;
        this.f9803d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new a(this.f9800a.get(), this.f9801b.get(), this.f9802c.get(), this.f9803d.get());
    }
}
