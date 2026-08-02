package J4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D implements Executor {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f13848a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<Runnable> f13849b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f13850c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f13851d;

    public D(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f13848a = executor;
        this.f13849b = new ArrayDeque<>();
        this.f13851d = new Object();
    }

    public final void a() {
        synchronized (this.f13851d) {
            try {
                Runnable poll = this.f13849b.poll();
                Runnable runnable = poll;
                this.f13850c = runnable;
                if (poll != null) {
                    this.f13848a.execute(runnable);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f13851d) {
            try {
                this.f13849b.offer(new C(command, this, 0));
                if (this.f13850c == null) {
                    a();
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
