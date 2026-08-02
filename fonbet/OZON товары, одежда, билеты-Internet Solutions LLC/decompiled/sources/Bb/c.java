package Bb;

import We.InterfaceC4865g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes9.dex */
public final class c {
    public static final Object a(@NotNull InterfaceC4865g interfaceC4865g, @NotNull kotlin.coroutines.jvm.internal.c frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        d dVar = new d(interfaceC4865g, c10737n);
        interfaceC4865g.E0(dVar);
        c10737n.q(dVar);
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
