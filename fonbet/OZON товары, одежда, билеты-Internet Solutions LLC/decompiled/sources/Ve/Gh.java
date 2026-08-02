package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Gh extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4586rd f29078a;

    public Gh(InterfaceC4586rd mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f29078a = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gh) && Intrinsics.d(this.f29078a, ((Gh) obj).f29078a);
    }

    public final int hashCode() {
        return this.f29078a.hashCode();
    }

    public final String toString() {
        return "UserProfile(mode=" + this.f29078a + ")";
    }
}
