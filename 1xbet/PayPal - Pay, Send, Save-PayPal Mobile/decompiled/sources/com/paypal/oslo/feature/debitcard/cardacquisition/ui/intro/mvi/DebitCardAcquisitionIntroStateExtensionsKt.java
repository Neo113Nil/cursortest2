package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;", "getEligibilityResponse", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;", "eligibilityResponse", "", "getDisplayProductName", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;)Ljava/lang/String;", "displayProductName", "getVirtualCardHolderAgreementUrl", "virtualCardHolderAgreementUrl"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardAcquisitionIntroStateExtensionsKt {
    public static final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse getEligibilityResponse(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionIntroState, "");
        if (debitCardAcquisitionIntroState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Eligible) {
            return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Eligible) debitCardAcquisitionIntroState).getResponse();
        }
        if (debitCardAcquisitionIntroState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.EligibleWithCondition) {
            return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.EligibleWithCondition) debitCardAcquisitionIntroState).getResponse();
        }
        if (debitCardAcquisitionIntroState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Ineligible) {
            return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Ineligible) debitCardAcquisitionIntroState).getResponse();
        }
        return null;
    }

    public static final java.lang.String getDisplayProductName(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState) {
        java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails> eligibleDebitCardDetails;
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionIntroState, "");
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse eligibilityResponse = getEligibilityResponse(debitCardAcquisitionIntroState);
        if (eligibilityResponse == null || (eligibleDebitCardDetails = eligibilityResponse.getEligibleDebitCardDetails()) == null || (eligibleDebitCardDetails2 = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) eligibleDebitCardDetails)) == null) {
            return null;
        }
        return eligibleDebitCardDetails2.getDisplayProductName();
    }

    public static final java.lang.String getVirtualCardHolderAgreementUrl(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState) {
        java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails> eligibleDebitCardDetails;
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionIntroState, "");
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse eligibilityResponse = getEligibilityResponse(debitCardAcquisitionIntroState);
        if (eligibilityResponse == null || (eligibleDebitCardDetails = eligibilityResponse.getEligibleDebitCardDetails()) == null || (eligibleDebitCardDetails2 = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) eligibleDebitCardDetails)) == null) {
            return null;
        }
        return eligibleDebitCardDetails2.getVirtualCardHolderAgreementUrl();
    }
}
