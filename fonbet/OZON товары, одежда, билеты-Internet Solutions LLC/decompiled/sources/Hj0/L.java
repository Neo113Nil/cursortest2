package Hj0;

import Bl0.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class L implements Jb.e<Yj0.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<fi0.v> f11093a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Wj0.a> f11094b;

    public L(k0 k0Var, Pc.a<fi0.v> aVar, Pc.a<Wj0.a> aVar2) {
        this.f11093a = aVar;
        this.f11094b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        fi0.v config = this.f11093a.get();
        Ib.a lazyImpl = Jb.d.a(this.f11094b);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(lazyImpl, "lazyImpl");
        if (!config.g()) {
            return Yj0.b.f35138a;
        }
        Object obj = lazyImpl.get();
        Intrinsics.f(obj);
        return (Yj0.a) obj;
    }
}
