package com.paypal.oslo.feature.pushnotification.shared.domain.provider;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProviderImpl;", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "deviceRegistrationInfo", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "deviceRegistrationSignal", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;)V", "", "getDeviceId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceIdProviderImpl implements com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DeviceIdProviderImpl(com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal deviceRegistrationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationSignal, "");
        this.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationInformation;
        this.getHighSpeedVideoSizes = deviceRegistrationSignal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r12 != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDeviceId(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl$getDeviceId$1 deviceIdProviderImpl$getDeviceId$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl$getDeviceId$1) {
            deviceIdProviderImpl$getDeviceId$1 = (com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl$getDeviceId$1) continuation;
            if ((deviceIdProviderImpl$getDeviceId$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                deviceIdProviderImpl$getDeviceId$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl$getDeviceId$1 deviceIdProviderImpl$getDeviceId$12 = deviceIdProviderImpl$getDeviceId$1;
                java.lang.Object obj = deviceIdProviderImpl$getDeviceId$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceIdProviderImpl$getDeviceId$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation = this.getHighResolutionOutputSizeshNQ4ISI;
                    deviceIdProviderImpl$getDeviceId$12.getHighSpeedVideoFpsRanges = 1;
                    obj = deviceRegistrationInformation.getPayPalDeviceId(deviceIdProviderImpl$getDeviceId$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str2 = (java.lang.String) obj;
                        if (str2 != null) {
                            return str2;
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Device ID unavailable after awaiting registration signal", null, null, 6, null);
                        return null;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    return str;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Device ID not in storage, awaiting registration signal", null, null, 6, null);
                com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal deviceRegistrationSignal = this.getHighSpeedVideoSizes;
                deviceIdProviderImpl$getDeviceId$12.getHighSpeedVideoFpsRanges = 2;
                obj = com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal.awaitDeviceId$default(deviceRegistrationSignal, 0L, deviceIdProviderImpl$getDeviceId$12, 1, null);
            }
        }
        deviceIdProviderImpl$getDeviceId$1 = new com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl$getDeviceId$1(this, continuation);
        com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl$getDeviceId$1 deviceIdProviderImpl$getDeviceId$122 = deviceIdProviderImpl$getDeviceId$1;
        java.lang.Object obj2 = deviceIdProviderImpl$getDeviceId$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceIdProviderImpl$getDeviceId$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
    }
}
