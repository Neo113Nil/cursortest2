package com.paypal.oslo.feature.taptopay.data.payair.init;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/init/PayairInitializer;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "Landroid/app/Application;", "application", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkSetupManager;", "setupManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/CsdkListener;", "csdkListener", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkConfigurationManager;", "configurationManager", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;", "isApiLevelSupportedUseCase", "<init>", "(Landroid/app/Application;Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkSetupManager;Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/CsdkListener;Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkConfigurationManager;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;)V", "Ljava/lang/Class;", "Landroid/app/Activity;", "paymentActivity", "", "baseUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializationError;", "", "init", "(Ljava/lang/Class;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroid/app/Application;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkSetupManager;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/CsdkListener;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkConfigurationManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairInitializer implements com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.app.Application getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PayairInitializer(android.app.Application application, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager sdkSetupManager, com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener csdkListener, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager sdkConfigurationManager, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase isApiLevelSupportedUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkSetupManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(csdkListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfigurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isApiLevelSupportedUseCase, "");
        this.getHighSpeedVideoFpsRanges = application;
        this.getHighSpeedVideoSizes = sdkSetupManager;
        this.getHighResolutionOutputSizeshNQ4ISI = csdkListener;
        this.Camera2StreamConfigurationMap = sdkConfigurationManager;
        this.getHighSpeedVideoFpsRangesFor = isApiLevelSupportedUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object init(java.lang.Class<? extends android.app.Activity> cls, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer$init$1 payairInitializer$init$1;
        int i;
        com.payair.model.Response response;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer$init$1) {
            payairInitializer$init$1 = (com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer$init$1) continuation;
            if ((payairInitializer$init$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payairInitializer$init$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = payairInitializer$init$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairInitializer$init$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Initializing Payair SDK", null, null, 6, null);
                    if (!this.getHighSpeedVideoFpsRangesFor.invoke()) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Payair SDK initialization skipped: Device API level is below minimum required (Android P / API 28)", null, null, 6, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError(com.paypal.oslo.feature.taptopay.domain.PayairRequirements.UNSUPPORTED_API_LEVEL_MESSAGE, null, 2, null));
                    }
                    if (str == null) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError("Payair SDK requires a baseUrl for initialization", null, 2, null));
                    }
                    com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager sdkSetupManager = this.getHighSpeedVideoSizes;
                    java.util.Set<? extends com.payair.model.CardScheme> of = kotlin.collections.SetsKt.setOf(com.payair.model.CardScheme.MASTERCARD);
                    payairInitializer$init$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cls);
                    payairInitializer$init$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    payairInitializer$init$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = sdkSetupManager.initialize(of, str, cls, payairInitializer$init$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                response = (com.payair.model.Response) obj;
                com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager sdkSetupManager2 = this.getHighSpeedVideoSizes;
                android.content.Context applicationContext = this.getHighSpeedVideoFpsRanges.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                sdkSetupManager2.setLowValueTransactionSupport(false, applicationContext);
                this.Camera2StreamConfigurationMap.setClientListener(this.getHighResolutionOutputSizeshNQ4ISI);
                if (!(response instanceof com.payair.model.Response.Success)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Payair SDK initialized successfully", null, null, 6, null);
                    if (this.getHighSpeedVideoSizes.checkRegistrationStatus() == com.payair.model.RegistrationStatus.REGISTERED) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Checking device unlock keys", null, null, 6, null);
                        this.getHighSpeedVideoSizes.checkDeviceKeys();
                    }
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (!(response instanceof com.payair.model.Response.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                com.payair.model.Response.Error error = (com.payair.model.Response.Error) response;
                if (error.getErrorCode() == 106) {
                    str2 = "Payair SDK initialization failed: Device is not secure";
                } else {
                    str2 = "Payair SDK initialization failed";
                }
                com.paypal.android.logger.Logger.w$default(logger, str2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(error.getErrorCode())), kotlin.TuplesKt.to("networkErrors", error.getNetworkErrors())), null, 4, null);
                int errorCode = error.getErrorCode();
                java.util.List<com.payair.model.NetworkError> networkErrors = error.getNetworkErrors();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialization failed: errorCode=");
                sb.append(errorCode);
                sb.append(", networkErrors=");
                sb.append(networkErrors);
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError(sb.toString(), null, 2, null));
            }
        }
        payairInitializer$init$1 = new com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer$init$1(this, continuation);
        java.lang.Object obj2 = payairInitializer$init$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairInitializer$init$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager sdkSetupManager22 = this.getHighSpeedVideoSizes;
        android.content.Context applicationContext2 = this.getHighSpeedVideoFpsRanges.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        sdkSetupManager22.setLowValueTransactionSupport(false, applicationContext2);
        this.Camera2StreamConfigurationMap.setClientListener(this.getHighResolutionOutputSizeshNQ4ISI);
        if (!(response instanceof com.payair.model.Response.Success)) {
        }
    }
}
