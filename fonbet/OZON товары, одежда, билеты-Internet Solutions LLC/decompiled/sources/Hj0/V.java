package Hj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class V implements Jb.e<Yj0.a> {

    /* renamed from: a, reason: collision with root package name */
    private final T f11108a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<fi0.v> f11109b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Wj0.a> f11110c;

    public V(T t2, Pc.a<fi0.v> aVar, Pc.a<Wj0.a> aVar2) {
        this.f11108a = t2;
        this.f11109b = aVar;
        this.f11110c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        fi0.v config = this.f11109b.get();
        Ib.a lazyImpl = Jb.d.a(this.f11110c);
        this.f11108a.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(lazyImpl, "lazyImpl");
        if (!config.e()) {
            return Yj0.b.f35138a;
        }
        Object obj = lazyImpl.get();
        Intrinsics.f(obj);
        return (Yj0.a) obj;
    }
}
