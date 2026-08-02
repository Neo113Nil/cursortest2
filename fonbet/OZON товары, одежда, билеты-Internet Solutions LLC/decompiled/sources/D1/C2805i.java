package D1;

import org.jetbrains.annotations.NotNull;

/* renamed from: D1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2805i {
    public static final Object a(@NotNull InterfaceC2803h interfaceC2803h, @NotNull S0.G0 g02) {
        if (interfaceC2803h.getNode().isAttached()) {
            return C2809k.f(interfaceC2803h).C().b(g02);
        }
        A1.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        throw null;
    }
}
