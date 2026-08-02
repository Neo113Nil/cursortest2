package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class P extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(@NotNull String id2) {
        super(0);
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f23531a = id2;
    }

    @NotNull
    public final String a() {
        return this.f23531a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && Intrinsics.d(this.f23531a, ((P) obj).f23531a);
    }

    public final int hashCode() {
        return this.f23531a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("StateId(id="), this.f23531a, ")");
    }
}
