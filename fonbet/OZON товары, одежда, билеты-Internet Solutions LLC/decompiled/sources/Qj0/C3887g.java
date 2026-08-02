package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3887g implements InterfaceC3892l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23642a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23643b;

    public C3887g(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f23642a = name;
        this.f23643b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3887g) && Intrinsics.d(this.f23642a, ((C3887g) obj).f23642a);
    }

    @Override // Qj0.InterfaceC3892l
    @NotNull
    public final String getMetricName() {
        return this.f23643b;
    }

    @Override // Qj0.InterfaceC3892l
    @NotNull
    public final String getName() {
        return this.f23642a;
    }

    public final int hashCode() {
        return this.f23642a.hashCode();
    }

    @Override // Qj0.InterfaceC3892l
    public final boolean isInterval() {
        return false;
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("CustomMetricType(name="), this.f23642a, ")");
    }
}
