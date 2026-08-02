package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class C7 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f28743b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7(Sr description, String phone) {
        super(phone);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f28743b = description;
        this.f28744c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7)) {
            return false;
        }
        C7 c72 = (C7) obj;
        return Intrinsics.d(this.f28743b, c72.f28743b) && Intrinsics.d(this.f28744c, c72.f28744c);
    }

    public final int hashCode() {
        return this.f28744c.hashCode() + (this.f28743b.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpAttemptsExhausted(description=" + this.f28743b + ", phone=" + this.f28744c + ")";
    }
}
