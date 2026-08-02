package com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;", "", "hasSimilarProductExists", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardEligibilityResponseKt {
    public static final boolean hasSimilarProductExists(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse debitCardEligibilityResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardEligibilityResponse, "");
        java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> eligibilityReasons = debitCardEligibilityResponse.getEligibilityReasons();
        if ((eligibilityReasons instanceof java.util.Collection) && eligibilityReasons.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = eligibilityReasons.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason) it.next()).getReason(), com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS)) {
                return true;
            }
        }
        return false;
    }
}
