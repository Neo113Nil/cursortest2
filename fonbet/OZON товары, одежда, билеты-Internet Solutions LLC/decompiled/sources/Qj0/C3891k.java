package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3891k extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3891k(@NotNull String hash) {
        super(0);
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.f23674a = hash;
    }

    @NotNull
    public final String a() {
        return this.f23674a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3891k) && Intrinsics.d(this.f23674a, ((C3891k) obj).f23674a);
    }

    public final int hashCode() {
        return this.f23674a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("GitHashCommit(hash="), this.f23674a, ")");
    }
}
