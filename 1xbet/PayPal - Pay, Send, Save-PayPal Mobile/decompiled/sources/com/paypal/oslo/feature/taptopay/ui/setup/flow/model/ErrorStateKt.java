package com.paypal.oslo.feature.taptopay.ui.setup.flow.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState;", "toErrorState", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "", "toErrorDescription", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState$Tokenization;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "toSetupFlowError", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/ErrorState$Tokenization;)Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ErrorStateKt {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState toErrorState(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState payPalAddCardState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalAddCardState, "");
        if (payPalAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError) {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError oTPError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError) payPalAddCardState;
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.OtpError(oTPError.getOtpErrorCode(), oTPError.getDebugMessage());
        }
        if (payPalAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError) {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError defaultError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError) payPalAddCardState;
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.GENERIC_ERROR, defaultError.getDebugMessage(), defaultError.getErrorCode(), 0, 8, null);
        }
        if (payPalAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure) {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure failure = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure) payPalAddCardState;
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorTypeKt.toTokenizationErrorType(failure), toErrorDescription(failure), null, 0, 12, null);
        }
        if (payPalAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.RiskDeclined) {
            return new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.GENERIC_ERROR, null, null, 0, 12, null);
        }
        return null;
    }

    public static final java.lang.String toErrorDescription(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed) {
            return ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed) failure).getDebugMessage();
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.Offline) {
            return "Offline";
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError) {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError responseError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError) failure;
            int responseCode = responseError.getResponseCode();
            java.lang.String errorBody = responseError.getErrorBody();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(responseCode);
            sb.append(" - ");
            sb.append(errorBody);
            return sb.toString();
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError) {
            return ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError) failure).getThrowable().getMessage();
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError) {
            return ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError) failure).getDebugMessage();
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed) {
            return ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed) failure).getDebugMessage();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(failure, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.UserDeclinedTermsAndConditions.INSTANCE)) {
            return null;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed) {
            return ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed) failure).getDebugMessage();
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed) {
            return ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed) failure).getDebugMessage();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(failure, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.CardNotFound.INSTANCE)) {
            return null;
        }
        if (failure instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError) {
            return ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError) failure).getDebugMessage();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError toSetupFlowError(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization tokenization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenization, "");
        int i = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorStateKt.WhenMappings.$EnumSwitchMapping$0[tokenization.getType().ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed.INSTANCE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed.INSTANCE;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound.INSTANCE;
        }
        return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.ELIGIBILITY_CHECK_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.DIGITIZATION_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.ACTIVATION_FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.CARD_NOT_FOUND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
