package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeSubmissionHandler;", "", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;", "cardProvisionHandler", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;", "tokenizationTimer", "Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;", "payairCardPaymentKeysReplenisher", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/TokenManager;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "networkTokenReference", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/payair/logic/managers/TokenManager;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivationCodeSubmissionHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.payair.logic.managers.TokenManager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ActivationCodeSubmissionHandler(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer, com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProvisionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationTimer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairCardPaymentKeysReplenisher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = tokenManager;
        this.getHighSpeedVideoSizes = cardProvisionHandler;
        this.getHighResolutionOutputSizeshNQ4ISI = tokenizationTimer;
        this.getHighSpeedVideoFpsRangesFor = payairCardPaymentKeysReplenisher;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1(this, networkTokenReference, null));
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError access$retrieveOtpError(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, com.payair.model.ActivateCodeResponse activateCodeResponse) {
        int i = com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler.WhenMappings.$EnumSwitchMapping$0[activateCodeResponse.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError.IncorrectOtp;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError.OtpExpired;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError.IncorrectOtpMaxTryExceeded;
        }
        throw new java.lang.IllegalArgumentException("Unknown ActivateCodeResponse: ".concat(java.lang.String.valueOf(activateCodeResponse)));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.ActivateCodeResponse.values().length];
            try {
                iArr[com.payair.model.ActivateCodeResponse.INCORRECT_CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.ActivateCodeResponse.EXPIRED_CODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.payair.model.ActivateCodeResponse.INCORRECT_CODE_RETRIES_EXCEEDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
