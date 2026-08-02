package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* loaded from: classes10.dex */
public final class Qd {

    /* renamed from: a, reason: collision with root package name */
    public final ListOfCardsRequestBody f29769a;

    /* renamed from: b, reason: collision with root package name */
    public final PaymentBnplPlanRequestBody f29770b;

    /* renamed from: c, reason: collision with root package name */
    public final SpasiboBonusesRequestBody f29771c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29772d;

    public Qd(ListOfCardsRequestBody listOfCardsRequestBody, PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, SpasiboBonusesRequestBody spasiboBonusesRequestBody, String authorization) {
        Intrinsics.checkNotNullParameter(listOfCardsRequestBody, "listOfCardsRequestBody");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        this.f29769a = listOfCardsRequestBody;
        this.f29770b = paymentBnplPlanRequestBody;
        this.f29771c = spasiboBonusesRequestBody;
        this.f29772d = authorization;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qd)) {
            return false;
        }
        Qd qd2 = (Qd) obj;
        return Intrinsics.d(this.f29769a, qd2.f29769a) && Intrinsics.d(this.f29770b, qd2.f29770b) && Intrinsics.d(this.f29771c, qd2.f29771c) && Intrinsics.d(this.f29772d, qd2.f29772d);
    }

    public final int hashCode() {
        int hashCode = this.f29769a.hashCode() * 31;
        PaymentBnplPlanRequestBody paymentBnplPlanRequestBody = this.f29770b;
        int hashCode2 = (hashCode + (paymentBnplPlanRequestBody == null ? 0 : paymentBnplPlanRequestBody.hashCode())) * 31;
        SpasiboBonusesRequestBody spasiboBonusesRequestBody = this.f29771c;
        return this.f29772d.hashCode() + ((hashCode2 + (spasiboBonusesRequestBody != null ? spasiboBonusesRequestBody.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OrderScreenInteractorRequestParams(listOfCardsRequestBody=" + this.f29769a + ", paymentPlanBnplRequestBody=" + this.f29770b + ", spasiboBonusesRequestBody=" + this.f29771c + ", authorization=" + this.f29772d + ")";
    }
}
