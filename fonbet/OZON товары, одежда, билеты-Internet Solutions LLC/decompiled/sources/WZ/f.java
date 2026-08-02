package WZ;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33357a;

    public f(@NotNull String pageViewId) {
        Intrinsics.checkNotNullParameter(pageViewId, "pageViewId");
        this.f33357a = pageViewId;
    }

    @NotNull
    public final String a() {
        return this.f33357a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f33357a, ((f) obj).f33357a);
    }

    public final int hashCode() {
        return this.f33357a.hashCode();
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("CustomizedAnalyticsScreenParams(pageViewId="), this.f33357a, ")");
    }
}
