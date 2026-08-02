package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PayOnlineRequestBody;

/* renamed from: Ve.a4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4087a4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30630a;

    /* renamed from: b, reason: collision with root package name */
    public final PayOnlineRequestBody f30631b;

    public C4087a4(String authorization, PayOnlineRequestBody payOnlineRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(payOnlineRequestBody, "payOnlineRequestBody");
        this.f30630a = authorization;
        this.f30631b = payOnlineRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4087a4)) {
            return false;
        }
        C4087a4 c4087a4 = (C4087a4) obj;
        return Intrinsics.d(this.f30630a, c4087a4.f30630a) && Intrinsics.d(this.f30631b, c4087a4.f30631b);
    }

    public final int hashCode() {
        return this.f30631b.hashCode() + (this.f30630a.hashCode() * 31);
    }

    public final String toString() {
        return "GetPayOnlineUseCaseRequestParams(authorization=" + this.f30630a + ", payOnlineRequestBody=" + this.f30631b + ")";
    }
}
