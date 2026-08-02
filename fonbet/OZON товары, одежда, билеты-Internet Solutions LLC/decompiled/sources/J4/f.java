package J4;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import android.os.CancellationSignal;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10737n;
import xe.C10747s0;
import xe.C10749t0;
import xe.I;

/* loaded from: classes.dex */
public final class f {
    @NotNull
    public static final InterfaceC2395h a(@NotNull s sVar, @NotNull String[] strArr, @NotNull Callable callable) {
        return C2399j.A(new C3380b(sVar, strArr, callable, null));
    }

    public static final Object b(@NotNull s sVar, CancellationSignal cancellationSignal, @NotNull Callable callable, @NotNull kotlin.coroutines.d frame) {
        kotlin.coroutines.e a11;
        if (sVar.isOpenInternal() && sVar.inTransaction()) {
            return callable.call();
        }
        B b11 = (B) frame.getContext().get(B.f13842c);
        if (b11 == null || (a11 = b11.b()) == null) {
            a11 = g.a(sVar);
        }
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        c10737n.q(new C3382d(cancellationSignal, C10727i.c(C10749t0.f105499a, a11, null, new e(callable, c10737n, null), 2)));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public static final Object c(@NotNull s sVar, @NotNull Callable callable, @NotNull kotlin.coroutines.d dVar) {
        kotlin.coroutines.e eVar;
        if (sVar.isOpenInternal() && sVar.inTransaction()) {
            return callable.call();
        }
        B b11 = (B) dVar.getContext().get(B.f13842c);
        if (b11 == null || (eVar = b11.b()) == null) {
            Map<String, Object> backingFieldMap = sVar.getBackingFieldMap();
            Object obj = backingFieldMap.get("TransactionDispatcher");
            if (obj == null) {
                obj = C10747s0.b(sVar.getTransactionExecutor());
                backingFieldMap.put("TransactionDispatcher", obj);
            }
            eVar = (I) obj;
        }
        return C10727i.f(eVar, new C3381c(callable, null), dVar);
    }
}
