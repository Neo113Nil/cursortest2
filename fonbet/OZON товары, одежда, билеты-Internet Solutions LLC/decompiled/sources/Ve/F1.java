package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;

/* loaded from: classes10.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final ConfirmBindingOtpRequestBody f28957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28958b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28959c;

    public F1(ConfirmBindingOtpRequestBody request, String mobilePhone, long j11) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(mobilePhone, "mobilePhone");
        this.f28957a = request;
        this.f28958b = mobilePhone;
        this.f28959c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F1)) {
            return false;
        }
        F1 f12 = (F1) obj;
        return Intrinsics.d(this.f28957a, f12.f28957a) && Intrinsics.d(this.f28958b, f12.f28958b) && this.f28959c == f12.f28959c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28959c) + Lf.a.b0(this.f28957a.hashCode() * 31, this.f28958b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmBindingOtpCodeUseCaseRequestParams(request=");
        sb2.append(this.f28957a);
        sb2.append(", mobilePhone=");
        sb2.append(this.f28958b);
        sb2.append(", timerTime=");
        return P4.f.a(this.f28959c, ")", sb2);
    }
}
