package Hj0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Hj0.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3160q implements Jb.e<Wj0.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f11190a;

    public C3160q(Jb.f fVar) {
        this.f11190a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        fi0.x settings = (fi0.x) this.f11190a.get();
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new Wj0.a(settings.n());
    }
}
