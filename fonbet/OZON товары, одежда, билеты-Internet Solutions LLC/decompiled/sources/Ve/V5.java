package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class V5 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f30177b;

    public V5(Sr description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f30177b = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V5) && Intrinsics.d(this.f30177b, ((V5) obj).f30177b);
    }

    public final int hashCode() {
        return this.f30177b.hashCode();
    }

    public final String toString() {
        return "ConfirmSystemOrInternalError(description=" + this.f30177b + ")";
    }
}
