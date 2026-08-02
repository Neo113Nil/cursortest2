package Be;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class F<T> implements kotlin.coroutines.d<T>, kotlin.coroutines.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<T> f3558a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f3559b;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@NotNull kotlin.coroutines.d<? super T> dVar, @NotNull CoroutineContext coroutineContext) {
        this.f3558a = dVar;
        this.f3559b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final kotlin.coroutines.jvm.internal.d getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f3558a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final CoroutineContext getContext() {
        return this.f3559b;
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) {
        this.f3558a.resumeWith(obj);
    }
}
