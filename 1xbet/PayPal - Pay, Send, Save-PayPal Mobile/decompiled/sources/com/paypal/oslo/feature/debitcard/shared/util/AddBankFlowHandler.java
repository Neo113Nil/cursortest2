package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowHandler;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowConfig;", "config", "Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowCallbacks;", "callbacks", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowConfig;Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowCallbacks;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "launchAddBankFlow", "()V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;", "result", "handleResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Ljava/lang/String;", "getRequestId-QDVFmTU", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowConfig;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddBankFlowHandler {
    public static final int $stable = com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig.$stable;
    private final com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowCallbacks getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig getHighSpeedVideoFpsRanges;
    private final java.lang.String requestId;

    private AddBankFlowHandler(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig addBankFlowConfig, com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowCallbacks addBankFlowCallbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankFlowConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankFlowCallbacks, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.requestId = str;
        this.getHighSpeedVideoFpsRanges = addBankFlowConfig;
        this.getHighSpeedVideoFpsRangesFor = addBankFlowCallbacks;
    }

    /* renamed from: getRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final void launchAddBankFlow() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Launching Add Bank flow with analytics flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, this.getHighSpeedVideoFpsRanges.getAnalyticsFlow().name())), null, 4, null);
        this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler.$r8$lambda$dien0IPjy1nFZbDMbERQSMm03nY(com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void handleResult(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome outcome = result.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) {
            com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) outcome;
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Bank(s) added successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("accounts", java.lang.Integer.valueOf(success.getLinkedBankAccounts().size()))), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.getOnSuccess().invoke(success.getLinkedBankAccounts(), success.getSuccessMessage());
        } else {
            if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error) {
                com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error error = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error) outcome;
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Add bank flow error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", error.getErrorCode())), null, 4, null);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Add bank flow error details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", error.getErrorMessage()), kotlin.TuplesKt.to("errorCode", error.getErrorCode())), null, 4, null);
                this.getHighSpeedVideoFpsRangesFor.getOnError().invoke(error.getErrorMessage(), error.getErrorCode());
                return;
            }
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Cancelled cancelled = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Cancelled) outcome;
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Add bank flow canceled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", cancelled.getReason())), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.getOnCancelled().invoke(cancelled.getReason());
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dien0IPjy1nFZbDMbERQSMm03nY(com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler addBankFlowHandler, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(addBankFlowHandler.getHighSpeedVideoFpsRanges.getAnalyticsFlow(), (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), addBankFlowHandler.getHighSpeedVideoFpsRanges.getAddBankConfig()));
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ AddBankFlowHandler(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig addBankFlowConfig, com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowCallbacks addBankFlowCallbacks, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(appNavigator, str, addBankFlowConfig, addBankFlowCallbacks);
    }
}
