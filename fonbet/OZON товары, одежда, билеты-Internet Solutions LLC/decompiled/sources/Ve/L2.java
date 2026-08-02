package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class L2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f29384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29385b;

    public L2(long j11, String str) {
        this.f29384a = j11;
        this.f29385b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L2)) {
            return false;
        }
        L2 l22 = (L2) obj;
        return this.f29384a == l22.f29384a && Intrinsics.d(this.f29385b, l22.f29385b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f29384a) * 31;
        String str = this.f29385b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BnplSum(sum=");
        sb2.append(this.f29384a);
        sb2.append(", currency=");
        return C.o0.c(sb2, this.f29385b, ")");
    }
}
