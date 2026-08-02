package com.paypal.oslo.feature.verificationcapture.data.datasource;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 JQ\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/datasource/DaonSdkWrapperImpl;", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/DaonSdkWrapper;", "<init>", "()V", "Lcom/daon/dmds/views/DaonDocumentScanView;", "scanView", "Lcom/daon/dmds/models/DMDSOptions;", "options", "Lcom/daon/dmds/managers/DMDSCustomScanListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "startScan", "(Lcom/daon/dmds/views/DaonDocumentScanView;Lcom/daon/dmds/models/DMDSOptions;Lcom/daon/dmds/managers/DMDSCustomScanListener;)V", "stopScan", "(Lcom/daon/dmds/views/DaonDocumentScanView;)V", "", "enabled", "Lkotlin/Function1;", com.sun.jna.Callback.METHOD_NAME, "setFlash", "(Lcom/daon/dmds/views/DaonDocumentScanView;ZLkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "isCameraAvailable", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/util/SensorCollector;", "createSensorCollector", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/verificationcapture/util/SensorCollector;", "Lcom/paypal/oslo/feature/verificationcapture/util/BatteryMonitor;", "createBatteryMonitor", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/verificationcapture/util/BatteryMonitor;", "sensorCollector", "batteryMonitor", "", "sdkVersion", "appVersion", "", "retryCount", "effort", "", "docDetectScore", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "buildDeviceCaptureData", "(Landroid/content/Context;Lcom/paypal/oslo/feature/verificationcapture/util/SensorCollector;Lcom/paypal/oslo/feature/verificationcapture/util/BatteryMonitor;Ljava/lang/String;Ljava/lang/String;IIF)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DaonSdkWrapperImpl implements com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DaonSdkWrapperImpl() {
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper
    public final void startScan(com.daon.dmds.views.DaonDocumentScanView scanView, com.daon.dmds.models.DMDSOptions options, com.daon.dmds.managers.DMDSCustomScanListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        scanView.create(options, listener);
        scanView.start();
        scanView.resume();
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper
    public final void stopScan(com.daon.dmds.views.DaonDocumentScanView scanView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanView, "");
        scanView.stop();
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper
    public final void setFlash(com.daon.dmds.views.DaonDocumentScanView scanView, boolean enabled, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanView, "");
        scanView.setFlashState(enabled, new com.daon.dmds.managers.DMDSFlashStateChangeListener() { // from class: com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$$ExternalSyntheticLambda0
            @Override // com.daon.dmds.managers.DMDSFlashStateChangeListener
            public final void onOperationDone(boolean z) {
                com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl.$r8$lambda$k7edBPugjQneJq6SNIVuyVzLWJo(kotlin.jvm.functions.Function1.this, z);
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|24|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isCameraAvailable(android.content.Context context, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$isCameraAvailable$1 daonSdkWrapperImpl$isCameraAvailable$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$isCameraAvailable$1) {
            daonSdkWrapperImpl$isCameraAvailable$1 = (com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$isCameraAvailable$1) continuation;
            if ((daonSdkWrapperImpl$isCameraAvailable$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                daonSdkWrapperImpl$isCameraAvailable$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = daonSdkWrapperImpl$isCameraAvailable$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = daonSdkWrapperImpl$isCameraAvailable$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    daonSdkWrapperImpl$isCameraAvailable$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                    daonSdkWrapperImpl$isCameraAvailable$1.getHighSpeedVideoSizes = 1;
                    obj = getHighSpeedVideoFpsRanges(context, daonSdkWrapperImpl$isCameraAvailable$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                boolean z = ((java.lang.Boolean) obj).booleanValue();
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        daonSdkWrapperImpl$isCameraAvailable$1 = new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$isCameraAvailable$1(this, continuation);
        java.lang.Object obj2 = daonSdkWrapperImpl$isCameraAvailable$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = daonSdkWrapperImpl$isCameraAvailable$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        boolean z2 = ((java.lang.Boolean) obj2).booleanValue();
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(android.content.Context context, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$1 daonSdkWrapperImpl$checkCameraAvailability$1;
        int i;
        final java.lang.String str;
        android.hardware.camera2.CameraManager cameraManager;
        android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$1) {
            daonSdkWrapperImpl$checkCameraAvailability$1 = (com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$1) continuation;
            if ((daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = daonSdkWrapperImpl$checkCameraAvailability$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object systemService = context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                    android.hardware.camera2.CameraManager cameraManager2 = (android.hardware.camera2.CameraManager) systemService;
                    java.lang.String[] cameraIdList = cameraManager2.getCameraIdList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
                    if (cameraIdList.length != 0 && (str = (java.lang.String) kotlin.collections.ArraysKt.firstOrNull(cameraIdList)) != null) {
                        final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback2 = new android.hardware.camera2.CameraManager.AvailabilityCallback() { // from class: com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$callback$1
                            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                            public final void onCameraAvailable(java.lang.String cameraId) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(cameraId, str) || CompletableDeferred$default.isCompleted()) {
                                    return;
                                }
                                CompletableDeferred$default.complete(java.lang.Boolean.TRUE);
                            }

                            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                            public final void onCameraUnavailable(java.lang.String cameraId) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(cameraId, str) || CompletableDeferred$default.isCompleted()) {
                                    return;
                                }
                                CompletableDeferred$default.complete(java.lang.Boolean.FALSE);
                            }
                        };
                        cameraManager2.registerAvailabilityCallback(availabilityCallback2, (android.os.Handler) null);
                        com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$result$1 daonSdkWrapperImpl$checkCameraAvailability$result$1 = new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$result$1(CompletableDeferred$default, null);
                        daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                        daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoFpsRanges = cameraManager2;
                        daonSdkWrapperImpl$checkCameraAvailability$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cameraIdList);
                        daonSdkWrapperImpl$checkCameraAvailability$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(CompletableDeferred$default);
                        daonSdkWrapperImpl$checkCameraAvailability$1.getOutputFormats = availabilityCallback2;
                        daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(1000L, daonSdkWrapperImpl$checkCameraAvailability$result$1, daonSdkWrapperImpl$checkCameraAvailability$1);
                        if (withTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cameraManager = cameraManager2;
                        obj = withTimeoutOrNull;
                        availabilityCallback = availabilityCallback2;
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                availabilityCallback = (com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$callback$1) daonSdkWrapperImpl$checkCameraAvailability$1.getOutputFormats;
                cameraManager = (android.hardware.camera2.CameraManager) daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                cameraManager.unregisterAvailabilityCallback(availabilityCallback);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue);
            }
        }
        daonSdkWrapperImpl$checkCameraAvailability$1 = new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$1(this, continuation);
        java.lang.Object obj2 = daonSdkWrapperImpl$checkCameraAvailability$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = daonSdkWrapperImpl$checkCameraAvailability$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        if (bool2 != null) {
        }
        cameraManager.unregisterAvailabilityCallback(availabilityCallback);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper
    public final com.paypal.oslo.feature.verificationcapture.util.SensorCollector createSensorCollector(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.verificationcapture.util.SensorCollector(context);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper
    public final com.paypal.oslo.feature.verificationcapture.util.BatteryMonitor createBatteryMonitor(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.verificationcapture.util.BatteryMonitor(context);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData buildDeviceCaptureData(android.content.Context context, com.paypal.oslo.feature.verificationcapture.util.SensorCollector sensorCollector, com.paypal.oslo.feature.verificationcapture.util.BatteryMonitor batteryMonitor, java.lang.String sdkVersion, java.lang.String appVersion, int retryCount, int effort, float docDetectScore) {
        com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData buildForDocumentCapture;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorCollector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "");
        try {
            buildForDocumentCapture = com.paypal.oslo.feature.verificationcapture.util.DeviceCaptureDataBuilder.INSTANCE.buildForDocumentCapture(context, sensorCollector, batteryMonitor, sdkVersion, appVersion, retryCount, effort, docDetectScore, (r21 & 256) != 0 ? null : null);
            return buildForDocumentCapture;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void $r8$lambda$k7edBPugjQneJq6SNIVuyVzLWJo(kotlin.jvm.functions.Function1 function1, boolean z) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }
}
