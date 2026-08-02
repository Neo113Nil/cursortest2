package Ve;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Gd {

    /* renamed from: a, reason: collision with root package name */
    public final List f29072a;

    public Gd(List links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f29072a = links;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gd) && Intrinsics.d(this.f29072a, ((Gd) obj).f29072a);
    }

    public final int hashCode() {
        return this.f29072a.hashCode();
    }

    public final String toString() {
        return C2618u.h(new StringBuilder("GetAgreementLinksTitlesUseCaseRequestParams(links="), this.f29072a, ")");
    }
}
