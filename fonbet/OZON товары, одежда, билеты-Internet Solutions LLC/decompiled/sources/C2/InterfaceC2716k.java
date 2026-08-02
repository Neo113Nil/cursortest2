package C2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: C2.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC2716k {

    /* renamed from: C2.k$a */
    public static final class a {
        @NotNull
        public static C2723s a(@NotNull Application context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C2723s(context);
        }
    }

    void a(@NotNull Activity activity, @NotNull g0 g0Var, CancellationSignal cancellationSignal, @NotNull ExecutorC2715j executorC2715j, @NotNull C2722q c2722q);

    default Object b(@NotNull Activity activity, @NotNull g0 g0Var, @NotNull kotlin.coroutines.d frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c10737n.q(new C2721p(cancellationSignal));
        a(activity, g0Var, cancellationSignal, new ExecutorC2715j(), new C2722q(c10737n));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    default Object c(@NotNull C2706a c2706a, @NotNull kotlin.coroutines.d<? super Unit> frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c10737n.q(new C2717l(cancellationSignal));
        e(c2706a, cancellationSignal, new ExecutorC2715j(), new C2718m(c10737n));
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    default Object d(@NotNull Activity activity, @NotNull C2710e c2710e, @NotNull kotlin.coroutines.d frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c10737n.q(new C2719n(cancellationSignal));
        f(activity, c2710e, cancellationSignal, new ExecutorC2715j(), new C2720o(c10737n));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    void e(@NotNull C2706a c2706a, CancellationSignal cancellationSignal, @NotNull ExecutorC2715j executorC2715j, @NotNull C2718m c2718m);

    void f(@NotNull Activity activity, @NotNull C2710e c2710e, CancellationSignal cancellationSignal, @NotNull ExecutorC2715j executorC2715j, @NotNull C2720o c2720o);
}
