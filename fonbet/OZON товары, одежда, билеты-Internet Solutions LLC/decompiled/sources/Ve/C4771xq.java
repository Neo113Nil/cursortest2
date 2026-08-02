package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.xq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4771xq implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f32512a;

    public C4771xq(Pc.a aVar) {
        this.f32512a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Xj commonConnector = (Xj) this.f32512a.get();
        Intrinsics.checkNotNullParameter(commonConnector, "commonConnector");
        return new Il(commonConnector);
    }
}
