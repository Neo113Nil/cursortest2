package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.km, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4393km {

    /* renamed from: a, reason: collision with root package name */
    public final String f31454a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31455b;

    /* renamed from: c, reason: collision with root package name */
    public final J2 f31456c;

    public C4393km(String token, long j11, J2 j22) {
        Intrinsics.checkNotNullParameter("", "code");
        Intrinsics.checkNotNullParameter("", "state");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f31454a = token;
        this.f31455b = j11;
        this.f31456c = j22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4393km)) {
            return false;
        }
        C4393km c4393km = (C4393km) obj;
        c4393km.getClass();
        return Intrinsics.d(this.f31454a, c4393km.f31454a) && this.f31455b == c4393km.f31455b && this.f31456c == c4393km.f31456c;
    }

    public final int hashCode() {
        int a11 = Pk0.c.a(this.f31454a.hashCode() * 31, 31, this.f31455b);
        J2 j22 = this.f31456c;
        return a11 + (j22 == null ? 0 : j22.hashCode());
    }

    public final String toString() {
        return "AppTokenModel(code=, state=, token=" + this.f31454a + ", createTime=" + this.f31455b + ", typeAuth=" + this.f31456c + ")";
    }
}
