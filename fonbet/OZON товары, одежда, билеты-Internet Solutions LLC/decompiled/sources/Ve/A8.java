package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class A8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f28587a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28588b;

    /* renamed from: c, reason: collision with root package name */
    public final J2 f28589c;

    public A8(String oidcUrl, long j11, J2 j22) {
        Intrinsics.checkNotNullParameter(oidcUrl, "oidcUrl");
        this.f28587a = oidcUrl;
        this.f28588b = j11;
        this.f28589c = j22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A8)) {
            return false;
        }
        A8 a82 = (A8) obj;
        return Intrinsics.d(this.f28587a, a82.f28587a) && this.f28588b == a82.f28588b && this.f28589c == a82.f28589c;
    }

    public final int hashCode() {
        int a11 = Pk0.c.a(this.f28587a.hashCode() * 31, 31, this.f28588b);
        J2 j22 = this.f28589c;
        return a11 + (j22 == null ? 0 : j22.hashCode());
    }

    public final String toString() {
        return "ExchangeTokenModel(oidcUrl=" + this.f28587a + ", createTimeAppToken=" + this.f28588b + ", typeAuth=" + this.f28589c + ")";
    }
}
