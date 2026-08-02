package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class O extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23530a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(@NotNull String value) {
        super(0);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23530a = value;
    }

    @NotNull
    public final String a() {
        return this.f23530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O) && Intrinsics.d(this.f23530a, ((O) obj).f23530a);
    }

    public final int hashCode() {
        return this.f23530a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("StEdgeIp(value="), this.f23530a, ")");
    }
}
