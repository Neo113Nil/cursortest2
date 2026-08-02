package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.h4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4289h4 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f31140b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31141c;

    public C4289h4(Sr description, String phone) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f31140b = description;
        this.f31141c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4289h4)) {
            return false;
        }
        C4289h4 c4289h4 = (C4289h4) obj;
        return Intrinsics.d(this.f31140b, c4289h4.f31140b) && Intrinsics.d(this.f31141c, c4289h4.f31141c);
    }

    public final int hashCode() {
        return this.f31141c.hashCode() + (this.f31140b.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmAttemptsExhausted(description=" + this.f31140b + ", phone=" + this.f31141c + ")";
    }
}
