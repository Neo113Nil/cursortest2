package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/AuthenticationResultProcessor;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/BuildAuthenticationResultFromAuthResponseUseCase;", "buildOneShotAuthenticationUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/BuildAuthenticationResultFromAuthResponseUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "authData", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "universalLinkData", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "", "onEvent", "Lkotlinx/coroutines/Job;", "processAuthenticationResult", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "handleAuthenticationCancelledByUser", "(Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/BuildAuthenticationResultFromAuthResponseUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AuthenticationResultProcessor {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AuthenticationResultProcessor(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase buildAuthenticationResultFromAuthResponseUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildAuthenticationResultFromAuthResponseUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = buildAuthenticationResultFromAuthResponseUseCase;
        this.getHighSpeedVideoFpsRanges = appSwitchSession;
        this.Camera2StreamConfigurationMap = checkoutLogger;
    }

    public final kotlinx.coroutines.Job processAuthenticationResult(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData authData, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData, kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> onEvent) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalLinkData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.Camera2StreamConfigurationMap, "Authentication successful, processing checkout data", null, null, 6, null);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor$processAuthenticationResult$1(this, universalLinkData, onEvent, authData, null), 3, null);
        return launch$default;
    }

    public final void handleAuthenticationCancelledByUser(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.Camera2StreamConfigurationMap, "Authentication cancelled by user", null, null, 6, null);
        onEvent.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError("User cancelled authentication"), false));
    }

    public static final /* synthetic */ void access$handleAuthenticationResultError(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor authenticationResultProcessor, java.lang.IllegalStateException illegalStateException, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(authenticationResultProcessor.Camera2StreamConfigurationMap, com.paypal.android.logger.categories.UI.Error.INSTANCE, "Failed to process authentication result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", illegalStateException.toString())), null, illegalStateException, 8, null);
        java.lang.String message = illegalStateException.getMessage();
        if (message == null) {
            message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError(message), false));
    }

    public static final /* synthetic */ void access$storeCheckoutPreferencesIfAvailable(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor authenticationResultProcessor, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = oneShotAuthenticationResult.getCheckoutPreferences();
        if (checkoutPreferences != null) {
            authenticationResultProcessor.getHighSpeedVideoFpsRanges.setCheckoutPreferences(checkoutPreferences);
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid access$validateUniversalLinkData(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor authenticationResultProcessor, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData, kotlin.jvm.functions.Function1 function1) {
        if (!(universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid)) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(authenticationResultProcessor.Camera2StreamConfigurationMap, com.paypal.android.logger.categories.UI.Error.INSTANCE, "Cannot process authentication result: universalLinkData not stored", null, null, null, 28, null);
            function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError("Universal link data not available"), false));
            return null;
        }
        return (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) universalLinkData;
    }
}
