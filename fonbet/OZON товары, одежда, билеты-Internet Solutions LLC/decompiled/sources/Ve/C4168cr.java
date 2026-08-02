package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.cr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4168cr implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f30835a;

    /* renamed from: b, reason: collision with root package name */
    public final C4821zk f30836b;

    public C4168cr(Pc.a aVar, C4821zk c4821zk) {
        this.f30835a = aVar;
        this.f30836b = c4821zk;
    }

    @Override // Pc.a
    public final Object get() {
        X okHttpConnector = (X) this.f30835a.get();
        InterfaceC4589rg headersHandler = (InterfaceC4589rg) this.f30836b.get();
        Intrinsics.checkNotNullParameter(okHttpConnector, "okHttpConnector");
        Intrinsics.checkNotNullParameter(headersHandler, "headersHandler");
        return new Xj(okHttpConnector, headersHandler);
    }
}
