package com.paypal.oslo.feature.identity.deviceregistration.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceregistration/domain/usecase/PostLoginDeviceRegisterUseCase;", "", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "deviceRegistrationInformation", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/usecase/DeviceRegistrationUseCase;", "deviceRegistrationUseCase", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;Lcom/paypal/oslo/feature/identity/deviceregistration/domain/usecase/DeviceRegistrationUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/model/DeviceRegistrationError;", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/model/DeviceRegistrationOutput;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/usecase/DeviceRegistrationUseCase;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostLoginDeviceRegisterUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PostLoginDeviceRegisterUseCase(com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation, com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase deviceRegistrationUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationUseCase, "");
        this.getHighSpeedVideoFpsRanges = deviceRegistrationInformation;
        this.getHighSpeedVideoFpsRangesFor = deviceRegistrationUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r1 != r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r1 != r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError, com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput>> continuation) {
        com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase$invoke$1 postLoginDeviceRegisterUseCase$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase$invoke$1) {
            postLoginDeviceRegisterUseCase$invoke$1 = (com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase$invoke$1) continuation;
            if ((postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                obj = postLoginDeviceRegisterUseCase$invoke$1.Camera2StreamConfigurationMap;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Checking device registration status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration")), null, 4, null);
                    com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation = this.getHighSpeedVideoFpsRanges;
                    postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = deviceRegistrationInformation.isDeviceRegisteredWithPayPal(postLoginDeviceRegisterUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                return obj;
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration"));
                            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("existingDeviceId", (java.lang.String) obj));
                            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError.AlreadyRegistered.INSTANCE);
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation2 = this.getHighSpeedVideoFpsRanges;
                            postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes = 3;
                            obj = deviceRegistrationInformation2.getPayPalDeviceId(postLoginDeviceRegisterUseCase$invoke$1);
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device not registered, proceeding with registration", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration")), null, 4, null);
                        com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase deviceRegistrationUseCase = this.getHighSpeedVideoFpsRangesFor;
                        postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes = 4;
                        java.lang.Object invoke = deviceRegistrationUseCase.invoke(postLoginDeviceRegisterUseCase$invoke$1);
                        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation3 = this.getHighSpeedVideoFpsRanges;
                    postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes = 2;
                    obj = deviceRegistrationInformation3.isPaymentAppInstanceIdRegistered(postLoginDeviceRegisterUseCase$invoke$1);
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device not registered, proceeding with registration", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration")), null, 4, null);
                com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase deviceRegistrationUseCase2 = this.getHighSpeedVideoFpsRangesFor;
                postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes = 4;
                java.lang.Object invoke2 = deviceRegistrationUseCase2.invoke(postLoginDeviceRegisterUseCase$invoke$1);
                if (invoke2 == coroutine_suspended) {
                }
            }
        }
        postLoginDeviceRegisterUseCase$invoke$1 = new com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase$invoke$1(this, continuation);
        obj = postLoginDeviceRegisterUseCase$invoke$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device not registered, proceeding with registration", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration")), null, 4, null);
        com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.DeviceRegistrationUseCase deviceRegistrationUseCase22 = this.getHighSpeedVideoFpsRangesFor;
        postLoginDeviceRegisterUseCase$invoke$1.getHighSpeedVideoSizes = 4;
        java.lang.Object invoke22 = deviceRegistrationUseCase22.invoke(postLoginDeviceRegisterUseCase$invoke$1);
        if (invoke22 == coroutine_suspended) {
        }
    }
}
