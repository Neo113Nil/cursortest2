package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.c7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4148c7 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC4801z0 f30784a;

    public C4148c7(EnumC4801z0 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f30784a = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4148c7) && this.f30784a == ((C4148c7) obj).f30784a;
    }

    public final int hashCode() {
        return this.f30784a.hashCode();
    }

    public final String toString() {
        return "PhoneNumber(reason=" + this.f30784a + ")";
    }
}
