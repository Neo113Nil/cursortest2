package B1;

import B1.m0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class Q extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final D1.V f2083b;

    public Q(@NotNull D1.V v11) {
        this.f2083b = v11;
    }

    @Override // B1.m0.a
    @NotNull
    protected final Z1.s b() {
        return this.f2083b.getLayoutDirection();
    }

    @Override // B1.m0.a
    protected final int c() {
        return this.f2083b.r0();
    }
}
