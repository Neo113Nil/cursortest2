package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/OneShotAuthenticationHandler;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetOneShotCheckoutUrlUseCase;", "getOneShotCheckoutUrlUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutPreferencesUseCase;", "getCheckoutPreferencesUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetOneShotCheckoutUrlUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutPreferencesUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "universalLinkData", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "", "onEvent", "executeOneShotAuthentication", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.KeyAuthCodeParam, "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "result", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/Job;", "fetchCheckoutPreferences", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetOneShotCheckoutUrlUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutPreferencesUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneShotAuthenticationHandler {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public OneShotAuthenticationHandler(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase getOneShotCheckoutUrlUseCase, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase getCheckoutPreferencesUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOneShotCheckoutUrlUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCheckoutPreferencesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getOneShotCheckoutUrlUseCase;
        this.getHighSpeedVideoSizes = getCheckoutPreferencesUseCase;
        this.getHighSpeedVideoFpsRanges = appSwitchSession;
        this.Camera2StreamConfigurationMap = checkoutLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeOneShotAuthentication(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$executeOneShotAuthentication$1 oneShotAuthenticationHandler$executeOneShotAuthentication$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$executeOneShotAuthentication$1) {
            oneShotAuthenticationHandler$executeOneShotAuthentication$1 = (com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$executeOneShotAuthentication$1) continuation;
            if ((oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase getOneShotCheckoutUrlUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken = valid.getCheckoutToken();
                    oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoFpsRanges = valid;
                    oneShotAuthenticationHandler$executeOneShotAuthentication$1.Camera2StreamConfigurationMap = function1;
                    oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getOneShotCheckoutUrlUseCase.invoke(checkoutToken, oneShotAuthenticationHandler$executeOneShotAuthentication$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) oneShotAuthenticationHandler$executeOneShotAuthentication$1.Camera2StreamConfigurationMap;
                    valid = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Right) {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError checkoutURLError = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError) ((arrow.core.Either.Left) either).getValue();
                    if (checkoutURLError instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired) {
                        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired authenticationPromptRequired = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired) checkoutURLError;
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.Camera2StreamConfigurationMap, "Authentication required, will navigate to login", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("context", authenticationPromptRequired.getCheckoutAuthenticationContext().toString())), null, 4, null);
                        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.AuthenticationRequired(authenticationPromptRequired.getCheckoutAuthenticationContext()));
                    } else {
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.Camera2StreamConfigurationMap, com.paypal.android.logger.categories.UI.Error.INSTANCE, "One-shot authentication failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", checkoutURLError.toString())), null, null, 24, null);
                        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError(checkoutURLError, false));
                    }
                } else {
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.Camera2StreamConfigurationMap;
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    pairArr[0] = kotlin.TuplesKt.to("hasAuthCode", java.lang.String.valueOf(oneShotAuthenticationResult.getAuthCode() != null));
                    pairArr[1] = kotlin.TuplesKt.to("hasCheckoutPreferences", java.lang.String.valueOf(oneShotAuthenticationResult.getCheckoutPreferences() != null));
                    pairArr[2] = kotlin.TuplesKt.to("isWebFlow", java.lang.String.valueOf(oneShotAuthenticationResult.isWebFlow()));
                    pairArr[3] = kotlin.TuplesKt.to("isNativeFlow", java.lang.String.valueOf(oneShotAuthenticationResult.isNativeFlow()));
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "One-shot authentication succeeded", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = oneShotAuthenticationResult.getCheckoutPreferences();
                    if (checkoutPreferences != null) {
                        this.getHighSpeedVideoFpsRanges.setCheckoutPreferences(checkoutPreferences);
                    }
                    function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationSuccess(oneShotAuthenticationResult, valid));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        oneShotAuthenticationHandler$executeOneShotAuthentication$1 = new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$executeOneShotAuthentication$1(this, continuation);
        java.lang.Object obj2 = oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oneShotAuthenticationHandler$executeOneShotAuthentication$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Right) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.Job fetchCheckoutPreferences(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid universalLinkData, java.lang.String authCode, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult result, kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> onEvent) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalLinkData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.Camera2StreamConfigurationMap, "Auth code received but no checkout preferences, fetching preferences", null, null, 6, null);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$fetchCheckoutPreferences$1(this, universalLinkData, authCode, onEvent, result, null), 3, null);
        return launch$default;
    }
}
