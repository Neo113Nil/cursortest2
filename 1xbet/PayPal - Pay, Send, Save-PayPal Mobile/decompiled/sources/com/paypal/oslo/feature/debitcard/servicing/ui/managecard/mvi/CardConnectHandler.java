package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/CardConnectHandler;", "", "Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;", "cardConnectApi", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "cardId", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "", "eventDispatcher", "checkEligibility", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardConnectHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cardconnect.api.CardConnectApi getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CardConnectHandler(com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRanges = cardConnectApi;
        this.getHighResolutionOutputSizeshNQ4ISI = featureGateManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkEligibility(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler$checkEligibility$1 cardConnectHandler$checkEligibility$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.core.mvi.Event event;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler$checkEligibility$1) {
            cardConnectHandler$checkEligibility$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler$checkEligibility$1) continuation;
            if ((cardConnectHandler$checkEligibility$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cardConnectHandler$checkEligibility$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cardConnectHandler$checkEligibility$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardConnectHandler$checkEligibility$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.isCardConnectEntrypointEnabled()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "CardConnectHandler: feature gate disabled, skipping eligibility check", null, null, 6, null);
                        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectIneligible.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi = this.getHighSpeedVideoFpsRanges;
                    java.lang.String name2 = debitCardProductName.name();
                    cardConnectHandler$checkEligibility$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardProductName);
                    cardConnectHandler$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cardConnectHandler$checkEligibility$1.getHighSpeedVideoFpsRanges = function1;
                    cardConnectHandler$checkEligibility$1.Camera2StreamConfigurationMap = 1;
                    obj = cardConnectApi.checkEligibility(name2, str, cardConnectHandler$checkEligibility$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) cardConnectHandler$checkEligibility$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility cardConnectEligibility = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility) ((arrow.core.Either.Right) either).getValue();
                    if (cardConnectEligibility instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility.Eligible) {
                        event = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent) com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEligible.INSTANCE;
                    } else {
                        if (!(cardConnectEligibility instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility.Ineligible)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        event = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent) com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectIneligible.INSTANCE;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "CardConnectHandler: eligibility check succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardConnectEligibility.getClass()).getSimpleName())), null, 4, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "CardConnectHandler: eligibility check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.cardconnect.api.models.CardConnectError) ((arrow.core.Either.Left) either).getValue()).getClass()).getSimpleName())), null, 4, null);
                    event = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent) com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectIneligible.INSTANCE;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                function1.invoke(event);
                return kotlin.Unit.INSTANCE;
            }
        }
        cardConnectHandler$checkEligibility$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler$checkEligibility$1(this, continuation);
        java.lang.Object obj2 = cardConnectHandler$checkEligibility$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardConnectHandler$checkEligibility$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        function1.invoke(event);
        return kotlin.Unit.INSTANCE;
    }
}
