package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class t0 extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23708a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull String url) {
        super(0);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f23708a = url;
    }

    @NotNull
    public final String a() {
        return this.f23708a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.f23708a, ((t0) obj).f23708a);
    }

    public final int hashCode() {
        return this.f23708a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C.o0.c(new StringBuilder("Url(url="), this.f23708a, ")");
    }
}
