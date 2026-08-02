package Hj0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Hj0.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3158o implements Jb.e<Yj0.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<fi0.v> f11186a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Wj0.a> f11187b;

    public C3158o(C3156m c3156m, Pc.a<fi0.v> aVar, Pc.a<Wj0.a> aVar2) {
        this.f11186a = aVar;
        this.f11187b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        fi0.v config = this.f11186a.get();
        Ib.a lazyImpl = Jb.d.a(this.f11187b);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(lazyImpl, "lazyImpl");
        if (!config.f()) {
            return Yj0.b.f35138a;
        }
        Object obj = lazyImpl.get();
        Intrinsics.f(obj);
        return (Yj0.a) obj;
    }
}
