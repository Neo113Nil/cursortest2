package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutUrlUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutPreferencesUseCase;", "getCheckoutPreferencesUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "authRepository", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;", "trackMonitoringEventUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutPreferencesUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "checkoutToken", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetCheckoutPreferencesUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCheckoutUrlUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCheckoutUrlUseCase(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase getCheckoutPreferencesUseCase, com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository authRepository, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCheckoutPreferencesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackMonitoringEventUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getCheckoutPreferencesUseCase;
        this.Camera2StreamConfigurationMap = authRepository;
        this.getHighSpeedVideoFpsRangesFor = trackMonitoringEventUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r9 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences>> continuation) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$invoke$1 getCheckoutUrlUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$invoke$1) {
            getCheckoutUrlUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$invoke$1) continuation;
            if ((getCheckoutUrlUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                getCheckoutUrlUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = getCheckoutUrlUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCheckoutUrlUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.INITIATED_AUTHENTICATION, null, 2, null);
                    getCheckoutUrlUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = checkoutToken;
                    getCheckoutUrlUseCase$invoke$1.getInputFormats = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(getCheckoutUrlUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = getCheckoutUrlUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i3 = getCheckoutUrlUseCase$invoke$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    checkoutToken = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken) getCheckoutUrlUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.lang.String str = (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_AUTHENTICATION, null, 2, null);
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase getCheckoutPreferencesUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    getCheckoutUrlUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                    getCheckoutUrlUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    getCheckoutUrlUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getCheckoutUrlUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                    getCheckoutUrlUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    getCheckoutUrlUseCase$invoke$1.getInputFormats = 2;
                    obj = getCheckoutPreferencesUseCase.invoke(checkoutToken, str, getCheckoutUrlUseCase$invoke$1);
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError checkoutURLError = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError) ((arrow.core.Either.Left) either).getValue();
                        com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_AUTHENTICATION, null, 2, null);
                        return arrow.core.EitherKt.left(checkoutURLError);
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        getCheckoutUrlUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCheckoutUrlUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCheckoutUrlUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$transferSession$1 getCheckoutUrlUseCase$transferSession$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$transferSession$1) {
            getCheckoutUrlUseCase$transferSession$1 = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$transferSession$1) continuation;
            if ((getCheckoutUrlUseCase$transferSession$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getCheckoutUrlUseCase$transferSession$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getCheckoutUrlUseCase$transferSession$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCheckoutUrlUseCase$transferSession$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository authRepository = this.Camera2StreamConfigurationMap;
                    getCheckoutUrlUseCase$transferSession$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = authRepository.transferSession(getCheckoutUrlUseCase$transferSession$1);
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
                    return arrow.core.EitherKt.right(((com.paypal.oslo.feature.inappcheckout.features.auth.SessionTransferData) ((arrow.core.Either.Right) either).getValue()).getAuthorizationCode());
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError transferSessionError = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.inappcheckout.LoggerKt.log;
                    com.paypal.android.logger.categories.App.Error error = com.paypal.android.logger.categories.App.Error.INSTANCE;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferSessionError.getTransferError().getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName);
                    pairArr[1] = kotlin.TuplesKt.to("errorDetails", transferSessionError.getTransferError().toString());
                    com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(logger, error, "Failed to transfer session", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 24, null);
                    return arrow.core.EitherKt.left(transferSessionError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getCheckoutUrlUseCase$transferSession$1 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase$transferSession$1(this, continuation);
        java.lang.Object obj2 = getCheckoutUrlUseCase$transferSession$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCheckoutUrlUseCase$transferSession$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
