package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;

/* loaded from: classes10.dex */
public final class V3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30172a;

    /* renamed from: b, reason: collision with root package name */
    public final ConfirmOtpRequestBody f30173b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30174c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30175d;

    public V3(String authorization, ConfirmOtpRequestBody confirmOtpRequest, String mobilePhone, long j11) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(confirmOtpRequest, "confirmOtpRequest");
        Intrinsics.checkNotNullParameter(mobilePhone, "mobilePhone");
        this.f30172a = authorization;
        this.f30173b = confirmOtpRequest;
        this.f30174c = mobilePhone;
        this.f30175d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V3)) {
            return false;
        }
        V3 v32 = (V3) obj;
        return Intrinsics.d(this.f30172a, v32.f30172a) && Intrinsics.d(this.f30173b, v32.f30173b) && Intrinsics.d(this.f30174c, v32.f30174c) && this.f30175d == v32.f30175d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30175d) + Lf.a.b0((this.f30173b.hashCode() + (this.f30172a.hashCode() * 31)) * 31, this.f30174c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmOtpCodeUseCaseRequestParams(authorization=");
        sb2.append(this.f30172a);
        sb2.append(", confirmOtpRequest=");
        sb2.append(this.f30173b);
        sb2.append(", mobilePhone=");
        sb2.append(this.f30174c);
        sb2.append(", timerTime=");
        return P4.f.a(this.f30175d, ")", sb2);
    }
}
