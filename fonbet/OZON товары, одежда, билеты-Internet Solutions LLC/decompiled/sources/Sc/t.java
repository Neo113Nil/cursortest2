package Sc;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u0000 \u000b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\fJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"LSc/t;", "T", "LSc/j;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "_value", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class t<T> implements InterfaceC4008j<T>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<t<?>, Object> f26109d = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    private volatile Function0<? extends T> f26110a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Object _value;

    public t(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f26110a = initializer;
        this._value = E.f26093a;
    }

    private final Object writeReplace() {
        return new C4004f(getValue());
    }

    @Override // Sc.InterfaceC4008j
    public final T getValue() {
        T t2 = (T) this._value;
        E e11 = E.f26093a;
        if (t2 != e11) {
            return t2;
        }
        Function0<? extends T> function0 = this.f26110a;
        if (function0 != null) {
            T invoke = function0.invoke();
            AtomicReferenceFieldUpdater<t<?>, Object> atomicReferenceFieldUpdater = f26109d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, e11, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != e11) {
                }
            }
            this.f26110a = null;
            return invoke;
        }
        return (T) this._value;
    }

    @Override // Sc.InterfaceC4008j
    public final boolean isInitialized() {
        return this._value != E.f26093a;
    }

    @NotNull
    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
