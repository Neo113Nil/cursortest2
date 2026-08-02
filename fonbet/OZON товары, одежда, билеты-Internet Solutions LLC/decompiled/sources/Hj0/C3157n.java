package Hj0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Hj0.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3157n implements Jb.e<ru.ozon.tracker.process.lifecycle.a> {

    /* renamed from: a, reason: collision with root package name */
    private final C3149f f11184a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Yj0.a> f11185b;

    public C3157n(C3156m c3156m, C3149f c3149f, Pc.a aVar) {
        this.f11184a = c3149f;
        this.f11185b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        xe.I dispatcher = (xe.I) this.f11184a.get();
        Ib.a providerLazy = Jb.d.a(this.f11185b);
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(providerLazy, "providerLazy");
        return new ru.ozon.tracker.process.lifecycle.a(dispatcher, providerLazy);
    }
}
