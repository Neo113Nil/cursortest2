package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class K8 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f29339b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8(Sr description, String phone) {
        super(phone);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f29339b = description;
        this.f29340c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K8)) {
            return false;
        }
        K8 k82 = (K8) obj;
        return Intrinsics.d(this.f29339b, k82.f29339b) && Intrinsics.d(this.f29340c, k82.f29340c);
    }

    public final int hashCode() {
        return this.f29340c.hashCode() + (this.f29339b.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpOrderNotFoundError(description=" + this.f29339b + ", phone=" + this.f29340c + ")";
    }
}
