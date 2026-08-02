package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ua, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4670ua extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f32199b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4670ua(Sr description, String phone) {
        super(phone);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f32199b = description;
        this.f32200c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4670ua)) {
            return false;
        }
        C4670ua c4670ua = (C4670ua) obj;
        return Intrinsics.d(this.f32199b, c4670ua.f32199b) && Intrinsics.d(this.f32200c, c4670ua.f32200c);
    }

    public final int hashCode() {
        return this.f32200c.hashCode() + (this.f32199b.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpTimeoutError(description=" + this.f32199b + ", phone=" + this.f32200c + ")";
    }
}
