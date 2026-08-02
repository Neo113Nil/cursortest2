package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutPreferencesUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/repository/CheckoutUrlRepository;", "checkoutUrlRepository", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "session", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;", "trackMonitoringEventUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/repository/CheckoutUrlRepository;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "checkoutToken", "", "authorizationCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/repository/CheckoutUrlRepository;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCheckoutPreferencesUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.repository.CheckoutUrlRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetCheckoutPreferencesUseCase(com.paypal.oslo.feature.inappcheckout.features.webview.domain.repository.CheckoutUrlRepository checkoutUrlRepository, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutUrlRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackMonitoringEventUseCase, "");
        this.getHighSpeedVideoFpsRanges = checkoutUrlRepository;
        this.getHighSpeedVideoFpsRangesFor = appSwitchSession;
        this.getHighSpeedVideoSizes = trackMonitoringEventUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences>> continuation) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase$invoke$1 getCheckoutPreferencesUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase$invoke$1) {
            getCheckoutPreferencesUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase$invoke$1) continuation;
            if ((getCheckoutPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getCheckoutPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getCheckoutPreferencesUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCheckoutPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.repository.CheckoutUrlRepository checkoutUrlRepository = this.getHighSpeedVideoFpsRanges;
                    getCheckoutPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                    getCheckoutPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = str;
                    getCheckoutPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = checkoutUrlRepository.getCheckoutPreferences(checkoutToken, getCheckoutPreferencesUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) getCheckoutPreferencesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.getHighSpeedVideoSizes, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_RECEIVING_TOKEN_DETAILS, null, 2, null);
                    return new arrow.core.Either.Right(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences.copy$default(checkoutPreferences, checkoutPreferences.getCheckoutURLs().withAuthCode(str).withUniversalLinkParams(this.getHighSpeedVideoFpsRangesFor.getUniversalLinkUri()), null, null, 6, null));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getCheckoutPreferencesUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCheckoutPreferencesUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCheckoutPreferencesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
