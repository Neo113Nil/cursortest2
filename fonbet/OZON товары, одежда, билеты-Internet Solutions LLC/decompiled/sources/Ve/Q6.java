package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Q6 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Jb.f f29756a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29757b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f29758c;

    public Q6(Jb.f fVar, Pc.a aVar, An an, Pc.a aVar2) {
        this.f29756a = fVar;
        this.f29757b = aVar;
        this.f29758c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) this.f29756a.get();
        C4363jl lazyNetworkModule = (C4363jl) this.f29757b.get();
        C4512op hashUtility = new C4512op();
        C4248fl featuresHandler = (C4248fl) this.f29758c.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lazyNetworkModule, "lazyNetworkModule");
        Intrinsics.checkNotNullParameter(hashUtility, "hashUtility");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        return Wk.f30290b == 5 ? new C4234f7(context, hashUtility, featuresHandler) : new K7(lazyNetworkModule, featuresHandler);
    }
}
