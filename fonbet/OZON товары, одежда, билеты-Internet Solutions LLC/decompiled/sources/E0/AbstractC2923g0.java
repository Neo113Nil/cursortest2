package E0;

import androidx.compose.ui.platform.P1;
import androidx.compose.ui.platform.c2;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2923g0 implements Q1.F {

    /* renamed from: a, reason: collision with root package name */
    private C2917d0 f7220a;

    /* renamed from: E0.g0$a */
    public interface a {
        B0.O0 E0();

        @NotNull
        c2 b();

        I0.W0 q0();

        B1.B v();
    }

    @Override // Q1.F
    public final void e() {
        P1 I12;
        C2917d0 c2917d0 = this.f7220a;
        if (c2917d0 == null || (I12 = c2917d0.I1()) == null) {
            return;
        }
        I12.hide();
    }

    @Override // Q1.F
    public final void h() {
        P1 I12;
        C2917d0 c2917d0 = this.f7220a;
        if (c2917d0 == null || (I12 = c2917d0.I1()) == null) {
            return;
        }
        I12.show();
    }

    protected final a i() {
        return this.f7220a;
    }

    public final void j(@NotNull C2917d0 c2917d0) {
        if (this.f7220a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        this.f7220a = c2917d0;
    }

    public abstract void k();

    public final void l(@NotNull C2917d0 c2917d0) {
        if (this.f7220a == c2917d0) {
            this.f7220a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + c2917d0 + " but was " + this.f7220a).toString());
    }
}
