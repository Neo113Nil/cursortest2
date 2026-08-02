package Ve;

import We.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Yp implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f30517a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f30518b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f30519c;

    public Yp(Pc.a aVar, Pc.a aVar2, Pc.a aVar3) {
        this.f30517a = aVar;
        this.f30518b = aVar2;
        this.f30519c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        Be sslInteractor = (Be) this.f30517a.get();
        E.a okHttpBuilder = (E.a) this.f30518b.get();
        C4248fl featuresHandler = (C4248fl) this.f30519c.get();
        Intrinsics.checkNotNullParameter(sslInteractor, "sslInteractor");
        Intrinsics.checkNotNullParameter(okHttpBuilder, "okHttpBuilder");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        return new C4363jl(sslInteractor, okHttpBuilder, featuresHandler);
    }
}
