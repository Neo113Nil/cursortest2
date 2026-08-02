package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.kr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4398kr extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4182dc f31476a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31477b;

    public C4398kr(AbstractC4182dc result, long j11) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f31476a = result;
        this.f31477b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4398kr)) {
            return false;
        }
        C4398kr c4398kr = (C4398kr) obj;
        return Intrinsics.d(this.f31476a, c4398kr.f31476a) && this.f31477b == c4398kr.f31477b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31477b) + (this.f31476a.hashCode() * 31);
    }

    public final String toString() {
        return "HandleConfirmOtpResult(result=" + this.f31476a + ", timerTime=" + this.f31477b + ")";
    }
}
