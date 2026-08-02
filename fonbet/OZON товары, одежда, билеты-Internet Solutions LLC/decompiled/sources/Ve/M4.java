package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class M4 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f29458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29459c;

    public M4(Sr description, String phone) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f29458b = description;
        this.f29459c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M4)) {
            return false;
        }
        M4 m42 = (M4) obj;
        return Intrinsics.d(this.f29458b, m42.f29458b) && Intrinsics.d(this.f29459c, m42.f29459c);
    }

    public final int hashCode() {
        return this.f29459c.hashCode() + (this.f29458b.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmCodeLifetimeExpired(description=" + this.f29458b + ", phone=" + this.f29459c + ")";
    }
}
