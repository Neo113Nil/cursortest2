package A20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z20.EnumC10976a;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC10976a f314a;

    public e(@NotNull EnumC10976a token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f314a = token;
    }

    @NotNull
    public final EnumC10976a a() {
        return this.f314a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f314a == ((e) obj).f314a && Float.compare(0.4f, 0.4f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.4f) + (this.f314a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TokenWithAlpha(token=" + this.f314a + ", alphaMultiplier=0.4)";
    }
}
