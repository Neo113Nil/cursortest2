package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Pn extends AbstractC4595rm {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4335im f29733a;

    public Pn(AbstractC4335im fraudMonResultMode) {
        Intrinsics.checkNotNullParameter(fraudMonResultMode, "fraudMonResultMode");
        this.f29733a = fraudMonResultMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pn) && Intrinsics.d(this.f29733a, ((Pn) obj).f29733a);
    }

    public final int hashCode() {
        return this.f29733a.hashCode();
    }

    public final String toString() {
        return "FraudMonReview(fraudMonResultMode=" + this.f29733a + ")";
    }
}
