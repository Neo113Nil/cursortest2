package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class F extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23512a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(@NotNull String id2) {
        super(0);
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f23512a = id2;
    }

    @NotNull
    public final String a() {
        return this.f23512a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F) && Intrinsics.d(this.f23512a, ((F) obj).f23512a);
    }

    public final int hashCode() {
        return this.f23512a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("PageId(id="), this.f23512a, ")");
    }
}
