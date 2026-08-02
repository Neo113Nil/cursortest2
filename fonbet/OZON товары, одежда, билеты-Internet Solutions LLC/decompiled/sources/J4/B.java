package J4;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class B implements CoroutineContext.Element {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f13842c = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.e f13843a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f13844b = new AtomicInteger(0);

    public static final class a implements CoroutineContext.a<B> {
    }

    public B(@NotNull kotlin.coroutines.e eVar) {
        this.f13843a = eVar;
    }

    public final void a() {
        this.f13844b.incrementAndGet();
    }

    @NotNull
    public final kotlin.coroutines.e b() {
        return this.f13843a;
    }

    public final void c() {
        if (this.f13844b.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.a<B> getKey() {
        return f13842c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(coroutineContext, this);
    }
}
