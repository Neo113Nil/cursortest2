package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0010\u001a\u00020\u000f2\u001e\u0010\u000e\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u001b\u0010\u0017\u001a\u00020\u000f8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/compat/workaround/UseTorchAsFlashImpl;", "Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameraDevices", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "intrinsicZoomCalculator", "<init>", "(Landroidx/camera/camera2/compat/quirk/CameraQuirks;Landroidx/camera/camera2/pipe/CameraDevices;Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;)V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "frameMetadata", "", "shouldUseTorchAsFlash", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldDisableAePrecapture", "()Z", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseTorchAsFlashImpl implements androidx.camera.camera2.compat.workaround.UseTorchAsFlash {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.CameraQuirks getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraDevices Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.internal.IntrinsicZoomCalculator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    public UseTorchAsFlashImpl(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks, androidx.camera.camera2.pipe.CameraDevices cameraDevices, androidx.camera.camera2.internal.IntrinsicZoomCalculator intrinsicZoomCalculator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevices, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicZoomCalculator, "");
        this.getHighSpeedVideoFpsRangesFor = cameraQuirks;
        this.Camera2StreamConfigurationMap = cameraDevices;
        this.getHighSpeedVideoSizes = intrinsicZoomCalculator;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean contains;
                contains = androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl.this.getHighSpeedVideoFpsRangesFor.getQuirks().contains(androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.class);
                return java.lang.Boolean.valueOf(contains);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object shouldUseTorchAsFlash(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameMetadata>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1 useTorchAsFlashImpl$shouldUseTorchAsFlash$1;
        int i;
        androidx.camera.camera2.pipe.FrameMetadata frameMetadata;
        if (continuation instanceof androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1) {
            useTorchAsFlashImpl$shouldUseTorchAsFlash$1 = (androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1) continuation;
            if ((useTorchAsFlashImpl$shouldUseTorchAsFlash$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                useTorchAsFlashImpl$shouldUseTorchAsFlash$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                        getHighResolutionOutputSizeshNQ4ISI();
                    }
                    if (!getHighResolutionOutputSizeshNQ4ISI()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        useTorchAsFlashImpl$shouldUseTorchAsFlash$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = function1.invoke(useTorchAsFlashImpl$shouldUseTorchAsFlash$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                frameMetadata = (androidx.camera.camera2.pipe.FrameMetadata) obj;
                if (frameMetadata != null) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                java.lang.String str = (java.lang.String) frameMetadata.get(key);
                java.lang.Boolean bool = null;
                if (str != null) {
                    androidx.camera.camera2.pipe.CameraMetadata m281awaitCameraMetadataFpsL5FU$default = androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(this.Camera2StreamConfigurationMap, androidx.camera.camera2.pipe.CameraId.m393constructorimpl(str), null, 2, null);
                    if (m281awaitCameraMetadataFpsL5FU$default != null) {
                        java.lang.Float calculateIntrinsicZoomRatio = this.getHighSpeedVideoSizes.calculateIntrinsicZoomRatio(m281awaitCameraMetadataFpsL5FU$default);
                        if (calculateIntrinsicZoomRatio == null) {
                            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                        } else {
                            float floatValue = calculateIntrinsicZoomRatio.floatValue();
                            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                            bool = java.lang.Boolean.valueOf(floatValue < 1.0f);
                        }
                    } else {
                        androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    }
                } else {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool != null ? bool.booleanValue() : true);
            }
        }
        useTorchAsFlashImpl$shouldUseTorchAsFlash$1 = new androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1(this, continuation);
        java.lang.Object obj2 = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = useTorchAsFlashImpl$shouldUseTorchAsFlash$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        frameMetadata = (androidx.camera.camera2.pipe.FrameMetadata) obj2;
        if (frameMetadata != null) {
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    public final boolean shouldDisableAePrecapture() {
        return !getHighResolutionOutputSizeshNQ4ISI();
    }
}
