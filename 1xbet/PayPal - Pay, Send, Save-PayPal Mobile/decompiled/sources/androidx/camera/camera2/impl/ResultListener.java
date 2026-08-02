package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R%\u0010\u0018\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!"}, d2 = {"Landroidx/camera/camera2/impl/ResultListener;", "Landroidx/camera/camera2/pipe/Request$Listener;", "", "timeLimitNs", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameInfo;", "Lkotlin/ParameterName;", "", "checker", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "totalCaptureResult", "", "onTotalCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onTotalCaptureResult", "getHighSpeedVideoFpsRangesFor", "J", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CompletableDeferred;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CompletableDeferred;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Deferred;", "getResult", "()Lkotlinx/coroutines/Deferred;", "result", "Ljava/lang/Long;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResultListener implements androidx.camera.camera2.pipe.Request.Listener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameInfo, java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.FrameInfo> getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile java.lang.Long Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultListener(long j, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameInfo, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.FrameInfo> getResult() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public final void mo38onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo totalCaptureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.isCompleted() || this.getHighResolutionOutputSizeshNQ4ISI.isCancelled()) {
            return;
        }
        androidx.camera.camera2.pipe.FrameMetadata metadata = totalCaptureResult.getMetadata();
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Long l = (java.lang.Long) metadata.get(key);
        if (l != null && this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = l;
        }
        java.lang.Long l2 = this.Camera2StreamConfigurationMap;
        if (this.getHighSpeedVideoFpsRangesFor != 0 && l2 != null && l != null && l.longValue() - l2.longValue() > this.getHighSpeedVideoFpsRangesFor) {
            this.getHighResolutionOutputSizeshNQ4ISI.complete(null);
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                return;
            }
            return;
        }
        if (this.getHighSpeedVideoSizes.invoke(totalCaptureResult).booleanValue()) {
            this.getHighResolutionOutputSizeshNQ4ISI.complete(totalCaptureResult);
        }
    }
}
