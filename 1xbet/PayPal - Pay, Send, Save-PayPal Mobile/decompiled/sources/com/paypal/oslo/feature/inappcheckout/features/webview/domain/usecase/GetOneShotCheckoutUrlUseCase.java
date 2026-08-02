package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetOneShotCheckoutUrlUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "authRepository", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/BuildAuthenticationResultFromAuthResponseUseCase;", "buildAuthenticationResultFromAuthResponseUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;", "trackMonitoringEventUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/BuildAuthenticationResultFromAuthResponseUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "checkoutToken", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/BuildAuthenticationResultFromAuthResponseUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetOneShotCheckoutUrlUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetOneShotCheckoutUrlUseCase(com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository authRepository, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase buildAuthenticationResultFromAuthResponseUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildAuthenticationResultFromAuthResponseUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackMonitoringEventUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = authRepository;
        this.getHighSpeedVideoSizes = buildAuthenticationResultFromAuthResponseUseCase;
        this.Camera2StreamConfigurationMap = trackMonitoringEventUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult>> continuation) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase$invoke$1 getOneShotCheckoutUrlUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase$invoke$1) {
            getOneShotCheckoutUrlUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase$invoke$1) continuation;
            if ((getOneShotCheckoutUrlUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                getOneShotCheckoutUrlUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = getOneShotCheckoutUrlUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getOneShotCheckoutUrlUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.INITIATED_AUTHENTICATION, null, 2, null);
                    com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository authRepository = this.getHighSpeedVideoFpsRangesFor;
                    getOneShotCheckoutUrlUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                    getOneShotCheckoutUrlUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = authRepository.getOneShotAuthentication(checkoutToken, getOneShotCheckoutUrlUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData = (com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_AUTHENTICATION, null, 2, null);
                    try {
                        return this.getHighSpeedVideoSizes.invoke(checkoutAuthenticationSuccessData);
                    } finally {
                        com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_RECEIVING_TOKEN_DETAILS, null, 2, null);
                    }
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError checkoutURLError = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_AUTHENTICATION, null, 2, null);
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_RECEIVING_TOKEN_DETAILS, null, 2, null);
                    return arrow.core.EitherKt.left(checkoutURLError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getOneShotCheckoutUrlUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getOneShotCheckoutUrlUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getOneShotCheckoutUrlUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
