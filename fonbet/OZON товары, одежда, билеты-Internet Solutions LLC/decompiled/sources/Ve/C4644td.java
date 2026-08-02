package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.td, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4644td extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC4801z0 f32099a;

    public C4644td(EnumC4801z0 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f32099a = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4644td) && this.f32099a == ((C4644td) obj).f32099a;
    }

    public final int hashCode() {
        return this.f32099a.hashCode();
    }

    public final String toString() {
        return "ShowPhoneNumberFragment(reason=" + this.f32099a + ")";
    }
}
