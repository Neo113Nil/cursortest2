package Ge;

import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes.dex */
public final class f {
    public static final Object a(@NotNull AbstractC7094b abstractC7094b, @NotNull kotlin.coroutines.d frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        abstractC7094b.a(new c(c10737n));
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    public static final Object b(@NotNull y yVar, @NotNull kotlin.coroutines.d frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        yVar.c(new d(c10737n));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public static final Object c(@NotNull io.reactivex.p pVar, @NotNull kotlin.coroutines.d frame) {
        EnumC3096a enumC3096a = EnumC3096a.FIRST;
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        pVar.subscribe(new e(c10737n, enumC3096a));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
