package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4462n4 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f31621a;

    public C4462n4(Pc.a aVar) {
        this.f31621a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Cj appTokenApi = (Cj) this.f31621a.get();
        Intrinsics.checkNotNullParameter(appTokenApi, "appTokenApi");
        return new C4365jn(appTokenApi);
    }
}
