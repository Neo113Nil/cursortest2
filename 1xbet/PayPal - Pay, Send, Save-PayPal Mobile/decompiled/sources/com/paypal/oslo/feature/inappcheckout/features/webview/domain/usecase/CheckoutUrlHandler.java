package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ@\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/CheckoutUrlHandler;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutUrlUseCase;", "getCheckoutUrlUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutUrlUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "checkoutToken", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "", "onEvent", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "onEffect", "getCheckoutURL", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "universalLinkData", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "reloadCheckoutURL", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutUrlUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckoutUrlHandler {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CheckoutUrlHandler(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getCheckoutUrlUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCheckoutUrlUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighSpeedVideoFpsRanges = getCheckoutUrlUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = appSwitchSession;
        this.getHighSpeedVideoSizes = checkoutLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCheckoutURL(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$getCheckoutURL$1 checkoutUrlHandler$getCheckoutURL$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$getCheckoutURL$1) {
            checkoutUrlHandler$getCheckoutURL$1 = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$getCheckoutURL$1) continuation;
            if ((checkoutUrlHandler$getCheckoutURL$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                checkoutUrlHandler$getCheckoutURL$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = checkoutUrlHandler$getCheckoutURL$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkoutUrlHandler$getCheckoutURL$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getCheckoutUrlUseCase = this.getHighSpeedVideoFpsRanges;
                    checkoutUrlHandler$getCheckoutURL$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                    checkoutUrlHandler$getCheckoutURL$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    checkoutUrlHandler$getCheckoutURL$1.getHighSpeedVideoSizes = function12;
                    checkoutUrlHandler$getCheckoutURL$1.Camera2StreamConfigurationMap = 1;
                    obj = getCheckoutUrlUseCase.invoke(checkoutToken, checkoutUrlHandler$getCheckoutURL$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function12 = (kotlin.jvm.functions.Function1) checkoutUrlHandler$getCheckoutURL$1.getHighSpeedVideoSizes;
                    function1 = (kotlin.jvm.functions.Function1) checkoutUrlHandler$getCheckoutURL$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences) ((arrow.core.Either.Right) either).getValue();
                    this.getHighResolutionOutputSizeshNQ4ISI.setCheckoutPreferences(checkoutPreferences);
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "checkout_urls_fetch_success: Checkout URLs retrieved", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("approvalUrl", checkoutPreferences.getCheckoutURLs().getApprovalUrl()), kotlin.TuplesKt.to("returnUrl", checkoutPreferences.getCheckoutURLs().getReturnUrl()), kotlin.TuplesKt.to("cancelUrl", checkoutPreferences.getCheckoutURLs().getCancelUrl())), null, 4, null);
                    function1.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ReadyForCheckout(checkoutPreferences.getCheckoutURLs(), this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizes()));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError checkoutURLError = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError) ((arrow.core.Either.Left) either).getValue();
                    kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                    if (checkoutURLError instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired) {
                        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired authenticationPromptRequired = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired) checkoutURLError;
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Authentication required, navigating to login", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("context", authenticationPromptRequired.getCheckoutAuthenticationContext().toString())), null, 4, null);
                        function12.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication(authenticationPromptRequired.getCheckoutAuthenticationContext(), com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), defaultConstructorMarker));
                    } else {
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Presentation.Error.INSTANCE, "checkout_urls_fetch_error: Failed to get checkout URLs: Showing non recoverable error screen.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", checkoutURLError.toString())), null, null, 24, null);
                        function1.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError(false, null));
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        checkoutUrlHandler$getCheckoutURL$1 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$getCheckoutURL$1(this, continuation);
        java.lang.Object obj2 = checkoutUrlHandler$getCheckoutURL$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkoutUrlHandler$getCheckoutURL$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object reloadCheckoutURL(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs> continuation) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$reloadCheckoutURL$1 checkoutUrlHandler$reloadCheckoutURL$1;
        int i;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$reloadCheckoutURL$1) {
            checkoutUrlHandler$reloadCheckoutURL$1 = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$reloadCheckoutURL$1) continuation;
            if ((checkoutUrlHandler$reloadCheckoutURL$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                checkoutUrlHandler$reloadCheckoutURL$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = checkoutUrlHandler$reloadCheckoutURL$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkoutUrlHandler$reloadCheckoutURL$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = universalLinkData instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid ? (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) universalLinkData : null;
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken = valid != null ? valid.getCheckoutToken() : null;
                    if (checkoutToken == null) {
                        return null;
                    }
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getCheckoutUrlUseCase = this.getHighSpeedVideoFpsRanges;
                    checkoutUrlHandler$reloadCheckoutURL$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(universalLinkData);
                    checkoutUrlHandler$reloadCheckoutURL$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                    checkoutUrlHandler$reloadCheckoutURL$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getCheckoutUrlUseCase.invoke(checkoutToken, checkoutUrlHandler$reloadCheckoutURL$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                checkoutPreferences = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences) ((arrow.core.Either) obj).getOrNull();
                if (checkoutPreferences != null) {
                    return null;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.setCheckoutPreferences(checkoutPreferences);
                return checkoutPreferences.getCheckoutURLs();
            }
        }
        checkoutUrlHandler$reloadCheckoutURL$1 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$reloadCheckoutURL$1(this, continuation);
        java.lang.Object obj2 = checkoutUrlHandler$reloadCheckoutURL$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkoutUrlHandler$reloadCheckoutURL$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        checkoutPreferences = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences) ((arrow.core.Either) obj2).getOrNull();
        if (checkoutPreferences != null) {
        }
    }
}
