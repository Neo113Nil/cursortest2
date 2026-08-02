package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.to, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4655to extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final String f32158a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4801z0 f32159b;

    public C4655to(String number, EnumC4801z0 reason) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f32158a = number;
        this.f32159b = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4655to)) {
            return false;
        }
        C4655to c4655to = (C4655to) obj;
        return Intrinsics.d(this.f32158a, c4655to.f32158a) && this.f32159b == c4655to.f32159b;
    }

    public final int hashCode() {
        return this.f32159b.hashCode() + (this.f32158a.hashCode() * 31);
    }

    public final String toString() {
        return "HandleWebViewAuthorizationWithPhoneNumber(number=" + this.f32158a + ", reason=" + this.f32159b + ")";
    }
}
