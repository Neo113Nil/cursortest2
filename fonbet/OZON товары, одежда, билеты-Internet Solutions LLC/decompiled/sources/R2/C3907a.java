package R2;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* renamed from: R2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3907a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f24336a = new AtomicInteger(0);

    public final int a() {
        return this.f24336a.decrementAndGet();
    }

    public final int b() {
        return this.f24336a.get();
    }

    public final int c() {
        return this.f24336a.getAndIncrement();
    }

    public final int d() {
        return this.f24336a.incrementAndGet();
    }
}
