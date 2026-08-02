package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class To extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4323i9 f30074a;

    public To(AbstractC4323i9 helpers) {
        Intrinsics.checkNotNullParameter(helpers, "helpers");
        this.f30074a = helpers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof To) && Intrinsics.d(this.f30074a, ((To) obj).f30074a);
    }

    public final int hashCode() {
        return this.f30074a.hashCode();
    }

    public final String toString() {
        return "HelpersState(helpers=" + this.f30074a + ")";
    }
}
