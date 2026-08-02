package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K6 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f29336a;

    public K6(Pc.a aVar) {
        this.f29336a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        In appTokenStoreSP = (In) this.f29336a.get();
        Intrinsics.checkNotNullParameter(appTokenStoreSP, "appTokenStoreSP");
        return new C4503og(appTokenStoreSP);
    }
}
