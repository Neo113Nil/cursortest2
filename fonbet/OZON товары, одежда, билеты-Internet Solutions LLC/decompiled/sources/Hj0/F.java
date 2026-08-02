package Hj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class F implements Jb.e<fi0.w> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f11079a;

    public F(D d11, Jb.f fVar) {
        this.f11079a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        fi0.x trackerSettings = (fi0.x) this.f11079a.get();
        Intrinsics.checkNotNullParameter(trackerSettings, "trackerSettings");
        fi0.w x11 = trackerSettings.x();
        Jb.j.d(x11);
        return x11;
    }
}
