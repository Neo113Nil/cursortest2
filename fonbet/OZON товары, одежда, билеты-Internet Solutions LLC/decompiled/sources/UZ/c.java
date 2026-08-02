package UZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Rg.a f27472a;

    public c(Rg.a aVar) {
        this.f27472a = aVar;
    }

    public final Rg.a a() {
        return this.f27472a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f27472a, ((c) obj).f27472a);
    }

    public final int hashCode() {
        Rg.a aVar = this.f27472a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PageAnalyticsEvent(screen=" + this.f27472a + ")";
    }
}
