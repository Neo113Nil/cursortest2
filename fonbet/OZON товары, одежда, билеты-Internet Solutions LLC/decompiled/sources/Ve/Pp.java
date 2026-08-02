package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Pp implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f29738a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29739b;

    public Pp(Pc.a aVar, Pc.a aVar2) {
        this.f29738a = aVar;
        this.f29739b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Tq configService = (Tq) this.f29738a.get();
        Ma defaultPreferences = (Ma) this.f29739b.get();
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(defaultPreferences, "defaultPreferences");
        return new C4712vn(configService, defaultPreferences);
    }
}
