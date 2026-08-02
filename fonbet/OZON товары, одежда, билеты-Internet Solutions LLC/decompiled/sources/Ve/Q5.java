package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Q5 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f29754a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29755b;

    public Q5(Pc.a aVar, Pc.a aVar2) {
        this.f29754a = aVar;
        this.f29755b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Ib sPayStorage = (Ib) this.f29754a.get();
        C4248fl featuresHandler = (C4248fl) this.f29755b.get();
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        return new Nq(sPayStorage, featuresHandler);
    }
}
