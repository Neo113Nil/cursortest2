package B1;

import B1.m0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class i0 extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final D1.x0 f2114b;

    public i0(@NotNull D1.x0 x0Var) {
        this.f2114b = x0Var;
    }

    @Override // B1.m0.a
    @NotNull
    protected final Z1.s b() {
        return this.f2114b.getLayoutDirection();
    }

    @Override // B1.m0.a
    protected final int c() {
        return this.f2114b.getF40548l().l0();
    }
}
