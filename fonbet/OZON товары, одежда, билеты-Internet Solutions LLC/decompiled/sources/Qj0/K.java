package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class K extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(@NotNull String status) {
        super(0);
        Intrinsics.checkNotNullParameter(status, "status");
        this.f23527a = status;
    }

    @NotNull
    public final String a() {
        return this.f23527a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && Intrinsics.d(this.f23527a, ((K) obj).f23527a);
    }

    public final int hashCode() {
        return this.f23527a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("ProfileCompilationStatus(status="), this.f23527a, ")");
    }
}
