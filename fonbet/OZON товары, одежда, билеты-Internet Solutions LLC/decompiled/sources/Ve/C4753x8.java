package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.x8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4753x8 extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4323i9 f32471a;

    public C4753x8(AbstractC4323i9 helpers) {
        Intrinsics.checkNotNullParameter(helpers, "helpers");
        this.f32471a = helpers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4753x8) && Intrinsics.d(this.f32471a, ((C4753x8) obj).f32471a);
    }

    public final int hashCode() {
        return this.f32471a.hashCode();
    }

    public final String toString() {
        return "HelpersState(helpers=" + this.f32471a + ")";
    }
}
