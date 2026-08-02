package Lf0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f17068a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f17069b;

    public b(@NotNull a domainsLimit, @NotNull a parallelPingLimit) {
        Intrinsics.checkNotNullParameter(domainsLimit, "domainsLimit");
        Intrinsics.checkNotNullParameter(parallelPingLimit, "parallelPingLimit");
        this.f17068a = domainsLimit;
        this.f17069b = parallelPingLimit;
    }

    @NotNull
    public final a a() {
        return this.f17068a;
    }

    @NotNull
    public final a b() {
        return this.f17069b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f17068a, bVar.f17068a) && Intrinsics.d(this.f17069b, bVar.f17069b);
    }

    public final int hashCode() {
        return this.f17069b.hashCode() + (this.f17068a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugMenuDomainReachabilityConfigParams(domainsLimit=" + this.f17068a + ", parallelPingLimit=" + this.f17069b + ")";
    }
}
