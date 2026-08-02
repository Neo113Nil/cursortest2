package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/DeviceRegistrationSignalImpl;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "<init>", "()V", "", "timeoutMs", "", "awaitDeviceId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceId", "", "notifyRegistered", "(Ljava/lang/String;)V", "reset", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceRegistrationSignalImpl implements com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> Camera2StreamConfigurationMap = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, 2, null);

    @javax.inject.Inject
    public DeviceRegistrationSignalImpl() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitDeviceId(long j, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$1 deviceRegistrationSignalImpl$awaitDeviceId$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$1) {
            deviceRegistrationSignalImpl$awaitDeviceId$1 = (com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$1) continuation;
            if ((deviceRegistrationSignalImpl$awaitDeviceId$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                deviceRegistrationSignalImpl$awaitDeviceId$1.Camera2StreamConfigurationMap -= 2147483648;
                obj = deviceRegistrationSignalImpl$awaitDeviceId$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationSignalImpl$awaitDeviceId$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$2 deviceRegistrationSignalImpl$awaitDeviceId$2 = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$2(this, null);
                    deviceRegistrationSignalImpl$awaitDeviceId$1.getHighSpeedVideoSizes = j;
                    deviceRegistrationSignalImpl$awaitDeviceId$1.Camera2StreamConfigurationMap = 1;
                    obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(j, deviceRegistrationSignalImpl$awaitDeviceId$2, deviceRegistrationSignalImpl$awaitDeviceId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = deviceRegistrationSignalImpl$awaitDeviceId$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.String) obj) == null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "Timed out waiting for device registration signal", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("timeout_ms", kotlin.coroutines.jvm.internal.Boxing.boxLong(j))), null, 4, null);
                }
                return obj;
            }
        }
        deviceRegistrationSignalImpl$awaitDeviceId$1 = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$1(this, continuation);
        obj = deviceRegistrationSignalImpl$awaitDeviceId$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationSignalImpl$awaitDeviceId$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        if (((java.lang.String) obj) == null) {
        }
        return obj;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal
    public final void notifyRegistered(java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        if (this.Camera2StreamConfigurationMap.tryEmit(deviceId)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "Device registration signal emitted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistrationSignal")), null, 4, null);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "Failed to emit device registration signal", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistrationSignal")), null, 4, null);
        }
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal
    public final void reset() {
        this.Camera2StreamConfigurationMap.resetReplayCache();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "Device registration signal reset", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistrationSignal")), null, 4, null);
    }
}
