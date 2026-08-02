package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class S extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(@NotNull String type) {
        super(0);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f23533a = type;
    }

    @NotNull
    public final String a() {
        return this.f23533a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S) && Intrinsics.d(this.f23533a, ((S) obj).f23533a);
    }

    public final int hashCode() {
        return this.f23533a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("StatusCodeType(type="), this.f23533a, ")");
    }
}
