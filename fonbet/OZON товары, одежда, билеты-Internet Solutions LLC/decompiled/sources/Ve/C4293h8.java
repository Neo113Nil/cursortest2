package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.h8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4293h8 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f31173b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4293h8(Sr description, String phone) {
        super(phone);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f31173b = description;
        this.f31174c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4293h8)) {
            return false;
        }
        C4293h8 c4293h8 = (C4293h8) obj;
        return Intrinsics.d(this.f31173b, c4293h8.f31173b) && Intrinsics.d(this.f31174c, c4293h8.f31174c);
    }

    public final int hashCode() {
        return this.f31174c.hashCode() + (this.f31173b.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpBundleNotFoundError(description=" + this.f31173b + ", phone=" + this.f31174c + ")";
    }
}
