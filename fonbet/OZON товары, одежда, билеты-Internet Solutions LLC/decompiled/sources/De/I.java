package De;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class I implements CoroutineContext.a<H<?>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ThreadLocal<?> f6609a;

    public I(@NotNull ThreadLocal<?> threadLocal) {
        this.f6609a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && Intrinsics.d(this.f6609a, ((I) obj).f6609a);
    }

    public final int hashCode() {
        return this.f6609a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f6609a + ')';
    }
}
