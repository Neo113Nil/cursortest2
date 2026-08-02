package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ca extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4323i9 f28752a;

    public Ca(AbstractC4323i9 helperScreenMode) {
        Intrinsics.checkNotNullParameter(helperScreenMode, "helperScreenMode");
        this.f28752a = helperScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ca) && Intrinsics.d(this.f28752a, ((Ca) obj).f28752a);
    }

    public final int hashCode() {
        return this.f28752a.hashCode();
    }

    public final String toString() {
        return "ShowHelperScreen(helperScreenMode=" + this.f28752a + ")";
    }
}
