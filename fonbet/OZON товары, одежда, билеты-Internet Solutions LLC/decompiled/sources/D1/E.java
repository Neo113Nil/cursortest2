package D1;

import B1.InterfaceC2552v;
import D1.q0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface E extends InterfaceC2807j {
    default int A(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return new D(this).a(new B1.A(v11, v11.getLayoutDirection()), new q0.b(interfaceC2552v, q0.d.Min, q0.e.Width), Z1.c.b(0, i11, 7)).getWidth();
    }

    @NotNull
    B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11);

    default int I(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return new C(this).a(new B1.A(v11, v11.getLayoutDirection()), new q0.b(interfaceC2552v, q0.d.Max, q0.e.Height), Z1.c.b(i11, 0, 13)).getHeight();
    }

    default int K(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return D(new B1.A(v11, v11.getLayoutDirection()), new q0.b(interfaceC2552v, q0.d.Min, q0.e.Height), Z1.c.b(i11, 0, 13)).getHeight();
    }

    default int u(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return D(new B1.A(v11, v11.getLayoutDirection()), new q0.b(interfaceC2552v, q0.d.Max, q0.e.Width), Z1.c.b(0, i11, 7)).getWidth();
    }
}
