package P1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S1.p f21535a = new S1.p();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final O1.b<W, Z> f21536b = new O1.b<>(16);

    @NotNull
    public final S1.p b() {
        return this.f21535a;
    }

    @NotNull
    public final Z c(@NotNull W w11, @NotNull Function1 function1) {
        synchronized (this.f21535a) {
            Z a11 = this.f21536b.a(w11);
            if (a11 != null) {
                if (a11.c()) {
                    return a11;
                }
                this.f21536b.c(w11);
            }
            try {
                Z z11 = (Z) ((C3811s) function1).invoke(new X(this, w11));
                synchronized (this.f21535a) {
                    try {
                        if (this.f21536b.a(w11) == null && z11.c()) {
                            this.f21536b.b(w11, z11);
                        }
                        Unit unit = Unit.f71690a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return z11;
            } catch (Exception e11) {
                throw new IllegalStateException("Could not load font", e11);
            }
        }
    }
}
