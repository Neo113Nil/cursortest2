package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class x0 extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(@NotNull String token) {
        super(0);
        Intrinsics.checkNotNullParameter(token, "token");
        this.f23760a = token;
    }

    @NotNull
    public final String a() {
        return this.f23760a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f23760a, ((x0) obj).f23760a);
    }

    public final int hashCode() {
        return this.f23760a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("UserToken(token="), this.f23760a, ")");
    }
}
