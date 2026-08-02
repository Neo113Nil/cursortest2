package Hj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class U implements Jb.e<ru.ozon.tracker.process.lifecycle.a> {

    /* renamed from: a, reason: collision with root package name */
    private final C3149f f11106a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Yj0.a> f11107b;

    public U(T t2, C3149f c3149f, Pc.a aVar) {
        this.f11106a = c3149f;
        this.f11107b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        xe.I dispatcher = (xe.I) this.f11106a.get();
        Ib.a providerLazy = Jb.d.a(this.f11107b);
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(providerLazy, "providerLazy");
        return new ru.ozon.tracker.process.lifecycle.a(dispatcher, providerLazy);
    }
}
