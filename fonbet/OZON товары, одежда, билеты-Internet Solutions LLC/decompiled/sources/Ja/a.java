package Ja;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f14293a;

    public a(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f14293a = host;
    }

    @NotNull
    public final String a() {
        return this.f14293a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.d(this.f14293a, ((a) obj).f14293a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(443) + (this.f14293a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("Host(host="), this.f14293a, ", port=443)");
    }
}
