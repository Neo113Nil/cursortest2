package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowHandler;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowConfig;", "config", "Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowCallbacks;", "callbacks", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowConfig;Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowCallbacks;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "launchAddCardFlow", "()V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "result", "handleResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Ljava/lang/String;", "getRequestId-QDVFmTU", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowConfig;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddCardFlowHandler {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowCallbacks getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    private final java.lang.String requestId;

    private AddCardFlowHandler(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig addCardFlowConfig, com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowCallbacks addCardFlowCallbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFlowConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFlowCallbacks, "");
        this.getHighSpeedVideoSizes = appNavigator;
        this.requestId = str;
        this.Camera2StreamConfigurationMap = addCardFlowConfig;
        this.getHighSpeedVideoFpsRangesFor = addCardFlowCallbacks;
    }

    /* renamed from: getRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final void launchAddCardFlow() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Launching Add Card flow with analytics flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, this.Camera2StreamConfigurationMap.getAnalyticsFlow().name())), null, 4, null);
        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowHandler.$r8$lambda$Oayj_S9kckd7tEhgo39wGtcJcXs(com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowHandler.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void handleResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = result.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Card added successfully", null, null, 6, null);
            this.getHighSpeedVideoFpsRangesFor.getOnSuccess().invoke(((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) outcome).getSuccessMessage());
        } else if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) {
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error error = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) outcome;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Add card flow error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", error.getErrorMsg())), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.getOnError().invoke(error.getErrorMsg());
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled cancelled = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled) outcome;
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Add card flow canceled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", cancelled.getReason())), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.getOnCancelled().invoke(cancelled.getReason());
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Oayj_S9kckd7tEhgo39wGtcJcXs(com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowHandler addCardFlowHandler, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(addCardFlowHandler.Camera2StreamConfigurationMap.getAnalyticsFlow(), (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header) null, new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, false, false, false, false, 247, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options) null, 10, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ AddCardFlowHandler(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig addCardFlowConfig, com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowCallbacks addCardFlowCallbacks, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(appNavigator, str, addCardFlowConfig, addCardFlowCallbacks);
    }
}
