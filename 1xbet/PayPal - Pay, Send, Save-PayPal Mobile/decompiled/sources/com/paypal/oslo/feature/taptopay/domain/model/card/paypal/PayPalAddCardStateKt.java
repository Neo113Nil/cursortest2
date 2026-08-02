package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "toPayPalAddCardState", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalAddCardStateKt {
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState toPayPalAddCardState(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardState, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(addCardState, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.AddCardInitiated.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.AddCardInitiated.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(addCardState, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.EligibilityCheck.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.EligibilityCheck.INSTANCE;
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleTermsAndConditions) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleTermsAndConditions handleTermsAndConditions = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleTermsAndConditions) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleTermsAndConditions(handleTermsAndConditions.getTcText(), handleTermsAndConditions.getAccept(), handleTermsAndConditions.getDecline());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(addCardState, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizingCard.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizingCard.INSTANCE;
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizationCompleted.INSTANCE;
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod selectIdentityVerificationMethod = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod(selectIdentityVerificationMethod.getMethods(), selectIdentityVerificationMethod.getOnSelected());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification handleAppToAppIdentityVerification = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification(handleAppToAppIdentityVerification.getScheme(), handleAppToAppIdentityVerification.getPayload(), handleAppToAppIdentityVerification.getSource());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification(((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification) addCardState).getOnOtp());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated(((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) addCardState).getCard());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed initCheckFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed(initCheckFailed.getDebugMessage(), initCheckFailed.getThrowable());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed activationFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed(activationFailed.getDebugMessage(), activationFailed.getThrowable());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed digitizationFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed(digitizationFailed.getDebugMessage(), digitizationFailed.getThrowable());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed eligibilityCheckFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed(eligibilityCheckFailed.getDebugMessage(), eligibilityCheckFailed.getThrowable());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(addCardState, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.UserDeclinedTermsAndConditions.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.UserDeclinedTermsAndConditions.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(addCardState, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.CardNotFound.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.CardNotFound.INSTANCE;
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed getCardsFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed(getCardsFailed.getDebugMessage(), getCardsFailed.getThrowable());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped(((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped) addCardState).getDebugMessage());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed(setDefaultCardFailed.getDebugMessage(), setDefaultCardFailed.getThrowable());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError oTPError = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError) addCardState;
            int i = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.WhenMappings.$EnumSwitchMapping$0[oTPError.getOtpError().ordinal()];
            if (i == 1) {
                oTPErrorCode = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode.INCORRECT_OTP;
            } else if (i == 2) {
                oTPErrorCode = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode.INCORRECT_OTP_MAX_TRY_EXCEEDED;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                oTPErrorCode = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode.OTP_EXPIRED;
            }
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError(oTPErrorCode, oTPError.getDebugMessage());
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError defaultError = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError) addCardState;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError(defaultError.getErrorCode(), defaultError.getDebugMessage());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(addCardState, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ContinueAddCardError.INSTANCE)) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError("-1", "Invalid card enrollment status");
        }
        if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError) {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError threeDsError = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError) addCardState;
            int i2 = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.WhenMappings.$EnumSwitchMapping$1[threeDsError.getThreeDsError().ordinal()];
            if (i2 == 1) {
                threeDsErrorCode = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode.NOT_AUTHENTICATED;
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                threeDsErrorCode = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode.NETWORK_ERROR;
            }
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError(threeDsErrorCode, threeDsError.getDebugMessage());
        }
        if (!(addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt$toPayPalAddCardState$1(addCardState, null));
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent access$toAddCardState3dsEvent(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent threeDsEvent) {
        com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError;
        if (!(threeDsEvent instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error)) {
            if (threeDsEvent instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Success) {
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Success(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Success) threeDsEvent).getProofOfAuth());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error error = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error) threeDsEvent;
        int i = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.WhenMappings.$EnumSwitchMapping$2[error.getError().ordinal()];
        if (i == 1) {
            threeDsError = com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError.NOT_AUTHENTICATED;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            threeDsError = com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError.NETWORK_ERROR;
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error(threeDsError, error.getReason());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError.IncorrectOtp.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError.IncorrectOtpMaxTryExceeded.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError.OtpExpired.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError.values().length];
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError.NOT_AUTHENTICATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError.NETWORK_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode.values().length];
            try {
                iArr3[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode.NOT_AUTHENTICATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode.NETWORK_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
