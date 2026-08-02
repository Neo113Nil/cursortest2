package S0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class F<T> implements G1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC3994y, T> f25199a;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@NotNull Function1<? super InterfaceC3994y, ? extends T> function1) {
        this.f25199a = function1;
    }

    @Override // S0.G1
    public final T a(@NotNull A0 a02) {
        return this.f25199a.invoke(a02);
    }

    @NotNull
    public final Function1<InterfaceC3994y, T> b() {
        return this.f25199a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F) && Intrinsics.d(this.f25199a, ((F) obj).f25199a);
    }

    public final int hashCode() {
        return this.f25199a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f25199a + ')';
    }
}
