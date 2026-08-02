package com.paypal.oslo.feature.taptopay.ui.setup.flow.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/TokenizationErrorType;", "toTokenizationErrorType", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/TokenizationErrorType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TokenizationErrorTypeKt {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType toTokenizationErrorType(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.INIT_CHECK_FAILED;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.PREPARE_ADD_CARD_ERROR;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.ELIGIBILITY_CHECK_FAILED;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.UserDeclinedTermsAndConditions) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.USER_DECLINED_TERMS;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.DIGITIZATION_FAILED;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.ACTIVATION_FAILED;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.CardNotFound) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.CARD_NOT_FOUND;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.THREE_DS_ERROR;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
