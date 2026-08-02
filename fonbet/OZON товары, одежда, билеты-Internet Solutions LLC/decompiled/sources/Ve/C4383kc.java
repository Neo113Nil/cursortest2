package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.kc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4383kc implements InterfaceC4586rd {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4323i9 f31436a;

    public C4383kc(AbstractC4323i9 helpersScreenMode) {
        Intrinsics.checkNotNullParameter(helpersScreenMode, "helpersScreenMode");
        this.f31436a = helpersScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4383kc) && Intrinsics.d(this.f31436a, ((C4383kc) obj).f31436a);
    }

    public final int hashCode() {
        return this.f31436a.hashCode();
    }

    public final String toString() {
        return "ReturnHelpersScreenType(helpersScreenMode=" + this.f31436a + ")";
    }
}
