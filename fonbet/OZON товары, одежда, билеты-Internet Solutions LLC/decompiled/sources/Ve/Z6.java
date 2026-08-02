package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Z6 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f30570b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30571c;

    public Z6(Sr description, String phone) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f30570b = description;
        this.f30571c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z6)) {
            return false;
        }
        Z6 z62 = (Z6) obj;
        return Intrinsics.d(this.f30570b, z62.f30570b) && Intrinsics.d(this.f30571c, z62.f30571c);
    }

    public final int hashCode() {
        return this.f30571c.hashCode() + (this.f30570b.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmWrongCode(description=" + this.f30570b + ", phone=" + this.f30571c + ")";
    }
}
