package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0003R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowNavigator;", "", "<init>", "()V", "", "skippedFiSelector", "", "updateNavigationContext", "(Z)V", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "step", "", "reason", "navigate", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "state", "isThirdPartyCard", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;Z)V", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;", "result", "goBack", "(ZLcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;)V", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowNavigator$NavStrategy;", "resolveNavStrategy", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowNavigator$NavStrategy;", "reset", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "currentNavStep", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentNavStep", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges", "NavStrategy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetupFlowNavigator {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep> currentNavStep;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SetupFlowNavigator() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Initializing.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.currentNavStep = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowNavigator$NavStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "GoBackInStack", "Push", "ReplaceTop", "PopToAnchorThenPush"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavStrategy {
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy GoBackInStack;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy PopToAnchorThenPush;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy Push;
        public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy ReplaceTop;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy[] getHighSpeedVideoFpsRanges;

        private NavStrategy(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy navStrategy = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy("GoBackInStack", 0);
            GoBackInStack = navStrategy;
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy navStrategy2 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy("Push", 1);
            Push = navStrategy2;
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy navStrategy3 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy("ReplaceTop", 2);
            ReplaceTop = navStrategy3;
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy navStrategy4 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy("PopToAnchorThenPush", 3);
            PopToAnchorThenPush = navStrategy4;
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy[] navStrategyArr = {navStrategy, navStrategy2, navStrategy3, navStrategy4};
            getHighSpeedVideoFpsRanges = navStrategyArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(navStrategyArr);
        }

        public static com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy[] values() {
            return (com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep> getCurrentNavStep() {
        return this.currentNavStep;
    }

    public final void updateNavigationContext(boolean skippedFiSelector) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Navigation context updated", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("skippedFiSelector", java.lang.Boolean.valueOf(skippedFiSelector))), null, 4, null);
        this.getHighSpeedVideoFpsRanges = skippedFiSelector;
    }

    public final void navigate(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep step, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Step transition", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("from", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.Camera2StreamConfigurationMap.getValue().getClass()).getSimpleName()), kotlin.TuplesKt.to(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(step.getClass()).getSimpleName()), kotlin.TuplesKt.to("reason", reason)), null, 4, null);
        this.Camera2StreamConfigurationMap.setValue(step);
    }

    public final void goBack(boolean isThirdPartyCard, com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep value = this.Camera2StreamConfigurationMap.getValue();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Initializing.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ScreenLock.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.SetupIntro.INSTANCE) && !(value instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading) && !kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector.INSTANCE)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.PpdcAcquisitionBridge.INSTANCE)) {
                r2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterCvv.INSTANCE)) {
                r2 = this.getHighSpeedVideoFpsRanges ? null : com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.TermsAndConditions.INSTANCE)) {
                if (isThirdPartyCard) {
                    r2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterCvv.INSTANCE;
                } else if (!this.getHighSpeedVideoFpsRanges) {
                    r2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector.INSTANCE;
                }
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterOtp.INSTANCE)) {
                    r2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Handle3dsVerification.INSTANCE)) {
                    r2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AppToAppVerification.INSTANCE)) {
                    r2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.CallBankSupport.INSTANCE)) {
                    r2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE;
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseDefaultPayment.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseSecondaryPayment.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.XiaomiPaymentConfirmations.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AllSet.INSTANCE)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.OtpError.INSTANCE)) {
                        r2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE;
                    } else if (!(value instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error) && !(value instanceof com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
        }
        if (r2 != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Step back", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("from", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.Camera2StreamConfigurationMap.getValue().getClass()).getSimpleName()), kotlin.TuplesKt.to(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2.getClass()).getSimpleName())), null, 4, null);
            this.Camera2StreamConfigurationMap.setValue(r2);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Back not allowed, closing flow", null, null, 6, null);
            navigate(new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Close(result), "no previous step");
        }
    }

    public final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy resolveNavStrategy(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep from, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep to) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(to, "");
        if (from == null) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.Push;
        }
        com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupStackGroup stackGroup = com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationMapperKt.getStackGroup(from);
        com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupStackGroup stackGroup2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationMapperKt.getStackGroup(to);
        if (kotlin.jvm.internal.Intrinsics.areEqual(from, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterCvv.INSTANCE) && kotlin.jvm.internal.Intrinsics.areEqual(to, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.GoBackInStack;
        }
        if (com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationMapperKt.getStackGroup(from) == com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupStackGroup.Verification && kotlin.jvm.internal.Intrinsics.areEqual(to, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.GoBackInStack;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(from, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.FiSelector.INSTANCE) && kotlin.jvm.internal.Intrinsics.areEqual(to, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterCvv.INSTANCE)) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.Push;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(from, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE) && stackGroup2 == com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupStackGroup.Verification) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.Push;
        }
        if (stackGroup != com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupStackGroup.None && stackGroup != stackGroup2) {
            return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.PopToAnchorThenPush;
        }
        return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator.NavStrategy.ReplaceTop;
    }

    public final void reset() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Resetting setup flow navigation state", null, null, 6, null);
        this.getHighSpeedVideoFpsRanges = false;
        this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Initializing.INSTANCE);
    }

    public final void navigate(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState state, boolean isThirdPartyCard) {
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading loading;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if ((state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.AddCardInitiated) || (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.EligibilityCheck)) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading.INSTANCE;
        } else if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleTermsAndConditions) {
            loading = isThirdPartyCard ? com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.TermsAndConditions.INSTANCE : com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading.INSTANCE;
        } else if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.VerificationOptions.INSTANCE;
        } else if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.EnterOtp.INSTANCE;
        } else if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Handle3dsVerification.INSTANCE;
        } else if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.AppToAppVerification.INSTANCE;
        } else if ((state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizingCard) || (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizationCompleted)) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Loading.INSTANCE;
        } else if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.ChooseDefaultPayment.INSTANCE;
        } else if ((state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.RiskDeclined) || (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError) || (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure)) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.INSTANCE;
        } else if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError) {
            loading = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.OtpError.INSTANCE;
        } else {
            if (!(state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge) && !(state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess) && !(state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed) && !(state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed) && !(state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed) && !(state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped) && !(state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.NotifyCardAddedError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            loading = null;
        }
        if (loading != null) {
            navigate(loading, "domain: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(state.getClass()).getSimpleName())));
        }
    }
}
