package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/pipe/graph/LatestFrameInfoListener;", "Landroidx/camera/camera2/pipe/Request$Listener;", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameInfo;", "", "onNextFrameInfo", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "totalCaptureResult", "onTotalCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onTotalCaptureResult", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", "J", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LatestFrameInfoListener implements androidx.camera.camera2.pipe.Request.Listener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameInfo, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public LatestFrameInfoListener(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameInfo, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = Long.MIN_VALUE;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public final void mo38onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo totalCaptureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
        if (requestMetadata.getRequest().getInputRequest() != null) {
            return;
        }
        synchronized (this) {
            if (totalCaptureResult.mo112getFrameNumberUgla2oM() > this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighResolutionOutputSizeshNQ4ISI = totalCaptureResult.mo112getFrameNumberUgla2oM();
                this.getHighSpeedVideoSizes.invoke(totalCaptureResult);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
