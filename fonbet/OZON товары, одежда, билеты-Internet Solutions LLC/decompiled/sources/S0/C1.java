package S0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C1<T> implements G1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f25192a;

    public C1(T t2) {
        this.f25192a = t2;
    }

    @Override // S0.G1
    public final T a(@NotNull A0 a02) {
        return this.f25192a;
    }

    public final T b() {
        return this.f25192a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1) && Intrinsics.d(this.f25192a, ((C1) obj).f25192a);
    }

    public final int hashCode() {
        T t2 = this.f25192a;
        if (t2 == null) {
            return 0;
        }
        return t2.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StaticValueHolder(value=" + this.f25192a + ')';
    }
}
