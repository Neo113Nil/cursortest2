package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3899t extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23707a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3899t(@NotNull String layoutId) {
        super(0);
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        this.f23707a = layoutId;
    }

    @NotNull
    public final String a() {
        return this.f23707a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3899t) && Intrinsics.d(this.f23707a, ((C3899t) obj).f23707a);
    }

    public final int hashCode() {
        return this.f23707a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("LayoutId(layoutId="), this.f23707a, ")");
    }
}
