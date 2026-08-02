package F70;

import Jb.e;
import android.content.Context;

/* loaded from: classes3.dex */
public final class d implements e<ru.ozon.fintech.features.operations.presentation.d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f9117a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f9118b;

    public d(Pc.a<Context> aVar, Pc.a<S80.b> aVar2) {
        this.f9117a = aVar;
        this.f9118b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new ru.ozon.fintech.features.operations.presentation.d(this.f9117a.get(), this.f9118b.get());
    }
}
