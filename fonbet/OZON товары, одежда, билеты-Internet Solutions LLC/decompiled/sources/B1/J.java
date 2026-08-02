package B1;

import B1.C2532a0;
import androidx.compose.ui.e;
import m5.C8080c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface J extends e.b {

    /* loaded from: classes8.dex */
    public static final class a {
        @Deprecated
        public static int a(@NotNull C8080c c8080c, @NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
            return c8080c.D(new A(v11, v11.getLayoutDirection()), new C2532a0.a(interfaceC2552v, C2532a0.c.Max, C2532a0.d.Height), Z1.c.b(i11, 0, 13)).getHeight();
        }

        @Deprecated
        public static int b(@NotNull C8080c c8080c, @NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
            return c8080c.D(new A(v11, v11.getLayoutDirection()), new C2532a0.a(interfaceC2552v, C2532a0.c.Max, C2532a0.d.Width), Z1.c.b(0, i11, 7)).getWidth();
        }

        @Deprecated
        public static int c(@NotNull C8080c c8080c, @NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
            return c8080c.D(new A(v11, v11.getLayoutDirection()), new C2532a0.a(interfaceC2552v, C2532a0.c.Min, C2532a0.d.Height), Z1.c.b(i11, 0, 13)).getHeight();
        }

        @Deprecated
        public static int d(@NotNull C8080c c8080c, @NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
            return c8080c.D(new A(v11, v11.getLayoutDirection()), new C2532a0.a(interfaceC2552v, C2532a0.c.Min, C2532a0.d.Width), Z1.c.b(0, i11, 7)).getWidth();
        }
    }

    default int A(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return C2532a0.d(this, v11, interfaceC2552v, i11);
    }

    @NotNull
    W D(@NotNull Y y11, @NotNull U u11, long j11);

    default int I(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return C2532a0.a(this, v11, interfaceC2552v, i11);
    }

    default int K(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return C2532a0.c(this, v11, interfaceC2552v, i11);
    }

    default int u(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return C2532a0.b(this, v11, interfaceC2552v, i11);
    }
}
