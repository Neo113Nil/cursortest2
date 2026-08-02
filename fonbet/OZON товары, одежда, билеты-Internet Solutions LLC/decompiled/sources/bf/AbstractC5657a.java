package bf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bf.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC5657a {

    /* renamed from: a, reason: collision with root package name */
    private c f55964a;

    /* renamed from: b, reason: collision with root package name */
    private long f55965b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f55966c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f55967d;

    public AbstractC5657a(@NotNull String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f55966c = name;
        this.f55967d = z11;
        this.f55965b = -1L;
    }

    public final boolean a() {
        return this.f55967d;
    }

    @NotNull
    public final String b() {
        return this.f55966c;
    }

    public final long c() {
        return this.f55965b;
    }

    public final c d() {
        return this.f55964a;
    }

    public final void e(@NotNull c queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        c cVar = this.f55964a;
        if (cVar == queue) {
            return;
        }
        if (!(cVar == null)) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f55964a = queue;
    }

    public abstract long f();

    public final void g(long j11) {
        this.f55965b = j11;
    }

    @NotNull
    public final String toString() {
        return this.f55966c;
    }
}
