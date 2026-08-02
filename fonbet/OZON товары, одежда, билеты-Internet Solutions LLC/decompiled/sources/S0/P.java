package S0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class P<T> implements G1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0<T> f25294a;

    public P(@NotNull InterfaceC3978p0<T> interfaceC3978p0) {
        this.f25294a = interfaceC3978p0;
    }

    @Override // S0.G1
    public final T a(@NotNull A0 a02) {
        return this.f25294a.getValue();
    }

    @NotNull
    public final InterfaceC3978p0<T> b() {
        return this.f25294a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && Intrinsics.d(this.f25294a, ((P) obj).f25294a);
    }

    public final int hashCode() {
        return this.f25294a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DynamicValueHolder(state=" + this.f25294a + ')';
    }
}
