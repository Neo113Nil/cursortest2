package androidx.lifecycle;

import Cm.RunnableC2781a;
import java.util.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.L0;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5425l {

    /* renamed from: b, reason: collision with root package name */
    private boolean f43336b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f43337c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f43335a = true;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayDeque f43338d = new ArrayDeque();

    public static void a(C5425l this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        if (!this$0.f43338d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        this$0.d();
    }

    public final boolean b() {
        return this.f43336b || !this.f43335a;
    }

    public final void c(@NotNull CoroutineContext context, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 x11 = De.s.f6650a.x();
        if (x11.t(context) || b()) {
            x11.q(context, new RunnableC2781a(4, this, runnable));
        } else {
            if (!this.f43338d.offer(runnable)) {
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
            d();
        }
    }

    public final void d() {
        if (this.f43337c) {
            return;
        }
        try {
            this.f43337c = true;
            while (true) {
                ArrayDeque arrayDeque = this.f43338d;
                if (arrayDeque.isEmpty() || !b()) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f43337c = false;
        }
    }

    public final void e() {
        this.f43336b = true;
        d();
    }

    public final void f() {
        this.f43335a = true;
    }

    public final void g() {
        if (this.f43335a) {
            if (this.f43336b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.f43335a = false;
            d();
        }
    }
}
