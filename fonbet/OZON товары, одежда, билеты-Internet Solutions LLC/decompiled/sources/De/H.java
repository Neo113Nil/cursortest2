package De;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.Y0;

/* loaded from: classes.dex */
public final class H<T> implements Y0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f6606a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ThreadLocal<T> f6607b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f6608c;

    public H(Integer num, @NotNull ThreadLocal threadLocal) {
        this.f6606a = num;
        this.f6607b = threadLocal;
        this.f6608c = new I(threadLocal);
    }

    @Override // xe.Y0
    public final void O(Object obj) {
        this.f6607b.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        if (this.f6608c.equals(aVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.a<?> getKey() {
        return this.f6608c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
        return this.f6608c.equals(aVar) ? kotlin.coroutines.g.f71771a : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(coroutineContext, this);
    }

    @Override // xe.Y0
    public final T s0(@NotNull CoroutineContext coroutineContext) {
        ThreadLocal<T> threadLocal = this.f6607b;
        T t2 = (T) threadLocal.get();
        threadLocal.set(this.f6606a);
        return t2;
    }

    @NotNull
    public final String toString() {
        return "ThreadLocal(value=" + this.f6606a + ", threadLocal = " + this.f6607b + ')';
    }
}
