package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Va extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f30189b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Va(Sr description, String phone) {
        super(phone);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f30189b = description;
        this.f30190c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Va)) {
            return false;
        }
        Va va2 = (Va) obj;
        return Intrinsics.d(this.f30189b, va2.f30189b) && Intrinsics.d(this.f30190c, va2.f30190c);
    }

    public final int hashCode() {
        return this.f30190c.hashCode() + (this.f30189b.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpValidationError(description=" + this.f30189b + ", phone=" + this.f30190c + ")";
    }
}
