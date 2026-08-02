package com.paypal.oslo.feature.taptopay.domain.usecase.sdk;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/sdk/InitializeTapToPaySdkUseCaseImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/sdk/InitializeTapToPaySdkUseCase;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "sdkInitializer", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;)V", "", "baseUrl", "Ljava/lang/Class;", "Landroid/app/Activity;", "paymentActivity", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/sdk/InitializeSdkError;", "", "invoke", "(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InitializeTapToPaySdkUseCaseImpl implements com.paypal.oslo.feature.taptopay.api.domain.usecase.sdk.InitializeTapToPaySdkUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public InitializeTapToPaySdkUseCaseImpl(com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer sdkInitializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitializer, "");
        this.getHighSpeedVideoFpsRangesFor = sdkInitializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.sdk.InitializeTapToPaySdkUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.Class<? extends android.app.Activity> cls, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.api.domain.model.sdk.InitializeSdkError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl$invoke$1 initializeTapToPaySdkUseCaseImpl$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl$invoke$1) {
            initializeTapToPaySdkUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl$invoke$1) continuation;
            if ((initializeTapToPaySdkUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                initializeTapToPaySdkUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = initializeTapToPaySdkUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeTapToPaySdkUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Initializing Tap to Pay SDK via use case", null, null, 6, null);
                    com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer sdkInitializer = this.getHighSpeedVideoFpsRangesFor;
                    initializeTapToPaySdkUseCaseImpl$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    initializeTapToPaySdkUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cls);
                    initializeTapToPaySdkUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = sdkInitializer.init(cls, str, initializeTapToPaySdkUseCaseImpl$invoke$1);
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
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError sdkInitializationError = (com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError) ((arrow.core.Either.Left) either).getValue();
                    return new arrow.core.Either.Left(new com.paypal.oslo.feature.taptopay.api.domain.model.sdk.InitializeSdkError(sdkInitializationError.getDebugMessage(), sdkInitializationError.getThrowable()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        initializeTapToPaySdkUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = initializeTapToPaySdkUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeTapToPaySdkUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }
}
