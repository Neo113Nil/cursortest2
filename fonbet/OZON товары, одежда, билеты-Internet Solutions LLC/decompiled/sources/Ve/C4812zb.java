package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.zb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4812zb extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final Sr f32640b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4812zb(Sr description, String phone) {
        super(phone);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f32640b = description;
        this.f32641c = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4812zb)) {
            return false;
        }
        C4812zb c4812zb = (C4812zb) obj;
        return Intrinsics.d(this.f32640b, c4812zb.f32640b) && Intrinsics.d(this.f32641c, c4812zb.f32641c);
    }

    public final int hashCode() {
        return this.f32641c.hashCode() + (this.f32640b.hashCode() * 31);
    }

    public final String toString() {
        return "CreateOtpWrongBundleState(description=" + this.f32640b + ", phone=" + this.f32641c + ")";
    }
}
