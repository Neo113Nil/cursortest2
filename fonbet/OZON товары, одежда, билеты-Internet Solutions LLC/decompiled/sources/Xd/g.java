package Xd;

import je.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* loaded from: classes.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f34400a;

    public g(T t2) {
        this.f34400a = t2;
    }

    @NotNull
    public abstract N a(@NotNull InterfaceC9815F interfaceC9815F);

    public T b() {
        return this.f34400a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T b11 = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return Intrinsics.d(b11, gVar != null ? gVar.b() : null);
    }

    public final int hashCode() {
        T b11 = b();
        if (b11 != null) {
            return b11.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(b());
    }
}
