package Of;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.function.Supplier;

/* loaded from: classes10.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    final ThreadLocal<SoftReference<ArrayDeque<T>>> f20354a = ThreadLocal.withInitial(new d());

    /* renamed from: b, reason: collision with root package name */
    private final Supplier<T> f20355b;

    public e(Supplier<T> supplier) {
        this.f20355b = supplier;
    }

    public final T a() {
        ThreadLocal<SoftReference<ArrayDeque<T>>> threadLocal = this.f20354a;
        ArrayDeque<T> arrayDeque = threadLocal.get().get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            threadLocal.set(new SoftReference<>(arrayDeque));
        }
        return !arrayDeque.isEmpty() ? arrayDeque.pop() : this.f20355b.get();
    }

    public final void b(T t2) {
        ThreadLocal<SoftReference<ArrayDeque<T>>> threadLocal = this.f20354a;
        ArrayDeque<T> arrayDeque = threadLocal.get().get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            threadLocal.set(new SoftReference<>(arrayDeque));
        }
        if (arrayDeque.size() < 12) {
            arrayDeque.push(t2);
        }
    }
}
