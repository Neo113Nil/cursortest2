package H90;

import Jb.e;
import Jb.f;
import android.app.Application;
import c90.InterfaceC5773a;
import d40.InterfaceC6083a;
import x70.C10674a;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10716a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f10717b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f10718c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f10719d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a f10720e;

    public /* synthetic */ c(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, int i11) {
        this.f10716a = i11;
        this.f10717b = aVar;
        this.f10718c = aVar2;
        this.f10719d = aVar3;
        this.f10720e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f10716a) {
            case 0:
                return new b((Application) this.f10717b.get(), (ru.ozon.fintech.settings.domain.a) this.f10718c.get(), (S80.b) this.f10719d.get(), (InterfaceC5773a) this.f10720e.get());
            default:
                return new y70.c((Application) this.f10717b.get(), (InterfaceC6083a) this.f10718c.get(), (ru.ozon.fintech.settings.domain.a) this.f10719d.get(), (C10674a) ((f) this.f10720e).get());
        }
    }
}
