package L50;

import L50.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements Jb.e<M50.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<R30.a> f16573a;

    public f(Pc.a<R30.a> aVar) {
        this.f16573a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        R30.a appCoroutineScopes = (R30.a) ((a.C0314a) this.f16573a).get();
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        return new M50.c(appCoroutineScopes);
    }
}
