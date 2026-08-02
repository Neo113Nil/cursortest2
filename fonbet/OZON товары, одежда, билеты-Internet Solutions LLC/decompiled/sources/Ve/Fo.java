package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Fo implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f29021a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29022b;

    public Fo(Pc.a aVar, Pc.a aVar2) {
        this.f29021a = aVar;
        this.f29022b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Ma defaultPreferences = (Ma) this.f29021a.get();
        xe.M coroutineScope = (xe.M) this.f29022b.get();
        Intrinsics.checkNotNullParameter(defaultPreferences, "defaultPreferences");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new C4180da(defaultPreferences, coroutineScope);
    }
}
