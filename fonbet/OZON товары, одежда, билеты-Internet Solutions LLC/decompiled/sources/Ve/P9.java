package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class P9 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f29685b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P9(Sr description, String phone) {
        super(phone);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f29685b = description;
        this.f29686c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P9)) {
            return false;
        }
        P9 p92 = (P9) obj;
        return Intrinsics.d(this.f29685b, p92.f29685b) && Intrinsics.d(this.f29686c, p92.f29686c);
    }

    public final int hashCode() {
        return this.f29686c.hashCode() + (this.f29685b.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpSystemOrInternalError(description=" + this.f29685b + ", phone=" + this.f29686c + ")";
    }
}
