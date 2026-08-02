package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ae extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4586rd f28602a;

    public Ae(InterfaceC4586rd mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f28602a = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ae) && Intrinsics.d(this.f28602a, ((Ae) obj).f28602a);
    }

    public final int hashCode() {
        return this.f28602a.hashCode();
    }

    public final String toString() {
        return "ShowUserProfile(mode=" + this.f28602a + ")";
    }
}
