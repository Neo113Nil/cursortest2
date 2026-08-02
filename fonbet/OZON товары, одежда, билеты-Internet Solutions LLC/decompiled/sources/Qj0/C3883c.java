package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3883c extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23616a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3883c(@NotNull String type) {
        super(0);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f23616a = type;
    }

    @NotNull
    public final String a() {
        return this.f23616a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3883c) && Intrinsics.d(this.f23616a, ((C3883c) obj).f23616a);
    }

    public final int hashCode() {
        return this.f23616a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("ContentType(type="), this.f23616a, ")");
    }
}
