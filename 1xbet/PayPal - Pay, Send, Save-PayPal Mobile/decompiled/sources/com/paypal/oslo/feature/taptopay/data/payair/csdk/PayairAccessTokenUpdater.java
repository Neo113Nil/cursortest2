package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/PayairAccessTokenUpdater;", "", "Lcom/payair/logic/managers/ConfigurationManager;", "confManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "authToken", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;", "isApiLevelSupportedUseCase", "<init>", "(Lcom/payair/logic/managers/ConfigurationManager;Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;)V", "", "update", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/payair/logic/managers/ConfigurationManager;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairAccessTokenUpdater {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.payair.logic.managers.ConfigurationManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayairAccessTokenUpdater(com.payair.logic.managers.ConfigurationManager configurationManager, com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase isApiLevelSupportedUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isApiLevelSupportedUseCase, "");
        this.getHighSpeedVideoSizes = configurationManager;
        this.getHighResolutionOutputSizeshNQ4ISI = authToken;
        this.Camera2StreamConfigurationMap = isApiLevelSupportedUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object update(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater$update$1 payairAccessTokenUpdater$update$1;
        int i;
        com.payair.logic.managers.ConfigurationManager configurationManager;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater$update$1) {
            payairAccessTokenUpdater$update$1 = (com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater$update$1) continuation;
            if ((payairAccessTokenUpdater$update$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                payairAccessTokenUpdater$update$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = payairAccessTokenUpdater$update$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairAccessTokenUpdater$update$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.Camera2StreamConfigurationMap.invoke()) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Skipping access token update: Device API level is below minimum required (Android P / API 28)", null, null, 6, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Updating access token in Payair SDK configuration", null, null, 6, null);
                    com.payair.logic.managers.ConfigurationManager configurationManager2 = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken = this.getHighResolutionOutputSizeshNQ4ISI;
                    payairAccessTokenUpdater$update$1.getHighSpeedVideoSizes = configurationManager2;
                    payairAccessTokenUpdater$update$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object token = authToken.getToken(payairAccessTokenUpdater$update$1);
                    if (token == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    configurationManager = configurationManager2;
                    obj = token;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    configurationManager = (com.payair.logic.managers.ConfigurationManager) payairAccessTokenUpdater$update$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Payair access token update completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("response_type", configurationManager.updateJWT((java.lang.String) obj).getClass().getName())), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        payairAccessTokenUpdater$update$1 = new com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater$update$1(this, continuation);
        java.lang.Object obj2 = payairAccessTokenUpdater$update$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairAccessTokenUpdater$update$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Payair access token update completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("response_type", configurationManager.updateJWT((java.lang.String) obj2).getClass().getName())), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
