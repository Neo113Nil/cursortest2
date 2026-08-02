package Cd;

import Sc.C4007i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final z f4790d = new z(L.STRICT, 6);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f4791a;

    /* renamed from: b, reason: collision with root package name */
    private final C4007i f4792b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final L f4793c;

    public z(@NotNull L reportLevelBefore, C4007i c4007i, @NotNull L reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f4791a = reportLevelBefore;
        this.f4792b = c4007i;
        this.f4793c = reportLevelAfter;
    }

    @NotNull
    public final L b() {
        return this.f4793c;
    }

    @NotNull
    public final L c() {
        return this.f4791a;
    }

    public final C4007i d() {
        return this.f4792b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f4791a == zVar.f4791a && Intrinsics.d(this.f4792b, zVar.f4792b) && this.f4793c == zVar.f4793c;
    }

    public final int hashCode() {
        int hashCode = this.f4791a.hashCode() * 31;
        C4007i c4007i = this.f4792b;
        return this.f4793c.hashCode() + ((hashCode + (c4007i == null ? 0 : c4007i.getF26103d())) * 31);
    }

    @NotNull
    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f4791a + ", sinceVersion=" + this.f4792b + ", reportLevelAfter=" + this.f4793c + ')';
    }

    public z(L l11, int i11) {
        this(l11, (i11 & 2) != 0 ? new C4007i(1, 0, 0) : null, l11);
    }
}
