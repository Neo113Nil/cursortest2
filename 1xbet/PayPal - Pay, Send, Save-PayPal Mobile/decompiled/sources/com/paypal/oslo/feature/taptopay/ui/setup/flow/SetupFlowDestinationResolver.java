package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowDestinationResolver;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "step", "Lcom/paypal/oslo/feature/taptopay/navigation/SetupDestination;", "resolve", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;)Lcom/paypal/oslo/feature/taptopay/navigation/SetupDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetupFlowDestinationResolver {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SetupFlowDestinationResolver() {
    }

    public final com.paypal.oslo.feature.taptopay.navigation.SetupDestination resolve(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Initializing.INSTANCE)) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ScreenLock.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.SetupRequireScreenLockDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.SetupIntro.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.SetupIntroDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.SetupLoadingDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.FiSelectorDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.PpdcAcquisitionBridge.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.PpdcAcquisitionBridgeDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterCvv.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.EnterCvvDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.TermsAndConditions.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.TermsAndConditionsDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.CardVerificationDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterOtp.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.OtpError.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.EnterOtpDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Handle3dsVerification.INSTANCE)) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AppToAppVerification.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.CardVerificationWithAppDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.CallBankSupport.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.CallBankVerificationDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseDefaultPayment.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.SetupChooseDefaultPaymentDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseSecondaryPayment.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.SetupChooseSecondaryPaymentDestination.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.XiaomiPaymentConfirmations.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.navigation.SetupXiaomiPaymentConfirmationsDestination.INSTANCE;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AllSet.INSTANCE)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.INSTANCE)) {
                return com.paypal.oslo.feature.taptopay.navigation.TokenizationErrorDestination.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Terminal.INSTANCE)) {
                return com.paypal.oslo.feature.taptopay.navigation.TerminalGenericErrorDestination.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(step, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Ineligible.INSTANCE)) {
                return com.paypal.oslo.feature.taptopay.navigation.IneligibleCardErrorDestination.INSTANCE;
            }
            if (step instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close) {
                return null;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.taptopay.navigation.AllSetSuccessDestination.INSTANCE;
    }
}
