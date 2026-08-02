package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.L0;

/* loaded from: classes8.dex */
public final class I0 {
    public static final Object a(@NotNull AbstractC5434v abstractC5434v, @NotNull AbstractC5434v.b bVar, boolean z11, @NotNull L0 l02, @NotNull Function0 function0, @NotNull kotlin.coroutines.jvm.internal.j frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        G0 g02 = new G0(bVar, abstractC5434v, c10737n, function0);
        if (z11) {
            l02.q(kotlin.coroutines.g.f71771a, new H0(abstractC5434v, g02));
        } else {
            abstractC5434v.a(g02);
        }
        c10737n.q(new F0(l02, abstractC5434v, g02));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
