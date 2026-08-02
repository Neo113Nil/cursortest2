package Je0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f14695a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f14696b;

    public s(@NotNull String errorTitle, @NotNull String errorHash) {
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        Intrinsics.checkNotNullParameter(errorHash, "errorHash");
        this.f14695a = errorTitle;
        this.f14696b = errorHash;
    }

    @NotNull
    public final String a() {
        return this.f14696b;
    }

    @NotNull
    public final String b() {
        return this.f14695a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f14695a, sVar.f14695a) && Intrinsics.d(this.f14696b, sVar.f14696b);
    }

    public final int hashCode() {
        return this.f14696b.hashCode() + (this.f14695a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackerErrorData(errorTitle=");
        sb2.append(this.f14695a);
        sb2.append(", errorHash=");
        return o0.c(sb2, this.f14696b, ")");
    }
}
