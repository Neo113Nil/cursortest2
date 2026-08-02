package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* renamed from: Ve.dk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4190dk {

    /* renamed from: a, reason: collision with root package name */
    public final String f30890a;

    /* renamed from: b, reason: collision with root package name */
    public final SpasiboBonusesRequestBody f30891b;

    public C4190dk(String authorization, SpasiboBonusesRequestBody spasiboBonusesRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(spasiboBonusesRequestBody, "spasiboBonusesRequestBody");
        this.f30890a = authorization;
        this.f30891b = spasiboBonusesRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4190dk)) {
            return false;
        }
        C4190dk c4190dk = (C4190dk) obj;
        return Intrinsics.d(this.f30890a, c4190dk.f30890a) && Intrinsics.d(this.f30891b, c4190dk.f30891b);
    }

    public final int hashCode() {
        return this.f30891b.hashCode() + (this.f30890a.hashCode() * 31);
    }

    public final String toString() {
        return "GetSpasiboBonusesUseCaseRequestParams(authorization=" + this.f30890a + ", spasiboBonusesRequestBody=" + this.f30891b + ")";
    }
}
