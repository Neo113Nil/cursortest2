package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.CacheResult;

/* loaded from: classes7.dex */
public final class N extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CacheResult f23529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(@NotNull CacheResult type) {
        super(0);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f23529a = type;
    }

    @NotNull
    public final CacheResult a() {
        return this.f23529a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && this.f23529a == ((N) obj).f23529a;
    }

    public final int hashCode() {
        return this.f23529a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StCdnCache(type=" + this.f23529a + ")";
    }
}
