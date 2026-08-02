package Z40;

import We.E;
import android.app.Application;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class d implements Jb.e<c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f35475a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f35476b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<E> f35477c;

    public d(Pc.a<Application> aVar, Pc.a<InterfaceC6618a> aVar2, Pc.a<E> aVar3) {
        this.f35475a = aVar;
        this.f35476b = aVar2;
        this.f35477c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new c(this.f35475a.get(), this.f35476b.get(), this.f35477c.get());
    }
}
