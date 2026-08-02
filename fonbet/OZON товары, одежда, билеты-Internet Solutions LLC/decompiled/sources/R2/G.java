package R2;

import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<g0<T>> f24283a = O0.a(k0.f24381b);

    @NotNull
    public final g0<T> a() {
        return this.f24283a.getValue();
    }

    @NotNull
    public final InterfaceC2395h<g0<T>> b() {
        return this.f24283a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.a() > r2.a()) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(@NotNull g0 newState) {
        Object value;
        g0 g0Var;
        Intrinsics.checkNotNullParameter(newState, "newState");
        x0<g0<T>> x0Var = this.f24283a;
        do {
            value = x0Var.getValue();
            g0Var = (g0) value;
            if (!(g0Var instanceof W ? true : Intrinsics.d(g0Var, k0.f24381b))) {
                if (!(g0Var instanceof C3911e)) {
                    if (!(g0Var instanceof S)) {
                        throw new Sc.o();
                    }
                }
            }
            g0Var = newState;
        } while (!x0Var.b(value, g0Var));
    }
}
