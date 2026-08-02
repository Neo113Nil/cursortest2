package Be;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s implements CoroutineContext {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f3686a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Throwable f3687b;

    public s(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        this.f3686a = coroutineContext;
        this.f3687b = th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) this.f3686a.fold(r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        return (E) this.f3686a.get(aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
        return this.f3686a.minusKey(aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return this.f3686a.plus(coroutineContext);
    }
}
