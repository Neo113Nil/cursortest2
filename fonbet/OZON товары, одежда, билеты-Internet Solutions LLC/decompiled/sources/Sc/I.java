package Sc;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class I<T> implements InterfaceC4008j<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0<? extends T> f26095a;

    /* renamed from: b, reason: collision with root package name */
    private Object f26096b;

    public I(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f26095a = initializer;
        this.f26096b = E.f26093a;
    }

    private final Object writeReplace() {
        return new C4004f(getValue());
    }

    @Override // Sc.InterfaceC4008j
    public final T getValue() {
        if (this.f26096b == E.f26093a) {
            Function0<? extends T> function0 = this.f26095a;
            Intrinsics.f(function0);
            this.f26096b = function0.invoke();
            this.f26095a = null;
        }
        return (T) this.f26096b;
    }

    @Override // Sc.InterfaceC4008j
    public final boolean isInitialized() {
        return this.f26096b != E.f26093a;
    }

    @NotNull
    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
