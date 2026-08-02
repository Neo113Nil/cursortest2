package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.w6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4723w6 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f32345b;

    public C4723w6(Sr description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f32345b = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4723w6) && Intrinsics.d(this.f32345b, ((C4723w6) obj).f32345b);
    }

    public final int hashCode() {
        return this.f32345b.hashCode();
    }

    public final String toString() {
        return "ConfirmValidationError(description=" + this.f32345b + ")";
    }
}
