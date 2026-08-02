package Lf0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f17076a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f17077b;

    public f(Integer num, Integer num2) {
        this.f17076a = num;
        this.f17077b = num2;
    }

    public final Integer a() {
        return this.f17076a;
    }

    public final Integer b() {
        return this.f17077b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f17076a, fVar.f17076a) && Intrinsics.d(this.f17077b, fVar.f17077b);
    }

    public final int hashCode() {
        Integer num = this.f17076a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f17077b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SavedDomainReachabilityConfigParams(domainsLimit=" + this.f17076a + ", parallelPingLimit=" + this.f17077b + ")";
    }
}
