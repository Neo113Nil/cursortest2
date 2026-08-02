package B1;

import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D extends e.c implements D1.A0, E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Object f2027a;

    public D(@NotNull Object obj) {
        this.f2027a = obj;
    }

    public final void I1(@NotNull Object obj) {
        this.f2027a = obj;
    }

    @Override // D1.A0
    public final Object M(@NotNull Z1.d dVar, Object obj) {
        return this;
    }

    @Override // B1.E
    @NotNull
    public final Object e1() {
        return this.f2027a;
    }
}
