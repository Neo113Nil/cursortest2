package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.j7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4349j7 {

    /* renamed from: a, reason: collision with root package name */
    public final Wj f31346a;

    public C4349j7(Wj state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f31346a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4349j7) && Intrinsics.d(this.f31346a, ((C4349j7) obj).f31346a);
    }

    public final int hashCode() {
        return this.f31346a.hashCode();
    }

    public final String toString() {
        return "SheetState(state=" + this.f31346a + ")";
    }
}
