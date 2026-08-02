package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.fh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4244fh extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final String f31037a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4801z0 f31038b;

    public C4244fh(String number, EnumC4801z0 reason) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f31037a = number;
        this.f31038b = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4244fh)) {
            return false;
        }
        C4244fh c4244fh = (C4244fh) obj;
        return Intrinsics.d(this.f31037a, c4244fh.f31037a) && this.f31038b == c4244fh.f31038b;
    }

    public final int hashCode() {
        return this.f31038b.hashCode() + (this.f31037a.hashCode() * 31);
    }

    public final String toString() {
        return "StartWebAuthorizationWithPhoneNumber(number=" + this.f31037a + ", reason=" + this.f31038b + ")";
    }
}
